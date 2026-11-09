2026-11-09T13:32:47.0892007Z ##[section]Starting: Deploy Config no JBOSS
2026-11-09T13:32:47.0895052Z ==============================================================================
2026-11-09T13:32:47.0895131Z Task         : Bash
2026-11-09T13:32:47.0895172Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-11-09T13:32:47.0895321Z Version      : 3.227.0
2026-11-09T13:32:47.0895364Z Author       : Microsoft Corporation
2026-11-09T13:32:47.0895415Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-11-09T13:32:47.0895495Z ==============================================================================
2026-11-09T13:32:47.2118829Z Generating script.
2026-11-09T13:32:47.2129571Z ========================== Starting Command Output ===========================
2026-11-09T13:32:47.2136880Z [command]/bin/bash /opt/ads-agent/_work/_temp/8f66f6ba-3ad7-48d1-a792-5be719d5acbf.sh
2026-11-09T13:32:47.2219336Z /opt/ads-agent/_work/_temp/8f66f6ba-3ad7-48d1-a792-5be719d5acbf.sh: line 2: quantidade_vm: comando não encontrado
2026-11-09T13:32:47.2235666Z /opt/ads-agent/_work/_temp/8f66f6ba-3ad7-48d1-a792-5be719d5acbf.sh: line 2: USE_WMQ: comando não encontrado
2026-11-09T13:32:49.4182944Z 
2026-11-09T13:32:49.4183497Z PLAY [local] *******************************************************************
2026-11-09T13:32:49.4469504Z 
2026-11-09T13:32:49.4470041Z PLAY [Configurando o DNS] ******************************************************
2026-11-09T13:32:49.6642321Z 
2026-11-09T13:32:49.6642858Z PLAY [local] *******************************************************************
2026-11-09T13:32:49.6680595Z 
2026-11-09T13:32:49.6681382Z PLAY [Verificando serviços] ****************************************************
2026-11-09T13:32:49.6773415Z 
2026-11-09T13:32:49.6773909Z PLAY [Configuração LDAP] *******************************************************
2026-11-09T13:32:49.6806925Z [WARNING]: Found variable using reserved name: when
2026-11-09T13:32:49.6812675Z 
2026-11-09T13:32:49.6813031Z PLAY [jboss] *******************************************************************
2026-11-09T13:32:49.6898337Z 
2026-11-09T13:32:49.6898841Z PLAY [Stack Jboss] *************************************************************
2026-11-09T13:32:49.7139938Z Monday 09 November 2026  10:32:49 -0300 (0:00:00.358)       0:00:00.358 ******* 
2026-11-09T13:32:50.2361359Z 
2026-11-09T13:32:50.2362644Z TASK [Verifica ser o Jboss já foi instalado] ***********************************
2026-11-09T13:32:50.2364689Z [DEPRECATION WARNING]: Distribution rhel 9.3 on host 
2026-11-09T13:32:50.2365047Z caddeapllx2864.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, 
2026-11-09T13:32:50.2365304Z but is using /usr/bin/python for backward compatibility with prior Ansible 
2026-11-09T13:32:50.2365621Z releases. A future Ansible release will default to using the discovered 
2026-11-09T13:32:50.2365779Z platform python for this host. See https://docs.ansible.com/ansible/2.9/referen
2026-11-09T13:32:50.2365979Z ce_appendices/interpreter_discovery.html for more information. This feature 
2026-11-09T13:32:50.2366312Z will be removed in version 2.12. Deprecation warnings can be disabled by 
2026-11-09T13:32:50.2366539Z setting deprecation_warnings=False in ansible.cfg.
2026-11-09T13:32:50.2366681Z ok: [caddeapllx2864.agil.nprd.caixa.gov.br]
2026-11-09T13:32:50.2387214Z 
2026-11-09T13:32:50.2387473Z PLAY [jboss] *******************************************************************
2026-11-09T13:32:50.2478950Z Monday 09 November 2026  10:32:50 -0300 (0:00:00.533)       0:00:00.892 ******* 
2026-11-09T13:32:50.6290114Z 
2026-11-09T13:32:50.6290942Z TASK [Verifica se o arquivo nfs_config.json existe] ****************************
2026-11-09T13:32:50.6291167Z ok: [caddeapllx2864.agil.nprd.caixa.gov.br]
2026-11-09T13:32:50.6325000Z Monday 09 November 2026  10:32:50 -0300 (0:00:00.384)       0:00:01.277 ******* 
2026-11-09T13:32:50.6807340Z included: /opt/ads-agent/_work/r19548/a/esteira-jboss-vm-v2/roles/nfs/tasks/get_nfs.yml for caddeapllx2864.agil.nprd.caixa.gov.br
2026-11-09T13:32:50.6852464Z Monday 09 November 2026  10:32:50 -0300 (0:00:00.052)       0:00:01.330 ******* 
2026-11-09T13:32:50.7435143Z 
2026-11-09T13:32:50.7436221Z TASK [nfs : Criar variáveis] ***************************************************
2026-11-09T13:32:50.7436457Z ok: [caddeapllx2864.agil.nprd.caixa.gov.br]
2026-11-09T13:32:50.7488328Z Monday 09 November 2026  10:32:50 -0300 (0:00:00.063)       0:00:01.393 ******* 
2026-11-09T13:32:51.2119344Z 
2026-11-09T13:32:51.2120012Z TASK [nfs : Coletar variáveis de ambiente] *************************************
2026-11-09T13:32:51.2120218Z ok: [caddeapllx2864.agil.nprd.caixa.gov.br]
2026-11-09T13:32:51.2126711Z Monday 09 November 2026  10:32:51 -0300 (0:00:00.463)       0:00:01.857 ******* 
2026-11-09T13:32:51.2704574Z 
2026-11-09T13:32:51.2705527Z TASK [nfs : Exibir resultado em JSON] ******************************************
2026-11-09T13:32:51.2706234Z ok: [caddeapllx2864.agil.nprd.caixa.gov.br] => {
2026-11-09T13:32:51.2706364Z     "nfs_vars_json": {
2026-11-09T13:32:51.2706754Z         "changed": false, 
2026-11-09T13:32:51.2707432Z         "cmd": "cat /opt/ads-agent/_work/r19548/a/nfs_config.json", 
2026-11-09T13:32:51.2707679Z         "delta": "0:00:00.006014", 
2026-11-09T13:32:51.2707861Z         "end": "2026-11-09 10:32:51.193094", 
2026-11-09T13:32:51.2707985Z         "failed": false, 
2026-11-09T13:32:51.2708108Z         "rc": 0, 
2026-11-09T13:32:51.2708274Z         "start": "2026-11-09 10:32:51.187080", 
2026-11-09T13:32:51.2708397Z         "stderr": "", 
2026-11-09T13:32:51.2708503Z         "stderr_lines": [], 
2026-11-09T13:32:51.2708612Z         "stdout": "[]", 
2026-11-09T13:32:51.2708707Z         "stdout_lines": [
2026-11-09T13:32:51.2708810Z             "[]"
2026-11-09T13:32:51.2708906Z         ]
2026-11-09T13:32:51.2708992Z     }
2026-11-09T13:32:51.2709085Z }
2026-11-09T13:32:51.2742494Z Monday 09 November 2026  10:32:51 -0300 (0:00:00.061)       0:00:01.919 ******* 
2026-11-09T13:32:51.3342704Z 
2026-11-09T13:32:51.3343417Z TASK [nfs : Criar variáveis] ***************************************************
2026-11-09T13:32:51.3343609Z ok: [caddeapllx2864.agil.nprd.caixa.gov.br]
2026-11-09T13:32:51.3392117Z Monday 09 November 2026  10:32:51 -0300 (0:00:00.064)       0:00:01.984 ******* 
2026-11-09T13:32:51.3842098Z Monday 09 November 2026  10:32:51 -0300 (0:00:00.044)       0:00:02.028 ******* 
2026-11-09T13:32:51.4283618Z Monday 09 November 2026  10:32:51 -0300 (0:00:00.044)       0:00:02.072 ******* 
2026-11-09T13:32:51.4721773Z Monday 09 November 2026  10:32:51 -0300 (0:00:00.043)       0:00:02.116 ******* 
2026-11-09T13:32:51.5160207Z Monday 09 November 2026  10:32:51 -0300 (0:00:00.043)       0:00:02.160 ******* 
2026-11-09T13:32:51.5606927Z Monday 09 November 2026  10:32:51 -0300 (0:00:00.044)       0:00:02.205 ******* 
2026-11-09T13:32:51.6046646Z Monday 09 November 2026  10:32:51 -0300 (0:00:00.043)       0:00:02.249 ******* 
2026-11-09T13:32:51.6490065Z 
2026-11-09T13:32:51.6490482Z PLAY [jboss] *******************************************************************
2026-11-09T13:32:51.6531544Z 
2026-11-09T13:32:51.6532161Z PLAY [jboss] *******************************************************************
2026-11-09T13:32:51.6569185Z Monday 09 November 2026  10:32:51 -0300 (0:00:00.052)       0:00:02.301 ******* 
2026-11-09T13:32:52.5197410Z 
2026-11-09T13:32:52.5198199Z TASK [Gathering Facts] *********************************************************
2026-11-09T13:32:52.5198426Z ok: [caddeapllx2864.agil.nprd.caixa.gov.br]
2026-11-09T13:32:52.5372303Z Monday 09 November 2026  10:32:52 -0300 (0:00:00.879)       0:00:03.181 ******* 
2026-11-09T13:32:53.8624465Z 
2026-11-09T13:32:53.8625009Z TASK [Gerando fatos de servicos] ***********************************************
2026-11-09T13:32:53.8625176Z ok: [caddeapllx2864.agil.nprd.caixa.gov.br]
2026-11-09T13:32:53.8941803Z Monday 09 November 2026  10:32:53 -0300 (0:00:01.356)       0:00:04.538 ******* 
2026-11-09T13:32:53.9550831Z 
2026-11-09T13:32:53.9551387Z TASK [Gerando lista de units jboss] ********************************************
2026-11-09T13:32:53.9551902Z ok: [caddeapllx2864.agil.nprd.caixa.gov.br]
2026-11-09T13:32:53.9811397Z Monday 09 November 2026  10:32:53 -0300 (0:00:00.086)       0:00:04.625 ******* 
2026-11-09T13:32:54.0486970Z Monday 09 November 2026  10:32:54 -0300 (0:00:00.067)       0:00:04.693 ******* 
2026-11-09T13:32:54.0628705Z 
2026-11-09T13:32:54.0629179Z PLAY [Copiando deployments adicionais] *****************************************
2026-11-09T13:32:54.0909273Z Monday 09 November 2026  10:32:54 -0300 (0:00:00.041)       0:00:04.735 ******* 
2026-11-09T13:32:54.1485877Z 
2026-11-09T13:32:54.1486638Z TASK [Cria variável build_repository_name] *************************************
2026-11-09T13:32:54.1486816Z ok: [caddeapllx2864.agil.nprd.caixa.gov.br]
2026-11-09T13:32:54.1745173Z Monday 09 November 2026  10:32:54 -0300 (0:00:00.083)       0:00:04.819 ******* 
2026-11-09T13:32:54.2338363Z 
2026-11-09T13:32:54.2339015Z TASK [Buscando diretorio de config] ********************************************
2026-11-09T13:32:54.2339302Z ok: [caddeapllx2864.agil.nprd.caixa.gov.br]
2026-11-09T13:32:54.2603342Z Monday 09 November 2026  10:32:54 -0300 (0:00:00.085)       0:00:04.904 ******* 
2026-11-09T13:32:54.3161241Z 
2026-11-09T13:32:54.3161810Z TASK [Buscando diretorio de config] ********************************************
2026-11-09T13:32:54.3161988Z ok: [caddeapllx2864.agil.nprd.caixa.gov.br]
2026-11-09T13:32:54.3533034Z Monday 09 November 2026  10:32:54 -0300 (0:00:00.092)       0:00:04.997 ******* 
2026-11-09T13:32:54.8935443Z 
2026-11-09T13:32:54.8936175Z TASK [Create a symbolic link] **************************************************
2026-11-09T13:32:54.8936601Z changed: [caddeapllx2864.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r19548/a/_SIEMP-java-web-config)
2026-11-09T13:32:55.1980506Z changed: [caddeapllx2864.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r19548/a/_SIEMP-java-web-config/jboss)
2026-11-09T13:32:55.2294352Z Monday 09 November 2026  10:32:55 -0300 (0:00:00.876)       0:00:05.873 ******* 
2026-11-09T13:32:55.5995344Z 
2026-11-09T13:32:55.5996375Z TASK [Verifica se o arquivo  existe] *******************************************
2026-11-09T13:32:55.5996871Z ok: [caddeapllx2864.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r19548/a/_SIEMP-java-web-config)
2026-11-09T13:32:55.9137987Z ok: [caddeapllx2864.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r19548/a/_SIEMP-java-web-config/jboss)
2026-11-09T13:32:55.9410766Z Monday 09 November 2026  10:32:55 -0300 (0:00:00.711)       0:00:06.585 ******* 
2026-11-09T13:32:56.0310994Z included: /opt/ads-agent/_work/r19548/a/esteira-jboss-vm-v2/roles/jboss/tasks/stack_deployments_custom_block.yml for caddeapllx2864.agil.nprd.caixa.gov.br
2026-11-09T13:32:56.0597936Z Monday 09 November 2026  10:32:56 -0300 (0:00:00.118)       0:00:06.704 ******* 
2026-11-09T13:32:56.5673374Z 
2026-11-09T13:32:56.5674254Z TASK [Lendo artefatos do arquivo CSV] ******************************************
2026-11-09T13:32:56.5674528Z ok: [caddeapllx2864.agil.nprd.caixa.gov.br]
2026-11-09T13:32:56.5973296Z Monday 09 November 2026  10:32:56 -0300 (0:00:00.537)       0:00:07.242 ******* 
2026-11-09T13:32:56.6367372Z Monday 09 November 2026  10:32:56 -0300 (0:00:00.039)       0:00:07.281 ******* 
2026-11-09T13:32:56.6751140Z Monday 09 November 2026  10:32:56 -0300 (0:00:00.038)       0:00:07.319 ******* 
2026-11-09T13:32:56.8554196Z 
2026-11-09T13:32:56.8554755Z TASK [Copiando artefatos para o(s) servidor(es) Jboss] *************************
2026-11-09T13:32:56.8554921Z ok: [caddeapllx2864.agil.nprd.caixa.gov.br]
2026-11-09T13:32:56.8817433Z Monday 09 November 2026  10:32:56 -0300 (0:00:00.206)       0:00:07.526 ******* 
2026-11-09T13:32:56.9387591Z 
2026-11-09T13:32:56.9388586Z TASK [Sem artefatos de deployments] ********************************************
2026-11-09T13:32:56.9388804Z ok: [caddeapllx2864.agil.nprd.caixa.gov.br] => {
2026-11-09T13:32:56.9389210Z     "msg": "Sem deployments adicional"
2026-11-09T13:32:56.9389385Z }
2026-11-09T13:32:56.9411763Z 
2026-11-09T13:32:56.9412278Z PLAY [Copiando modules adicionais] *********************************************
2026-11-09T13:32:56.9699494Z Monday 09 November 2026  10:32:56 -0300 (0:00:00.088)       0:00:07.614 ******* 
2026-11-09T13:32:57.0264883Z 
2026-11-09T13:32:57.0266032Z TASK [Cria variável build_repository_name] *************************************
2026-11-09T13:32:57.0266220Z ok: [caddeapllx2864.agil.nprd.caixa.gov.br]
2026-11-09T13:32:57.0536474Z Monday 09 November 2026  10:32:57 -0300 (0:00:00.083)       0:00:07.698 ******* 
2026-11-09T13:32:57.1127558Z 
2026-11-09T13:32:57.1128044Z TASK [Buscando diretorio de config] ********************************************
2026-11-09T13:32:57.1398196Z ok: [caddeapllx2864.agil.nprd.caixa.gov.br]
2026-11-09T13:32:57.1398716Z Monday 09 November 2026  10:32:57 -0300 (0:00:00.086)       0:00:07.784 ******* 
2026-11-09T13:32:57.1936052Z 
2026-11-09T13:32:57.1936545Z TASK [Buscando diretorio de config] ********************************************
2026-11-09T13:32:57.1936773Z ok: [caddeapllx2864.agil.nprd.caixa.gov.br]
2026-11-09T13:32:57.2238824Z Monday 09 November 2026  10:32:57 -0300 (0:00:00.084)       0:00:07.868 ******* 
2026-11-09T13:32:57.5749997Z 
2026-11-09T13:32:57.5750536Z TASK [Create a directory] ******************************************************
2026-11-09T13:32:57.5750956Z changed: [caddeapllx2864.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r19548/a/_SIEMP-java-web-config)
2026-11-09T13:32:57.8789794Z changed: [caddeapllx2864.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r19548/a/_SIEMP-java-web-config/jboss)
2026-11-09T13:32:57.9093056Z Monday 09 November 2026  10:32:57 -0300 (0:00:00.685)       0:00:08.553 ******* 
2026-11-09T13:32:58.2705300Z 
2026-11-09T13:32:58.2705813Z TASK [Verifica se o arquivo  existe] *******************************************
2026-11-09T13:32:58.2706258Z ok: [caddeapllx2864.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r19548/a/_SIEMP-java-web-config)
2026-11-09T13:32:58.5944647Z ok: [caddeapllx2864.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r19548/a/_SIEMP-java-web-config/jboss)
2026-11-09T13:32:58.6223031Z Monday 09 November 2026  10:32:58 -0300 (0:00:00.712)       0:00:09.266 ******* 
2026-11-09T13:32:58.7284435Z included: /opt/ads-agent/_work/r19548/a/esteira-jboss-vm-v2/roles/jboss/tasks/stack_modules_custom_block.yml for caddeapllx2864.agil.nprd.caixa.gov.br
2026-11-09T13:32:58.7566476Z Monday 09 November 2026  10:32:58 -0300 (0:00:00.134)       0:00:09.401 ******* 
2026-11-09T13:32:59.1135720Z 
2026-11-09T13:32:59.1136330Z TASK [Lendo artefatos do arquivo CSV] ******************************************
2026-11-09T13:32:59.1136569Z ok: [caddeapllx2864.agil.nprd.caixa.gov.br]
2026-11-09T13:32:59.1427059Z Monday 09 November 2026  10:32:59 -0300 (0:00:00.386)       0:00:09.787 ******* 
2026-11-09T13:32:59.1822814Z Monday 09 November 2026  10:32:59 -0300 (0:00:00.039)       0:00:09.826 ******* 
2026-11-09T13:32:59.6113316Z 
2026-11-09T13:32:59.6114024Z TASK [Listar arquivos no diretório baixados anteriormente] *********************
2026-11-09T13:32:59.6114258Z ok: [caddeapllx2864.agil.nprd.caixa.gov.br]
2026-11-09T13:32:59.6405872Z Monday 09 November 2026  10:32:59 -0300 (0:00:00.458)       0:00:10.285 ******* 
2026-11-09T13:32:59.6801445Z Monday 09 November 2026  10:32:59 -0300 (0:00:00.039)       0:00:10.324 ******* 
2026-11-09T13:33:00.0490922Z 
2026-11-09T13:33:00.0491574Z TASK [Verifica se o arquivo jboss-modules-custom tem conteudo] *****************
2026-11-09T13:33:00.0491790Z ok: [caddeapllx2864.agil.nprd.caixa.gov.br]
2026-11-09T13:33:00.0761747Z Monday 09 November 2026  10:33:00 -0300 (0:00:00.395)       0:00:10.720 ******* 
2026-11-09T13:33:00.2546461Z 
2026-11-09T13:33:00.2547105Z TASK [Copiando artefatos (Modules) para o(s) servidor(es) Jboss] ***************
2026-11-09T13:33:00.2547346Z ok: [caddeapllx2864.agil.nprd.caixa.gov.br]
2026-11-09T13:33:00.2805964Z Monday 09 November 2026  10:33:00 -0300 (0:00:00.204)       0:00:10.925 ******* 
2026-11-09T13:33:00.8539929Z 
2026-11-09T13:33:00.8540674Z TASK [Copiando artefato (jboss-custom.cli) para o(s) servidor(es) Jboss] *******
2026-11-09T13:33:00.8540888Z ok: [caddeapllx2864.agil.nprd.caixa.gov.br]
2026-11-09T13:33:00.8808401Z Monday 09 November 2026  10:33:00 -0300 (0:00:00.600)       0:00:11.525 ******* 
2026-11-09T13:33:00.9487878Z Monday 09 November 2026  10:33:00 -0300 (0:00:00.067)       0:00:11.593 ******* 
2026-11-09T13:33:01.0159004Z Monday 09 November 2026  10:33:01 -0300 (0:00:00.067)       0:00:11.660 ******* 
2026-11-09T13:33:01.0844006Z Monday 09 November 2026  10:33:01 -0300 (0:00:00.068)       0:00:11.728 ******* 
2026-11-09T13:33:01.1530490Z Monday 09 November 2026  10:33:01 -0300 (0:00:00.068)       0:00:11.797 ******* 
2026-11-09T13:33:01.2217452Z Monday 09 November 2026  10:33:01 -0300 (0:00:00.068)       0:00:11.866 ******* 
2026-11-09T13:33:01.2788042Z 
2026-11-09T13:33:01.2788561Z TASK [Sem modules adicionais] **************************************************
2026-11-09T13:33:01.2788760Z ok: [caddeapllx2864.agil.nprd.caixa.gov.br] => {
2026-11-09T13:33:01.2789452Z     "msg": "Sem modules adicional"
2026-11-09T13:33:01.2789631Z }
2026-11-09T13:33:01.2813021Z 
2026-11-09T13:33:01.2813578Z PLAY [jboss] *******************************************************************
2026-11-09T13:33:01.3096799Z Monday 09 November 2026  10:33:01 -0300 (0:00:00.088)       0:00:11.954 ******* 
2026-11-09T13:33:01.3697281Z 
2026-11-09T13:33:01.3698193Z TASK [Setando a versão do Jboss] ***********************************************
2026-11-09T13:33:01.3698374Z ok: [caddeapllx2864.agil.nprd.caixa.gov.br]
2026-11-09T13:33:01.3966781Z Monday 09 November 2026  10:33:01 -0300 (0:00:00.086)       0:00:12.041 ******* 
2026-11-09T13:33:01.4532702Z 
2026-11-09T13:33:01.4533595Z TASK [Cria variável build_repository_name_tfs] *********************************
2026-11-09T13:33:01.4533861Z ok: [caddeapllx2864.agil.nprd.caixa.gov.br]
2026-11-09T13:33:01.4818394Z Monday 09 November 2026  10:33:01 -0300 (0:00:00.085)       0:00:12.126 ******* 
2026-11-09T13:33:01.5391675Z 
2026-11-09T13:33:01.5392181Z TASK [Buscando diretorio de config] ********************************************
2026-11-09T13:33:01.5392350Z ok: [caddeapllx2864.agil.nprd.caixa.gov.br]
2026-11-09T13:33:01.5653153Z Monday 09 November 2026  10:33:01 -0300 (0:00:00.083)       0:00:12.210 ******* 
2026-11-09T13:33:02.1403807Z 
2026-11-09T13:33:02.1404350Z TASK [Copy common_start.sh] ****************************************************
2026-11-09T13:33:02.1404517Z ok: [caddeapllx2864.agil.nprd.caixa.gov.br]
2026-11-09T13:33:02.1655374Z Monday 09 November 2026  10:33:02 -0300 (0:00:00.600)       0:00:12.810 ******* 
2026-11-09T13:33:02.7612933Z 
2026-11-09T13:33:02.7613610Z TASK [Copy template script] ****************************************************
2026-11-09T13:33:02.7613784Z ok: [caddeapllx2864.agil.nprd.caixa.gov.br]
2026-11-09T13:33:02.7892873Z Monday 09 November 2026  10:33:02 -0300 (0:00:00.623)       0:00:13.433 ******* 
2026-11-09T13:33:03.3716128Z 
2026-11-09T13:33:03.3716695Z TASK [JBoss systemd wrapper for sysvinit script mode domain] *******************
2026-11-09T13:33:03.3716865Z ok: [caddeapllx2864.agil.nprd.caixa.gov.br]
2026-11-09T13:33:03.4026180Z Monday 09 November 2026  10:33:03 -0300 (0:00:00.613)       0:00:14.047 ******* 
2026-11-09T13:33:04.1582544Z 
2026-11-09T13:33:04.1583091Z TASK [Realiza copia do arquivo de Trust Store] *********************************
2026-11-09T13:33:04.1583246Z ok: [caddeapllx2864.agil.nprd.caixa.gov.br]
2026-11-09T13:33:04.1866806Z Monday 09 November 2026  10:33:04 -0300 (0:00:00.784)       0:00:14.831 ******* 
2026-11-09T13:33:04.2569258Z Monday 09 November 2026  10:33:04 -0300 (0:00:00.070)       0:00:14.901 ******* 
2026-11-09T13:33:04.3453082Z Monday 09 November 2026  10:33:04 -0300 (0:00:00.088)       0:00:14.989 ******* 
2026-11-09T13:33:04.7133325Z 
2026-11-09T13:33:04.7134097Z TASK [Check directory configuration exists] ************************************
2026-11-09T13:33:04.7134509Z ok: [caddeapllx2864.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r19548/a/_SIEMP-java-web-config)
2026-11-09T13:33:05.0224707Z ok: [caddeapllx2864.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r19548/a/_SIEMP-java-web-config/jboss)
2026-11-09T13:33:05.0497722Z Monday 09 November 2026  10:33:05 -0300 (0:00:00.704)       0:00:15.694 ******* 
2026-11-09T13:33:05.1322935Z Monday 09 November 2026  10:33:05 -0300 (0:00:00.082)       0:00:15.776 ******* 
2026-11-09T13:33:05.4908113Z 
2026-11-09T13:33:05.4908844Z TASK [Get standalone-full-ha.xml status] ***************************************
2026-11-09T13:33:05.4909197Z ok: [caddeapllx2864.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r19548/a/_SIEMP-java-web-config)
2026-11-09T13:33:05.8115383Z ok: [caddeapllx2864.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r19548/a/_SIEMP-java-web-config/jboss)
2026-11-09T13:33:05.8392727Z Monday 09 November 2026  10:33:05 -0300 (0:00:00.706)       0:00:16.483 ******* 
2026-11-09T13:33:06.4273372Z 
2026-11-09T13:33:06.4274126Z TASK [Copiando arquivo standalone-full-ha.xml] *********************************
2026-11-09T13:33:06.4275803Z ok: [caddeapllx2864.agil.nprd.caixa.gov.br] => (item={u'item': u'/opt/ads-agent/_work/r19548/a/_SIEMP-java-web-config/jboss', u'stat': {u'charset': u'us-ascii', u'uid': 1000, u'exists': True, u'attr_flags': u'', u'woth': False, u'device_type': 0, u'mtime': 1794231060.1862545, u'block_size': 4096, u'inode': 453019831, u'isgid': False, u'size': 31508, u'wgrp': False, u'executable': False, u'isuid': False, u'readable': True, u'isreg': True, u'version': u'18446744073181176838', u'pw_name': u'sadscp01', u'gid': 1000, u'ischr': False, u'wusr': True, u'writeable': True, u'mimetype': u'application/xml', u'blocks': 64, u'xoth': False, u'islnk': False, u'nlink': 1, u'issock': False, u'rgrp': True, u'gr_name': u'sadscp01', u'path': u'/opt/ads-agent/_work/r19548/a/_SIEMP-java-web-config/jboss/standalone-full-ha.xml', u'xusr': False, u'atime': 1794231060.1872547, u'isdir': False, u'ctime': 1794231060.1862545, u'isblk': False, u'checksum': u'f50467821558df6170e511ac7b6c0b7a4764c4bd', u'dev': 64771, u'roth': True, u'isfifo': False, u'mode': u'0644', u'xgrp': False, u'rusr': True, u'attributes': []}, u'ansible_loop_var': u'item', u'failed': False, u'invocation': {u'module_args': {u'follow': False, u'get_checksum': True, u'path': u'/opt/ads-agent/_work/r19548/a/_SIEMP-java-web-config/jboss/standalone-full-ha.xml', u'checksum_algorithm': u'sha1', u'get_md5': False, u'get_mime': True, u'get_attributes': True}}, u'changed': False})
2026-11-09T13:33:06.4614422Z Monday 09 November 2026  10:33:06 -0300 (0:00:00.622)       0:00:17.105 ******* 
2026-11-09T13:33:06.8695092Z 
2026-11-09T13:33:06.8695869Z TASK [Get standalone-ha.xml status] ********************************************
2026-11-09T13:33:06.8696169Z ok: [caddeapllx2864.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r19548/a/_SIEMP-java-web-config)
2026-11-09T13:33:07.1678232Z ok: [caddeapllx2864.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r19548/a/_SIEMP-java-web-config/jboss)
2026-11-09T13:33:07.1950667Z Monday 09 November 2026  10:33:07 -0300 (0:00:00.733)       0:00:17.839 ******* 
2026-11-09T13:33:07.2766614Z Monday 09 November 2026  10:33:07 -0300 (0:00:00.081)       0:00:17.921 ******* 
2026-11-09T13:33:07.6324944Z 
2026-11-09T13:33:07.6325498Z TASK [Get standalone.xml status] ***********************************************
2026-11-09T13:33:07.6325933Z ok: [caddeapllx2864.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r19548/a/_SIEMP-java-web-config)
2026-11-09T13:33:07.9251351Z ok: [caddeapllx2864.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r19548/a/_SIEMP-java-web-config/jboss)
2026-11-09T13:33:07.9528477Z Monday 09 November 2026  10:33:07 -0300 (0:00:00.676)       0:00:18.597 ******* 
2026-11-09T13:33:08.0325889Z Monday 09 November 2026  10:33:08 -0300 (0:00:00.079)       0:00:18.677 ******* 
2026-11-09T13:33:08.4105669Z 
2026-11-09T13:33:08.4106191Z TASK [Get standalone.conf status] **********************************************
2026-11-09T13:33:08.4106867Z ok: [caddeapllx2864.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r19548/a/_SIEMP-java-web-config)
2026-11-09T13:33:08.7279335Z ok: [caddeapllx2864.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r19548/a/_SIEMP-java-web-config/jboss)
2026-11-09T13:33:08.7564358Z Monday 09 November 2026  10:33:08 -0300 (0:00:00.723)       0:00:19.401 ******* 
2026-11-09T13:33:09.3505832Z 
2026-11-09T13:33:09.3506369Z TASK [Copiando arquivo standalone.conf] ****************************************
2026-11-09T13:33:09.3508054Z ok: [caddeapllx2864.agil.nprd.caixa.gov.br] => (item={u'item': u'/opt/ads-agent/_work/r19548/a/_SIEMP-java-web-config/jboss', u'stat': {u'charset': u'us-ascii', u'uid': 1000, u'exists': True, u'attr_flags': u'', u'woth': False, u'device_type': 0, u'mtime': 1794231060.1962545, u'block_size': 4096, u'inode': 453019832, u'isgid': False, u'size': 4033, u'wgrp': False, u'executable': False, u'isuid': False, u'readable': True, u'isreg': True, u'version': u'18446744073314684186', u'pw_name': u'sadscp01', u'gid': 1000, u'ischr': False, u'wusr': True, u'writeable': True, u'mimetype': u'text/plain', u'blocks': 8, u'xoth': False, u'islnk': False, u'nlink': 1, u'issock': False, u'rgrp': True, u'gr_name': u'sadscp01', u'path': u'/opt/ads-agent/_work/r19548/a/_SIEMP-java-web-config/jboss/standalone.conf', u'xusr': False, u'atime': 1794231060.1972544, u'isdir': False, u'ctime': 1794231060.1962545, u'isblk': False, u'checksum': u'eefab59881122f41b60a38e8a196260702c4ded0', u'dev': 64771, u'roth': True, u'isfifo': False, u'mode': u'0644', u'xgrp': False, u'rusr': True, u'attributes': []}, u'ansible_loop_var': u'item', u'failed': False, u'invocation': {u'module_args': {u'follow': False, u'get_checksum': True, u'path': u'/opt/ads-agent/_work/r19548/a/_SIEMP-java-web-config/jboss/standalone.conf', u'checksum_algorithm': u'sha1', u'get_md5': False, u'get_mime': True, u'get_attributes': True}}, u'changed': False})
2026-11-09T13:33:09.3822725Z Monday 09 November 2026  10:33:09 -0300 (0:00:00.625)       0:00:20.026 ******* 
2026-11-09T13:33:10.0051071Z 
2026-11-09T13:33:10.0051940Z TASK [Restart Zabbix] **********************************************************
2026-11-09T13:33:10.0052659Z fatal: [caddeapllx2864.agil.nprd.caixa.gov.br]: FAILED! => {"changed": false, "msg": "Could not find the requested service zabbix-agent: host"}
2026-11-09T13:33:10.0053012Z ...ignoring
2026-11-09T13:33:10.0318850Z Monday 09 November 2026  10:33:10 -0300 (0:00:00.649)       0:00:20.676 ******* 
2026-11-09T13:33:10.0989582Z Monday 09 November 2026  10:33:10 -0300 (0:00:00.066)       0:00:20.743 ******* 
2026-11-09T13:33:10.1341450Z [WARNING]: conditional statements should not include jinja2 templating
2026-11-09T13:33:10.1341894Z delimiters such as {{ }} or {% %}. Found: {{ lookup('env','HSM') |
2026-11-09T13:33:10.1342075Z default('false', true) | bool }}
2026-11-09T13:33:10.1451873Z 
2026-11-09T13:33:10.1452148Z PLAY [jboss] *******************************************************************
2026-11-09T13:33:10.1488834Z 
2026-11-09T13:33:10.1489047Z PLAY [jboss] *******************************************************************
2026-11-09T13:33:10.1520358Z 
2026-11-09T13:33:10.1520509Z PLAY [jboss] *******************************************************************
2026-11-09T13:33:10.1798844Z Monday 09 November 2026  10:33:10 -0300 (0:00:00.081)       0:00:20.824 ******* 
2026-11-09T13:33:10.2405465Z 
2026-11-09T13:33:10.2406212Z TASK [Cria variável build_repository_name] *************************************
2026-11-09T13:33:10.2406382Z ok: [caddeapllx2864.agil.nprd.caixa.gov.br]
2026-11-09T13:33:10.2664803Z Monday 09 November 2026  10:33:10 -0300 (0:00:00.086)       0:00:20.911 ******* 
2026-11-09T13:33:10.3232164Z 
2026-11-09T13:33:10.3232701Z TASK [Buscando diretorio de config] ********************************************
2026-11-09T13:33:10.3232946Z ok: [caddeapllx2864.agil.nprd.caixa.gov.br]
2026-11-09T13:33:10.3543439Z Monday 09 November 2026  10:33:10 -0300 (0:00:00.087)       0:00:20.998 ******* 
2026-11-09T13:33:10.7096984Z 
2026-11-09T13:33:10.7097644Z TASK [Verifica se o arquivo {{ item }}/etc/hosts-{{ sistema_ambiente }} existe] ***
2026-11-09T13:33:10.7097995Z ok: [caddeapllx2864.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r19548/a/_SIEMP-java-web-config)
2026-11-09T13:33:11.0118109Z ok: [caddeapllx2864.agil.nprd.caixa.gov.br] => (item=/opt/ads-agent/_work/r19548/a/_SIEMP-java-web-config/so)
2026-11-09T13:33:11.0383384Z Monday 09 November 2026  10:33:11 -0300 (0:00:00.684)       0:00:21.683 ******* 
2026-11-09T13:33:11.0931859Z 
2026-11-09T13:33:11.0932763Z PLAY [jboss] *******************************************************************
2026-11-09T13:33:11.1238025Z Monday 09 November 2026  10:33:11 -0300 (0:00:00.085)       0:00:21.768 ******* 
2026-11-09T13:33:11.3715529Z 
2026-11-09T13:33:11.3716234Z TASK [Verifica se o arquivo /opt/jboss-eap/standalone/configuration/custom.sh existe] ***
2026-11-09T13:33:11.3716475Z ok: [caddeapllx2864.agil.nprd.caixa.gov.br]
2026-11-09T13:33:11.3991630Z Monday 09 November 2026  10:33:11 -0300 (0:00:00.275)       0:00:22.043 ******* 
2026-11-09T13:33:11.4686578Z Monday 09 November 2026  10:33:11 -0300 (0:00:00.069)       0:00:22.113 ******* 
2026-11-09T13:33:11.7150465Z 
2026-11-09T13:33:11.7151322Z TASK [Verifica se o arquivo /opt/batch/config/configuration/custom.sh existe] ***
2026-11-09T13:33:11.7151536Z ok: [caddeapllx2864.agil.nprd.caixa.gov.br]
2026-11-09T13:33:11.7409995Z Monday 09 November 2026  10:33:11 -0300 (0:00:00.272)       0:00:22.385 ******* 
2026-11-09T13:33:11.7831058Z 
2026-11-09T13:33:11.7831918Z PLAY [local] *******************************************************************
2026-11-09T13:33:11.7865885Z [WARNING]: Could not match supplied host pattern, ignoring: instance_restart
2026-11-09T13:33:11.7869071Z 
2026-11-09T13:33:11.7869447Z PLAY [instance_restart] ********************************************************
2026-11-09T13:33:11.7869645Z skipping: no hosts matched
2026-11-09T13:33:11.7871705Z [WARNING]: Could not match supplied host pattern, ignoring: machine_reboot
2026-11-09T13:33:11.7874846Z 
2026-11-09T13:33:11.7875313Z PLAY [machine_reboot] **********************************************************
2026-11-09T13:33:11.7875484Z skipping: no hosts matched
2026-11-09T13:33:11.7881734Z 
2026-11-09T13:33:11.7882015Z PLAY [local] *******************************************************************
2026-11-09T13:33:11.7908949Z [WARNING]: Could not match supplied host pattern, ignoring: instance_stop
2026-11-09T13:33:11.7911868Z 
2026-11-09T13:33:11.7912019Z PLAY [instance_stop] ***********************************************************
2026-11-09T13:33:11.7912271Z skipping: no hosts matched
2026-11-09T13:33:11.7915419Z 
2026-11-09T13:33:11.7915606Z PLAY [machine_reboot] **********************************************************
2026-11-09T13:33:11.7915761Z skipping: no hosts matched
2026-11-09T13:33:11.7921460Z 
2026-11-09T13:33:11.7921878Z PLAY [local] *******************************************************************
2026-11-09T13:33:11.7943155Z [WARNING]: Could not match supplied host pattern, ignoring: escopo_execucao
2026-11-09T13:33:11.7946655Z 
2026-11-09T13:33:11.7946899Z PLAY [Executar o Start do Sirot Connector no escopo definido] ******************
2026-11-09T13:33:11.7947044Z skipping: no hosts matched
2026-11-09T13:33:11.7955049Z 
2026-11-09T13:33:11.7955195Z PLAY [local] *******************************************************************
2026-11-09T13:33:11.7978163Z 
2026-11-09T13:33:11.7978433Z PLAY [Executar o Stop do Sirot Connector] **************************************
2026-11-09T13:33:11.7978580Z skipping: no hosts matched
2026-11-09T13:33:11.7985452Z 
2026-11-09T13:33:11.7985586Z PLAY [Configura TSM] ***********************************************************
2026-11-09T13:33:11.8013770Z 
2026-11-09T13:33:11.8013916Z PLAY [jboss] *******************************************************************
2026-11-09T13:33:11.8040116Z 
2026-11-09T13:33:11.8040683Z PLAY [Configura Control-M] *****************************************************
2026-11-09T13:33:11.8082149Z 
2026-11-09T13:33:11.8082317Z PLAY [jboss] *******************************************************************
2026-11-09T13:33:11.8124082Z 
2026-11-09T13:33:11.8124229Z PLAY [jboss] *******************************************************************
2026-11-09T13:33:11.8165079Z 
2026-11-09T13:33:11.8165508Z PLAY [jboss] *******************************************************************
2026-11-09T13:33:11.8189904Z 
2026-11-09T13:33:11.8190066Z PLAY [jboss] *******************************************************************
2026-11-09T13:33:11.8216412Z 
2026-11-09T13:33:11.8216552Z PLAY [localhost] ***************************************************************
2026-11-09T13:33:11.8244759Z 
2026-11-09T13:33:11.8244984Z PLAY [jboss] *******************************************************************
2026-11-09T13:33:11.8300271Z 
2026-11-09T13:33:11.8300596Z PLAY [jboss] *******************************************************************
2026-11-09T13:33:11.8341945Z 
2026-11-09T13:33:11.8342237Z PLAY [jboss] *******************************************************************
2026-11-09T13:33:11.8380943Z 
2026-11-09T13:33:11.8381333Z PLAY RECAP *********************************************************************
2026-11-09T13:33:11.8381648Z caddeapllx2864.agil.nprd.caixa.gov.br : ok=51   changed=2    unreachable=0    failed=0    skipped=28   rescued=0    ignored=1   
2026-11-09T13:33:11.8381754Z 
2026-11-09T13:33:11.8382092Z Monday 09 November 2026  10:33:11 -0300 (0:00:00.097)       0:00:22.483 ******* 
2026-11-09T13:33:11.8382258Z =============================================================================== 
2026-11-09T13:33:11.8387788Z Gerando fatos de servicos ----------------------------------------------- 1.36s
2026-11-09T13:33:11.8388029Z Gathering Facts --------------------------------------------------------- 0.88s
2026-11-09T13:33:11.8388278Z Create a symbolic link -------------------------------------------------- 0.88s
2026-11-09T13:33:11.8388515Z Realiza copia do arquivo de Trust Store --------------------------------- 0.78s
2026-11-09T13:33:11.8388842Z Get standalone-ha.xml status -------------------------------------------- 0.73s
2026-11-09T13:33:11.8389294Z Get standalone.conf status ---------------------------------------------- 0.72s
2026-11-09T13:33:11.8389537Z Verifica se o arquivo  existe ------------------------------------------- 0.71s
2026-11-09T13:33:11.8389761Z Verifica se o arquivo  existe ------------------------------------------- 0.71s
2026-11-09T13:33:11.8389984Z Get standalone-full-ha.xml status --------------------------------------- 0.71s
2026-11-09T13:33:11.8390309Z Check directory configuration exists ------------------------------------ 0.70s
2026-11-09T13:33:11.8390990Z Create a directory ------------------------------------------------------ 0.69s
2026-11-09T13:33:11.8391288Z Verifica se o arquivo {{ item }}/etc/hosts-{{ sistema_ambiente }} existe --- 0.68s
2026-11-09T13:33:11.8391637Z Get standalone.xml status ----------------------------------------------- 0.68s
2026-11-09T13:33:11.8391949Z Restart Zabbix ---------------------------------------------------------- 0.65s
2026-11-09T13:33:11.8392190Z Copiando arquivo standalone.conf ---------------------------------------- 0.63s
2026-11-09T13:33:11.8392425Z Copy template script ---------------------------------------------------- 0.62s
2026-11-09T13:33:11.8392974Z Copiando arquivo standalone-full-ha.xml --------------------------------- 0.62s
2026-11-09T13:33:11.8393249Z JBoss systemd wrapper for sysvinit script mode domain ------------------- 0.61s
2026-11-09T13:33:11.8393486Z Copiando artefato (jboss-custom.cli) para o(s) servidor(es) Jboss ------- 0.60s
2026-11-09T13:33:11.8393711Z Copy common_start.sh ---------------------------------------------------- 0.60s
2026-11-09T13:33:11.8393877Z Playbook run took 0 days, 0 hours, 0 minutes, 22 seconds
2026-11-09T13:33:11.9102681Z ##[section]Finishing: Deploy Config no JBOSS
