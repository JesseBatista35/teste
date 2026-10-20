Bom dia , o erro que encontramos na criação da release do boleto service é esse abaixo:
 
 Principais falhas encontradas:
Falha ao habilitar repositório no Satellite
Evidência: 20_Cadastrar Servidor no Satellite.log:153
Erro: repository ID inválido
Mensagem: Error: 'CEF_Zabbix_Zabbix_6_REDHAT_9' does not match a valid repository ID
Consequência: task falha e o bash encerra com código 2 em 20_Cadastrar Servidor no Satellite.log:171
Falha na integração com API de monitoração
Evidência: 33_Configurando Stack de Monitoração.log:179
Erro: HTTP 404 na URL da API do Zabbix
URL: https://monitoracao.az.cloud.caixa/zabbixapi/api_jsonrpc.php
Consequência: etapa também termina com bash code 2 em 33_Configurando Stack de Monitoração.log:208
Observação adicional:
Houve erro de serviço zabbix-agent não encontrado, mas foi ignorado pelo playbook: 37_Deploy Config no JBOSS.log:278
O deploy do pacote no JBoss concluiu com failed=0: 38_Deploy Pacote no JBOSS.log:155
 
11:58 Reunião encerrada 1h 44min 2s [ADDR] SIGSJ - Pendências JBOSSterça-feira, 20 de outubro de 2026 10:16 - 11:58Exibir recapitulação2ConteúdoTranscriçãoNT CEPTI SIGSJ Ambiente obsoleto 3.pdf

 
Boa tarde . A falha identificada no projeto SIGSJ-intranet durante a release 
Etapa: Configurando Stack de Monitoração
Erro:

TASK [zabbix : hostgroup get to Zabbix Az CEMOT]

FAILED! => msg: Status code was 404 and not [200, 202]: HTTP Error 404: Not Found

url: https://monitoracao.az.cloud.caixa/zabbixapi/api_jsonrpc.php
Resultado da etapa:

Bash exited with code '2'.
 
Erro comum nas duas releases INTRANET e BOLETO SERVICE: falha na integração com a API do Zabbix, com retorno HTTP 404 no endpoint de monitoração.


