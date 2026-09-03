Favor verificar erro no Deploy conforme evidência que segue anexo.
SIGEC-CSC - SIGEC-CSC-935 - Pipelines

https://devops.caixa/projetos/Caixa/_releaseProgress?_a=release-environment-logs&releaseId=521566&environmentId=2421953
 
Back-End:
https://devops.caixa/projetos/Caixa/_git/SIGEC-CSC
Front-End:
https://devops.caixa/projetos/Caixa/_git/SIGEC-CSC-FRONTEND



2026-09-02T17:45:11.7845676Z ##[section]Starting: Deploy Config no JBOSS
2026-09-02T17:45:11.7848805Z ==============================================================================
2026-09-02T17:45:11.7848881Z Task         : Bash
2026-09-02T17:45:11.7848933Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-02T17:45:11.7848992Z Version      : 3.227.0
2026-09-02T17:45:11.7849035Z Author       : Microsoft Corporation
2026-09-02T17:45:11.7849090Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-02T17:45:11.7849266Z ==============================================================================
2026-09-02T17:45:12.5231983Z Generating script.
2026-09-02T17:45:12.5244931Z ========================== Starting Command Output ===========================
2026-09-02T17:45:12.5257477Z [command]/bin/bash /opt/ads-agent/_work/_temp/0b354c96-4dc0-4fee-9723-1a18fc694cf8.sh
2026-09-02T17:45:12.5350772Z /opt/ads-agent/_work/_temp/0b354c96-4dc0-4fee-9723-1a18fc694cf8.sh: line 2: site: comando não encontrado
2026-09-02T17:45:14.5140268Z 
2026-09-02T17:45:14.5141023Z PLAY [local] *******************************************************************
2026-09-02T17:45:14.5691224Z 
2026-09-02T17:45:14.5691741Z PLAY [Configurando o DNS] ******************************************************
2026-09-02T17:45:14.7342170Z 
2026-09-02T17:45:14.7342934Z PLAY [local] *******************************************************************
2026-09-02T17:45:14.7371101Z 
2026-09-02T17:45:14.7371685Z PLAY [Verificando serviços] ****************************************************
2026-09-02T17:45:14.7464002Z 
2026-09-02T17:45:14.7464604Z PLAY [Configuração LDAP] *******************************************************
2026-09-02T17:45:14.7530615Z 
2026-09-02T17:45:14.7531156Z PLAY [apache_des] **************************************************************
2026-09-02T17:45:14.7563074Z 
2026-09-02T17:45:14.7563472Z PLAY [jboss] *******************************************************************
2026-09-02T17:45:14.7632995Z Wednesday 02 September 2026  14:45:14 -0300 (0:00:00.309)       0:00:00.309 *** 
2026-09-02T17:45:14.8136319Z Wednesday 02 September 2026  14:45:14 -0300 (0:00:00.050)       0:00:00.359 *** 
2026-09-02T17:45:14.8631131Z Wednesday 02 September 2026  14:45:14 -0300 (0:00:00.049)       0:00:00.409 *** 
2026-09-02T17:45:14.9135320Z Wednesday 02 September 2026  14:45:14 -0300 (0:00:00.050)       0:00:00.459 *** 
2026-09-02T17:45:14.9624406Z 
2026-09-02T17:45:14.9624863Z PLAY [Instalando stack Jboss] **************************************************
2026-09-02T17:45:14.9745226Z Wednesday 02 September 2026  14:45:14 -0300 (0:00:00.061)       0:00:00.520 *** 
2026-09-02T17:45:15.4745466Z 
2026-09-02T17:45:15.4746552Z TASK [Verificando o java versão esta instalado: 1.8.0_221] *********************
2026-09-02T17:45:15.4747251Z ok: [caddeapllx756.agil.nprd.caixa.gov.br]
2026-09-02T17:45:15.4993125Z ok: [caddeapllx763.agil.nprd.caixa.gov.br]
2026-09-02T17:45:15.5032861Z Wednesday 02 September 2026  14:45:15 -0300 (0:00:00.528)       0:00:01.049 *** 
2026-09-02T17:45:15.9674350Z 
2026-09-02T17:45:15.9675854Z TASK [Verificando a versão do Java] ********************************************
2026-09-02T17:45:15.9676051Z changed: [caddeapllx756.agil.nprd.caixa.gov.br]
2026-09-02T17:45:16.0095391Z changed: [caddeapllx763.agil.nprd.caixa.gov.br]
2026-09-02T17:45:16.0142893Z Wednesday 02 September 2026  14:45:16 -0300 (0:00:00.511)       0:00:01.560 *** 
2026-09-02T17:45:16.0750792Z Wednesday 02 September 2026  14:45:16 -0300 (0:00:00.060)       0:00:01.621 *** 
2026-09-02T17:45:16.3512040Z 
2026-09-02T17:45:16.3512944Z TASK [Verifica ser o Jboss já foi instalado] ***********************************
2026-09-02T17:45:16.3513324Z ok: [caddeapllx756.agil.nprd.caixa.gov.br]
2026-09-02T17:45:16.3751556Z ok: [caddeapllx763.agil.nprd.caixa.gov.br]
2026-09-02T17:45:16.3799308Z Wednesday 02 September 2026  14:45:16 -0300 (0:00:00.304)       0:00:01.926 *** 
2026-09-02T17:45:16.4399024Z 
2026-09-02T17:45:16.4399732Z TASK [Setando a versão do Jboss] ***********************************************
2026-09-02T17:45:16.4400186Z ok: [caddeapllx763.agil.nprd.caixa.gov.br]
2026-09-02T17:45:16.4470517Z ok: [caddeapllx756.agil.nprd.caixa.gov.br]
2026-09-02T17:45:16.4508089Z Wednesday 02 September 2026  14:45:16 -0300 (0:00:00.070)       0:00:01.997 *** 
2026-09-02T17:45:16.5048746Z Wednesday 02 September 2026  14:45:16 -0300 (0:00:00.053)       0:00:02.051 *** 
2026-09-02T17:45:16.5558796Z Wednesday 02 September 2026  14:45:16 -0300 (0:00:00.050)       0:00:02.102 *** 
2026-09-02T17:45:16.6059287Z Wednesday 02 September 2026  14:45:16 -0300 (0:00:00.050)       0:00:02.152 *** 
2026-09-02T17:45:16.6571929Z Wednesday 02 September 2026  14:45:16 -0300 (0:00:00.051)       0:00:02.203 *** 
2026-09-02T17:45:16.7095229Z Wednesday 02 September 2026  14:45:16 -0300 (0:00:00.052)       0:00:02.255 *** 
2026-09-02T17:45:16.7615333Z Wednesday 02 September 2026  14:45:16 -0300 (0:00:00.051)       0:00:02.307 *** 
2026-09-02T17:45:16.8126000Z Wednesday 02 September 2026  14:45:16 -0300 (0:00:00.051)       0:00:02.358 *** 
2026-09-02T17:45:16.8619177Z 
2026-09-02T17:45:16.8619660Z PLAY [jboss] *******************************************************************
2026-09-02T17:45:16.8665164Z Wednesday 02 September 2026  14:45:16 -0300 (0:00:00.054)       0:00:02.413 *** 
2026-09-02T17:45:18.4229357Z 
2026-09-02T17:45:18.4230357Z TASK [Gathering Facts] *********************************************************
2026-09-02T17:45:18.4231220Z ok: [caddeapllx756.agil.nprd.caixa.gov.br]
2026-09-02T17:45:18.4488387Z ok: [caddeapllx763.agil.nprd.caixa.gov.br]
2026-09-02T17:45:18.4655791Z Wednesday 02 September 2026  14:45:18 -0300 (0:00:01.598)       0:00:04.011 *** 
2026-09-02T17:45:19.3669786Z 
2026-09-02T17:45:19.3670731Z TASK [Gerando fatos de servicos] ***********************************************
2026-09-02T17:45:19.3671075Z ok: [caddeapllx756.agil.nprd.caixa.gov.br]
2026-09-02T17:45:19.4714060Z ok: [caddeapllx763.agil.nprd.caixa.gov.br]
2026-09-02T17:45:19.4963279Z Wednesday 02 September 2026  14:45:19 -0300 (0:00:01.030)       0:00:05.042 *** 
2026-09-02T17:45:19.5582788Z 
2026-09-02T17:45:19.5583285Z TASK [Gerando lista de units jboss] ********************************************
2026-09-02T17:45:19.5584670Z ok: [caddeapllx763.agil.nprd.caixa.gov.br]
2026-09-02T17:45:19.5849083Z ok: [caddeapllx756.agil.nprd.caixa.gov.br]
2026-09-02T17:45:19.6074109Z Wednesday 02 September 2026  14:45:19 -0300 (0:00:00.111)       0:00:05.153 *** 
2026-09-02T17:45:19.6662246Z 
2026-09-02T17:45:19.6663934Z TASK [Lista os units jboss que tenham versao no nome] **************************
2026-09-02T17:45:19.6664089Z ok: [caddeapllx763.agil.nprd.caixa.gov.br] => {
2026-09-02T17:45:19.6664472Z     "msg": "Servidor caddeapllx763.agil.nprd.caixa.gov.br tem os seguintes systemd: jboss-eap-standalone-71.service"
2026-09-02T17:45:19.6664611Z }
2026-09-02T17:45:19.6981255Z Wednesday 02 September 2026  14:45:19 -0300 (0:00:00.090)       0:00:05.244 *** 
2026-09-02T17:45:20.3723197Z 
2026-09-02T17:45:20.3723590Z TASK [Stop e Disable service jboss] ********************************************
2026-09-02T17:45:20.3724008Z changed: [caddeapllx763.agil.nprd.caixa.gov.br] => (item=jboss-eap-standalone-71.service)
2026-09-02T17:45:20.3771719Z 
2026-09-02T17:45:20.3772366Z PLAY [jboss] *******************************************************************
2026-09-02T17:45:20.4049465Z Wednesday 02 September 2026  14:45:20 -0300 (0:00:00.706)       0:00:05.951 *** 
2026-09-02T17:45:20.4658799Z 
2026-09-02T17:45:20.4659528Z TASK [Setando a versão do Jboss] ***********************************************
2026-09-02T17:45:20.4659724Z ok: [caddeapllx763.agil.nprd.caixa.gov.br]
2026-09-02T17:45:20.4930899Z ok: [caddeapllx756.agil.nprd.caixa.gov.br]
2026-09-02T17:45:20.5179985Z Wednesday 02 September 2026  14:45:20 -0300 (0:00:00.112)       0:00:06.064 *** 
2026-09-02T17:45:21.3505578Z 
2026-09-02T17:45:21.3506306Z TASK [Copy template script] ****************************************************
2026-09-02T17:45:21.3506497Z ok: [caddeapllx756.agil.nprd.caixa.gov.br]
2026-09-02T17:45:21.3649776Z ok: [caddeapllx763.agil.nprd.caixa.gov.br]
2026-09-02T17:45:21.3875432Z Wednesday 02 September 2026  14:45:21 -0300 (0:00:00.869)       0:00:06.933 *** 
2026-09-02T17:45:21.9923043Z 
2026-09-02T17:45:21.9923539Z TASK [JBoss systemd wrapper for sysvinit script mode domain] *******************
2026-09-02T17:45:21.9923689Z ok: [caddeapllx763.agil.nprd.caixa.gov.br]
2026-09-02T17:45:22.0082497Z ok: [caddeapllx756.agil.nprd.caixa.gov.br]
2026-09-02T17:45:22.0309122Z Wednesday 02 September 2026  14:45:22 -0300 (0:00:00.643)       0:00:07.577 *** 
2026-09-02T17:45:22.8691920Z 
2026-09-02T17:45:22.8692792Z TASK [Realiza copia do arquivo de Trust Store] *********************************
2026-09-02T17:45:22.8693019Z ok: [caddeapllx756.agil.nprd.caixa.gov.br]
2026-09-02T17:45:22.8906275Z ok: [caddeapllx763.agil.nprd.caixa.gov.br]
2026-09-02T17:45:22.9129972Z Wednesday 02 September 2026  14:45:22 -0300 (0:00:00.882)       0:00:08.459 *** 
2026-09-02T17:45:23.0073495Z Wednesday 02 September 2026  14:45:23 -0300 (0:00:00.094)       0:00:08.553 *** 
2026-09-02T17:45:23.1104311Z Wednesday 02 September 2026  14:45:23 -0300 (0:00:00.103)       0:00:08.656 *** 
2026-09-02T17:45:23.5183435Z 
2026-09-02T17:45:23.5184199Z TASK [Check directory configuration exists] ************************************
2026-09-02T17:45:23.5184754Z ok: [caddeapllx763.agil.nprd.caixa.gov.br]
2026-09-02T17:45:23.5311078Z ok: [caddeapllx756.agil.nprd.caixa.gov.br]
2026-09-02T17:45:23.5549119Z Wednesday 02 September 2026  14:45:23 -0300 (0:00:00.444)       0:00:09.101 *** 
2026-09-02T17:45:24.1517624Z 
2026-09-02T17:45:24.1518171Z TASK [Copiando arquivos para jboss.server.config.dir] **************************
2026-09-02T17:45:24.1518325Z ok: [caddeapllx763.agil.nprd.caixa.gov.br]
2026-09-02T17:45:24.1592538Z ok: [caddeapllx756.agil.nprd.caixa.gov.br]
2026-09-02T17:45:24.1831161Z Wednesday 02 September 2026  14:45:24 -0300 (0:00:00.628)       0:00:09.729 *** 
2026-09-02T17:45:24.8029990Z 
2026-09-02T17:45:24.8030696Z TASK [Copiando arquivo standalone-full-ha.xml] *********************************
2026-09-02T17:45:24.8030852Z ok: [caddeapllx763.agil.nprd.caixa.gov.br]
2026-09-02T17:45:25.0574930Z changed: [caddeapllx756.agil.nprd.caixa.gov.br]
2026-09-02T17:45:25.0903005Z Wednesday 02 September 2026  14:45:25 -0300 (0:00:00.907)       0:00:10.636 *** 
2026-09-02T17:45:25.6948670Z 
2026-09-02T17:45:25.6949573Z TASK [Copiando arquivo standalone.conf] ****************************************
2026-09-02T17:45:25.6949822Z ok: [caddeapllx763.agil.nprd.caixa.gov.br]
2026-09-02T17:45:25.7022487Z ok: [caddeapllx756.agil.nprd.caixa.gov.br]
2026-09-02T17:45:25.7255721Z Wednesday 02 September 2026  14:45:25 -0300 (0:00:00.635)       0:00:11.271 *** 
2026-09-02T17:45:25.8199098Z Wednesday 02 September 2026  14:45:25 -0300 (0:00:00.094)       0:00:11.366 *** 
2026-09-02T17:45:25.8554543Z [WARNING]: conditional statements should not include jinja2 templating
2026-09-02T17:45:25.8554954Z delimiters such as {{ }} or {% %}. Found: {{ lookup('env','HSM') |
2026-09-02T17:45:25.8555154Z default('false', true) | bool }}
2026-09-02T17:45:25.8845888Z [WARNING]: conditional statements should not include jinja2 templating
2026-09-02T17:45:25.8846286Z delimiters such as {{ }} or {% %}. Found: {{ lookup('env','HSM') |
2026-09-02T17:45:25.8846444Z default('false', true) | bool }}
2026-09-02T17:45:25.8931278Z Wednesday 02 September 2026  14:45:25 -0300 (0:00:00.073)       0:00:11.439 *** 
2026-09-02T17:45:40.5281052Z 
2026-09-02T17:45:40.5282862Z RUNNING HANDLER [Restart Jboss] ************************************************
2026-09-02T17:45:40.5283019Z changed: [caddeapllx756.agil.nprd.caixa.gov.br]
2026-09-02T17:45:40.5292565Z 
2026-09-02T17:45:40.5293079Z PLAY [jboss] *******************************************************************
2026-09-02T17:45:40.5328353Z 
2026-09-02T17:45:40.5328728Z PLAY [local] *******************************************************************
2026-09-02T17:45:40.5352675Z 
2026-09-02T17:45:40.5352870Z PLAY [jboss] *******************************************************************
2026-09-02T17:45:40.5380003Z 
2026-09-02T17:45:40.5380215Z PLAY [jboss] *******************************************************************
2026-09-02T17:45:40.5412188Z 
2026-09-02T17:45:40.5412436Z PLAY [Copiando deployments adicionais] *****************************************
2026-09-02T17:45:40.5655597Z Wednesday 02 September 2026  14:45:40 -0300 (0:00:14.672)       0:00:26.111 *** 
2026-09-02T17:45:40.6223937Z 
2026-09-02T17:45:40.6224421Z TASK [Buscando diretorio de config] ********************************************
2026-09-02T17:45:40.6224561Z ok: [caddeapllx763.agil.nprd.caixa.gov.br]
2026-09-02T17:45:40.6527635Z ok: [caddeapllx756.agil.nprd.caixa.gov.br]
2026-09-02T17:45:40.6796440Z Wednesday 02 September 2026  14:45:40 -0300 (0:00:00.114)       0:00:26.226 *** 
2026-09-02T17:45:40.7359127Z 
2026-09-02T17:45:40.7359678Z TASK [Buscando diretorio de config] ********************************************
2026-09-02T17:45:40.7359851Z ok: [caddeapllx763.agil.nprd.caixa.gov.br]
2026-09-02T17:45:40.7649757Z ok: [caddeapllx756.agil.nprd.caixa.gov.br]
2026-09-02T17:45:40.7930859Z Wednesday 02 September 2026  14:45:40 -0300 (0:00:00.113)       0:00:26.339 *** 
2026-09-02T17:45:41.1788647Z 
2026-09-02T17:45:41.1789224Z TASK [Create a symbolic link] **************************************************
2026-09-02T17:45:41.1789391Z changed: [caddeapllx763.agil.nprd.caixa.gov.br]
2026-09-02T17:45:41.1949148Z ok: [caddeapllx756.agil.nprd.caixa.gov.br]
2026-09-02T17:45:41.2189326Z Wednesday 02 September 2026  14:45:41 -0300 (0:00:00.425)       0:00:26.765 *** 
2026-09-02T17:45:41.5866777Z 
2026-09-02T17:45:41.5867264Z TASK [Verifica se o arquivo  existe] *******************************************
2026-09-02T17:45:41.5867414Z ok: [caddeapllx763.agil.nprd.caixa.gov.br]
2026-09-02T17:45:41.6115781Z ok: [caddeapllx756.agil.nprd.caixa.gov.br]
2026-09-02T17:45:41.6352327Z Wednesday 02 September 2026  14:45:41 -0300 (0:00:00.416)       0:00:27.181 *** 
2026-09-02T17:45:42.1618778Z 
2026-09-02T17:45:42.1619381Z TASK [Lendo artefatos do arquivo CSV] ******************************************
2026-09-02T17:45:42.1619576Z ok: [caddeapllx756.agil.nprd.caixa.gov.br]
2026-09-02T17:45:42.1656290Z ok: [caddeapllx763.agil.nprd.caixa.gov.br]
2026-09-02T17:45:42.1949364Z Wednesday 02 September 2026  14:45:42 -0300 (0:00:00.559)       0:00:27.740 *** 
2026-09-02T17:45:42.2458898Z 
2026-09-02T17:45:42.2459857Z TASK [Teste] *******************************************************************
2026-09-02T17:45:42.2460383Z ok: [caddeapllx763.agil.nprd.caixa.gov.br] => (item={u'version': u'3.0.0', u'group_id': u'br.gov.caixa.jcics', u'extension': u'jar', u'artifact_id': u'framework'}) => {
2026-09-02T17:45:42.2460609Z     "msg": "Artefato: framework - versao 3.0.0"
2026-09-02T17:45:42.2460714Z }
2026-09-02T17:45:42.2755152Z ok: [caddeapllx763.agil.nprd.caixa.gov.br] => (item={u'version': u'1.0.0', u'group_id': u'br.gov.caixa.bsb.sisgd', u'extension': u'jar', u'artifact_id': u'framework_sisgd'}) => {
2026-09-02T17:45:42.2755695Z     "msg": "Artefato: framework_sisgd - versao 1.0.0"
2026-09-02T17:45:42.2756251Z }
2026-09-02T17:45:42.2771026Z ok: [caddeapllx756.agil.nprd.caixa.gov.br] => (item={u'version': u'3.0.0', u'group_id': u'br.gov.caixa.jcics', u'extension': u'jar', u'artifact_id': u'framework'}) => {
2026-09-02T17:45:42.2771281Z     "msg": "Artefato: framework - versao 3.0.0"
2026-09-02T17:45:42.2771405Z }
2026-09-02T17:45:42.3069166Z ok: [caddeapllx763.agil.nprd.caixa.gov.br] => (item={u'version': u'7.0.1.12', u'group_id': u'com.ibm.wmq', u'extension': u'rar', u'artifact_id': u'wmq.jmsra'}) => {
2026-09-02T17:45:42.3069785Z     "msg": "Artefato: wmq.jmsra - versao 7.0.1.12"
2026-09-02T17:45:42.3070418Z }
2026-09-02T17:45:42.3089894Z ok: [caddeapllx756.agil.nprd.caixa.gov.br] => (item={u'version': u'1.0.0', u'group_id': u'br.gov.caixa.bsb.sisgd', u'extension': u'jar', u'artifact_id': u'framework_sisgd'}) => {
2026-09-02T17:45:42.3090671Z     "msg": "Artefato: framework_sisgd - versao 1.0.0"
2026-09-02T17:45:42.3091126Z }
2026-09-02T17:45:42.3428353Z ok: [caddeapllx756.agil.nprd.caixa.gov.br] => (item={u'version': u'7.0.1.12', u'group_id': u'com.ibm.wmq', u'extension': u'rar', u'artifact_id': u'wmq.jmsra'}) => {
2026-09-02T17:45:42.3428886Z     "msg": "Artefato: wmq.jmsra - versao 7.0.1.12"
2026-09-02T17:45:42.3429319Z }
2026-09-02T17:45:42.3719646Z Wednesday 02 September 2026  14:45:42 -0300 (0:00:00.177)       0:00:27.918 *** 
2026-09-02T17:45:42.9999820Z 
2026-09-02T17:45:43.0000585Z TASK [maven_artifact] **********************************************************
2026-09-02T17:45:43.0001284Z changed: [caddeapllx756.agil.nprd.caixa.gov.br] => (item={u'version': u'3.0.0', u'group_id': u'br.gov.caixa.jcics', u'extension': u'jar', u'artifact_id': u'framework'})
2026-09-02T17:45:43.0044637Z changed: [caddeapllx763.agil.nprd.caixa.gov.br] => (item={u'version': u'3.0.0', u'group_id': u'br.gov.caixa.jcics', u'extension': u'jar', u'artifact_id': u'framework'})
2026-09-02T17:45:43.4047054Z changed: [caddeapllx763.agil.nprd.caixa.gov.br] => (item={u'version': u'1.0.0', u'group_id': u'br.gov.caixa.bsb.sisgd', u'extension': u'jar', u'artifact_id': u'framework_sisgd'})
2026-09-02T17:45:43.4108311Z changed: [caddeapllx756.agil.nprd.caixa.gov.br] => (item={u'version': u'1.0.0', u'group_id': u'br.gov.caixa.bsb.sisgd', u'extension': u'jar', u'artifact_id': u'framework_sisgd'})
2026-09-02T17:45:43.8487970Z changed: [caddeapllx756.agil.nprd.caixa.gov.br] => (item={u'version': u'7.0.1.12', u'group_id': u'com.ibm.wmq', u'extension': u'rar', u'artifact_id': u'wmq.jmsra'})
2026-09-02T17:45:43.8519608Z changed: [caddeapllx763.agil.nprd.caixa.gov.br] => (item={u'version': u'7.0.1.12', u'group_id': u'com.ibm.wmq', u'extension': u'rar', u'artifact_id': u'wmq.jmsra'})
2026-09-02T17:45:43.8784162Z Wednesday 02 September 2026  14:45:43 -0300 (0:00:01.506)       0:00:29.424 *** 
2026-09-02T17:45:49.1442162Z 
2026-09-02T17:45:49.1443233Z TASK [Copiando artefatos para o(s) servidor(es) Jboss] *************************
2026-09-02T17:45:49.1444129Z fatal: [caddeapllx763.agil.nprd.caixa.gov.br]: FAILED! => {"msg": "Failed to get information on remote file (/opt/jboss/jboss-eap/standalone/deployments/framework.jar): sudo: ldap_sasl_bind_s(): Can't contact LDAP server\n\nPresumimos que você recebeu as instruções de sempre do administrador\nde sistema local. Basicamente, resume-se a estas três coisas:\n\n    #1) Respeite a privacidade dos outros.\n    #2) Pense antes de digitar.\n    #3) Com grandes poderes vêm grandes responsabilidades.\n\nsudo: nenhum tty presente e nenhum programa de askpass especificado\n"}
2026-09-02T17:45:49.3528782Z fatal: [caddeapllx756.agil.nprd.caixa.gov.br]: FAILED! => {"msg": "Failed to get information on remote file (/opt/jboss/jboss-eap/standalone/deployments/framework.jar): sudo: ldap_sasl_bind_s(): Can't contact LDAP server\n\nPresumimos que você recebeu as instruções de sempre do administrador\nde sistema local. Basicamente, resume-se a estas três coisas:\n\n    #1) Respeite a privacidade dos outros.\n    #2) Pense antes de digitar.\n    #3) Com grandes poderes vêm grandes responsabilidades.\n\nsudo: nenhum tty presente e nenhum programa de askpass especificado\n"}
2026-09-02T17:45:49.3531891Z 
2026-09-02T17:45:49.3532688Z PLAY RECAP *********************************************************************
2026-09-02T17:45:49.3532937Z caddeapllx756.agil.nprd.caixa.gov.br : ok=23   changed=4    unreachable=0    failed=1    skipped=19   rescued=0    ignored=0   
2026-09-02T17:45:49.3533142Z caddeapllx763.agil.nprd.caixa.gov.br : ok=24   changed=4    unreachable=0    failed=1    skipped=17   rescued=0    ignored=0   
2026-09-02T17:45:49.3533232Z 
2026-09-02T17:45:49.3533831Z Wednesday 02 September 2026  14:45:49 -0300 (0:00:05.475)       0:00:34.899 *** 
2026-09-02T17:45:49.3533987Z =============================================================================== 
2026-09-02T17:45:49.3537540Z Restart Jboss ---------------------------------------------------------- 14.67s
2026-09-02T17:45:49.3539075Z Copiando artefatos para o(s) servidor(es) Jboss ------------------------- 5.48s
2026-09-02T17:45:49.3539580Z Gathering Facts --------------------------------------------------------- 1.60s
2026-09-02T17:45:49.3539799Z maven_artifact ---------------------------------------------------------- 1.51s
2026-09-02T17:45:49.3541607Z Gerando fatos de servicos ----------------------------------------------- 1.03s
2026-09-02T17:45:49.3542789Z Copiando arquivo standalone-full-ha.xml --------------------------------- 0.91s
2026-09-02T17:45:49.3543473Z Realiza copia do arquivo de Trust Store --------------------------------- 0.88s
2026-09-02T17:45:49.3543879Z Copy template script ---------------------------------------------------- 0.87s
2026-09-02T17:45:49.3544277Z Stop e Disable service jboss -------------------------------------------- 0.71s
2026-09-02T17:45:49.3544514Z JBoss systemd wrapper for sysvinit script mode domain ------------------- 0.64s
2026-09-02T17:45:49.3547228Z Copiando arquivo standalone.conf ---------------------------------------- 0.64s
2026-09-02T17:45:49.3547983Z Copiando arquivos para jboss.server.config.dir -------------------------- 0.63s
2026-09-02T17:45:49.3548262Z Lendo artefatos do arquivo CSV ------------------------------------------ 0.56s
2026-09-02T17:45:49.3548492Z Verificando o java versão esta instalado: 1.8.0_221 --------------------- 0.53s
2026-09-02T17:45:49.3548707Z Verificando a versão do Java -------------------------------------------- 0.51s
2026-09-02T17:45:49.3548938Z Check directory configuration exists ------------------------------------ 0.44s
2026-09-02T17:45:49.3552320Z Create a symbolic link -------------------------------------------------- 0.43s
2026-09-02T17:45:49.3552583Z Verifica se o arquivo  existe ------------------------------------------- 0.42s
2026-09-02T17:45:49.3552841Z Verifica ser o Jboss já foi instalado ----------------------------------- 0.30s
2026-09-02T17:45:49.3553115Z Teste ------------------------------------------------------------------- 0.18s
2026-09-02T17:45:49.3589467Z Playbook run took 0 days, 0 hours, 0 minutes, 34 seconds
2026-09-02T17:45:49.4285390Z ##[error]Bash exited with code '2'.
2026-09-02T17:45:49.4289309Z ##[section]Finishing: Deploy Config no JBOSS




