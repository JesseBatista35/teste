2026-09-03T12:13:13.8819004Z ##[section]Starting: Deploy Config no JBOSS
2026-09-03T12:13:13.8822026Z ==============================================================================
2026-09-03T12:13:13.8822200Z Task         : Bash
2026-09-03T12:13:13.8822241Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-03T12:13:13.8822300Z Version      : 3.227.0
2026-09-03T12:13:13.8822349Z Author       : Microsoft Corporation
2026-09-03T12:13:13.8822396Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-03T12:13:13.8822462Z ==============================================================================
2026-09-03T12:13:14.7571614Z Generating script.
2026-09-03T12:13:14.7582754Z ========================== Starting Command Output ===========================
2026-09-03T12:13:14.7593263Z [command]/bin/bash /opt/ads-agent/_work/_temp/087a7836-e356-4cc4-877e-84f5cfdc4ef1.sh
2026-09-03T12:13:14.7683584Z /opt/ads-agent/_work/_temp/087a7836-e356-4cc4-877e-84f5cfdc4ef1.sh: line 2: site: comando não encontrado
2026-09-03T12:13:16.7259772Z 
2026-09-03T12:13:16.7260615Z PLAY [local] *******************************************************************
2026-09-03T12:13:16.7789381Z 
2026-09-03T12:13:16.7789854Z PLAY [Configurando o DNS] ******************************************************
2026-09-03T12:13:16.9329481Z 
2026-09-03T12:13:16.9331477Z PLAY [local] *******************************************************************
2026-09-03T12:13:16.9360671Z 
2026-09-03T12:13:16.9361156Z PLAY [Verificando serviços] ****************************************************
2026-09-03T12:13:16.9453613Z 
2026-09-03T12:13:16.9454144Z PLAY [Configuração LDAP] *******************************************************
2026-09-03T12:13:16.9522234Z 
2026-09-03T12:13:16.9522842Z PLAY [apache_des] **************************************************************
2026-09-03T12:13:16.9557746Z 
2026-09-03T12:13:16.9558450Z PLAY [jboss] *******************************************************************
2026-09-03T12:13:16.9628236Z Thursday 03 September 2026  09:13:16 -0300 (0:00:00.295)       0:00:00.295 **** 
2026-09-03T12:13:17.0125086Z Thursday 03 September 2026  09:13:17 -0300 (0:00:00.049)       0:00:00.344 **** 
2026-09-03T12:13:17.0601604Z Thursday 03 September 2026  09:13:17 -0300 (0:00:00.047)       0:00:00.392 **** 
2026-09-03T12:13:17.1088946Z Thursday 03 September 2026  09:13:17 -0300 (0:00:00.048)       0:00:00.441 **** 
2026-09-03T12:13:17.1564330Z 
2026-09-03T12:13:17.1565062Z PLAY [Instalando stack Jboss] **************************************************
2026-09-03T12:13:17.1679314Z Thursday 03 September 2026  09:13:17 -0300 (0:00:00.059)       0:00:00.500 **** 
2026-09-03T12:13:17.7088916Z 
2026-09-03T12:13:17.7093911Z TASK [Verificando o java versão esta instalado: 1.8.0_221] *********************
2026-09-03T12:13:17.7094088Z ok: [caddeapllx763.agil.nprd.caixa.gov.br]
2026-09-03T12:13:17.7164713Z ok: [caddeapllx756.agil.nprd.caixa.gov.br]
2026-09-03T12:13:17.7203915Z Thursday 03 September 2026  09:13:17 -0300 (0:00:00.552)       0:00:01.052 **** 
2026-09-03T12:13:18.1821152Z 
2026-09-03T12:13:18.1821853Z TASK [Verificando a versão do Java] ********************************************
2026-09-03T12:13:18.1822041Z changed: [caddeapllx763.agil.nprd.caixa.gov.br]
2026-09-03T12:13:18.2006938Z changed: [caddeapllx756.agil.nprd.caixa.gov.br]
2026-09-03T12:13:18.2042706Z Thursday 03 September 2026  09:13:18 -0300 (0:00:00.483)       0:00:01.536 **** 
2026-09-03T12:13:18.2640316Z Thursday 03 September 2026  09:13:18 -0300 (0:00:00.058)       0:00:01.595 **** 
2026-09-03T12:13:18.5314226Z 
2026-09-03T12:13:18.5314932Z TASK [Verifica ser o Jboss já foi instalado] ***********************************
2026-09-03T12:13:18.5315102Z ok: [caddeapllx763.agil.nprd.caixa.gov.br]
2026-09-03T12:13:18.5430458Z ok: [caddeapllx756.agil.nprd.caixa.gov.br]
2026-09-03T12:13:18.5471067Z Thursday 03 September 2026  09:13:18 -0300 (0:00:00.283)       0:00:01.879 **** 
2026-09-03T12:13:18.6070040Z 
2026-09-03T12:13:18.6077742Z TASK [Setando a versão do Jboss] ***********************************************
2026-09-03T12:13:18.6078332Z ok: [caddeapllx763.agil.nprd.caixa.gov.br]
2026-09-03T12:13:18.6149137Z ok: [caddeapllx756.agil.nprd.caixa.gov.br]
2026-09-03T12:13:18.6180176Z Thursday 03 September 2026  09:13:18 -0300 (0:00:00.070)       0:00:01.950 **** 
2026-09-03T12:13:18.6689083Z Thursday 03 September 2026  09:13:18 -0300 (0:00:00.050)       0:00:02.001 **** 
2026-09-03T12:13:18.7196903Z Thursday 03 September 2026  09:13:18 -0300 (0:00:00.050)       0:00:02.051 **** 
2026-09-03T12:13:18.7699578Z Thursday 03 September 2026  09:13:18 -0300 (0:00:00.050)       0:00:02.102 **** 
2026-09-03T12:13:18.8194691Z Thursday 03 September 2026  09:13:18 -0300 (0:00:00.049)       0:00:02.151 **** 
2026-09-03T12:13:18.8716519Z Thursday 03 September 2026  09:13:18 -0300 (0:00:00.052)       0:00:02.203 **** 
2026-09-03T12:13:18.9229848Z Thursday 03 September 2026  09:13:18 -0300 (0:00:00.051)       0:00:02.255 **** 
2026-09-03T12:13:18.9758205Z Thursday 03 September 2026  09:13:18 -0300 (0:00:00.052)       0:00:02.308 **** 
2026-09-03T12:13:19.0244596Z 
2026-09-03T12:13:19.0245095Z PLAY [jboss] *******************************************************************
2026-09-03T12:13:19.0289605Z Thursday 03 September 2026  09:13:19 -0300 (0:00:00.053)       0:00:02.361 **** 
2026-09-03T12:13:20.5743517Z 
2026-09-03T12:13:20.5743944Z TASK [Gathering Facts] *********************************************************
2026-09-03T12:13:20.5744139Z ok: [caddeapllx763.agil.nprd.caixa.gov.br]
2026-09-03T12:13:20.6579867Z ok: [caddeapllx756.agil.nprd.caixa.gov.br]
2026-09-03T12:13:20.6735331Z Thursday 03 September 2026  09:13:20 -0300 (0:00:01.644)       0:00:04.005 **** 
2026-09-03T12:13:21.7999507Z 
2026-09-03T12:13:21.8014206Z TASK [Gerando fatos de servicos] ***********************************************
2026-09-03T12:13:21.8014367Z ok: [caddeapllx763.agil.nprd.caixa.gov.br]
2026-09-03T12:13:22.0419145Z ok: [caddeapllx756.agil.nprd.caixa.gov.br]
2026-09-03T12:13:22.0689750Z Thursday 03 September 2026  09:13:22 -0300 (0:00:01.394)       0:00:05.400 **** 
2026-09-03T12:13:22.1292519Z 
2026-09-03T12:13:22.1293376Z TASK [Gerando lista de units jboss] ********************************************
2026-09-03T12:13:22.1293594Z ok: [caddeapllx763.agil.nprd.caixa.gov.br]
2026-09-03T12:13:22.1559995Z ok: [caddeapllx756.agil.nprd.caixa.gov.br]
2026-09-03T12:13:22.1787392Z Thursday 03 September 2026  09:13:22 -0300 (0:00:00.110)       0:00:05.511 **** 
2026-09-03T12:13:22.2362481Z 
2026-09-03T12:13:22.2362894Z TASK [Lista os units jboss que tenham versao no nome] **************************
2026-09-03T12:13:22.2364193Z ok: [caddeapllx763.agil.nprd.caixa.gov.br] => {
2026-09-03T12:13:22.2364567Z     "msg": "Servidor caddeapllx763.agil.nprd.caixa.gov.br tem os seguintes systemd: jboss-eap-standalone-71.service"
2026-09-03T12:13:22.2366438Z }
2026-09-03T12:13:22.2737096Z Thursday 03 September 2026  09:13:22 -0300 (0:00:00.094)       0:00:05.605 **** 
2026-09-03T12:13:29.0890763Z 
2026-09-03T12:13:29.0891525Z TASK [Stop e Disable service jboss] ********************************************
2026-09-03T12:13:29.0892593Z changed: [caddeapllx763.agil.nprd.caixa.gov.br] => (item=jboss-eap-standalone-71.service)
2026-09-03T12:13:29.0926939Z 
2026-09-03T12:13:29.0927254Z PLAY [jboss] *******************************************************************
2026-09-03T12:13:29.1168267Z Thursday 03 September 2026  09:13:29 -0300 (0:00:06.843)       0:00:12.449 **** 
2026-09-03T12:13:29.1782104Z 
2026-09-03T12:13:29.1783029Z TASK [Setando a versão do Jboss] ***********************************************
2026-09-03T12:13:29.1783445Z ok: [caddeapllx763.agil.nprd.caixa.gov.br]
2026-09-03T12:13:29.2055405Z ok: [caddeapllx756.agil.nprd.caixa.gov.br]
2026-09-03T12:13:29.2309095Z Thursday 03 September 2026  09:13:29 -0300 (0:00:00.111)       0:00:12.560 **** 
2026-09-03T12:13:30.0320924Z 
2026-09-03T12:13:30.0321837Z TASK [Copy template script] ****************************************************
2026-09-03T12:13:30.0322037Z ok: [caddeapllx763.agil.nprd.caixa.gov.br]
2026-09-03T12:13:30.0781348Z ok: [caddeapllx756.agil.nprd.caixa.gov.br]
2026-09-03T12:13:30.1011893Z Thursday 03 September 2026  09:13:30 -0300 (0:00:00.872)       0:00:13.433 **** 
2026-09-03T12:13:30.6949313Z 
2026-09-03T12:13:30.6961798Z TASK [JBoss systemd wrapper for sysvinit script mode domain] *******************
2026-09-03T12:13:30.6961951Z ok: [caddeapllx763.agil.nprd.caixa.gov.br]
2026-09-03T12:13:30.7559082Z ok: [caddeapllx756.agil.nprd.caixa.gov.br]
2026-09-03T12:13:30.7799073Z Thursday 03 September 2026  09:13:30 -0300 (0:00:00.678)       0:00:14.112 **** 
2026-09-03T12:13:31.5718303Z 
2026-09-03T12:13:31.5718790Z TASK [Realiza copia do arquivo de Trust Store] *********************************
2026-09-03T12:13:31.5718985Z ok: [caddeapllx763.agil.nprd.caixa.gov.br]
2026-09-03T12:13:31.6424717Z ok: [caddeapllx756.agil.nprd.caixa.gov.br]
2026-09-03T12:13:31.6659449Z Thursday 03 September 2026  09:13:31 -0300 (0:00:00.886)       0:00:14.998 **** 
2026-09-03T12:13:31.7617899Z Thursday 03 September 2026  09:13:31 -0300 (0:00:00.095)       0:00:15.094 **** 
2026-09-03T12:13:31.8642654Z Thursday 03 September 2026  09:13:31 -0300 (0:00:00.102)       0:00:15.196 **** 
2026-09-03T12:13:32.2561660Z 
2026-09-03T12:13:32.2562714Z TASK [Check directory configuration exists] ************************************
2026-09-03T12:13:32.2562952Z ok: [caddeapllx763.agil.nprd.caixa.gov.br]
2026-09-03T12:13:32.2773544Z ok: [caddeapllx756.agil.nprd.caixa.gov.br]
2026-09-03T12:13:32.3012587Z Thursday 03 September 2026  09:13:32 -0300 (0:00:00.436)       0:00:15.633 **** 
2026-09-03T12:13:32.8872221Z 
2026-09-03T12:13:32.8872716Z TASK [Copiando arquivos para jboss.server.config.dir] **************************
2026-09-03T12:13:32.8872868Z ok: [caddeapllx763.agil.nprd.caixa.gov.br]
2026-09-03T12:13:32.9940159Z ok: [caddeapllx756.agil.nprd.caixa.gov.br]
2026-09-03T12:13:33.0177924Z Thursday 03 September 2026  09:13:33 -0300 (0:00:00.716)       0:00:16.350 **** 
2026-09-03T12:13:33.8068497Z 
2026-09-03T12:13:33.8069446Z TASK [Copiando arquivo standalone-full-ha.xml] *********************************
2026-09-03T12:13:33.8070112Z changed: [caddeapllx763.agil.nprd.caixa.gov.br]
2026-09-03T12:13:33.8338363Z changed: [caddeapllx756.agil.nprd.caixa.gov.br]
2026-09-03T12:13:33.8569137Z Thursday 03 September 2026  09:13:33 -0300 (0:00:00.838)       0:00:17.188 **** 
2026-09-03T12:13:34.4324742Z 
2026-09-03T12:13:34.4325568Z TASK [Copiando arquivo standalone.conf] ****************************************
2026-09-03T12:13:34.4325793Z ok: [caddeapllx763.agil.nprd.caixa.gov.br]
2026-09-03T12:13:34.4845725Z ok: [caddeapllx756.agil.nprd.caixa.gov.br]
2026-09-03T12:13:34.5086939Z Thursday 03 September 2026  09:13:34 -0300 (0:00:00.652)       0:00:17.841 **** 
2026-09-03T12:13:34.5987884Z Thursday 03 September 2026  09:13:34 -0300 (0:00:00.089)       0:00:17.931 **** 
2026-09-03T12:13:34.6333063Z [WARNING]: conditional statements should not include jinja2 templating
2026-09-03T12:13:34.6333947Z delimiters such as {{ }} or {% %}. Found: {{ lookup('env','HSM') |
2026-09-03T12:13:34.6334181Z default('false', true) | bool }}
2026-09-03T12:13:34.6616034Z [WARNING]: conditional statements should not include jinja2 templating
2026-09-03T12:13:34.6616467Z delimiters such as {{ }} or {% %}. Found: {{ lookup('env','HSM') |
2026-09-03T12:13:34.6616662Z default('false', true) | bool }}
2026-09-03T12:13:34.6698810Z Thursday 03 September 2026  09:13:34 -0300 (0:00:00.070)       0:00:18.001 **** 
2026-09-03T12:13:41.1625360Z 
2026-09-03T12:13:41.1626314Z RUNNING HANDLER [Restart Jboss] ************************************************
2026-09-03T12:13:41.1626538Z changed: [caddeapllx763.agil.nprd.caixa.gov.br]
2026-09-03T12:13:47.3438785Z changed: [caddeapllx756.agil.nprd.caixa.gov.br]
2026-09-03T12:13:47.3467661Z 
2026-09-03T12:13:47.3468281Z PLAY [jboss] *******************************************************************
2026-09-03T12:13:47.3496148Z 
2026-09-03T12:13:47.3496362Z PLAY [local] *******************************************************************
2026-09-03T12:13:47.3525836Z 
2026-09-03T12:13:47.3526439Z PLAY [jboss] *******************************************************************
2026-09-03T12:13:47.3552964Z 
2026-09-03T12:13:47.3553510Z PLAY [jboss] *******************************************************************
2026-09-03T12:13:47.3585857Z 
2026-09-03T12:13:47.3586327Z PLAY [Copiando deployments adicionais] *****************************************
2026-09-03T12:13:47.3819275Z Thursday 03 September 2026  09:13:47 -0300 (0:00:12.712)       0:00:30.714 **** 
2026-09-03T12:13:47.4382397Z 
2026-09-03T12:13:47.4383198Z TASK [Buscando diretorio de config] ********************************************
2026-09-03T12:13:47.4383753Z ok: [caddeapllx763.agil.nprd.caixa.gov.br]
2026-09-03T12:13:47.4664268Z ok: [caddeapllx756.agil.nprd.caixa.gov.br]
2026-09-03T12:13:47.4907773Z Thursday 03 September 2026  09:13:47 -0300 (0:00:00.108)       0:00:30.823 **** 
2026-09-03T12:13:47.5474693Z 
2026-09-03T12:13:47.5475829Z TASK [Buscando diretorio de config] ********************************************
2026-09-03T12:13:47.5476382Z ok: [caddeapllx763.agil.nprd.caixa.gov.br]
2026-09-03T12:13:47.5761431Z ok: [caddeapllx756.agil.nprd.caixa.gov.br]
2026-09-03T12:13:47.6019568Z Thursday 03 September 2026  09:13:47 -0300 (0:00:00.111)       0:00:30.934 **** 
2026-09-03T12:13:47.9807992Z 
2026-09-03T12:13:47.9808388Z TASK [Create a symbolic link] **************************************************
2026-09-03T12:13:47.9808584Z changed: [caddeapllx763.agil.nprd.caixa.gov.br]
2026-09-03T12:13:47.9888434Z ok: [caddeapllx756.agil.nprd.caixa.gov.br]
2026-09-03T12:13:48.0131358Z Thursday 03 September 2026  09:13:48 -0300 (0:00:00.411)       0:00:31.345 **** 
2026-09-03T12:13:48.3862308Z 
2026-09-03T12:13:48.3862796Z TASK [Verifica se o arquivo  existe] *******************************************
2026-09-03T12:13:48.3862951Z ok: [caddeapllx763.agil.nprd.caixa.gov.br]
2026-09-03T12:13:48.4008122Z ok: [caddeapllx756.agil.nprd.caixa.gov.br]
2026-09-03T12:13:48.4265974Z Thursday 03 September 2026  09:13:48 -0300 (0:00:00.413)       0:00:31.758 **** 
2026-09-03T12:13:48.9429851Z 
2026-09-03T12:13:48.9453778Z TASK [Lendo artefatos do arquivo CSV] ******************************************
2026-09-03T12:13:48.9455192Z ok: [caddeapllx763.agil.nprd.caixa.gov.br]
2026-09-03T12:13:48.9455569Z ok: [caddeapllx756.agil.nprd.caixa.gov.br]
2026-09-03T12:13:48.9728544Z Thursday 03 September 2026  09:13:48 -0300 (0:00:00.546)       0:00:32.305 **** 
2026-09-03T12:13:49.0212076Z 
2026-09-03T12:13:49.0212610Z TASK [Teste] *******************************************************************
2026-09-03T12:13:49.0213377Z ok: [caddeapllx763.agil.nprd.caixa.gov.br] => (item={u'version': u'3.0.0', u'group_id': u'br.gov.caixa.jcics', u'extension': u'jar', u'artifact_id': u'framework'}) => {
2026-09-03T12:13:49.0213615Z     "msg": "Artefato: framework - versao 3.0.0"
2026-09-03T12:13:49.0217971Z }
2026-09-03T12:13:49.0526427Z ok: [caddeapllx763.agil.nprd.caixa.gov.br] => (item={u'version': u'1.0.0', u'group_id': u'br.gov.caixa.bsb.sisgd', u'extension': u'jar', u'artifact_id': u'framework_sisgd'}) => {
2026-09-03T12:13:49.0526913Z     "msg": "Artefato: framework_sisgd - versao 1.0.0"
2026-09-03T12:13:49.0527035Z }
2026-09-03T12:13:49.0555611Z ok: [caddeapllx756.agil.nprd.caixa.gov.br] => (item={u'version': u'3.0.0', u'group_id': u'br.gov.caixa.jcics', u'extension': u'jar', u'artifact_id': u'framework'}) => {
2026-09-03T12:13:49.0555900Z     "msg": "Artefato: framework - versao 3.0.0"
2026-09-03T12:13:49.0555996Z }
2026-09-03T12:13:49.0856351Z ok: [caddeapllx763.agil.nprd.caixa.gov.br] => (item={u'version': u'7.0.1.12', u'group_id': u'com.ibm.wmq', u'extension': u'rar', u'artifact_id': u'wmq.jmsra'}) => {
2026-09-03T12:13:49.0857033Z     "msg": "Artefato: wmq.jmsra - versao 7.0.1.12"
2026-09-03T12:13:49.0857439Z }
2026-09-03T12:13:49.0879183Z ok: [caddeapllx756.agil.nprd.caixa.gov.br] => (item={u'version': u'1.0.0', u'group_id': u'br.gov.caixa.bsb.sisgd', u'extension': u'jar', u'artifact_id': u'framework_sisgd'}) => {
2026-09-03T12:13:49.0880323Z     "msg": "Artefato: framework_sisgd - versao 1.0.0"
2026-09-03T12:13:49.0880725Z }
2026-09-03T12:13:49.1182726Z ok: [caddeapllx756.agil.nprd.caixa.gov.br] => (item={u'version': u'7.0.1.12', u'group_id': u'com.ibm.wmq', u'extension': u'rar', u'artifact_id': u'wmq.jmsra'}) => {
2026-09-03T12:13:49.1183336Z     "msg": "Artefato: wmq.jmsra - versao 7.0.1.12"
2026-09-03T12:13:49.1183864Z }
2026-09-03T12:13:49.1477920Z Thursday 03 September 2026  09:13:49 -0300 (0:00:00.174)       0:00:32.480 **** 
2026-09-03T12:13:49.7797670Z 
2026-09-03T12:13:49.7800482Z TASK [maven_artifact] **********************************************************
2026-09-03T12:13:49.7801751Z changed: [caddeapllx756.agil.nprd.caixa.gov.br] => (item={u'version': u'3.0.0', u'group_id': u'br.gov.caixa.jcics', u'extension': u'jar', u'artifact_id': u'framework'})
2026-09-03T12:13:49.7924247Z ok: [caddeapllx763.agil.nprd.caixa.gov.br] => (item={u'version': u'3.0.0', u'group_id': u'br.gov.caixa.jcics', u'extension': u'jar', u'artifact_id': u'framework'})
2026-09-03T12:13:50.2026026Z changed: [caddeapllx763.agil.nprd.caixa.gov.br] => (item={u'version': u'1.0.0', u'group_id': u'br.gov.caixa.bsb.sisgd', u'extension': u'jar', u'artifact_id': u'framework_sisgd'})
2026-09-03T12:13:50.2108584Z changed: [caddeapllx756.agil.nprd.caixa.gov.br] => (item={u'version': u'1.0.0', u'group_id': u'br.gov.caixa.bsb.sisgd', u'extension': u'jar', u'artifact_id': u'framework_sisgd'})
2026-09-03T12:13:50.6647821Z changed: [caddeapllx763.agil.nprd.caixa.gov.br] => (item={u'version': u'7.0.1.12', u'group_id': u'com.ibm.wmq', u'extension': u'rar', u'artifact_id': u'wmq.jmsra'})
2026-09-03T12:13:50.6708086Z changed: [caddeapllx756.agil.nprd.caixa.gov.br] => (item={u'version': u'7.0.1.12', u'group_id': u'com.ibm.wmq', u'extension': u'rar', u'artifact_id': u'wmq.jmsra'})
2026-09-03T12:13:50.6971248Z Thursday 03 September 2026  09:13:50 -0300 (0:00:01.549)       0:00:34.029 **** 
2026-09-03T12:13:53.1382388Z 
2026-09-03T12:13:53.1383286Z TASK [Copiando artefatos para o(s) servidor(es) Jboss] *************************
2026-09-03T12:13:53.1383504Z ok: [caddeapllx763.agil.nprd.caixa.gov.br]
2026-09-03T12:13:53.6555869Z ok: [caddeapllx756.agil.nprd.caixa.gov.br]
2026-09-03T12:13:53.6792802Z Thursday 03 September 2026  09:13:53 -0300 (0:00:02.982)       0:00:37.011 **** 
2026-09-03T12:13:53.7524296Z 
2026-09-03T12:13:53.7525051Z PLAY [Copiando modules adicionais] *********************************************
2026-09-03T12:13:53.7770407Z Thursday 03 September 2026  09:13:53 -0300 (0:00:00.097)       0:00:37.109 **** 
2026-09-03T12:13:53.8316375Z 
2026-09-03T12:13:53.8317209Z TASK [Buscando diretorio de config] ********************************************
2026-09-03T12:13:53.8317657Z ok: [caddeapllx763.agil.nprd.caixa.gov.br]
2026-09-03T12:13:53.8599362Z ok: [caddeapllx756.agil.nprd.caixa.gov.br]
2026-09-03T12:13:53.8832400Z Thursday 03 September 2026  09:13:53 -0300 (0:00:00.106)       0:00:37.215 **** 
2026-09-03T12:13:53.9376531Z 
2026-09-03T12:13:53.9377471Z TASK [Buscando diretorio de config] ********************************************
2026-09-03T12:13:53.9377889Z ok: [caddeapllx763.agil.nprd.caixa.gov.br]
2026-09-03T12:13:53.9660574Z ok: [caddeapllx756.agil.nprd.caixa.gov.br]
2026-09-03T12:13:53.9912820Z Thursday 03 September 2026  09:13:53 -0300 (0:00:00.107)       0:00:37.323 **** 
2026-09-03T12:13:54.3638018Z 
2026-09-03T12:13:54.3638858Z TASK [Create a directory] ******************************************************
2026-09-03T12:13:54.3639153Z changed: [caddeapllx763.agil.nprd.caixa.gov.br]
2026-09-03T12:13:54.3864462Z ok: [caddeapllx756.agil.nprd.caixa.gov.br]
2026-09-03T12:13:54.4120777Z Thursday 03 September 2026  09:13:54 -0300 (0:00:00.420)       0:00:37.744 **** 
2026-09-03T12:13:54.8111396Z 
2026-09-03T12:13:54.8112721Z TASK [Verifica se o arquivo  existe] *******************************************
2026-09-03T12:13:54.8113627Z ok: [caddeapllx763.agil.nprd.caixa.gov.br]
2026-09-03T12:13:54.8317619Z ok: [caddeapllx756.agil.nprd.caixa.gov.br]
2026-09-03T12:13:54.8542974Z Thursday 03 September 2026  09:13:54 -0300 (0:00:00.442)       0:00:38.186 **** 
2026-09-03T12:13:54.9511212Z Thursday 03 September 2026  09:13:54 -0300 (0:00:00.096)       0:00:38.283 **** 
2026-09-03T12:13:55.0502479Z Thursday 03 September 2026  09:13:55 -0300 (0:00:00.099)       0:00:38.382 **** 
2026-09-03T12:13:55.1484336Z Thursday 03 September 2026  09:13:55 -0300 (0:00:00.098)       0:00:38.480 **** 
2026-09-03T12:13:55.2529853Z Thursday 03 September 2026  09:13:55 -0300 (0:00:00.103)       0:00:38.584 **** 
2026-09-03T12:13:55.3458213Z Thursday 03 September 2026  09:13:55 -0300 (0:00:00.091)       0:00:38.676 **** 
2026-09-03T12:13:55.4380633Z Thursday 03 September 2026  09:13:55 -0300 (0:00:00.093)       0:00:38.770 **** 
2026-09-03T12:13:55.5114621Z 
2026-09-03T12:13:55.5115559Z PLAY [local] *******************************************************************
2026-09-03T12:13:55.5147215Z [WARNING]: Could not match supplied host pattern, ignoring: instance_restart
2026-09-03T12:13:55.5150248Z 
2026-09-03T12:13:55.5150630Z PLAY [instance_restart] ********************************************************
2026-09-03T12:13:55.5151013Z skipping: no hosts matched
2026-09-03T12:13:55.5153427Z [WARNING]: Could not match supplied host pattern, ignoring: machine_reboot
2026-09-03T12:13:55.5156139Z 
2026-09-03T12:13:55.5156455Z PLAY [machine_reboot] **********************************************************
2026-09-03T12:13:55.5156999Z skipping: no hosts matched
2026-09-03T12:13:55.5163029Z 
2026-09-03T12:13:55.5163392Z PLAY [local] *******************************************************************
2026-09-03T12:13:55.5189089Z [WARNING]: Could not match supplied host pattern, ignoring: instance_stop
2026-09-03T12:13:55.5192813Z 
2026-09-03T12:13:55.5193057Z PLAY [instance_stop] ***********************************************************
2026-09-03T12:13:55.5193351Z skipping: no hosts matched
2026-09-03T12:13:55.5196298Z 
2026-09-03T12:13:55.5196548Z PLAY [machine_reboot] **********************************************************
2026-09-03T12:13:55.5196817Z skipping: no hosts matched
2026-09-03T12:13:55.5204025Z 
2026-09-03T12:13:55.5204411Z PLAY [Configura TSM] ***********************************************************
2026-09-03T12:13:55.5236090Z 
2026-09-03T12:13:55.5236533Z PLAY [Configura Control-M] *****************************************************
2026-09-03T12:13:55.5258451Z 
2026-09-03T12:13:55.5258681Z PLAY RECAP *********************************************************************
2026-09-03T12:13:55.5258876Z caddeapllx756.agil.nprd.caixa.gov.br : ok=28   changed=4    unreachable=0    failed=0    skipped=27   rescued=0    ignored=0   
2026-09-03T12:13:55.5260898Z caddeapllx763.agil.nprd.caixa.gov.br : ok=30   changed=7    unreachable=0    failed=0    skipped=25   rescued=0    ignored=0   
2026-09-03T12:13:55.5262850Z 
2026-09-03T12:13:55.5265024Z Thursday 03 September 2026  09:13:55 -0300 (0:00:00.088)       0:00:38.858 **** 
2026-09-03T12:13:55.5266815Z =============================================================================== 
2026-09-03T12:13:55.5267409Z Restart Jboss ---------------------------------------------------------- 12.71s
2026-09-03T12:13:55.5267823Z Stop e Disable service jboss -------------------------------------------- 6.84s
2026-09-03T12:13:55.5269304Z Copiando artefatos para o(s) servidor(es) Jboss ------------------------- 2.98s
2026-09-03T12:13:55.5269770Z Gathering Facts --------------------------------------------------------- 1.64s
2026-09-03T12:13:55.5270312Z maven_artifact ---------------------------------------------------------- 1.55s
2026-09-03T12:13:55.5270578Z Gerando fatos de servicos ----------------------------------------------- 1.39s
2026-09-03T12:13:55.5270872Z Realiza copia do arquivo de Trust Store --------------------------------- 0.89s
2026-09-03T12:13:55.5271089Z Copy template script ---------------------------------------------------- 0.87s
2026-09-03T12:13:55.5282328Z Copiando arquivo standalone-full-ha.xml --------------------------------- 0.84s
2026-09-03T12:13:55.5283037Z Copiando arquivos para jboss.server.config.dir -------------------------- 0.72s
2026-09-03T12:13:55.5283658Z JBoss systemd wrapper for sysvinit script mode domain ------------------- 0.68s
2026-09-03T12:13:55.5283897Z Copiando arquivo standalone.conf ---------------------------------------- 0.65s
2026-09-03T12:13:55.5284131Z Verificando o java versão esta instalado: 1.8.0_221 --------------------- 0.55s
2026-09-03T12:13:55.5284357Z Lendo artefatos do arquivo CSV ------------------------------------------ 0.55s
2026-09-03T12:13:55.5284569Z Verificando a versão do Java -------------------------------------------- 0.48s
2026-09-03T12:13:55.5302612Z Verifica se o arquivo  existe ------------------------------------------- 0.44s
2026-09-03T12:13:55.5302920Z Check directory configuration exists ------------------------------------ 0.44s
2026-09-03T12:13:55.5303144Z Create a directory ------------------------------------------------------ 0.42s
2026-09-03T12:13:55.5303362Z Verifica se o arquivo  existe ------------------------------------------- 0.41s
2026-09-03T12:13:55.5303582Z Create a symbolic link -------------------------------------------------- 0.41s
2026-09-03T12:13:55.5303725Z Playbook run took 0 days, 0 hours, 0 minutes, 38 seconds
2026-09-03T12:13:55.5972936Z ##[section]Finishing: Deploy Config no JBOSS