2026-10-20T14:26:06.9040701Z ##[section]Starting: Check Deployments [JBOSS]
2026-10-20T14:26:06.9045611Z ==============================================================================
2026-10-20T14:26:06.9045752Z Task         : Bash
2026-10-20T14:26:06.9045842Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-10-20T14:26:06.9045928Z Version      : 3.227.0
2026-10-20T14:26:06.9045989Z Author       : Microsoft Corporation
2026-10-20T14:26:06.9046080Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-10-20T14:26:06.9046205Z ==============================================================================
2026-10-20T14:26:07.8091877Z Generating script.
2026-10-20T14:26:07.8092301Z Script contents:
2026-10-20T14:26:07.8092738Z ansible-playbook /opt/ads-agent/_work/r13496/a/esteira-jboss-vm-v2/site.yml --tags check_deployments -e sistema_ambiente=des -e sistema_nome=sigsj-boleto -e site=ctc_nprd
2026-10-20T14:26:07.8093355Z ========================== Starting Command Output ===========================
2026-10-20T14:26:07.8100362Z [command]/bin/bash /opt/ads-agent/_work/_temp/2489db82-2fc9-4bc2-a3d4-b2912409fa46.sh
2026-10-20T14:26:10.2195902Z 
2026-10-20T14:26:10.2198005Z PLAY [local] *******************************************************************
2026-10-20T14:26:10.2523849Z 
2026-10-20T14:26:10.2524556Z PLAY [Configurando o DNS] ******************************************************
2026-10-20T14:26:10.4885072Z 
2026-10-20T14:26:10.4885802Z PLAY [local] *******************************************************************
2026-10-20T14:26:10.4919984Z 
2026-10-20T14:26:10.4920594Z PLAY [Verificando serviços] ****************************************************
2026-10-20T14:26:10.5011453Z 
2026-10-20T14:26:10.5012247Z PLAY [Configuração LDAP] *******************************************************
2026-10-20T14:26:10.5047646Z [WARNING]: Found variable using reserved name: when
2026-10-20T14:26:10.5052580Z 
2026-10-20T14:26:10.5053017Z PLAY [jboss] *******************************************************************
2026-10-20T14:26:10.5144760Z 
2026-10-20T14:26:10.5145280Z PLAY [Stack Jboss] *************************************************************
2026-10-20T14:26:10.5394739Z Tuesday 20 October 2026  11:26:10 -0300 (0:00:00.385)       0:00:00.385 ******* 
2026-10-20T14:26:11.0504959Z 
2026-10-20T14:26:11.0506215Z TASK [Verifica ser o Jboss já foi instalado] ***********************************
2026-10-20T14:26:11.0506437Z [DEPRECATION WARNING]: Distribution rhel 9.3 on host 
2026-10-20T14:26:11.0506647Z caddeapllx2557.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, 
2026-10-20T14:26:11.0506814Z but is using /usr/bin/python for backward compatibility with prior Ansible 
2026-10-20T14:26:11.0506971Z releases. A future Ansible release will default to using the discovered 
2026-10-20T14:26:11.0507125Z platform python for this host. See https://docs.ansible.com/ansible/2.9/referen
2026-10-20T14:26:11.0507282Z ce_appendices/interpreter_discovery.html for more information. This feature 
2026-10-20T14:26:11.0507455Z will be removed in version 2.12. Deprecation warnings can be disabled by 
2026-10-20T14:26:11.0507922Z setting deprecation_warnings=False in ansible.cfg.
2026-10-20T14:26:11.0508060Z ok: [caddeapllx2557.agil.nprd.caixa.gov.br]
2026-10-20T14:26:11.0534118Z 
2026-10-20T14:26:11.0534630Z PLAY [jboss] *******************************************************************
2026-10-20T14:26:11.0581643Z 
2026-10-20T14:26:11.0581976Z PLAY [jboss] *******************************************************************
2026-10-20T14:26:11.0626444Z 
2026-10-20T14:26:11.0627175Z PLAY [jboss] *******************************************************************
2026-10-20T14:26:11.0654764Z 
2026-10-20T14:26:11.0655116Z PLAY [Copiando deployments adicionais] *****************************************
2026-10-20T14:26:11.0682966Z 
2026-10-20T14:26:11.0683192Z PLAY [Copiando modules adicionais] *********************************************
2026-10-20T14:26:11.0711614Z 
2026-10-20T14:26:11.0712066Z PLAY [jboss] *******************************************************************
2026-10-20T14:26:11.0746885Z 
2026-10-20T14:26:11.0747211Z PLAY [jboss] *******************************************************************
2026-10-20T14:26:11.0780427Z 
2026-10-20T14:26:11.0780671Z PLAY [jboss] *******************************************************************
2026-10-20T14:26:11.0825196Z Tuesday 20 October 2026  11:26:11 -0300 (0:00:00.543)       0:00:00.929 ******* 
2026-10-20T14:26:11.4526635Z 
2026-10-20T14:26:11.4527203Z TASK [Wait for Jboss Management port] ******************************************
2026-10-20T14:26:11.4527367Z ok: [caddeapllx2557.agil.nprd.caixa.gov.br]
2026-10-20T14:26:11.4563067Z Tuesday 20 October 2026  11:26:11 -0300 (0:00:00.373)       0:00:01.302 ******* 
2026-10-20T14:26:12.0975977Z 
2026-10-20T14:26:12.0976545Z TASK [Check if Jboss is Running] ***********************************************
2026-10-20T14:26:12.0977287Z ok: [caddeapllx2557.agil.nprd.caixa.gov.br]
2026-10-20T14:26:12.1014610Z Tuesday 20 October 2026  11:26:12 -0300 (0:00:00.645)       0:00:01.947 ******* 
2026-10-20T14:26:12.5373145Z FAILED - RETRYING: Check Deployment details looking for status OK (60 retries left).
2026-10-20T14:26:17.9244747Z FAILED - RETRYING: Check Deployment details looking for status OK (59 retries left).
2026-10-20T14:26:23.2894437Z FAILED - RETRYING: Check Deployment details looking for status OK (58 retries left).
2026-10-20T14:26:28.6694646Z FAILED - RETRYING: Check Deployment details looking for status OK (57 retries left).
2026-10-20T14:26:34.0450559Z FAILED - RETRYING: Check Deployment details looking for status OK (56 retries left).
2026-10-20T14:26:39.4160358Z FAILED - RETRYING: Check Deployment details looking for status OK (55 retries left).
2026-10-20T14:26:44.7888618Z FAILED - RETRYING: Check Deployment details looking for status OK (54 retries left).
2026-10-20T14:26:50.1715805Z FAILED - RETRYING: Check Deployment details looking for status OK (53 retries left).
2026-10-20T14:26:55.5415784Z FAILED - RETRYING: Check Deployment details looking for status OK (52 retries left).
2026-10-20T14:27:00.9204103Z FAILED - RETRYING: Check Deployment details looking for status OK (51 retries left).
2026-10-20T14:27:06.3024074Z FAILED - RETRYING: Check Deployment details looking for status OK (50 retries left).
2026-10-20T14:27:11.6740540Z FAILED - RETRYING: Check Deployment details looking for status OK (49 retries left).
2026-10-20T14:27:17.0540484Z FAILED - RETRYING: Check Deployment details looking for status OK (48 retries left).
2026-10-20T14:27:22.4328901Z FAILED - RETRYING: Check Deployment details looking for status OK (47 retries left).
2026-10-20T14:27:27.8101344Z FAILED - RETRYING: Check Deployment details looking for status OK (46 retries left).
2026-10-20T14:27:33.1736902Z FAILED - RETRYING: Check Deployment details looking for status OK (45 retries left).
2026-10-20T14:27:38.5523852Z FAILED - RETRYING: Check Deployment details looking for status OK (44 retries left).
2026-10-20T14:27:43.9219880Z FAILED - RETRYING: Check Deployment details looking for status OK (43 retries left).
2026-10-20T14:27:49.2922880Z FAILED - RETRYING: Check Deployment details looking for status OK (42 retries left).
2026-10-20T14:27:54.6689919Z FAILED - RETRYING: Check Deployment details looking for status OK (41 retries left).
2026-10-20T14:28:00.0411004Z FAILED - RETRYING: Check Deployment details looking for status OK (40 retries left).
2026-10-20T14:28:05.4277013Z FAILED - RETRYING: Check Deployment details looking for status OK (39 retries left).
2026-10-20T14:28:10.8052592Z FAILED - RETRYING: Check Deployment details looking for status OK (38 retries left).
2026-10-20T14:28:16.1736627Z FAILED - RETRYING: Check Deployment details looking for status OK (37 retries left).
2026-10-20T14:28:21.5528628Z FAILED - RETRYING: Check Deployment details looking for status OK (36 retries left).
2026-10-20T14:28:26.9337999Z FAILED - RETRYING: Check Deployment details looking for status OK (35 retries left).
2026-10-20T14:28:32.3025994Z FAILED - RETRYING: Check Deployment details looking for status OK (34 retries left).
2026-10-20T14:28:37.6713738Z FAILED - RETRYING: Check Deployment details looking for status OK (33 retries left).
2026-10-20T14:28:43.0474663Z FAILED - RETRYING: Check Deployment details looking for status OK (32 retries left).
2026-10-20T14:28:48.4154409Z FAILED - RETRYING: Check Deployment details looking for status OK (31 retries left).
2026-10-20T14:28:53.7862801Z FAILED - RETRYING: Check Deployment details looking for status OK (30 retries left).
2026-10-20T14:28:59.1607464Z FAILED - RETRYING: Check Deployment details looking for status OK (29 retries left).
2026-10-20T14:29:04.5310948Z FAILED - RETRYING: Check Deployment details looking for status OK (28 retries left).
2026-10-20T14:29:09.9047297Z FAILED - RETRYING: Check Deployment details looking for status OK (27 retries left).
2026-10-20T14:29:15.3017425Z FAILED - RETRYING: Check Deployment details looking for status OK (26 retries left).
2026-10-20T14:29:20.6694481Z FAILED - RETRYING: Check Deployment details looking for status OK (25 retries left).
2026-10-20T14:29:26.0406009Z FAILED - RETRYING: Check Deployment details looking for status OK (24 retries left).
2026-10-20T14:29:31.4167658Z FAILED - RETRYING: Check Deployment details looking for status OK (23 retries left).
2026-10-20T14:29:36.7814737Z FAILED - RETRYING: Check Deployment details looking for status OK (22 retries left).
2026-10-20T14:29:42.1462157Z FAILED - RETRYING: Check Deployment details looking for status OK (21 retries left).
2026-10-20T14:29:47.5267086Z FAILED - RETRYING: Check Deployment details looking for status OK (20 retries left).
2026-10-20T14:29:52.9054511Z FAILED - RETRYING: Check Deployment details looking for status OK (19 retries left).
2026-10-20T14:29:58.2785463Z FAILED - RETRYING: Check Deployment details looking for status OK (18 retries left).
2026-10-20T14:30:03.6609617Z FAILED - RETRYING: Check Deployment details looking for status OK (17 retries left).
2026-10-20T14:30:09.0308201Z FAILED - RETRYING: Check Deployment details looking for status OK (16 retries left).
2026-10-20T14:30:14.3973606Z FAILED - RETRYING: Check Deployment details looking for status OK (15 retries left).
2026-10-20T14:30:19.7792406Z FAILED - RETRYING: Check Deployment details looking for status OK (14 retries left).
2026-10-20T14:30:25.1525350Z FAILED - RETRYING: Check Deployment details looking for status OK (13 retries left).
2026-10-20T14:30:30.5216453Z FAILED - RETRYING: Check Deployment details looking for status OK (12 retries left).
2026-10-20T14:30:35.8985364Z FAILED - RETRYING: Check Deployment details looking for status OK (11 retries left).
2026-10-20T14:30:41.2682292Z FAILED - RETRYING: Check Deployment details looking for status OK (10 retries left).
2026-10-20T14:30:46.6356754Z FAILED - RETRYING: Check Deployment details looking for status OK (9 retries left).
2026-10-20T14:30:52.0167189Z FAILED - RETRYING: Check Deployment details looking for status OK (8 retries left).
2026-10-20T14:30:57.3920904Z FAILED - RETRYING: Check Deployment details looking for status OK (7 retries left).
2026-10-20T14:31:02.7720785Z FAILED - RETRYING: Check Deployment details looking for status OK (6 retries left).
2026-10-20T14:31:08.1679172Z FAILED - RETRYING: Check Deployment details looking for status OK (5 retries left).
2026-10-20T14:31:13.5315698Z FAILED - RETRYING: Check Deployment details looking for status OK (4 retries left).
2026-10-20T14:31:18.9073531Z FAILED - RETRYING: Check Deployment details looking for status OK (3 retries left).
2026-10-20T14:31:24.3049723Z FAILED - RETRYING: Check Deployment details looking for status OK (2 retries left).
2026-10-20T14:31:29.6801981Z FAILED - RETRYING: Check Deployment details looking for status OK (1 retries left).
2026-10-20T14:31:35.0495187Z 
2026-10-20T14:31:35.0496090Z TASK [Check Deployment details looking for status OK] **************************
2026-10-20T14:31:35.0502858Z fatal: [caddeapllx2557.agil.nprd.caixa.gov.br]: FAILED! => {"attempts": 60, "changed": false, "connection": "close", "content": "{\"outcome\" : \"success\", \"result\" : {\"boletoService-ear.ear\" : {\"content\" : [{\"hash\" : { \"BYTES_VALUE\" : \"X38w/tfh1zWKGxN4weA3puw/djQ=\" }}], \"disabled-time\" : null, \"disabled-timestamp\" : null, \"enabled\" : true, \"enabled-time\" : 1792506354418, \"enabled-timestamp\" : \"2026-10-20 11:25:54,418 BRT\", \"managed\" : true, \"name\" : \"boletoService-ear.ear\", \"owner\" : [{ \"subsystem\" : \"deployment-scanner\" },{ \"scanner\" : \"default\" }], \"persistent\" : false, \"runtime-name\" : \"boletoService-ear.ear\", \"status\" : \"FAILED\", \"subdeployment\" : {\"boletoService-war-2.0.2.8.war\" : null}, \"subsystem\" : null}}}", "content_encoding": "identity", "content_length": "592", "content_type": "application/json; charset=utf-8", "cookies": {}, "cookies_string": "", "date": "Tue, 20 Oct 2026 14:31:34 GMT", "elapsed": 0, "json": {"outcome": "success", "result": {"boletoService-ear.ear": {"content": [{"hash": {"BYTES_VALUE": "X38w/tfh1zWKGxN4weA3puw/djQ="}}], "disabled-time": null, "disabled-timestamp": null, "enabled": true, "enabled-time": 1792506354418, "enabled-timestamp": "2026-10-20 11:25:54,418 BRT", "managed": true, "name": "boletoService-ear.ear", "owner": [{"subsystem": "deployment-scanner"}, {"scanner": "default"}], "persistent": false, "runtime-name": "boletoService-ear.ear", "status": "FAILED", "subdeployment": {"boletoService-war-2.0.2.8.war": null}, "subsystem": null}}}, "msg": "OK (592 bytes)", "redirected": false, "status": 200, "url": "http://10.116.201.25:9990/management/", "x_content_type_options": "nosniff", "x_frame_options": "SAMEORIGIN"}
2026-10-20T14:31:35.0536772Z Tuesday 20 October 2026  11:31:35 -0300 (0:05:22.952)       0:05:24.900 ******* 
2026-10-20T14:31:47.8615617Z 
2026-10-20T14:31:47.8616164Z TASK [systemd] *****************************************************************
2026-10-20T14:31:47.8616327Z changed: [caddeapllx2557.agil.nprd.caixa.gov.br]
2026-10-20T14:31:47.8663802Z Tuesday 20 October 2026  11:31:47 -0300 (0:00:12.812)       0:05:37.712 ******* 
2026-10-20T14:31:48.1768071Z 
2026-10-20T14:31:48.1768626Z TASK [Wait for Jboss Management port] ******************************************
2026-10-20T14:31:48.1768795Z ok: [caddeapllx2557.agil.nprd.caixa.gov.br]
2026-10-20T14:31:48.1810239Z Tuesday 20 October 2026  11:31:48 -0300 (0:00:00.314)       0:05:38.027 ******* 
2026-10-20T14:31:48.8173503Z FAILED - RETRYING: Check if Jboss is Running (120 retries left).
2026-10-20T14:31:54.2312191Z 
2026-10-20T14:31:54.2312682Z TASK [Check if Jboss is Running] ***********************************************
2026-10-20T14:31:54.2312858Z ok: [caddeapllx2557.agil.nprd.caixa.gov.br]
2026-10-20T14:31:54.2350558Z Tuesday 20 October 2026  11:31:54 -0300 (0:00:06.053)       0:05:44.081 ******* 
2026-10-20T14:31:54.7200211Z FAILED - RETRYING: Check Deployment details looking for status OK (60 retries left).
2026-10-20T14:32:00.0868182Z FAILED - RETRYING: Check Deployment details looking for status OK (59 retries left).
2026-10-20T14:32:05.4715050Z FAILED - RETRYING: Check Deployment details looking for status OK (58 retries left).
2026-10-20T14:32:10.8422650Z FAILED - RETRYING: Check Deployment details looking for status OK (57 retries left).
2026-10-20T14:32:16.2097311Z FAILED - RETRYING: Check Deployment details looking for status OK (56 retries left).
2026-10-20T14:32:21.5862925Z FAILED - RETRYING: Check Deployment details looking for status OK (55 retries left).
2026-10-20T14:32:26.9707222Z FAILED - RETRYING: Check Deployment details looking for status OK (54 retries left).
2026-10-20T14:32:32.3452249Z FAILED - RETRYING: Check Deployment details looking for status OK (53 retries left).
2026-10-20T14:32:37.7225979Z FAILED - RETRYING: Check Deployment details looking for status OK (52 retries left).
2026-10-20T14:32:43.0876399Z FAILED - RETRYING: Check Deployment details looking for status OK (51 retries left).
2026-10-20T14:32:48.4565166Z FAILED - RETRYING: Check Deployment details looking for status OK (50 retries left).
2026-10-20T14:32:53.8334277Z FAILED - RETRYING: Check Deployment details looking for status OK (49 retries left).
2026-10-20T14:32:59.1987408Z FAILED - RETRYING: Check Deployment details looking for status OK (48 retries left).
2026-10-20T14:33:04.5860418Z FAILED - RETRYING: Check Deployment details looking for status OK (47 retries left).
2026-10-20T14:33:09.9691298Z FAILED - RETRYING: Check Deployment details looking for status OK (46 retries left).
2026-10-20T14:33:15.3360113Z FAILED - RETRYING: Check Deployment details looking for status OK (45 retries left).
2026-10-20T14:33:20.7031688Z FAILED - RETRYING: Check Deployment details looking for status OK (44 retries left).
2026-10-20T14:33:26.0836443Z FAILED - RETRYING: Check Deployment details looking for status OK (43 retries left).
2026-10-20T14:33:31.4471681Z FAILED - RETRYING: Check Deployment details looking for status OK (42 retries left).
2026-10-20T14:33:36.8178072Z FAILED - RETRYING: Check Deployment details looking for status OK (41 retries left).
2026-10-20T14:33:42.1928801Z FAILED - RETRYING: Check Deployment details looking for status OK (40 retries left).
2026-10-20T14:33:47.5559029Z FAILED - RETRYING: Check Deployment details looking for status OK (39 retries left).
2026-10-20T14:33:52.9198681Z FAILED - RETRYING: Check Deployment details looking for status OK (38 retries left).
2026-10-20T14:33:58.2924090Z FAILED - RETRYING: Check Deployment details looking for status OK (37 retries left).
2026-10-20T14:34:03.6560443Z FAILED - RETRYING: Check Deployment details looking for status OK (36 retries left).
2026-10-20T14:34:09.0197229Z FAILED - RETRYING: Check Deployment details looking for status OK (35 retries left).
2026-10-20T14:34:14.4014383Z FAILED - RETRYING: Check Deployment details looking for status OK (34 retries left).
2026-10-20T14:34:19.7682898Z FAILED - RETRYING: Check Deployment details looking for status OK (33 retries left).
2026-10-20T14:34:25.1395607Z FAILED - RETRYING: Check Deployment details looking for status OK (32 retries left).
2026-10-20T14:34:30.5170748Z FAILED - RETRYING: Check Deployment details looking for status OK (31 retries left).
2026-10-20T14:34:35.8891668Z FAILED - RETRYING: Check Deployment details looking for status OK (30 retries left).
2026-10-20T14:34:41.2620603Z FAILED - RETRYING: Check Deployment details looking for status OK (29 retries left).
2026-10-20T14:34:46.6507388Z FAILED - RETRYING: Check Deployment details looking for status OK (28 retries left).
2026-10-20T14:34:52.0166732Z FAILED - RETRYING: Check Deployment details looking for status OK (27 retries left).
2026-10-20T14:34:57.3921035Z FAILED - RETRYING: Check Deployment details looking for status OK (26 retries left).
2026-10-20T14:35:02.7804428Z FAILED - RETRYING: Check Deployment details looking for status OK (25 retries left).
2026-10-20T14:35:08.1494743Z FAILED - RETRYING: Check Deployment details looking for status OK (24 retries left).
2026-10-20T14:35:13.5222307Z FAILED - RETRYING: Check Deployment details looking for status OK (23 retries left).
2026-10-20T14:35:18.8995756Z FAILED - RETRYING: Check Deployment details looking for status OK (22 retries left).
2026-10-20T14:35:24.2758022Z FAILED - RETRYING: Check Deployment details looking for status OK (21 retries left).
2026-10-20T14:35:29.6424923Z FAILED - RETRYING: Check Deployment details looking for status OK (20 retries left).
2026-10-20T14:35:35.0228826Z FAILED - RETRYING: Check Deployment details looking for status OK (19 retries left).
2026-10-20T14:35:40.3906496Z FAILED - RETRYING: Check Deployment details looking for status OK (18 retries left).
2026-10-20T14:35:45.7607019Z FAILED - RETRYING: Check Deployment details looking for status OK (17 retries left).
2026-10-20T14:35:51.1434536Z FAILED - RETRYING: Check Deployment details looking for status OK (16 retries left).
2026-10-20T14:35:56.5145278Z FAILED - RETRYING: Check Deployment details looking for status OK (15 retries left).
2026-10-20T14:36:01.8839982Z FAILED - RETRYING: Check Deployment details looking for status OK (14 retries left).
2026-10-20T14:36:04.9477144Z ##[error]The operation was canceled.
2026-10-20T14:36:04.9479735Z ##[section]Finishing: Check Deployments [JBOSS]