Warning: Permanently added '10.116.193.244' (ED25519) to the list of known hosts.
p585600@10.116.193.244's password:
,Creating home directory for p585600.
,-sh-4.2$ ,
-sh: ,: comando não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$ ps -ef | grep jboss
p585600   18343  18304  0 16:26 pts/0    00:00:00 grep --color=auto jboss
root     113692      1  0 09:14 ?        00:00:00 runuser jboss -c LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/opt/jboss/jboss-eap/standalone/tmp/jboss-eap-standalone.pid /opt/jboss/jboss-eap/bin/standalone.sh                -b 10.116.193.244                -bmanagement 10.116.193.244                -bprivate 10.116.193.244                                                -Dhttp.modcluster.proxy1=10.116.223.231                                 -Dhttp.modcluster.proxy2=10.116.223.232                                 -Djboss_modcluster_proxy_list="caddeapllx135.extra.caixa.gov.br:6666,caddeapllx136.extra.caixa.gov.br:6666"                -Djboss_modcluster_balancer=sigec-csc                -Djboss.cluster.tcp.initial_hosts=10.116.193.251[7600],10.116.193.244[7600]                -Djboss.node.name=caddeapllx756                -Djboss.tx.node.id=caddeapllx756                -u 230.0.0.4                                -Djboss.server.base.dir=/opt/jboss/jboss-eap/standalone                -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sigec-csc -c standalone-full-ha.xml
jboss    113695 113692  0 09:14 ?        00:00:00 /bin/sh /opt/jboss/jboss-eap/bin/standalone.sh -b 10.116.193.244 -bmanagement 10.116.193.244 -bprivate 10.116.193.244 -Dhttp.modcluster.proxy1=10.116.223.231 -Dhttp.modcluster.proxy2=10.116.223.232 -Djboss_modcluster_proxy_list=caddeapllx135.extra.caixa.gov.br:6666,caddeapllx136.extra.caixa.gov.br:6666 -Djboss_modcluster_balancer=sigec-csc -Djboss.cluster.tcp.initial_hosts=10.116.193.251[7600],10.116.193.244[7600] -Djboss.node.name=caddeapllx756 -Djboss.tx.node.id=caddeapllx756 -u 230.0.0.4 -Djboss.server.base.dir=/opt/jboss/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sigec-csc -c standalone-full-ha.xml
jboss    113872 113695  0 09:14 ?        00:03:24 java -D[Standalone] -verbose:gc -Xloggc:/logs/jboss/jboss-eap/standalone/sigec-csc/gc.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Xms1024m -Xmx2048m -XX:MetaspaceSize=96m -XX:MaxMetaspaceSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss/jboss-eap/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.modules.policy-permissions=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/p:/opt/jboss/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.0.7.Final-redhat-1.jar -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.util.logging.manager=org.jboss.logmanager.LogManager -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml -javaagent:/opt/apm_agent/elastic-apm-agent-1.15.0.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm-1.15.0.properties -Delastic.apm.service_name=sigec-csc -Delastic.apm.environment=DES -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=http://apm-server-devops.produtos.caixa -Delastic.apm.global_labels=deployment=sigec-csc-des-esteiras -Dorg.jboss.boot.log.file=/logs/jboss/jboss-eap/standalone/sigec-csc/server.log -Dlogging.configuration=file:/opt/jboss/jboss-eap/standalone/configuration/logging.properties -jar /opt/jboss/jboss-eap/jboss-modules.jar -mp /opt/jboss/jboss-eap/modules org.jboss.as.standalone -Djboss.home.dir=/opt/jboss/jboss-eap -Djboss.server.base.dir=/opt/jboss/jboss-eap/standalone -b 10.116.193.244 -bmanagement 10.116.193.244 -bprivate 10.116.193.244 -Dhttp.modcluster.proxy1=10.116.223.231 -Dhttp.modcluster.proxy2=10.116.223.232 -Djboss_modcluster_proxy_list=caddeapllx135.extra.caixa.gov.br:6666,caddeapllx136.extra.caixa.gov.br:6666 -Djboss_modcluster_balancer=sigec-csc -Djboss.cluster.tcp.initial_hosts=10.116.193.251[7600],10.116.193.244[7600] -Djboss.node.name=caddeapllx756 -Djboss.tx.node.id=caddeapllx756 -u 230.0.0.4 -Djboss.server.base.dir=/opt/jboss/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sigec-csc -c standalone-full-ha.xml
-sh-4.2$ ps -ef | grep java
p585600   18349  18304  0 16:26 pts/0    00:00:00 grep --color=auto java
jboss    113872 113695  0 09:14 ?        00:03:24 java -D[Standalone] -verbose:gc -Xloggc:/logs/jboss/jboss-eap/standalone/sigec-csc/gc.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Xms1024m -Xmx2048m -XX:MetaspaceSize=96m -XX:MaxMetaspaceSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss/jboss-eap/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.modules.policy-permissions=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/p:/opt/jboss/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.0.7.Final-redhat-1.jar -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.util.logging.manager=org.jboss.logmanager.LogManager -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml -javaagent:/opt/apm_agent/elastic-apm-agent-1.15.0.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm-1.15.0.properties -Delastic.apm.service_name=sigec-csc -Delastic.apm.environment=DES -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=http://apm-server-devops.produtos.caixa -Delastic.apm.global_labels=deployment=sigec-csc-des-esteiras -Dorg.jboss.boot.log.file=/logs/jboss/jboss-eap/standalone/sigec-csc/server.log -Dlogging.configuration=file:/opt/jboss/jboss-eap/standalone/configuration/logging.properties -jar /opt/jboss/jboss-eap/jboss-modules.jar -mp /opt/jboss/jboss-eap/modules org.jboss.as.standalone -Djboss.home.dir=/opt/jboss/jboss-eap -Djboss.server.base.dir=/opt/jboss/jboss-eap/standalone -b 10.116.193.244 -bmanagement 10.116.193.244 -bprivate 10.116.193.244 -Dhttp.modcluster.proxy1=10.116.223.231 -Dhttp.modcluster.proxy2=10.116.223.232 -Djboss_modcluster_proxy_list=caddeapllx135.extra.caixa.gov.br:6666,caddeapllx136.extra.caixa.gov.br:6666 -Djboss_modcluster_balancer=sigec-csc -Djboss.cluster.tcp.initial_hosts=10.116.193.251[7600],10.116.193.244[7600] -Djboss.node.name=caddeapllx756 -Djboss.tx.node.id=caddeapllx756 -u 230.0.0.4 -Djboss.server.base.dir=/opt/jboss/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sigec-csc -c standalone-full-ha.xml
-sh-4.2$ ps -ef | grep sigec
p585600   18357  18304  0 16:26 pts/0    00:00:00 grep --color=auto sigec
root     113692      1  0 09:14 ?        00:00:00 runuser jboss -c LAUNCH_JBOSS_IN_BACKGROUND=1 JBOSS_PIDFILE=/opt/jboss/jboss-eap/standalone/tmp/jboss-eap-standalone.pid /opt/jboss/jboss-eap/bin/standalone.sh                -b 10.116.193.244                -bmanagement 10.116.193.244                -bprivate 10.116.193.244                                                -Dhttp.modcluster.proxy1=10.116.223.231                                 -Dhttp.modcluster.proxy2=10.116.223.232                                 -Djboss_modcluster_proxy_list="caddeapllx135.extra.caixa.gov.br:6666,caddeapllx136.extra.caixa.gov.br:6666"                -Djboss_modcluster_balancer=sigec-csc                -Djboss.cluster.tcp.initial_hosts=10.116.193.251[7600],10.116.193.244[7600]                -Djboss.node.name=caddeapllx756                -Djboss.tx.node.id=caddeapllx756                -u 230.0.0.4                                -Djboss.server.base.dir=/opt/jboss/jboss-eap/standalone                -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sigec-csc -c standalone-full-ha.xml
jboss    113695 113692  0 09:14 ?        00:00:00 /bin/sh /opt/jboss/jboss-eap/bin/standalone.sh -b 10.116.193.244 -bmanagement 10.116.193.244 -bprivate 10.116.193.244 -Dhttp.modcluster.proxy1=10.116.223.231 -Dhttp.modcluster.proxy2=10.116.223.232 -Djboss_modcluster_proxy_list=caddeapllx135.extra.caixa.gov.br:6666,caddeapllx136.extra.caixa.gov.br:6666 -Djboss_modcluster_balancer=sigec-csc -Djboss.cluster.tcp.initial_hosts=10.116.193.251[7600],10.116.193.244[7600] -Djboss.node.name=caddeapllx756 -Djboss.tx.node.id=caddeapllx756 -u 230.0.0.4 -Djboss.server.base.dir=/opt/jboss/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sigec-csc -c standalone-full-ha.xml
jboss    113872 113695  0 09:14 ?        00:03:24 java -D[Standalone] -verbose:gc -Xloggc:/logs/jboss/jboss-eap/standalone/sigec-csc/gc.log -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=5 -XX:GCLogFileSize=3M -XX:-TraceClassUnloading -Xms1024m -Xmx2048m -XX:MetaspaceSize=96m -XX:MaxMetaspaceSize=512m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman -Djava.awt.headless=true -Djavax.net.ssl.trustStore=/opt/jboss/jboss-eap/standalone/configuration/caixa-truststore-acteste-nprd.jks -Djavax.net.ssl.trustStorePassword=changeit -Djboss.modules.policy-permissions=true -server -XX:+ExplicitGCInvokesConcurrent -XX:+UseG1GC -XX:MaxGCPauseMillis=500 -Xbootclasspath/p:/opt/jboss/jboss-eap/modules/system/layers/base/org/jboss/logmanager/main/jboss-logmanager-2.0.7.Final-redhat-1.jar -Djboss.modules.system.pkgs=org.jboss.byteman,org.jboss.logmanager -Djava.util.logging.manager=org.jboss.logmanager.LogManager -javaagent:/opt/jmx_exporter/jmx_prometheus.jar=8778:/opt/jmx_exporter/jmx_prometheus.yaml -javaagent:/opt/apm_agent/elastic-apm-agent-1.15.0.jar -Delastic.apm.config_file=/opt/apm_agent/elasticapm-1.15.0.properties -Delastic.apm.service_name=sigec-csc -Delastic.apm.environment=DES -Delastic.apm.application_packages=br.gov.caixa -Delastic.apm.server_urls=http://apm-server-devops.produtos.caixa -Delastic.apm.global_labels=deployment=sigec-csc-des-esteiras -Dorg.jboss.boot.log.file=/logs/jboss/jboss-eap/standalone/sigec-csc/server.log -Dlogging.configuration=file:/opt/jboss/jboss-eap/standalone/configuration/logging.properties -jar /opt/jboss/jboss-eap/jboss-modules.jar -mp /opt/jboss/jboss-eap/modules org.jboss.as.standalone -Djboss.home.dir=/opt/jboss/jboss-eap -Djboss.server.base.dir=/opt/jboss/jboss-eap/standalone -b 10.116.193.244 -bmanagement 10.116.193.244 -bprivate 10.116.193.244 -Dhttp.modcluster.proxy1=10.116.223.231 -Dhttp.modcluster.proxy2=10.116.223.232 -Djboss_modcluster_proxy_list=caddeapllx135.extra.caixa.gov.br:6666,caddeapllx136.extra.caixa.gov.br:6666 -Djboss_modcluster_balancer=sigec-csc -Djboss.cluster.tcp.initial_hosts=10.116.193.251[7600],10.116.193.244[7600] -Djboss.node.name=caddeapllx756 -Djboss.tx.node.id=caddeapllx756 -u 230.0.0.4 -Djboss.server.base.dir=/opt/jboss/jboss-eap/standalone -Djboss.server.log.dir=/logs/jboss/jboss-eap/standalone/sigec-csc -c standalone-full-ha.xml
-sh-4.2$