2026-10-20T14:26:22.7130883Z ##[section]Starting: Check Deployments [JBOSS]
2026-10-20T14:26:22.7134287Z ==============================================================================
2026-10-20T14:26:22.7134365Z Task         : Bash
2026-10-20T14:26:22.7134418Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-10-20T14:26:22.7134481Z Version      : 3.227.0
2026-10-20T14:26:22.7134524Z Author       : Microsoft Corporation
2026-10-20T14:26:22.7134581Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-10-20T14:26:22.7134652Z ==============================================================================
2026-10-20T14:26:23.2671826Z Generating script.
2026-10-20T14:26:23.2679683Z Script contents:
2026-10-20T14:26:23.2680214Z ansible-playbook /opt/ads-agent/_work/r16031/a/esteira-jboss-vm-v2/site.yml --tags check_deployments -e sistema_ambiente=des -e sistema_nome=sigsj-intranet -e site=ctc_nprd
2026-10-20T14:26:23.2683628Z ========================== Starting Command Output ===========================
2026-10-20T14:26:23.2690716Z [command]/bin/bash /opt/ads-agent/_work/_temp/501f37c4-ae28-43ca-99b8-2ca9b2fe2dca.sh
2026-10-20T14:26:25.4687338Z 
2026-10-20T14:26:25.4687782Z PLAY [local] *******************************************************************
2026-10-20T14:26:25.4991494Z 
2026-10-20T14:26:25.4992006Z PLAY [Configurando o DNS] ******************************************************
2026-10-20T14:26:25.6923157Z 
2026-10-20T14:26:25.6923457Z PLAY [local] *******************************************************************
2026-10-20T14:26:25.6968376Z 
2026-10-20T14:26:25.6969121Z PLAY [Verificando serviços] ****************************************************
2026-10-20T14:26:25.7057051Z 
2026-10-20T14:26:25.7057774Z PLAY [Configuração LDAP] *******************************************************
2026-10-20T14:26:25.7094054Z [WARNING]: Found variable using reserved name: when
2026-10-20T14:26:25.7098903Z 
2026-10-20T14:26:25.7099413Z PLAY [jboss] *******************************************************************
2026-10-20T14:26:25.7188275Z 
2026-10-20T14:26:25.7188613Z PLAY [Stack Jboss] *************************************************************
2026-10-20T14:26:25.7433800Z Tuesday 20 October 2026  11:26:25 -0300 (0:00:00.336)       0:00:00.336 ******* 
2026-10-20T14:26:26.2456406Z 
2026-10-20T14:26:26.2457119Z TASK [Verifica ser o Jboss já foi instalado] ***********************************
2026-10-20T14:26:26.2457963Z [DEPRECATION WARNING]: Distribution rhel 9.3 on host 
2026-10-20T14:26:26.2458319Z caddeapllx955.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, 
2026-10-20T14:26:26.2458488Z but is using /usr/bin/python for backward compatibility with prior Ansible 
2026-10-20T14:26:26.2458663Z releases. A future Ansible release will default to using the discovered 
2026-10-20T14:26:26.2458812Z platform python for this host. See https://docs.ansible.com/ansible/2.9/referen
2026-10-20T14:26:26.2459292Z ce_appendices/interpreter_discovery.html for more information. This feature 
2026-10-20T14:26:26.2459461Z will be removed in version 2.12. Deprecation warnings can be disabled by 
2026-10-20T14:26:26.2459606Z setting deprecation_warnings=False in ansible.cfg.
2026-10-20T14:26:26.2459955Z ok: [caddeapllx955.agil.nprd.caixa.gov.br]
2026-10-20T14:26:26.2482625Z 
2026-10-20T14:26:26.2483095Z PLAY [jboss] *******************************************************************
2026-10-20T14:26:26.2525107Z 
2026-10-20T14:26:26.2525270Z PLAY [jboss] *******************************************************************
2026-10-20T14:26:26.2563935Z 
2026-10-20T14:26:26.2564093Z PLAY [jboss] *******************************************************************
2026-10-20T14:26:26.2589719Z 
2026-10-20T14:26:26.2589892Z PLAY [Copiando deployments adicionais] *****************************************
2026-10-20T14:26:26.2621240Z 
2026-10-20T14:26:26.2621605Z PLAY [Copiando modules adicionais] *********************************************
2026-10-20T14:26:26.2646306Z 
2026-10-20T14:26:26.2646616Z PLAY [jboss] *******************************************************************
2026-10-20T14:26:26.2682730Z 
2026-10-20T14:26:26.2683036Z PLAY [jboss] *******************************************************************
2026-10-20T14:26:26.2712607Z 
2026-10-20T14:26:26.2712915Z PLAY [jboss] *******************************************************************
2026-10-20T14:26:26.2763586Z Tuesday 20 October 2026  11:26:26 -0300 (0:00:00.533)       0:00:00.869 ******* 
2026-10-20T14:29:46.8525805Z 
2026-10-20T14:29:46.8526343Z TASK [Wait for Jboss Management port] ******************************************
2026-10-20T14:29:46.8527654Z fatal: [caddeapllx955.agil.nprd.caixa.gov.br]: FAILED! => {"changed": false, "elapsed": 200, "msg": "Timeout when waiting for 10.116.194.179:9990"}
2026-10-20T14:29:46.8574849Z Tuesday 20 October 2026  11:29:46 -0300 (0:03:20.579)       0:03:21.448 ******* 
2026-10-20T14:29:53.5578334Z 
2026-10-20T14:29:53.5579087Z TASK [systemd] *****************************************************************
2026-10-20T14:29:53.5579361Z changed: [caddeapllx955.agil.nprd.caixa.gov.br]
2026-10-20T14:29:53.5620391Z Tuesday 20 October 2026  11:29:53 -0300 (0:00:06.706)       0:03:28.155 ******* 
2026-10-20T14:33:14.0251642Z 
2026-10-20T14:33:14.0252203Z TASK [Wait for Jboss Management port] ******************************************
2026-10-20T14:33:14.0256248Z fatal: [caddeapllx955.agil.nprd.caixa.gov.br]: FAILED! => {"changed": false, "elapsed": 200, "msg": "Timeout when waiting for 10.116.194.179:9990"}
2026-10-20T14:33:14.0264160Z 
2026-10-20T14:33:14.0264347Z PLAY RECAP *********************************************************************
2026-10-20T14:33:14.0264696Z caddeapllx955.agil.nprd.caixa.gov.br : ok=2    changed=1    unreachable=0    failed=1    skipped=0    rescued=1    ignored=0   
2026-10-20T14:33:14.0264796Z 
2026-10-20T14:33:14.0265941Z Tuesday 20 October 2026  11:33:14 -0300 (0:03:20.464)       0:06:48.619 ******* 
2026-10-20T14:33:14.0266341Z =============================================================================== 
2026-10-20T14:33:14.0266677Z Wait for Jboss Management port ---------------------------------------- 200.58s
2026-10-20T14:33:14.0266911Z Wait for Jboss Management port ---------------------------------------- 200.46s
2026-10-20T14:33:14.0267144Z systemd ----------------------------------------------------------------- 6.71s
2026-10-20T14:33:14.0267383Z Verifica ser o Jboss já foi instalado ----------------------------------- 0.53s
2026-10-20T14:33:14.0267539Z Playbook run took 0 days, 0 hours, 6 minutes, 48 seconds
2026-10-20T14:33:14.1019560Z ##[error]Bash exited with code '2'.
2026-10-20T14:33:14.1057863Z ##[section]Finishing: Check Deployments [JBOSS]



O ERRO D
 
