Após criação de certificado para apt-bancario.tqs.caixa - https://devops.caixa/projetos/Caixa/_release?_a=releases&view=mine&definitionId=6304 foi informado que a porta 443 está fechada. Favor ajustar.

Segue REQ000144492006

12/06/2026 13:57:57 ; (P665576)
Prezados,

Conforme nota anterior, foi verificado que o certificado CT2026_APT-BANCARIO.TQS.CAIXA está instalado no balanceador. No entanto, o VIP permanece down, pois a porta 443 do servidor 10.116.181.172 encontra-se fechada.

Favor verificar com o responsável pelo servidor o motivo de a porta estar fechada.

Atenciosamente,
TELEDATA / CETEL / REDE DATA CENTER


Histórico de Informações de Trabalho da Ordem de Trabalho
ID da Ordem de Trabalho	 WO0000080719557
Criado em	 12/06/2026 13:57:57
Criado por	 P665576
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezados,

Conforme nota anterior, foi verificado que o certificado CT2026_APT-BANCARIO.TQS.CAIXA está instalado no balanceador. No entanto, o VIP permanece down, pois a porta 443 do servidor 10.116.181.172 encontra-se fechada.

Favor verificar com o responsável pelo servidor o motivo de a porta estar fechada.

Atenciosamente,
TELEDATA / CETEL / REDE DATA CENTER
ID da Ordem de Trabalho	 WO0000080719557
Criado em	 11/06/2026 14:59:57
Criado por	 P705068
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À

TELEDATA/CETEL/REDES


Prezados,

Foi verificado que o certificado CT2026_APT-BANCARIO.TQS.CAIXA esta instalado no balanceador,porem o vip está down devido a porta 443 do servidor 10.116.181.172 está fechada.
Segue as evidencias abaixo.

CNPRDFW001-1# ping tcp 10.116.181.172 443
Type escape sequence to abort.
No source specified. Pinging from identity interface.
Sending 5 TCP SYN requests to 10.116.181.172 port 443
from 10.116.4.133, timeout is 2 seconds:
?????
Success rate is 0 percent (0/5)
CNPRDFW001-1# ping tcp 10.116.181.172 80
Type escape sequence to abort.
No source specified. Pinging from identity interface.
Sending 5 TCP SYN requests to 10.116.181.172 port 80
from 10.116.4.133, timeout is 2 seconds:
!!!!!
Success rate is 100 percent (5/5), round-trip min/avg/max = 1/1/1 ms
CNPRDFW001-1#

Att,
Weverton de Oliveira Silva
Analista de infraestrutura - Redes
TELEDATA/CETEL/REDES
ID da Ordem de Trabalho	 WO0000080719557
Criado em	 11/06/2026 13:13:35
Criado por	 C159655
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Certificado foi importado no balanceador pela REQ000144415521.

Atenciosamente,

CAIXA/CEPRO/CN PROTEÇÕES EM SEGURANÇA DIGITAL
ID da Ordem de Trabalho	 WO0000080719557
Criado em	 10/06/2026 12:55:03
Criado por	 Remedy Application Service
Origem de Comunicação	 E-mail
Exibir Acesso	 Interno
Notas	 Este ticket foi criado a partir do sistema de solicitação de serviço.
Impresso por P585600 em Quarta-feira, 17/06/2026 13:42:21



2026-06-16T18:08:36.5871680Z ##[section]Starting: Alocando o IP (AlocaIP e Infradevops)
2026-06-16T18:08:36.5875794Z ==============================================================================
2026-06-16T18:08:36.5875933Z Task         : Bash
2026-06-16T18:08:36.5875978Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-06-16T18:08:36.5876042Z Version      : 3.227.0
2026-06-16T18:08:36.5876129Z Author       : Microsoft Corporation
2026-06-16T18:08:36.5876181Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-06-16T18:08:36.5876256Z ==============================================================================
2026-06-16T18:08:36.7358255Z Generating script.
2026-06-16T18:08:36.7371441Z ========================== Starting Command Output ===========================
2026-06-16T18:08:36.7378997Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/d2fc1132-76e0-4fc3-a281-d47cf4a6c184.sh
2026-06-16T18:08:36.7463443Z /opt/ads-agent/_work/_temp/d2fc1132-76e0-4fc3-a281-d47cf4a6c184.sh: line 4: tf_var_quant: command not found
2026-06-16T18:08:37.0178880Z [DEPRECATION WARNING]: [defaults]callback_whitelist option, normalizing names 
2026-06-16T18:08:37.0179131Z to new standard, use callbacks_enabled instead. This feature will be removed 
2026-06-16T18:08:37.0179636Z from ansible-core in version 2.15. Deprecation warnings can be disabled by 
2026-06-16T18:08:37.0179852Z setting deprecation_warnings=False in ansible.cfg.
2026-06-16T18:08:37.5494373Z 
2026-06-16T18:08:37.5494967Z PLAY [local] *******************************************************************
2026-06-16T18:08:37.5495641Z Tuesday 16 June 2026  15:08:37 -0300 (0:00:00.009)       0:00:00.009 ********** 
2026-06-16T18:08:38.3752458Z [WARNING]: Distribution rhel 9.3 on host 127.0.0.1 should use /usr/bin/python3,
2026-06-16T18:08:38.3752922Z but is using /usr/bin/python for backward compatibility with prior Ansible
2026-06-16T18:08:38.3753106Z releases. See https://docs.ansible.com/ansible-
2026-06-16T18:08:38.3753289Z core/2.14/reference_appendices/interpreter_discovery.html for more information
2026-06-16T18:08:38.3930956Z 
2026-06-16T18:08:38.3931284Z TASK [Gathering Facts] *********************************************************
2026-06-16T18:08:38.3931460Z ok: [127.0.0.1]
2026-06-16T18:08:38.3931941Z Tuesday 16 June 2026  15:08:38 -0300 (0:00:00.843)       0:00:00.853 ********** 
2026-06-16T18:08:38.4307272Z 
2026-06-16T18:08:38.4308152Z TASK [include_role : vm] *******************************************************
2026-06-16T18:08:38.4308998Z Tuesday 16 June 2026  15:08:38 -0300 (0:00:00.037)       0:00:00.891 ********** 
2026-06-16T18:08:38.4595082Z [WARNING]: While constructing a mapping from /opt/ads-
2026-06-16T18:08:38.4595743Z agent/_work/r704/a/esteira-jboss-vm-v2/roles/vm/tasks/create_vm.yml, line 71,
2026-06-16T18:08:38.4596196Z column 3, found a duplicate dict key (include_tasks). Using last defined value
2026-06-16T18:08:38.4596315Z only.
2026-06-16T18:08:38.4742697Z 
2026-06-16T18:08:38.4743063Z TASK [vm : include_tasks] ******************************************************
2026-06-16T18:08:38.4743419Z included: /opt/ads-agent/_work/r704/a/esteira-jboss-vm-v2/roles/vm/tasks/create_vm.yml for 127.0.0.1
2026-06-16T18:08:38.4743739Z Tuesday 16 June 2026  15:08:38 -0300 (0:00:00.043)       0:00:00.934 ********** 
2026-06-16T18:08:38.5189503Z 
2026-06-16T18:08:38.5190346Z TASK [vm : Cria variável build_repository_name] ********************************
2026-06-16T18:08:38.5190810Z ok: [127.0.0.1]
2026-06-16T18:08:38.5191123Z Tuesday 16 June 2026  15:08:38 -0300 (0:00:00.044)       0:00:00.979 ********** 
2026-06-16T18:08:39.3852324Z 
2026-06-16T18:08:39.3853346Z TASK [vm : Instalar dependências Python para vCenter] **************************
2026-06-16T18:08:39.3853598Z ok: [127.0.0.1]
2026-06-16T18:08:39.3853880Z Tuesday 16 June 2026  15:08:39 -0300 (0:00:00.866)       0:00:01.845 ********** 
2026-06-16T18:08:41.0099134Z 
2026-06-16T18:08:41.0099671Z TASK [vm : Executar script para marcar VM como template] ***********************
2026-06-16T18:08:41.0103139Z changed: [127.0.0.1]
2026-06-16T18:08:41.0103694Z Tuesday 16 June 2026  15:08:41 -0300 (0:00:01.624)       0:00:03.470 ********** 
2026-06-16T18:08:41.0515881Z 
2026-06-16T18:08:41.0516693Z TASK [vm : Exibir resultado do script vCenter] *********************************
2026-06-16T18:08:41.0517012Z ok: [127.0.0.1] => {
2026-06-16T18:08:41.0517155Z     "msg": [
2026-06-16T18:08:41.0517279Z         "Iniciando registro do template VMTX...",
2026-06-16T18:08:41.0517545Z         "vCenter: 10.122.144.195",
2026-06-16T18:08:41.0518366Z         "Template: eap80-openjdk17-apache24-rhel93-v006",
2026-06-16T18:08:41.0518798Z         "Caminho VMTX: [TEMPLATE_TERRAFORM_NFS] eap80-openjdk17-apache24-rhel93-v006/eap80-openjdk17-apache24-rhel93-v006.vmtx",
2026-06-16T18:08:41.0519058Z         "Datastore: TEMPLATE_TERRAFORM_NFS",
2026-06-16T18:08:41.0519338Z         "Template 'eap80-openjdk17-apache24-rhel93-v006' ja existe e esta registrado. Nenhuma acao necessaria.",
2026-06-16T18:08:41.0519489Z         "Operacao concluida com sucesso."
2026-06-16T18:08:41.0519653Z     ]
2026-06-16T18:08:41.0519778Z }
2026-06-16T18:08:41.0520042Z Tuesday 16 June 2026  15:08:41 -0300 (0:00:00.041)       0:00:03.512 ********** 
2026-06-16T18:08:41.0971564Z 
2026-06-16T18:08:41.0972550Z TASK [vm : Cria variável ansible] **********************************************
2026-06-16T18:08:41.0972963Z ok: [127.0.0.1]
2026-06-16T18:08:41.0973229Z Tuesday 16 June 2026  15:08:41 -0300 (0:00:00.045)       0:00:03.557 ********** 
2026-06-16T18:08:41.4290264Z [WARNING]: Skipped '/opt/ads-agent/_work/r704/a/_ECAPT-bancario-
2026-06-16T18:08:41.4290952Z config/ansible/' path due to this access issue: '/opt/ads-
2026-06-16T18:08:41.4292029Z agent/_work/r704/a/_ECAPT-bancario-config/ansible/' is not a directory
2026-06-16T18:08:41.4369434Z 
2026-06-16T18:08:41.4370875Z TASK [vm : Encontrar arquivos no diretório de origem ansible] ******************
2026-06-16T18:08:41.4371086Z ok: [127.0.0.1]
2026-06-16T18:08:41.4371362Z Tuesday 16 June 2026  15:08:41 -0300 (0:00:00.339)       0:00:03.897 ********** 
2026-06-16T18:08:41.6490772Z 
2026-06-16T18:08:41.6492119Z TASK [vm : Encontrar arquivos no diretório de origem ansible] ******************
2026-06-16T18:08:41.6492466Z ok: [127.0.0.1]
2026-06-16T18:08:41.6493389Z Tuesday 16 June 2026  15:08:41 -0300 (0:00:00.211)       0:00:04.109 ********** 
2026-06-16T18:08:41.6665794Z Tuesday 16 June 2026  15:08:41 -0300 (0:00:00.017)       0:00:04.127 ********** 
2026-06-16T18:08:41.6959033Z Tuesday 16 June 2026  15:08:41 -0300 (0:00:00.029)       0:00:04.156 ********** 
2026-06-16T18:08:41.7635119Z 
2026-06-16T18:08:41.7635662Z TASK [vm : Sobrescrevendo groups vars ctc_nprd] ********************************
2026-06-16T18:08:41.7636511Z ok: [127.0.0.1]
2026-06-16T18:08:41.7637046Z Tuesday 16 June 2026  15:08:41 -0300 (0:00:00.067)       0:00:04.223 ********** 
2026-06-16T18:08:41.8115782Z 
2026-06-16T18:08:41.8116411Z TASK [vm : include_tasks] ******************************************************
2026-06-16T18:08:41.8116962Z included: /opt/ads-agent/_work/r704/a/esteira-jboss-vm-v2/roles/vm/tasks/size/size_vm.yml for 127.0.0.1
2026-06-16T18:08:41.8117323Z Tuesday 16 June 2026  15:08:41 -0300 (0:00:00.048)       0:00:04.272 ********** 
2026-06-16T18:08:41.8578159Z 
2026-06-16T18:08:41.8579899Z TASK [vm : include_tasks] ******************************************************
2026-06-16T18:08:41.8580587Z included: /opt/ads-agent/_work/r704/a/esteira-jboss-vm-v2/roles/vm/tasks/size/approved.yml for 127.0.0.1
2026-06-16T18:08:41.8581137Z Tuesday 16 June 2026  15:08:41 -0300 (0:00:00.045)       0:00:04.318 ********** 
2026-06-16T18:08:42.3003780Z 
2026-06-16T18:08:42.3004251Z TASK [vm : Consultar API] ******************************************************
2026-06-16T18:08:42.3004511Z ok: [127.0.0.1]
2026-06-16T18:08:42.3004993Z Tuesday 16 June 2026  15:08:42 -0300 (0:00:00.442)       0:00:04.761 ********** 
2026-06-16T18:08:42.3382619Z 
2026-06-16T18:08:42.3383322Z TASK [vm : Parse JSON] *********************************************************
2026-06-16T18:08:42.3383794Z ok: [127.0.0.1]
2026-06-16T18:08:42.3384311Z Tuesday 16 June 2026  15:08:42 -0300 (0:00:00.037)       0:00:04.798 ********** 
2026-06-16T18:08:42.3861659Z 
2026-06-16T18:08:42.3862832Z TASK [vm : include_tasks] ******************************************************
2026-06-16T18:08:42.3864200Z included: /opt/ads-agent/_work/r704/a/esteira-jboss-vm-v2/roles/vm/tasks/size/requested.yml for 127.0.0.1
2026-06-16T18:08:42.3865034Z Tuesday 16 June 2026  15:08:42 -0300 (0:00:00.047)       0:00:04.846 ********** 
2026-06-16T18:08:42.7323898Z 
2026-06-16T18:08:42.7324724Z TASK [vm : Consultar API] ******************************************************
2026-06-16T18:08:42.7324935Z ok: [127.0.0.1]
2026-06-16T18:08:42.7325485Z Tuesday 16 June 2026  15:08:42 -0300 (0:00:00.346)       0:00:05.192 ********** 
2026-06-16T18:08:42.7673909Z 
2026-06-16T18:08:42.7674573Z TASK [vm : Parse JSON] *********************************************************
2026-06-16T18:08:42.7674768Z ok: [127.0.0.1]
2026-06-16T18:08:42.7675227Z Tuesday 16 June 2026  15:08:42 -0300 (0:00:00.034)       0:00:05.227 ********** 
2026-06-16T18:08:42.8003344Z Tuesday 16 June 2026  15:08:42 -0300 (0:00:00.032)       0:00:05.260 ********** 
2026-06-16T18:08:42.8441794Z 
2026-06-16T18:08:42.8442518Z TASK [vm : Exibir size servidores.] ********************************************
2026-06-16T18:08:42.8442860Z ok: [127.0.0.1] => {
2026-06-16T18:08:42.8443054Z     "api_data.dados.0": {
2026-06-16T18:08:42.8443198Z         "ambiente": "tqs",
2026-06-16T18:08:42.8443300Z         "cluster": null,
2026-06-16T18:08:42.8443691Z         "cluster_principal": null,
2026-06-16T18:08:42.8443984Z         "cluster_terraform": null,
2026-06-16T18:08:42.8444154Z         "cpu": 2,
2026-06-16T18:08:42.8444251Z         "datacenter": null,
2026-06-16T18:08:42.8444465Z         "datastore": null,
2026-06-16T18:08:42.8444609Z         "detalhe_imagem": null,
2026-06-16T18:08:42.8444745Z         "disco_log": 2,
2026-06-16T18:08:42.8444850Z         "disco_opt": 10,
2026-06-16T18:08:42.8444988Z         "domain": null,
2026-06-16T18:08:42.8445153Z         "esx_network": null,
2026-06-16T18:08:42.8445321Z         "esx_network_bck": null,
2026-06-16T18:08:42.8445465Z         "esx_vcenter_server": null,
2026-06-16T18:08:42.8445565Z         "farm": null,
2026-06-16T18:08:42.8445700Z         "id": 13226,
2026-06-16T18:08:42.8446158Z         "inclusao": "2026-05-19 15:45:09",
2026-06-16T18:08:42.8446310Z         "info_framework": null,
2026-06-16T18:08:42.8446430Z         "info_linguagem": null,
2026-06-16T18:08:42.8446648Z         "info_tecnologia": null,
2026-06-16T18:08:42.8446815Z         "info_versao": null,
2026-06-16T18:08:42.8447007Z         "ipbackup": "",
2026-06-16T18:08:42.8447407Z         "jboss_apache_status": "ativado",
2026-06-16T18:08:42.8447511Z         "memoria": 4,
2026-06-16T18:08:42.8447651Z         "net_adapter_type": null,
2026-06-16T18:08:42.8447796Z         "nome_imagem": null,
2026-06-16T18:08:42.8448002Z         "objeto_origem": "ECAPT-BANCARIO_TQS_SERVIDOR",
2026-06-16T18:08:42.8448120Z         "plataforma": "vm",
2026-06-16T18:08:42.8448259Z         "produto": "jboss",
2026-06-16T18:08:42.8448504Z         "recursos_max_id": null,
2026-06-16T18:08:42.8448672Z         "servidores_json": [
2026-06-16T18:08:42.8448763Z             {
2026-06-16T18:08:42.8448924Z                 "ip": "10.116.201.129",
2026-06-16T18:08:42.8449073Z                 "jboss_apache_status": "ativado",
2026-06-16T18:08:42.8449241Z                 "nome": "caddeapllx2673.agil.nprd.caixa.gov.br"
2026-06-16T18:08:42.8449386Z             }
2026-06-16T18:08:42.8449467Z         ],
2026-06-16T18:08:42.8449654Z         "sistema": "ecapt-bancario",
2026-06-16T18:08:42.8449803Z         "site": "ctc_nprd",
2026-06-16T18:08:42.8449952Z         "solicitacoes_id": null,
2026-06-16T18:08:42.8450050Z         "status": "ativado",
2026-06-16T18:08:42.8450182Z         "terraform": true,
2026-06-16T18:08:42.8450343Z         "versao_imagem": null,
2026-06-16T18:08:42.8450585Z         "versao_plataforma": "7.1",
2026-06-16T18:08:42.8450721Z         "vm_dns": null,
2026-06-16T18:08:42.8450821Z         "vm_ipnetmask": null,
2026-06-16T18:08:42.8450963Z         "vm_ipnetmask_bck": null,
2026-06-16T18:08:42.8451109Z         "vsphere_folder": null,
2026-06-16T18:08:42.8451256Z         "vsphere_pool": null
2026-06-16T18:08:42.8451343Z     }
2026-06-16T18:08:42.8451461Z }
2026-06-16T18:08:42.8451702Z Tuesday 16 June 2026  15:08:42 -0300 (0:00:00.043)       0:00:05.304 ********** 
2026-06-16T18:08:42.8780382Z Tuesday 16 June 2026  15:08:42 -0300 (0:00:00.033)       0:00:05.338 ********** 
2026-06-16T18:08:42.9231350Z 
2026-06-16T18:08:42.9231789Z TASK [vm : Set size] ***********************************************************
2026-06-16T18:08:42.9232000Z ok: [127.0.0.1]
2026-06-16T18:08:42.9232368Z Tuesday 16 June 2026  15:08:42 -0300 (0:00:00.045)       0:00:05.383 ********** 
2026-06-16T18:08:42.9596327Z 
2026-06-16T18:08:42.9597060Z TASK [vm : Recuperar variável de ambiente] *************************************
2026-06-16T18:08:42.9597293Z ok: [127.0.0.1]
2026-06-16T18:08:42.9597515Z Tuesday 16 June 2026  15:08:42 -0300 (0:00:00.036)       0:00:05.420 ********** 
2026-06-16T18:08:42.9930244Z 
2026-06-16T18:08:42.9930763Z TASK [vm : debug] **************************************************************
2026-06-16T18:08:42.9932323Z ok: [127.0.0.1] => {
2026-06-16T18:08:42.9932790Z     "template_name": "eap80-openjdk17-apache24-rhel93-v006"
2026-06-16T18:08:42.9932944Z }
2026-06-16T18:08:42.9933214Z Tuesday 16 June 2026  15:08:42 -0300 (0:00:00.033)       0:00:05.453 ********** 
2026-06-16T18:08:43.0356805Z 
2026-06-16T18:08:43.0358018Z TASK [vm : Definir fato se o nome do template começa com "controlm"] ***********
2026-06-16T18:08:43.0358338Z ok: [127.0.0.1]
2026-06-16T18:08:43.0358800Z Tuesday 16 June 2026  15:08:43 -0300 (0:00:00.042)       0:00:05.496 ********** 
2026-06-16T18:08:43.0744176Z Tuesday 16 June 2026  15:08:43 -0300 (0:00:00.038)       0:00:05.534 ********** 
2026-06-16T18:08:43.4241238Z 
2026-06-16T18:08:43.4243744Z TASK [vm : Run Invetory All] ***************************************************
2026-06-16T18:08:43.4243955Z changed: [127.0.0.1]
2026-06-16T18:08:43.4244480Z Tuesday 16 June 2026  15:08:43 -0300 (0:00:00.349)       0:00:05.884 ********** 
2026-06-16T18:08:43.4585565Z 
2026-06-16T18:08:43.4586388Z TASK [vm : Parse JSON output] **************************************************
2026-06-16T18:08:43.4586658Z ok: [127.0.0.1]
2026-06-16T18:08:43.4587260Z Tuesday 16 June 2026  15:08:43 -0300 (0:00:00.034)       0:00:05.919 ********** 
2026-06-16T18:08:43.5008098Z 
2026-06-16T18:08:43.5008840Z TASK [vm : Count the number of hosts] ******************************************
2026-06-16T18:08:43.5011386Z ok: [127.0.0.1]
2026-06-16T18:08:43.5011923Z Tuesday 16 June 2026  15:08:43 -0300 (0:00:00.042)       0:00:05.961 ********** 
2026-06-16T18:08:43.5390108Z Tuesday 16 June 2026  15:08:43 -0300 (0:00:00.037)       0:00:05.999 ********** 
2026-06-16T18:08:43.5751415Z Tuesday 16 June 2026  15:08:43 -0300 (0:00:00.036)       0:00:06.035 ********** 
2026-06-16T18:08:43.6096620Z 
2026-06-16T18:08:43.6097373Z TASK [vm : Apresenta quantidade do(s) host(s)] *********************************
2026-06-16T18:08:43.6097562Z ok: [127.0.0.1] => {
2026-06-16T18:08:43.6097697Z     "msg": [
2026-06-16T18:08:43.6097795Z         "num_hosts: 1"
2026-06-16T18:08:43.6098158Z     ]
2026-06-16T18:08:43.6098285Z }
2026-06-16T18:08:43.6098954Z Tuesday 16 June 2026  15:08:43 -0300 (0:00:00.034)       0:00:06.070 ********** 
2026-06-16T18:08:43.6504377Z Tuesday 16 June 2026  15:08:43 -0300 (0:00:00.040)       0:00:06.110 ********** 
2026-06-16T18:08:43.6943893Z Tuesday 16 June 2026  15:08:43 -0300 (0:00:00.044)       0:00:06.154 ********** 
2026-06-16T18:08:43.7396003Z 
2026-06-16T18:08:43.7396676Z TASK [vm : include_tasks] ******************************************************
2026-06-16T18:08:43.7397216Z included: /opt/ads-agent/_work/r704/a/esteira-jboss-vm-v2/roles/vm/tasks/../../nfs/tasks/create_ip_bck.yml for 127.0.0.1
2026-06-16T18:08:43.7397884Z Tuesday 16 June 2026  15:08:43 -0300 (0:00:00.045)       0:00:06.200 ********** 
2026-06-16T18:08:43.7780237Z 
2026-06-16T18:08:43.7780838Z TASK [vm : include_tasks] ******************************************************
2026-06-16T18:08:43.7781497Z included: /opt/ads-agent/_work/r704/a/esteira-jboss-vm-v2/roles/nfs/tasks/get_nfs.yml for 127.0.0.1
2026-06-16T18:08:43.7781820Z Tuesday 16 June 2026  15:08:43 -0300 (0:00:00.038)       0:00:06.238 ********** 
2026-06-16T18:08:43.8184420Z 
2026-06-16T18:08:43.8185056Z TASK [vm : Criar variáveis] ****************************************************
2026-06-16T18:08:43.8185234Z ok: [127.0.0.1]
2026-06-16T18:08:43.8185462Z Tuesday 16 June 2026  15:08:43 -0300 (0:00:00.040)       0:00:06.279 ********** 
2026-06-16T18:08:44.0480166Z 
2026-06-16T18:08:44.0481892Z TASK [vm : Coletar variáveis de ambiente] **************************************
2026-06-16T18:08:44.0482416Z ok: [127.0.0.1 -> localhost]
2026-06-16T18:08:44.0482725Z Tuesday 16 June 2026  15:08:44 -0300 (0:00:00.229)       0:00:06.508 ********** 
2026-06-16T18:08:44.0826707Z 
2026-06-16T18:08:44.0827474Z TASK [vm : Exibir resultado em JSON] *******************************************
2026-06-16T18:08:44.0827720Z ok: [127.0.0.1] => {
2026-06-16T18:08:44.0827861Z     "nfs_vars_json": {
2026-06-16T18:08:44.0828111Z         "changed": false,
2026-06-16T18:08:44.0828809Z         "cmd": "cat /opt/ads-agent/_work/r704/a/nfs_config.json",
2026-06-16T18:08:44.0829009Z         "delta": "0:00:00.006053",
2026-06-16T18:08:44.0829180Z         "end": "2026-06-16 15:08:44.016205",
2026-06-16T18:08:44.0829849Z         "failed": false,
2026-06-16T18:08:44.0829991Z         "msg": "",
2026-06-16T18:08:44.0830148Z         "rc": 0,
2026-06-16T18:08:44.0830320Z         "start": "2026-06-16 15:08:44.010152",
2026-06-16T18:08:44.0830475Z         "stderr": "",
2026-06-16T18:08:44.0830642Z         "stderr_lines": [],
2026-06-16T18:08:44.0830779Z         "stdout": "[]",
2026-06-16T18:08:44.0830946Z         "stdout_lines": [
2026-06-16T18:08:44.0831040Z             "[]"
2026-06-16T18:08:44.0831159Z         ]
2026-06-16T18:08:44.0831320Z     }
2026-06-16T18:08:44.0831440Z }
2026-06-16T18:08:44.0831693Z Tuesday 16 June 2026  15:08:44 -0300 (0:00:00.034)       0:00:06.543 ********** 
2026-06-16T18:08:44.1195271Z 
2026-06-16T18:08:44.1196340Z TASK [vm : Criar variáveis] ****************************************************
2026-06-16T18:08:44.1196483Z ok: [127.0.0.1]
2026-06-16T18:08:44.1196809Z Tuesday 16 June 2026  15:08:44 -0300 (0:00:00.036)       0:00:06.580 ********** 
2026-06-16T18:08:44.1566857Z Tuesday 16 June 2026  15:08:44 -0300 (0:00:00.036)       0:00:06.617 ********** 
2026-06-16T18:08:44.1899290Z Tuesday 16 June 2026  15:08:44 -0300 (0:00:00.033)       0:00:06.650 ********** 
2026-06-16T18:08:44.5603317Z 
2026-06-16T18:08:44.5603858Z TASK [vm : Run Invetory All] ***************************************************
2026-06-16T18:08:44.5604219Z changed: [127.0.0.1]
2026-06-16T18:08:44.5604847Z Tuesday 16 June 2026  15:08:44 -0300 (0:00:00.370)       0:00:07.020 ********** 
2026-06-16T18:08:44.5958968Z 
2026-06-16T18:08:44.5959718Z TASK [vm : Parse JSON output] **************************************************
2026-06-16T18:08:44.5959905Z ok: [127.0.0.1]
2026-06-16T18:08:44.5960443Z Tuesday 16 June 2026  15:08:44 -0300 (0:00:00.035)       0:00:07.056 ********** 
2026-06-16T18:08:44.6335470Z 
2026-06-16T18:08:44.6336017Z TASK [vm : Debug parsed_output] ************************************************
2026-06-16T18:08:44.6336469Z ok: [127.0.0.1] => {
2026-06-16T18:08:44.6336616Z     "msg": [
2026-06-16T18:08:44.6336741Z         {
2026-06-16T18:08:44.6336870Z             "_meta": {
2026-06-16T18:08:44.6336966Z                 "hostvars": {
2026-06-16T18:08:44.6337147Z                     "caddeapllx2673.agil.nprd.caixa.gov.br": {
2026-06-16T18:08:44.6337309Z                         "ambiente": "tqs",
2026-06-16T18:08:44.6337613Z                         "ansible_host": "10.116.201.129",
2026-06-16T18:08:44.6338032Z                         "cluster": null,
2026-06-16T18:08:44.6338183Z                         "cluster_principal": null,
2026-06-16T18:08:44.6338339Z                         "cluster_terraform": null,
2026-06-16T18:08:44.6338651Z                         "cpu": 2,
2026-06-16T18:08:44.6338797Z                         "datacenter": null,
2026-06-16T18:08:44.6338943Z                         "datastore": null,
2026-06-16T18:08:44.6339049Z                         "detalhe_imagem": null,
2026-06-16T18:08:44.6339192Z                         "disco_log": 2,
2026-06-16T18:08:44.6339332Z                         "disco_opt": 10,
2026-06-16T18:08:44.6339524Z                         "domain": null,
2026-06-16T18:08:44.6339671Z                         "esx_network": null,
2026-06-16T18:08:44.6339778Z                         "esx_network_bck": null,
2026-06-16T18:08:44.6339929Z                         "esx_vcenter_server": null,
2026-06-16T18:08:44.6340073Z                         "farm": null,
2026-06-16T18:08:44.6340246Z                         "id": 13226,
2026-06-16T18:08:44.6340786Z                         "inclusao": "2026-05-19 15:45:09",
2026-06-16T18:08:44.6340913Z                         "info_framework": null,
2026-06-16T18:08:44.6341057Z                         "info_linguagem": null,
2026-06-16T18:08:44.6341212Z                         "info_tecnologia": null,
2026-06-16T18:08:44.6341377Z                         "info_versao": null,
2026-06-16T18:08:44.6341480Z                         "ipbackup": "",
2026-06-16T18:08:44.6341628Z                         "jboss_apache_status": "ativado",
2026-06-16T18:08:44.6341770Z                         "memoria": 4,
2026-06-16T18:08:44.6341914Z                         "net_adapter_type": null,
2026-06-16T18:08:44.6342063Z                         "nome_imagem": null,
2026-06-16T18:08:44.6342239Z                         "objeto_origem": "ECAPT-BANCARIO_TQS_SERVIDOR",
2026-06-16T18:08:44.6342396Z                         "plataforma": "vm",
2026-06-16T18:08:44.6342541Z                         "produto": "jboss",
2026-06-16T18:08:44.6342696Z                         "recursos_max_id": null,
2026-06-16T18:08:44.6342917Z                         "sistema": "ecapt-bancario",
2026-06-16T18:08:44.6343069Z                         "site": "ctc_nprd",
2026-06-16T18:08:44.6343264Z                         "solicitacoes_id": null,
2026-06-16T18:08:44.6343451Z                         "status": "ativado",
2026-06-16T18:08:44.6343631Z                         "terraform": true,
2026-06-16T18:08:44.6343733Z                         "versao_imagem": null,
2026-06-16T18:08:44.6343884Z                         "versao_plataforma": "7.1",
2026-06-16T18:08:44.6344024Z                         "vm_dns": null,
2026-06-16T18:08:44.6344282Z                         "vm_ipnetmask": null,
2026-06-16T18:08:44.6344428Z                         "vm_ipnetmask_bck": null,
2026-06-16T18:08:44.6344538Z                         "vsphere_folder": null,
2026-06-16T18:08:44.6344698Z                         "vsphere_pool": null
2026-06-16T18:08:44.6344835Z                     }
2026-06-16T18:08:44.6344963Z                 }
2026-06-16T18:08:44.6345047Z             },
2026-06-16T18:08:44.6345183Z             "ctc_nprd": {
2026-06-16T18:08:44.6345318Z                 "children": [
2026-06-16T18:08:44.6345460Z                     "jboss"
2026-06-16T18:08:44.6345584Z                 ],
2026-06-16T18:08:44.6345672Z                 "vars": {}
2026-06-16T18:08:44.6345799Z             },
2026-06-16T18:08:44.6345949Z             "jboss": {
2026-06-16T18:08:44.6346078Z                 "hosts": [
2026-06-16T18:08:44.6346187Z                     "caddeapllx2673.agil.nprd.caixa.gov.br"
2026-06-16T18:08:44.6346337Z                 ],
2026-06-16T18:08:44.6346471Z                 "vars": {}
2026-06-16T18:08:44.6346594Z             },
2026-06-16T18:08:44.6346681Z             "local": {
2026-06-16T18:08:44.6346821Z                 "hosts": [
2026-06-16T18:08:44.6346956Z                     "127.0.0.1"
2026-06-16T18:08:44.6347084Z                 ],
2026-06-16T18:08:44.6347280Z                 "vars": {
2026-06-16T18:08:44.6347383Z                     "ansible_connection": "local"
2026-06-16T18:08:44.6347515Z                 }
2026-06-16T18:08:44.6347634Z             },
2026-06-16T18:08:44.6347760Z             "tqs": {
2026-06-16T18:08:44.6347854Z                 "children": [
2026-06-16T18:08:44.6347998Z                     "local",
2026-06-16T18:08:44.6348132Z                     "ctc_nprd"
2026-06-16T18:08:44.6348256Z                 ],
2026-06-16T18:08:44.6348342Z                 "vars": {}
2026-06-16T18:08:44.6348572Z             }
2026-06-16T18:08:44.6348713Z         }
2026-06-16T18:08:44.6348833Z     ]
2026-06-16T18:08:44.6348947Z }
2026-06-16T18:08:44.6349171Z Tuesday 16 June 2026  15:08:44 -0300 (0:00:00.037)       0:00:07.094 ********** 
2026-06-16T18:08:44.6739448Z 
2026-06-16T18:08:44.6740488Z TASK [vm : Verificando os ambientes] *******************************************
2026-06-16T18:08:44.6740916Z ok: [127.0.0.1] => {
2026-06-16T18:08:44.6741083Z     "msg": [
2026-06-16T18:08:44.6741251Z         "Ambiente existentes! Servidores: caddeapllx2673.agil.nprd.caixa.gov.br"
2026-06-16T18:08:44.6741445Z     ]
2026-06-16T18:08:44.6741530Z }
2026-06-16T18:08:44.6742250Z Tuesday 16 June 2026  15:08:44 -0300 (0:00:00.040)       0:00:07.134 ********** 
2026-06-16T18:08:44.7327446Z 
2026-06-16T18:08:44.7328012Z TASK [vm : Recuperar ip] *******************************************************
2026-06-16T18:08:44.7328361Z ok: [127.0.0.1] => (item=caddeapllx2673.agil.nprd.caixa.gov.br)
2026-06-16T18:08:44.7329104Z Tuesday 16 June 2026  15:08:44 -0300 (0:00:00.058)       0:00:07.193 ********** 
2026-06-16T18:08:44.7828938Z Tuesday 16 June 2026  15:08:44 -0300 (0:00:00.050)       0:00:07.243 ********** 
2026-06-16T18:08:44.8235440Z 
2026-06-16T18:08:44.8236200Z TASK [vm : Apresenta informacoes do(s) host(s)] ********************************
2026-06-16T18:08:44.8236395Z ok: [127.0.0.1] => {
2026-06-16T18:08:44.8236492Z     "msg": [
2026-06-16T18:08:44.8236665Z         "Servidores: \\\"caddeapllx2673.agil.nprd.caixa.gov.br\\\"",
2026-06-16T18:08:44.8236839Z         "IPs: \\\"10.116.201.129\\\"",
2026-06-16T18:08:44.8236984Z         "Gateways: \\\"10.116.192.1\\\"",
2026-06-16T18:08:44.8237090Z         "IPs Backup: \\\"\\\"",
2026-06-16T18:08:44.8237316Z         "Servidores (OBJ): \\\"caddeapllx2673.agil.nprd.caixa.gov.br\\\":{\\\"ip_address\\\":\\\"10.116.201.129\\\",\\\"ip_gateway\\\":\\\"10.116.192.1\\\",\\\"ip_backup\\\":\\\"\\\"}"
2026-06-16T18:08:44.8237507Z     ]
2026-06-16T18:08:44.8237742Z }
2026-06-16T18:08:44.8238253Z Tuesday 16 June 2026  15:08:44 -0300 (0:00:00.040)       0:00:07.284 ********** 
2026-06-16T18:08:45.6402671Z 
2026-06-16T18:08:45.6403836Z TASK [vm : Criando arquivo para exportar as variáveis] *************************
2026-06-16T18:08:45.6404513Z changed: [127.0.0.1]
2026-06-16T18:08:45.6404563Z 
2026-06-16T18:08:45.6404915Z PLAY [Configurando o DNS] ******************************************************
2026-06-16T18:08:45.6405244Z Tuesday 16 June 2026  15:08:45 -0300 (0:00:00.647)       0:00:07.932 ********** 
2026-06-16T18:08:45.6405482Z Tuesday 16 June 2026  15:08:45 -0300 (0:00:00.168)       0:00:08.100 ********** 
2026-06-16T18:08:45.8836212Z 
2026-06-16T18:08:45.8837320Z TASK [Consultar DNS] ***********************************************************
2026-06-16T18:08:45.8837882Z changed: [10.116.193.77 -> localhost] => (item=caddeapllx2673.agil.nprd.caixa.gov.br)
2026-06-16T18:08:45.8838151Z Tuesday 16 June 2026  15:08:45 -0300 (0:00:00.243)       0:00:08.344 ********** 
2026-06-16T18:08:45.9169524Z Tuesday 16 June 2026  15:08:45 -0300 (0:00:00.033)       0:00:08.377 ********** 
2026-06-16T18:08:45.9570762Z 
2026-06-16T18:08:45.9571577Z TASK [Falha se o domínio não resolver para um IP] ******************************
2026-06-16T18:08:45.9572816Z ok: [10.116.193.77] => (item={'changed': True, 'stdout': '', 'stderr': '', 'rc': 0, 'cmd': ['dig', '+short', 'caddeapllx2673.agil.nprd.caixa.gov.br', '+timeout=5'], 'start': '2026-06-16 15:08:45.819693', 'end': '2026-06-16 15:08:45.853594', 'delta': '0:00:00.033901', 'msg': '', 'invocation': {'module_args': {'_raw_params': 'dig +short "caddeapllx2673.agil.nprd.caixa.gov.br" +timeout=5', '_uses_shell': False, 'stdin_add_newline': True, 'strip_empty_ends': True, 'argv': None, 'chdir': None, 'executable': None, 'creates': None, 'removes': None, 'stdin': None}}, 'stdout_lines': [], 'stderr_lines': [], 'failed': False, 'item': 'caddeapllx2673.agil.nprd.caixa.gov.br', 'ansible_loop_var': 'item'}) => {
2026-06-16T18:08:45.9574109Z     "msg": "O domínio caddeapllx2673.agil.nprd.caixa.gov.br não resolve para nenhum endereço IP."
2026-06-16T18:08:45.9574354Z }
2026-06-16T18:08:45.9574608Z Tuesday 16 June 2026  15:08:45 -0300 (0:00:00.040)       0:00:08.417 ********** 
2026-06-16T18:08:45.9999901Z 
2026-06-16T18:08:46.0000587Z TASK [Set not created DNS] *****************************************************
2026-06-16T18:08:46.0001670Z ok: [10.116.193.77] => (item={'changed': True, 'stdout': '', 'stderr': '', 'rc': 0, 'cmd': ['dig', '+short', 'caddeapllx2673.agil.nprd.caixa.gov.br', '+timeout=5'], 'start': '2026-06-16 15:08:45.819693', 'end': '2026-06-16 15:08:45.853594', 'delta': '0:00:00.033901', 'msg': '', 'invocation': {'module_args': {'_raw_params': 'dig +short "caddeapllx2673.agil.nprd.caixa.gov.br" +timeout=5', '_uses_shell': False, 'stdin_add_newline': True, 'strip_empty_ends': True, 'argv': None, 'chdir': None, 'executable': None, 'creates': None, 'removes': None, 'stdin': None}}, 'stdout_lines': [], 'stderr_lines': [], 'failed': False, 'item': 'caddeapllx2673.agil.nprd.caixa.gov.br', 'ansible_loop_var': 'item'})
2026-06-16T18:08:46.0002447Z Tuesday 16 June 2026  15:08:45 -0300 (0:00:00.043)       0:00:08.460 ********** 
2026-06-16T18:08:46.0341940Z Tuesday 16 June 2026  15:08:46 -0300 (0:00:00.034)       0:00:08.494 ********** 
2026-06-16T18:08:46.0945263Z 
2026-06-16T18:08:46.0945964Z TASK [include_role : dns] ******************************************************
2026-06-16T18:08:46.0946490Z Tuesday 16 June 2026  15:08:46 -0300 (0:00:00.060)       0:00:08.555 ********** 
2026-06-16T18:08:46.1401628Z 
2026-06-16T18:08:46.1402131Z TASK [dns : Criando o registro DNS] ********************************************
2026-06-16T18:08:46.1402829Z included: /opt/ads-agent/_work/r704/a/esteira-jboss-vm-v2/roles/dns/tasks/create.yml for 10.116.193.77, 10.116.193.78
2026-06-16T18:08:46.1403252Z Tuesday 16 June 2026  15:08:46 -0300 (0:00:00.045)       0:00:08.600 ********** 
2026-06-16T18:08:46.2086517Z 
2026-06-16T18:08:46.2087636Z TASK [dns : Criando o registro do DNS do servidor "caddeapllx2673"] ************
2026-06-16T18:08:46.2088677Z fatal: [10.116.193.77]: UNREACHABLE! => {"changed": false, "msg": "credssp: HTTPSConnectionPool(host='10.116.193.77', port=5986): Max retries exceeded with url: /wsman (Caused by NewConnectionError('<urllib3.connection.HTTPSConnection object at 0x7fc29e4d5490>: Failed to establish a new connection: [Errno 111] Connection refused'))", "unreachable": true}
2026-06-16T18:08:46.2091894Z ...ignoring
2026-06-16T18:08:46.2092438Z fatal: [10.116.193.78]: UNREACHABLE! => {"changed": false, "msg": "credssp: HTTPSConnectionPool(host='10.116.193.78', port=5986): Max retries exceeded with url: /wsman (Caused by NewConnectionError('<urllib3.connection.HTTPSConnection object at 0x7fc29e4d5490>: Failed to establish a new connection: [Errno 111] Connection refused'))", "unreachable": true}
2026-06-16T18:08:46.2092725Z ...ignoring
2026-06-16T18:08:46.2093016Z Tuesday 16 June 2026  15:08:46 -0300 (0:00:00.068)       0:00:08.669 ********** 
2026-06-16T18:08:46.2449832Z [DEPRECATION WARNING]: Use 'ansible.utils.ipaddr' module instead. This feature 
2026-06-16T18:08:46.2450192Z will be removed from ansible.netcommon in a release after 2024-01-01. 
2026-06-16T18:08:46.2450380Z Deprecation warnings can be disabled by setting deprecation_warnings=False in 
2026-06-16T18:08:46.2450574Z ansible.cfg.
2026-06-16T18:08:46.2514940Z [DEPRECATION WARNING]: Use 'ansible.utils.ipaddr' module instead. This feature 
2026-06-16T18:08:46.2515764Z will be removed from ansible.netcommon in a release after 2024-01-01. 
2026-06-16T18:08:46.2515963Z Deprecation warnings can be disabled by setting deprecation_warnings=False in 
2026-06-16T18:08:46.2516092Z ansible.cfg.
2026-06-16T18:08:46.2746438Z [DEPRECATION WARNING]: Use 'ansible.utils.ipsubnet' module instead. This 
2026-06-16T18:08:46.2746867Z feature will be removed from ansible.netcommon in a release after 2024-01-01. 
2026-06-16T18:08:46.2747071Z Deprecation warnings can be disabled by setting deprecation_warnings=False in 
2026-06-16T18:08:46.2747262Z ansible.cfg.
2026-06-16T18:08:46.2804811Z [DEPRECATION WARNING]: Use 'ansible.utils.ipsubnet' module instead. This 
2026-06-16T18:08:46.2805103Z feature will be removed from ansible.netcommon in a release after 2024-01-01. 
2026-06-16T18:08:46.2805513Z Deprecation warnings can be disabled by setting deprecation_warnings=False in 
2026-06-16T18:08:46.2805733Z ansible.cfg.
2026-06-16T18:08:46.3133278Z 
2026-06-16T18:08:46.3133941Z TASK [dns : Criando o registro reverso do DNS do servidor "caddeapllx2673"] ****
2026-06-16T18:08:46.3134664Z fatal: [10.116.193.77]: UNREACHABLE! => {"changed": false, "msg": "credssp: HTTPSConnectionPool(host='10.116.193.77', port=5986): Max retries exceeded with url: /wsman (Caused by NewConnectionError('<urllib3.connection.HTTPSConnection object at 0x7fc29e4b1df0>: Failed to establish a new connection: [Errno 111] Connection refused'))", "unreachable": true}
2026-06-16T18:08:46.3134979Z ...ignoring
2026-06-16T18:08:46.3135457Z fatal: [10.116.193.78]: UNREACHABLE! => {"changed": false, "msg": "credssp: HTTPSConnectionPool(host='10.116.193.78', port=5986): Max retries exceeded with url: /wsman (Caused by NewConnectionError('<urllib3.connection.HTTPSConnection object at 0x7fc29e473130>: Failed to establish a new connection: [Errno 111] Connection refused'))", "unreachable": true}
2026-06-16T18:08:46.3135781Z ...ignoring
2026-06-16T18:08:46.3136046Z Tuesday 16 June 2026  15:08:46 -0300 (0:00:00.104)       0:00:08.773 ********** 
2026-06-16T18:08:46.4421516Z [WARNING]: Found variable using reserved name: when
2026-06-16T18:08:46.6353995Z [WARNING]: Could not match supplied host pattern, ignoring: instance_restart
2026-06-16T18:08:46.6356327Z [WARNING]: Could not match supplied host pattern, ignoring: machine_reboot
2026-06-16T18:08:46.6669652Z [WARNING]: Could not match supplied host pattern, ignoring: instance_stop
2026-06-16T18:08:46.8724558Z 
2026-06-16T18:08:46.8725143Z PLAY [local] *******************************************************************
2026-06-16T18:08:46.8725220Z 
2026-06-16T18:08:46.8725715Z PLAY [Verificando serviços] ****************************************************
2026-06-16T18:08:46.8725833Z 
2026-06-16T18:08:46.8726168Z PLAY [Configuração LDAP] *******************************************************
2026-06-16T18:08:46.8726287Z 
2026-06-16T18:08:46.8726446Z PLAY [jboss] *******************************************************************
2026-06-16T18:08:46.8726519Z 
2026-06-16T18:08:46.8726694Z PLAY [Stack Jboss] *************************************************************
2026-06-16T18:08:46.8726763Z 
2026-06-16T18:08:46.8726952Z PLAY [jboss] *******************************************************************
2026-06-16T18:08:46.8727023Z 
2026-06-16T18:08:46.8727199Z PLAY [jboss] *******************************************************************
2026-06-16T18:08:46.8727267Z 
2026-06-16T18:08:46.8727422Z PLAY [jboss] *******************************************************************
2026-06-16T18:08:46.8727489Z 
2026-06-16T18:08:46.8727647Z PLAY [Copiando deployments adicionais] *****************************************
2026-06-16T18:08:46.8727714Z 
2026-06-16T18:08:46.8727868Z PLAY [Copiando modules adicionais] *********************************************
2026-06-16T18:08:46.8727978Z 
2026-06-16T18:08:46.8728092Z PLAY [jboss] *******************************************************************
2026-06-16T18:08:46.8728195Z 
2026-06-16T18:08:46.8728307Z PLAY [jboss] *******************************************************************
2026-06-16T18:08:46.8728577Z 
2026-06-16T18:08:46.8728695Z PLAY [jboss] *******************************************************************
2026-06-16T18:08:46.8728836Z 
2026-06-16T18:08:46.8728987Z PLAY [jboss] *******************************************************************
2026-06-16T18:08:46.8729054Z 
2026-06-16T18:08:46.8729201Z PLAY [jboss] *******************************************************************
2026-06-16T18:08:46.8729268Z 
2026-06-16T18:08:46.8729420Z PLAY [local] *******************************************************************
2026-06-16T18:08:46.8729486Z 
2026-06-16T18:08:46.8729642Z PLAY [instance_restart] ********************************************************
2026-06-16T18:08:46.8729810Z skipping: no hosts matched
2026-06-16T18:08:46.8729856Z 
2026-06-16T18:08:46.8730006Z PLAY [machine_reboot] **********************************************************
2026-06-16T18:08:46.8730177Z skipping: no hosts matched
2026-06-16T18:08:46.8730226Z 
2026-06-16T18:08:46.8730396Z PLAY [local] *******************************************************************
2026-06-16T18:08:46.8730465Z 
2026-06-16T18:08:46.8730613Z PLAY [instance_stop] ***********************************************************
2026-06-16T18:08:46.8730737Z skipping: no hosts matched
2026-06-16T18:08:46.8730819Z 
2026-06-16T18:08:46.8730965Z PLAY [machine_reboot] **********************************************************
2026-06-16T18:08:46.8731089Z skipping: no hosts matched
2026-06-16T18:08:46.8731168Z 
2026-06-16T18:08:46.8731282Z PLAY [Configura TSM] ***********************************************************
2026-06-16T18:08:46.8731386Z 
2026-06-16T18:08:46.8731496Z PLAY [jboss] *******************************************************************
2026-06-16T18:08:46.8731598Z 
2026-06-16T18:08:46.8731831Z PLAY [Configura Control-M] *****************************************************
2026-06-16T18:08:46.8731899Z 
2026-06-16T18:08:46.8732067Z PLAY [jboss] *******************************************************************
2026-06-16T18:08:46.8732137Z 
2026-06-16T18:08:46.8732369Z PLAY [jboss] *******************************************************************
2026-06-16T18:08:46.8732435Z 
2026-06-16T18:08:46.8732580Z PLAY [jboss] *******************************************************************
2026-06-16T18:08:46.8732644Z 
2026-06-16T18:08:46.8732795Z PLAY [jboss] *******************************************************************
2026-06-16T18:08:46.8732898Z 
2026-06-16T18:08:46.8733112Z PLAY [localhost] ***************************************************************
2026-06-16T18:08:46.8733211Z 
2026-06-16T18:08:46.8733402Z PLAY [jboss] *******************************************************************
2026-06-16T18:08:46.8733519Z 
2026-06-16T18:08:46.8733683Z PLAY [jboss] *******************************************************************
2026-06-16T18:08:46.8733786Z 
2026-06-16T18:08:46.8733899Z PLAY [jboss] *******************************************************************
2026-06-16T18:08:46.8734035Z 
2026-06-16T18:08:46.8734149Z PLAY RECAP *********************************************************************
2026-06-16T18:08:46.8734339Z 10.116.193.77              : ok=6    changed=1    unreachable=0    failed=0    skipped=3    rescued=0    ignored=2   
2026-06-16T18:08:46.8734541Z 10.116.193.78              : ok=3    changed=0    unreachable=0    failed=0    skipped=1    rescued=0    ignored=2   
2026-06-16T18:08:46.8734740Z 127.0.0.1                  : ok=39   changed=4    unreachable=0    failed=0    skipped=12   rescued=0    ignored=0   
2026-06-16T18:08:46.8734809Z 
2026-06-16T18:08:46.8734949Z Playbook run took 0 days, 0 hours, 0 minutes, 9 seconds
2026-06-16T18:08:46.8735267Z Tuesday 16 June 2026  15:08:46 -0300 (0:00:00.559)       0:00:09.333 ********** 
2026-06-16T18:08:46.8735477Z =============================================================================== 
2026-06-16T18:08:46.8735692Z vm : Executar script para marcar VM como template ----------------------- 1.62s
2026-06-16T18:08:46.8735986Z vm : Instalar dependências Python para vCenter -------------------------- 0.87s
2026-06-16T18:08:46.8736262Z Gathering Facts --------------------------------------------------------- 0.84s
2026-06-16T18:08:46.8736523Z vm : Criando arquivo para exportar as variáveis ------------------------- 0.65s
2026-06-16T18:08:46.8736773Z dns : Removendo o registro DNS ------------------------------------------ 0.56s
2026-06-16T18:08:46.8737047Z vm : Consultar API ------------------------------------------------------ 0.44s
2026-06-16T18:08:46.8737254Z vm : Run Invetory All --------------------------------------------------- 0.37s
2026-06-16T18:08:46.8737509Z vm : Run Invetory All --------------------------------------------------- 0.35s
2026-06-16T18:08:46.8737766Z vm : Consultar API ------------------------------------------------------ 0.35s
2026-06-16T18:08:46.8738011Z vm : Encontrar arquivos no diretório de origem ansible ------------------ 0.34s
2026-06-16T18:08:46.8738266Z Consultar DNS ----------------------------------------------------------- 0.24s
2026-06-16T18:08:46.8738583Z vm : Coletar variáveis de ambiente -------------------------------------- 0.23s
2026-06-16T18:08:46.8738870Z vm : Encontrar arquivos no diretório de origem ansible ------------------ 0.21s
2026-06-16T18:08:46.8739146Z Atualizando o inventário para garantir a existência de novas instâncias no inventário --- 0.17s
2026-06-16T18:08:46.8739413Z dns : Criando o registro reverso do DNS do servidor "caddeapllx2673" ---- 0.10s
2026-06-16T18:08:46.8739660Z dns : Criando o registro do DNS do servidor "caddeapllx2673" ------------ 0.07s
2026-06-16T18:08:46.8739869Z vm : Sobrescrevendo groups vars ctc_nprd -------------------------------- 0.07s
2026-06-16T18:08:46.8740131Z include_role : dns ------------------------------------------------------ 0.06s
2026-06-16T18:08:46.8740377Z vm : Recuperar ip ------------------------------------------------------- 0.06s
2026-06-16T18:08:46.8740622Z vm : Atualiza infrafacil com a informação de terraform ------------------ 0.05s
2026-06-16T18:08:46.9422184Z ##[section]Finishing: Alocando o IP (AlocaIP e Infradevops)



o problme e que a vm ta duplicada.


Ir para Conteúdo Principal
SINCC
#INTERNO.TODOS
VMs
Linhas

50
1 - 2 de 2
VCenter
Cluster
VM Name
DNS Name
VM Host
Serial Number
Datacenter
Datastores
Resource Pool
Folder
Status
IPs
Subnets
Tipos
Nr. de CPUs
Memória (GB)
Sistema Operacional
Tamanho de Disco (GB)
Notas
Data da Coleta
VCenter
Cluster
VM Name
DNS Name
VM Host
Serial Number
Datacenter
Datastores
Resource Pool
Folder
Status
IPs
Subnets
Tipos
Nr. de CPUs
Memória (GB)
Sistema Operacional
Tamanho de Disco (GB)
Notas
Data da Coleta
cadsvgerap030-1.intra.caixa.gov.br	CTC_NPRDXF2488HV7_NPRD	CADDEAPLLX2673	caddeapllx2673	cadsvgersh538.intra.caixa.gov.br	PI00988800000188	NPRD	CTCHWNPRDC011_0005	RP_TERRAFORM_NPRD	vm	Ligado	10.116.201.129	10.116.192.0/19	Vmxnet3	2	4	Red Hat Enterprise Linux 9 (64-bit)	37,08	
Gerenciado pelo Packer/Terraform - Esteiras Ageis - ECAPT-BANCARIO-TQS - Template: eap80-openjdk17-apache24-rhel93-v006 - caddeapllx2673.agil.nprd.caixa.gov.br

17/06/2026 13:37:08
cadsvgerap030-1.intra.caixa.gov.br	CTC_NPRDXF2488HV7_NPRD	CADDEAPLLX2520	caddeapllx2520.agil.nprd.caixa.gov.br	cadsvgersh485.intra.caixa.gov.br	PI00988800000134	NPRD	CTCHWNPRDPC03_0046	RP_TERRAFORM_NPRD	vm	Ligado	10.116.201.129	10.116.192.0/19	Vmxnet3	2	4	Red Hat Enterprise Linux 9 (64-bit)	37,08	
Gerenciado pelo Packer/Terraform - Esteiras Ageis - ECAPT-SOCIAL-TQS - Template: eap80-openjdk17-apache24-rhel93-v006 - caddeapllx2520.agil.nprd.caixa.gov.br

17/06/2026 13:38:05
1 - 2 de 2
v1.2.0 - 12/08/2024 :: v1.9.3 - 05/06/2026

Skip to main content

1 / 2

There are expired or expiring licenses in your inventory.
Manage your licenses


vSphere Client
CADDEAPLLX2520

p585600@corp.caixa.gov.br








 cadsvgerap027-1.intra.caixa.gov.br

 cadsvgerap028-1.intra.caixa.gov.br

 cadsvgerap029-1.intra.caixa.gov.br

 cadsvgerap030-1.intra.caixa.gov.br

 NPRD

 0_Migracao_P2V

 7259-NPRD

 7260

 7262

 7266

 7366

 7562

 _DTC_CTC_MIGRACAO

 _DTC_CTC_MIGRACAO_24_04_2023

 Bancario

 CEDES_P2V

 CETEL08

 Datacenters

 Discovered virtual machine

 HMP_SIFRA

 INVision

 kafka-nprd-9pjzw

 OKD_NPRD_WO0000077790621

 pdtcp4d01nprd-wgg6r

 pdtged01nprd-sqk84

 pdtwxd01nprd-r47rf

 pixnprd4-x44wk

 POC-InfoScale

 QUARENTENA

 Quarentena_Old

 RP_ESTEIRAS_AGEIS

 telemetria-nprd-phnvh

 Templates TELEDATA - Não Deletar

 Templates_Infrasimples

 TerraForm

 TERRAFORM_NPRD

 CADDEAPLLX0010

 CADDEAPLLX0011

 CADDEAPLLX0012

 CADDEAPLLX0013

 CADDEAPLLX012

 CADDEAPLLX1034

 CADDEAPLLX1067

 CADDEAPLLX1072

 CADDEAPLLX1078

 CADDEAPLLX1087

 CADDEAPLLX1132

 CADDEAPLLX1141

 CADDEAPLLX1151

 CADDEAPLLX1177

 CADDEAPLLX1209

 CADDEAPLLX1214

 CADDEAPLLX1230

 CADDEAPLLX1231

 CADDEAPLLX1234

 CADDEAPLLX1285

 CADDEAPLLX1307

 CADDEAPLLX1315

 CADDEAPLLX1355

 CADDEAPLLX1368

 CADDEAPLLX1369

 CADDEAPLLX1370

 CADDEAPLLX1371

 CADDEAPLLX1382

 CADDEAPLLX1385

 CADDEAPLLX1391

 CADDEAPLLX1394

 CADDEAPLLX1395

 CADDEAPLLX1398

 CADDEAPLLX1405

 CADDEAPLLX1410

 CADDEAPLLX1411

 CADDEAPLLX1429

 CADDEAPLLX1437

 CADDEAPLLX1441

 CADDEAPLLX1447

 CADDEAPLLX1451

 CADDEAPLLX1457

 CADDEAPLLX1459

 CADDEAPLLX1467

 CADDEAPLLX1499

 CADDEAPLLX1501

 CADDEAPLLX1502

 CADDEAPLLX1504

 CADDEAPLLX1505

 CADDEAPLLX1506

 CADDEAPLLX1508

 CADDEAPLLX1512

 CADDEAPLLX1519

 CADDEAPLLX1521

 CADDEAPLLX1522

 CADDEAPLLX1523

 CADDEAPLLX1524

 CADDEAPLLX1526

 CADDEAPLLX1529

 CADDEAPLLX1530

 CADDEAPLLX1531

 CADDEAPLLX1532

 CADDEAPLLX1533

 CADDEAPLLX1535

 CADDEAPLLX1536

 CADDEAPLLX1537

 CADDEAPLLX1538

 CADDEAPLLX1539

 CADDEAPLLX1540

 CADDEAPLLX1547

 CADDEAPLLX1550

 CADDEAPLLX1551

 CADDEAPLLX1553

 CADDEAPLLX1554

 CADDEAPLLX1555

 CADDEAPLLX1556

 CADDEAPLLX1557

 CADDEAPLLX1560

 CADDEAPLLX1561

 CADDEAPLLX1563

 CADDEAPLLX1572

 CADDEAPLLX1575

 CADDEAPLLX1576

 CADDEAPLLX1577

 CADDEAPLLX1578

 CADDEAPLLX1583

 CADDEAPLLX1600

 CADDEAPLLX1603

 CADDEAPLLX1604

 CADDEAPLLX1605

 CADDEAPLLX1606

 CADDEAPLLX1607

 CADDEAPLLX1609

 CADDEAPLLX1611

 CADDEAPLLX1614

 CADDEAPLLX1616

 CADDEAPLLX1617

 CADDEAPLLX1618

 CADDEAPLLX1619

 CADDEAPLLX1620

 CADDEAPLLX1622

 CADDEAPLLX1623

 CADDEAPLLX1625

 CADDEAPLLX1632

 CADDEAPLLX1633

 CADDEAPLLX1651

 CADDEAPLLX1653

 CADDEAPLLX1657

 CADDEAPLLX1659

 CADDEAPLLX1660

 CADDEAPLLX1661

 CADDEAPLLX1662

 CADDEAPLLX1663

 CADDEAPLLX1666

 CADDEAPLLX1667

 CADDEAPLLX1668

 CADDEAPLLX1669

 CADDEAPLLX1672

 CADDEAPLLX1675

 CADDEAPLLX1676

 CADDEAPLLX1677

 CADDEAPLLX1678

 CADDEAPLLX1682

 CADDEAPLLX1683

 CADDEAPLLX1684

 CADDEAPLLX1687

 CADDEAPLLX1692

 CADDEAPLLX1693

 CADDEAPLLX1694

 CADDEAPLLX1695

 CADDEAPLLX1696

 CADDEAPLLX1697

 CADDEAPLLX1698

 CADDEAPLLX1699

 CADDEAPLLX1700

 CADDEAPLLX1701

 CADDEAPLLX1702

 CADDEAPLLX1703

 CADDEAPLLX1704

 CADDEAPLLX1705

 CADDEAPLLX1706

 CADDEAPLLX1707

 CADDEAPLLX1713

 CADDEAPLLX1714

 CADDEAPLLX1715

 CADDEAPLLX1717

 CADDEAPLLX1718

 CADDEAPLLX1719

 CADDEAPLLX1720

 CADDEAPLLX1721

 CADDEAPLLX1722

 CADDEAPLLX1723

 CADDEAPLLX1724

 CADDEAPLLX1725

 CADDEAPLLX1730

 CADDEAPLLX1731

 CADDEAPLLX1732

 CADDEAPLLX1733

 CADDEAPLLX1734

 CADDEAPLLX1735

 CADDEAPLLX1736

 CADDEAPLLX1737

 CADDEAPLLX1738

 CADDEAPLLX1739

 CADDEAPLLX1740

 CADDEAPLLX1741

 CADDEAPLLX1745

 CADDEAPLLX1746

 CADDEAPLLX1747

 CADDEAPLLX1754

 CADDEAPLLX1764

 CADDEAPLLX1765

 CADDEAPLLX1766

 CADDEAPLLX1767

 CADDEAPLLX1768

 CADDEAPLLX1770

 CADDEAPLLX1772

 CADDEAPLLX1773

 CADDEAPLLX1774

 CADDEAPLLX1775

 CADDEAPLLX1777

 CADDEAPLLX1778

 CADDEAPLLX1779

 CADDEAPLLX1780

 CADDEAPLLX1781

 CADDEAPLLX1782

 CADDEAPLLX1783

 CADDEAPLLX1784

 CADDEAPLLX1785

 CADDEAPLLX1786

 CADDEAPLLX1789

 CADDEAPLLX1790

 CADDEAPLLX1791

 CADDEAPLLX1794

 CADDEAPLLX1795

 CADDEAPLLX1796

 CADDEAPLLX1798

 CADDEAPLLX1800

 CADDEAPLLX1801

 CADDEAPLLX1802

 CADDEAPLLX1844

 CADDEAPLLX1845

 CADDEAPLLX1846

 CADDEAPLLX1847

 CADDEAPLLX1849

 CADDEAPLLX1850

 CADDEAPLLX1855

 CADDEAPLLX1856

 CADDEAPLLX1860

 CADDEAPLLX1863

 CADDEAPLLX1864

 CADDEAPLLX1865

 CADDEAPLLX1866

 CADDEAPLLX1867

 CADDEAPLLX1868

 CADDEAPLLX1869

 CADDEAPLLX1870

 CADDEAPLLX1871

 CADDEAPLLX1874

 CADDEAPLLX1875

 CADDEAPLLX1876

 CADDEAPLLX1877

 CADDEAPLLX1878

 CADDEAPLLX1879

 CADDEAPLLX1880

 CADDEAPLLX1882

 caddeapllx1884

 CADDEAPLLX1885

 CADDEAPLLX1886

 CADDEAPLLX1887

 CADDEAPLLX1888

 CADDEAPLLX1890

 CADDEAPLLX1892

 CADDEAPLLX1893

 CADDEAPLLX1894

 CADDEAPLLX1906

 CADDEAPLLX1907

 CADDEAPLLX1908

 CADDEAPLLX1909

 CADDEAPLLX1910

 CADDEAPLLX1911

 CADDEAPLLX1912

 CADDEAPLLX1913

 CADDEAPLLX1914

 CADDEAPLLX1915

 CADDEAPLLX1916

 CADDEAPLLX1917

 CADDEAPLLX1918

 CADDEAPLLX1919

 CADDEAPLLX1920

 CADDEAPLLX1921

 CADDEAPLLX1922

 CADDEAPLLX1923

 CADDEAPLLX1924

 CADDEAPLLX1925

 CADDEAPLLX1926

 CADDEAPLLX193

 CADDEAPLLX1943

 CADDEAPLLX1944

 CADDEAPLLX1945

 CADDEAPLLX1946

 CADDEAPLLX1947

 CADDEAPLLX1950

 CADDEAPLLX1951

 CADDEAPLLX1952

 CADDEAPLLX1953

 CADDEAPLLX1954

 CADDEAPLLX1955

 CADDEAPLLX1956

 CADDEAPLLX1957

 CADDEAPLLX1958

 CADDEAPLLX1962

 CADDEAPLLX1963

 CADDEAPLLX1964

 CADDEAPLLX1965

 CADDEAPLLX1967

 CADDEAPLLX1968

 CADDEAPLLX1969

 CADDEAPLLX1970

 CADDEAPLLX1971

 CADDEAPLLX1972

 CADDEAPLLX1973

 CADDEAPLLX1974

 CADDEAPLLX1975

 CADDEAPLLX1976

 CADDEAPLLX1977

 CADDEAPLLX1978

 CADDEAPLLX1979

 CADDEAPLLX1985

 CADDEAPLLX1986

 CADDEAPLLX1987

 CADDEAPLLX1988

 CADDEAPLLX1989

 CADDEAPLLX1991

 CADDEAPLLX1992

 CADDEAPLLX1993

 CADDEAPLLX1994

 CADDEAPLLX1995

 CADDEAPLLX2002

 CADDEAPLLX2018

 CADDEAPLLX2035

 CADDEAPLLX2038

 CADDEAPLLX2039

 CADDEAPLLX2040

 CADDEAPLLX2044

 CADDEAPLLX2045

 CADDEAPLLX2046

 CADDEAPLLX2047

 CADDEAPLLX2052

 CADDEAPLLX2058

 CADDEAPLLX2073

 CADDEAPLLX2074

 CADDEAPLLX2075

 CADDEAPLLX2076

 CADDEAPLLX2079

 CADDEAPLLX2081

 CADDEAPLLX2082

 CADDEAPLLX2083

 CADDEAPLLX2086

 CADDEAPLLX2087

 CADDEAPLLX2091

 CADDEAPLLX2092

 CADDEAPLLX2093

 CADDEAPLLX2094

 CADDEAPLLX2095

 CADDEAPLLX2097

 CADDEAPLLX2098

 CADDEAPLLX2099

 CADDEAPLLX2100

 CADDEAPLLX2102

 CADDEAPLLX2105

 CADDEAPLLX2106

 CADDEAPLLX2107

 CADDEAPLLX2108

 CADDEAPLLX2109

 CADDEAPLLX2111

 CADDEAPLLX2113

 CADDEAPLLX2114

 CADDEAPLLX2118

 CADDEAPLLX2119

 CADDEAPLLX2121

 CADDEAPLLX2122

 CADDEAPLLX2123

 CADDEAPLLX2124

 CADDEAPLLX2125

 CADDEAPLLX2126

 CADDEAPLLX2127

 CADDEAPLLX2128

 CADDEAPLLX2129

 CADDEAPLLX2130

 CADDEAPLLX2131

 CADDEAPLLX2132

 CADDEAPLLX2133

 CADDEAPLLX2134

 CADDEAPLLX2136

 CADDEAPLLX2138

 CADDEAPLLX2141

 CADDEAPLLX2142

 CADDEAPLLX2143

 CADDEAPLLX2145

 CADDEAPLLX2153

 CADDEAPLLX2160

 CADDEAPLLX2161

 CADDEAPLLX2164

 CADDEAPLLX2170

 CADDEAPLLX2171

 CADDEAPLLX2172

 CADDEAPLLX2175

 CADDEAPLLX2176

 CADDEAPLLX2180

 CADDEAPLLX2184

 CADDEAPLLX2185

 CADDEAPLLX2187

 CADDEAPLLX2188

 CADDEAPLLX2189

 CADDEAPLLX2191

 CADDEAPLLX2192

 CADDEAPLLX2193

 CADDEAPLLX2195

 CADDEAPLLX2197

 CADDEAPLLX2198

 CADDEAPLLX2199

 CADDEAPLLX2200

 CADDEAPLLX2201

 CADDEAPLLX2202

 CADDEAPLLX2203

 CADDEAPLLX2204

 CADDEAPLLX2205

 CADDEAPLLX2206

 CADDEAPLLX2214

 CADDEAPLLX2215

 CADDEAPLLX2216

 CADDEAPLLX2218

 CADDEAPLLX2219

 CADDEAPLLX2220

 CADDEAPLLX2221

 CADDEAPLLX2226

 CADDEAPLLX2228

 CADDEAPLLX2229

 CADDEAPLLX2232

 CADDEAPLLX2234

 CADDEAPLLX2235

 CADDEAPLLX2236

 CADDEAPLLX2237

 CADDEAPLLX224

 CADDEAPLLX2249

 CADDEAPLLX2250

 CADDEAPLLX2251

 CADDEAPLLX2255

 CADDEAPLLX2256

 CADDEAPLLX2257

 CADDEAPLLX2258

 CADDEAPLLX2259

 CADDEAPLLX2260

 CADDEAPLLX2261

 CADDEAPLLX2262

 CADDEAPLLX2263

 CADDEAPLLX2264

 CADDEAPLLX2265

 CADDEAPLLX2266

 CADDEAPLLX2269

 CADDEAPLLX2271

 CADDEAPLLX2273

 CADDEAPLLX2274

 CADDEAPLLX2275

 CADDEAPLLX2276

 CADDEAPLLX2283

 CADDEAPLLX2312

 CADDEAPLLX2316

 CADDEAPLLX2317

 CADDEAPLLX2319

 CADDEAPLLX2320

 CADDEAPLLX2321

 CADDEAPLLX2322

 CADDEAPLLX2333

 CADDEAPLLX2334

 CADDEAPLLX2335

 CADDEAPLLX2336

 CADDEAPLLX2337

 CADDEAPLLX2339

 CADDEAPLLX2340

 CADDEAPLLX2341

 CADDEAPLLX2342

 CADDEAPLLX2346

 CADDEAPLLX2347

 CADDEAPLLX2349

 CADDEAPLLX2353

 CADDEAPLLX2365

 CADDEAPLLX2367

 CADDEAPLLX237

 CADDEAPLLX2371

 CADDEAPLLX2373

 CADDEAPLLX2376

 CADDEAPLLX2377

 CADDEAPLLX2378

 CADDEAPLLX2381

 CADDEAPLLX2382

 CADDEAPLLX2383

 CADDEAPLLX2384

 CADDEAPLLX2385

 CADDEAPLLX2386

 CADDEAPLLX2387

 CADDEAPLLX2390

 CADDEAPLLX2391

 CADDEAPLLX2392

 CADDEAPLLX2393

 CADDEAPLLX2394

 CADDEAPLLX2395

 CADDEAPLLX2402

 CADDEAPLLX2413

 CADDEAPLLX2419

 CADDEAPLLX2420

 CADDEAPLLX2421

 CADDEAPLLX2423

 CADDEAPLLX2426

 CADDEAPLLX2427

 CADDEAPLLX2428

 CADDEAPLLX2429

 CADDEAPLLX2430

 CADDEAPLLX2431

 CADDEAPLLX2432

 CADDEAPLLX2433

 CADDEAPLLX2434

 CADDEAPLLX2435

 CADDEAPLLX2436

 CADDEAPLLX2437

 CADDEAPLLX2438

 CADDEAPLLX2439

 CADDEAPLLX2440

 CADDEAPLLX2441

 CADDEAPLLX2442

 CADDEAPLLX2443

 CADDEAPLLX2444

 CADDEAPLLX2445

 CADDEAPLLX2446

 CADDEAPLLX2447

 CADDEAPLLX2448

 CADDEAPLLX2449

 CADDEAPLLX2450

 CADDEAPLLX2451

 CADDEAPLLX2452

 CADDEAPLLX2453

 CADDEAPLLX2454

 CADDEAPLLX2455

 CADDEAPLLX2456

 CADDEAPLLX2457

 CADDEAPLLX2458

 CADDEAPLLX2459

 CADDEAPLLX2460

 CADDEAPLLX2461

 CADDEAPLLX2462

 CADDEAPLLX2463

 CADDEAPLLX2464

 CADDEAPLLX2465

 CADDEAPLLX2466

 CADDEAPLLX2467

 CADDEAPLLX2469

 CADDEAPLLX2470

 CADDEAPLLX2471

 CADDEAPLLX2475

 CADDEAPLLX2476

 CADDEAPLLX2478

 CADDEAPLLX2479

 CADDEAPLLX248

 CADDEAPLLX2480

 CADDEAPLLX2481

 CADDEAPLLX2483

 CADDEAPLLX2484

 CADDEAPLLX2485

 CADDEAPLLX2486

 CADDEAPLLX2488

 CADDEAPLLX2489

 CADDEAPLLX249

 CADDEAPLLX2490

 CADDEAPLLX2491

 CADDEAPLLX2492

 CADDEAPLLX2493

 CADDEAPLLX2494

 CADDEAPLLX2495

 CADDEAPLLX2496

 CADDEAPLLX2498

 CADDEAPLLX2499

 CADDEAPLLX2500

 CADDEAPLLX2501

 CADDEAPLLX2502

 CADDEAPLLX2503

 CADDEAPLLX2504

 CADDEAPLLX2505

 CADDEAPLLX2506

 CADDEAPLLX2507

 CADDEAPLLX2508

 CADDEAPLLX2509

 CADDEAPLLX2510

 CADDEAPLLX2511

 CADDEAPLLX2512

 CADDEAPLLX2513

 CADDEAPLLX2514

 CADDEAPLLX2519

 CADDEAPLLX2520

 CADDEAPLLX2521

 CADDEAPLLX2522

 CADDEAPLLX2524

 CADDEAPLLX2528

 CADDEAPLLX2529

 CADDEAPLLX2531

 CADDEAPLLX2532

 CADDEAPLLX2533

 CADDEAPLLX2537

 CADDEAPLLX2538

 CADDEAPLLX2539

 CADDEAPLLX2540

 CADDEAPLLX2541

 CADDEAPLLX2542

 CADDEAPLLX2543

 CADDEAPLLX2545

 CADDEAPLLX2552

 CADDEAPLLX2553

 CADDEAPLLX2554

 CADDEAPLLX2555

 CADDEAPLLX2556

 CADDEAPLLX2557

 CADDEAPLLX2559

 CADDEAPLLX2560

 CADDEAPLLX2562

 CADDEAPLLX2565

 CADDEAPLLX2566

 CADDEAPLLX2567

 CADDEAPLLX2569

 CADDEAPLLX2570

 CADDEAPLLX2571

 CADDEAPLLX2572

 CADDEAPLLX2573

 CADDEAPLLX2574

 CADDEAPLLX2575

 CADDEAPLLX2576

 CADDEAPLLX2577

 CADDEAPLLX2580

 CADDEAPLLX2581

 CADDEAPLLX2582

 CADDEAPLLX2584

 CADDEAPLLX2589

 CADDEAPLLX2590

 CADDEAPLLX2591

 CADDEAPLLX2592

 CADDEAPLLX2593

 CADDEAPLLX2595

 CADDEAPLLX2597

 CADDEAPLLX2599

 CADDEAPLLX2601

 CADDEAPLLX2602

 CADDEAPLLX2603

 CADDEAPLLX2604

 CADDEAPLLX2605

 CADDEAPLLX2606

 CADDEAPLLX2607

 CADDEAPLLX2608

 CADDEAPLLX2609

 CADDEAPLLX2610

 CADDEAPLLX2611

 CADDEAPLLX2612

 CADDEAPLLX2613

 CADDEAPLLX2614

 CADDEAPLLX2616

 CADDEAPLLX2619

 CADDEAPLLX2620

 CADDEAPLLX2645

 CADDEAPLLX2646

 CADDEAPLLX2647

 CADDEAPLLX2650

 CADDEAPLLX2651

 CADDEAPLLX2652

 CADDEAPLLX2653

 CADDEAPLLX2654

 CADDEAPLLX2655

 CADDEAPLLX2656

 CADDEAPLLX2657

 CADDEAPLLX2658

 CADDEAPLLX2659

 CADDEAPLLX2660

 CADDEAPLLX2665

 CADDEAPLLX2666

 CADDEAPLLX2667

 CADDEAPLLX2668

 CADDEAPLLX2670

 CADDEAPLLX2671

 CADDEAPLLX2672

 CADDEAPLLX2673

 CADDEAPLLX2674

 CADDEAPLLX2675

 CADDEAPLLX2676

 CADDEAPLLX2677

 CADDEAPLLX2679

 CADDEAPLLX404

 CADDEAPLLX506

 CADDEAPLLX667

 CADDEAPLLX760

 CADDEAPLLX761

 CADDEAPLLX796

 CADDEAPLLX874_REQ000116760546

 CADDEAPLLX884

 CADDEAPLLX912

 CADDEAPLLX924

 CADDEAPLLX935

 CADDEAPLLX962

 CADDEAPLLX963

 CADDEAPLLX981

 CADDEAPLLX997

 CADDEAPLNT003_New

 CADDEAPLNT051

 CADDEAPLNT065

 CADDEAPLNT065_UPDATE

 CADDEAPLNT071

 CADDEAPLNT075

 CADDEAPLNT077

 CADDEAPLNT080

 CADDEAPLNT081

 CADDEAPLNT082

 CADDEAPLNT085

 CADDEAPLNT086

 CADDEAPRLX053

 CADDEAPRLX054

 CADDEAPRLX071

 CADDEAPRLX086

 CADDEAPRLX087

 CADDEAPRLX088

 CADDEAPRLX089

 CADDEAPRLX091

 CADDEAPRLX095

 CADDEAPRLX097

 CADDEAPRLX110

 CADDEAPRLX111

 CADDEAPRLX169

 CADDEAPRLX170

 CADDEAPRLX171

 CADDEAPRLX172

 CADDEAPRLX183

 CADDEAPRLX184

 CADDEAPRLX185

 CADDEAPRLX192

 CADDEAPRLX193

 CADDEAPRNT002_2019

 CADDEAPRNT003_2019

 CADDEAPRNT016

 CADDEAPRNT026

 CADDEAPRNT049

 CADDECLDLX005

 CADDECLDLX006

 CADDECLDLX007

 CADDECLDLX008

 CADDECLDLX009

 CADDECLDLX010

 CADDECLDLX011

 CADDECLDLX012

 CADDECLDLX013

 CADDECLDLX014

 CADDECLDLX015

 CADDECLDLX016

 CADDECLDLX017

 CADDECLDLX018

 CADDECLDLX019

 CADDECLDLX020

 CADDECLDLX021

 CADDECLDLX022

 CADDECLDLX026

 CADDECLDLX027

 CADDEDADNT019

 CADDEDADNT042

 CADDEDADNT043

 CADDEGERLX007

 CADDEGERLX021

 CADDEGERLX022

 CADDEGERLX030

 CADDEGERLX031

 CADHMAPLLX002

 CADHMAPLLX012

 CADHMAPLLX013

 CADHMAPLLX019

 CADHMAPLLX024

 CADHMAPLLX025

 CADHMAPLLX033

 CADHMAPLLX038

 CADHMAPLNT010

 CADHMAPLNT011

 CADHMAPRLX006

 CADHMAPRLX007

 CADHMAPRLX008

 CADHMAPRLX014

 CADHMAPRLX016

 CADHMAPRLX017

 CADHMAPRLX020

 CADHMAPRLX021

 CADHMAPRLX022

 CADHMAPRLX023

 CADHMAPRLX024

 CADHMAPRLX025

 CADHMAPRLX026

 CADHMAPRLX027

 CADHMAPRLX028

 CADHMAPRLX031

 CADHMAPRLX032

 CADHMAPRLX033

 CADHMAPRLX034

 CADHMAPRLX035

 CADHMAPRLX036

 CADHMAPRLX049_

 CADHMAPRLX053

 CADHMAPRLX056

 CADHMAPRLX057

 CADHMAPRLX060

 CADHMAPRNT010

 CADHMAPRNT011

 CADHMDADLX017

 CADHMDADLX021

 CADHMDADLX022

 CADHMDADLX023

 CADHMDADLX024

 CADHMDADLX025

 CADHMDADLX026

 CADHMDADLX027

 CADHMDADLX028

 CADHMDADLX029

 CADHMDADLX030

 CADHMDADLX031

 CADHMDADNT004

 CADHMDADNT009

 CADNPCLDLX1451

 CADNPCLDLX1452

 cadsvaprap003

 cadsvaprap007.intra.caixa.gov.br

 cadsvaprlx227.intra.caixa.gov.br

 cadsvaprlx228.intra.caixa.gov.br

 cadsvaprlx229.intra.caixa.gov.br

 cadsvaprlx231.intra.caixa.gov.br

 cadsvaprlx232.intra.caixa.gov.br

 cadsvaprlx411.intra.caixa.gov.br

 cadsvaprlx412.intra.caixa.gov.br

 CADSVGERLX195

 CADSVGERLX196

 CADSVGERNT185

 CADSVGERNT186

 CADSVGERNT187

 CADSVITRLX243

 CADTQAPLLX030

 CADTQAPLLX031

 CADTQAPLLX037

 CADTQAPLLX038

 CADTQAPLLX039

 CADTQAPLLX046_NEW

 CADTQAPLLX046_OLD

 CADTQAPLNT001

 CADTQAPRLX007

 CADTQAPRLX013

 CADTQAPRLX014

 CADTQAPRLX015

 CADTQAPRLX016

 CADTQAPRLX017

 CADTQAPRLX018

 CADTQAPRLX019

 CADTQAPRLX020

 CADTQAPRLX021

 CADTQAPRLX022

 CADTQAPRLX023

 CADTQAPRLX024

 CADTQAPRNT007_NEW

 CADTQAPRNT010

 CADTQAPRNT012

 CADTQDADLX014

 CADTQDADLX015

 CADTQDADNT005

 CADTQDADNT007

 CBRDEAPLLX010

 CBRDEAPLLX011

 CBRDEAPLLX025

 CBRDEAPLLX042

 CBRDEAPLLX257

 CBRDEAPLLX322

 CBRDEAPLLX336

 CBRDEAPLLX901

 CBRDEAPLLX902

 CBRDEAPLLX903

 CBRDEAPLLX904

 CBRDEAPLLX905

 CBRDEAPLLX906

 CBRDEAPLNT003

 CBRDEAPLNT006

 CBRDEAPLNT073

 CBRDEAPLNT119

 CBRDEAPLNT132

 CBRDEAPLNT143

 CBRDEAPLNT148

 CBRDEAPLNT151

 CBRDEAPLNT152

 CBRDEAPLNT153

 CBRDEAPLNT162

 CBRDEAPR001

 CBRDEAPRLX039

 CBRDEAPRLX046

 CBRDEAPRLX067

 CBRDEAPRLX086_16_JUL

 CBRDEAPRLX087

 CBRDEAPRLX088

 CBRDEAPRLX091

 CBRDEAPRLX139

 CBRDEAPRLX140_NOVA

 CBRDEAPRLX155

 CBRDEAPRLX156

 CBRDEAPRLX167

 CBRDEAPRLX186_NEW

 CBRDEAPRLX186_OLD

 CBRDEAPRLX187_NEW (inaccessible)

 CBRDEAPRLX187_OLD

 CBRDEAPRLX188_NEW (inaccessible)

 CBRDEAPRLX188_OLD

 CBRDEAPRLX189_NEW (inaccessible)

 CBRDEAPRLX189_OLD

 CBRDEAPRNT003

 CBRDEAPRNT059

 CBRDEDADLX047

 CBRDEDADLX048

 CBRDEDADNT012

 CBRHMAPLLX082

 CBRHMAPRLX020

 CBRHMAPRLX022

 CBRHMAPRLX024

 CBRHMAPRLX027

 CBRHMAPRLX029

 CBRHMAPRLX030

 CBRHMAPRNT014

 CBRHMAPRNT015

 CBRHMAPRNT016

 CBRTQAPLLX016_BKP

 CBRTQAPLLX023

 CBRTQAPLLX024

 CBRTQAPLLX025

 CBRTQAPLLX048

 CBRTQAPLLX055

 CBRTQAPLLX056

 CBRTQAPLLX057

 CBRTQAPLLX081

 CBRTQAPLLX107

 CBRTQAPLLX108

 CBRTQAPRLX005

 CBRTQAPRLX006

 CCSDEAPLLX001

 CCSDEAPLLX003

 CCSDEAPRLX001

 CCSHMAPLLX001

 CCSHMAPLNT001

 CCTDEAPLLX007

 CCTDEAPLLX014

 CCTDEAPRLX001

 CCTDEAPRNT002

 CCTDEDADNT008

 CCTHMAPLLX010

 CCTHMAPLNT005

 CCTRPTQSLX001

 CCTTQAPLNT004

 CCTTQAPLNT005

 CCTTQAPLNT006

 CEADECLDLX0003

 CEADECLDLX0004

 CEADECLDLX0005

 CEADECLDLX0006

 ceadecldlx044.nprd.caixa

 coreos_fedoraproject_WO0000070849900

 CRJDEAPLLX022

 CRJDEAPLLX055

 crjdeapllx069

 CRJDEAPRLX038

 CRJDEAPRLX039

 CRJDEAPRLX041

 CRJDEAPRLX081

 CRJDEAPRNT010

 CRJDEDADLX014

 CRJDEDADNT009

 CRJHMAPLLX037

 CRJHMAPLLX041

 CRJHMAPLLX043

 CRJHMAPRLX016

 CRJHMAPRLX022

 CRJHMAPRLX025

 CRJHMAPRLX027

 CRJHMAPRLX040

 CRJHMAPRLX042

 CRJHMAPRLX044

 CRJHMAPRLX063

 CRJHMAPRLX068

 CRJHMDADNT016

 CRJTQAPLLX034

 CRJTQAPRLX006

 CRJTQAPRLX007

 CSPDEAPLLX080

 CSPDEAPLLX081

 CSPDEAPLLX082

 CSPDEAPLLX083

 CSPDEAPLLX084

 CSPDEAPLLX085

 CSPDEAPRLX083

 CSPDEAPRLX084

 CSPDEAPRLX087

 CSPDEDADLX007

 CSPDEGERLX001

 CSPHMAPRLX006

 CSPHMAPRLX011

 CSPTQAPLLX030

 CSPTQAPLLX031

 CSPTQAPLLX032

 CXEXTRLX223

 CXEXTRLX296

 CXEXTRNT070

 DRJHMDADNT002

 DRJHMDADNT003

 DRJHMDADNT004

 DRJHMDADNT005

 DRJHMDADNT008

 okd_teste1

 okd_teste3

 okd_teste4

 okd_teste5

 okd_teste6

 okd_teste7

 okd_teste8

 okd_teste9

 RHEL_CSPDEAPLLX018

 RHEL_SSPDEAPLLX0032

 SBRDEAPLLX103_11_05_26

 SBRDEAPLNT039

 SBRDEAPRLX030

 SBRDEAPRLX031

 SBRHMAPLLX0044

 SBRHMAPRNT017

 SBRHMDADLX062

 SBRTQAPLLX0001

 SBRTQAPLLX0006

 SCTDEAPLLX0029

 SCTDEAPLLX0113

 SCTDEAPLLX0146

 SCTDEAPLLX0149

 SCTDEAPLLX0161

 SCTDEAPLNT0061

 SCTDEDADNT0021

 SCTHMDADLX0002

 SCTHMDADLX0015

 SCTTQAPLLX0025

 SRJDEAPLLX0048

 SRJDEAPLLX072_NEW

 SRJDEAPRNT0008_2019

 SRJDEAPRNT0009_2019

 SRJDEDADLX0004

 SRJDEDADNT030

 SRJHMAPRNT0018

 SRJTQAPRNT0003

 SSPDEAPLLX0016

 SSPDEAPLLX0024

 SSPDEAPLLX0065

 STSDEAPLLX0018_WO0000073866952

 TEMPLATE_RP_FILENET_HMP

 TESTE_ACI_NPCN2

 TESTE_Segurança

 controlm-21.200-AG-DATA-openjdk17-rhel93-v004

 controlm-21.200-AG-DATA-oracli-openjdk17-rhel93-v057

 controlm-21.200-AP-openjdk17-rhel93-v017

 controlm-21.300-AG-DATA-openjdk21-rhel93-v003

 controlm-21.300-AG-openjdk21-rhel93-v023

 controlm-plugins-v9-19-200-openjdk11-rhel79-v007

 controlm-plugins-v9-19-200-teste-openjdk11-rhel79-v009

 controlm9p-openjdk17-rhel93-v006_CLONE

 controlm9p-openjdk17-rhel93-v038_CLONE

 datagrid85-openjdk21-apache24-rhel93-v003

 eap70-jdk8-apache24-rhel79-v006_CLONE

 eap71-openjdk11-apache24-rhel79-v003_CLONE

 eap71-openjdk11-apache24-rhel79-v014

 eap74-openjdk11-apache24-rhel79-v042

 eap74-openjdk11-apache24-rhel79-v043

 eap74-openjdk17-apache24-rhel93-v006_CLONE

 eap74-openjdk8-apache24-rhel79-v018

 eap74-openjdk8-apache24-rhel79-v024

 eap74-openjdk8-apache24-rhel79-v025

 eap74-openjdk8-apache24-rhel93-v002

 eap74-openjdk8-apache24-rhel93-v010

 eap74-openjdk8-apache24-rhel93-v015

 eap80-openjdk17-apache24-rhel93-v005

 eap80-openjdk17-apache24-rhel93-v006

 eap80-openjdk21-apache24-rhel93-v003

 eap80-openjdk21-apache24-rhel93-v004

 RHEL-7.7-v02_Java-8

 RHEL-7.7-v02_Java-8_Clone

 rhel8-v001

 rhel93-v015
CADDEAPLLX2520

Actions
Summary
Monitor
Configure
Permissions
Datastores
Networks
Snapshots
Guest OS

Launch Remote Console 
Launch Web Console
Virtual Machine Details
Actions
Power Status	
 Powered On
Guest OS	 Red Hat Enterprise Linux 9 (64-bit)
VMware Tools	Running, version:12357 (Guest Managed) 
DNS Name (1)	
caddeapllx2520.agil.nprd.caixa.gov.br
IP Addresses (2)	
10.116.201.129
fe80::250:56ff:fe82:ffe6
Encryption	Not encrypted
Usage
Last updated: 6/17/26, 2:04 PM

CPU
 24 MHz used
Memory
 81 MB used
Storage
 37.08 GB used
View Stats
VM Hardware
CPU	2 CPU(s), 24 MHz used
Memory	4 GB, 0 GB memory active
Hard disk 1 (of 2)	
32 GB | Thick Provision Lazy Zeroed 
CTCHWNPRDC011_0029
See All Disks
Network adapter 1	
tn-NPRD+NPRD_AUTO_DES_BSB-ap+VL3676-ep+10.116.192.0 (connected) | 00:50:56:82:ff:e6
Compatibility	ESXi 7.0 U2 and later (VM version 19)
Edit
PCI Devices
No PCI devices
Edit
Related Objects
Cluster
 CTC_NPRDXF2488HV7_NPRD
Host
 cadsvgersh485.intra.caixa.gov.br
Resource pool
 RP_TERRAFORM_NPRD
Networks
 tn-NPRD+NPRD_AUTO_DES_BSB-ap+VL3676-ep+10.116.192.0
Storage
 DSC_CTCHWNPRDC011_NPRD
Tags
No tags assigned
Assign
Notes

Gerenciado pelo Packer/Terraform - Esteiras Ageis - ECAPT-SOCIAL-TQS - Template: eap80-openjdk17-apache24-rhel93-v006 - caddeapllx2520.agil.nprd.caixa.gov.br
Edit
Storage Policies
Check Compliance
Custom Attributes
Last Dell PowerProtect Backup	Backup Server=cadsvaprap003.intra.caixa.gov.br, Policy=721e04a9-f8b0-4a9d-a22f-f4886b2437e5, Stage=cdc0c151-07d2-e027-39ab-1387356c4ed6, StartTime=2026-06-16T23:58:10Z, EndTime=2026-06-16T23:59:20Z
Centro de CUSTO	
DATA CRIACAO	
Dell EMC PPDM Upgrade Rollback Type	
Dell VM Direct Engine Cleanup Descriptor	
Dell VM Direct Engine Session	
Funcao	
Responsavel	
SO	
Sistema	
Edit
Snapshots
No snapshot taken
Manage
 PowerProtect

Compute Policies
View all policies
vSphere HA
vSphere HA Protection		Protected 
Proactive HA		Manual
Host failure		Restart VMs
Host Isolation		Disabled
Datastore with Permanent Device Loss		Power off and restart VMs
Datastore with All Paths Down		Power off and restart VMs
Guest not heartbeating		Disabled

Settings

Recent Tasks
Alarms
Task Name

Use left or right key to resize the column
Target

Use left or right key to resize the column
Status

Use left or right key to resize the column
Details

Use left or right key to resize the column
Initiator

Use left or right key to resize the column
Queued For

Use left or right key to resize the column
Start Time

Use left or right key to resize the column
Completion Time

Use left or right key to resize the column
Server

Execute Storage vMotion for Storage DRS
 CADDEDADNT043
 Virtual machine is configured to use a device that prevents the operation: Device 'SCSI controller 1' is a SCSI controller engaged in bus-sharing.
Checking compatibility of the Virtual Machine
System
14 ms
06/17/2026, 2:04:36 PM
06/17/2026, 2:04:37 PM
cadsvgerap030-1.intra.caixa.gov.br
Execute Storage vMotion for Storage DRS
 CADDEDADNT043
 Virtual machine is configured to use a device that prevents the operation: Device 'SCSI controller 1' is a SCSI controller engaged in bus-sharing.
Checking compatibility of the Virtual Machine
System
5 ms
06/17/2026, 2:04:36 PM
06/17/2026, 2:04:37 PM
cadsvgerap030-1.intra.caixa.gov.br
DrmExecute.label
 Completed
System
35 ms
06/17/2026, 2:04:36 PM
06/17/2026, 2:04:36 PM
cadsvgerap030-1.intra.caixa.gov.br
Execute Storage vMotion for Storage DRS
 CADPCINTNT043
 Virtual machine is configured to use a device that prevents the operation: Device 'SCSI controller 1' is a SCSI controller engaged in bus-sharing.
Checking compatibility of the Virtual Machine
System
5 ms
06/17/2026, 2:04:00 PM
06/17/2026, 2:04:02 PM
cadsvgerap027-1.intra.caixa.gov.br
Execute Storage vMotion for Storage DRS
 CADPCINTNT043
 Virtual machine is configured to use a device that prevents the operation: Device 'SCSI controller 1' is a SCSI controller engaged in bus-sharing.
Checking compatibility of the Virtual Machine
System
4 ms
06/17/2026, 2:04:00 PM
06/17/2026, 2:04:02 PM
cadsvgerap027-1.intra.caixa.gov.br
Execute Storage vMotion for Storage DRS
 CADPCINTNT043
 Virtual machine is configured to use a device that prevents the operation: Device 'SCSI controller 1' is a SCSI controller engaged in bus-sharing.
Checking compatibility of the Virtual Machine
System
14 ms
06/17/2026, 2:04:00 PM
06/17/2026, 2:04:02 PM
cadsvgerap027-1.intra.caixa.gov.br
DrmExecute.label
 Completed
System
4 ms
06/17/2026, 2:04:00 PM
06/17/2026, 2:04:00 PM
cadsvgerap027-1.intra.caixa.gov.br
Execute Storage vMotion for Storage DRS
 CCTDCAPLNT0358

43%

Migrating Virtual Machine active state
System
2 ms
06/17/2026, 2:03:28 PM
cadsvgerap029-1.intra.caixa.gov.br
DrmExecute.label
 Completed
System
2 ms
06/17/2026, 2:03:28 PM
06/17/2026, 2:03:28 PM
cadsvgerap029-1.intra.caixa.gov.br
Execute Storage vMotion for Storage DRS
 CCTCOAPLLX053
 Completed
Changing Virtual Machine host and resource pool association
System
3 ms
06/17/2026, 2:03:08 PM
06/17/2026, 2:03:32 PM
cadsvgerap029-1.intra.caixa.gov.br
DrmExecute.label
 Completed
System
4 ms
06/17/2026, 2:03:08 PM
06/17/2026, 2:03:08 PM
cadsvgerap029-1.intra.caixa.gov.br
DrmExecute.label
 Completed
System
5 ms
06/17/2026, 1:58:54 PM
06/17/2026, 1:58:54 PM
cadsvgerap029-1.intra.caixa.gov.br
DrmExecute.label
 Completed
System
2 ms
06/17/2026, 1:58:54 PM
06/17/2026, 1:58:54 PM
cadsvgerap029-1.intra.caixa.gov.br
Apply Storage DRS recommendations
 DSC_CTCHWC001_CEAUS

12%

Reserving resources for operation
CORPCAIXA\p976713
55 ms
06/17/2026, 1:58:54 PM
cadsvgerap029-1.intra.caixa.gov.br
Apply Storage DRS recommendations
 DSC_CTCHWC001_CEAUS

12%

Resources currently in use by other operations. Waiting.
CORPCAIXA\p976713
55 ms
06/17/2026, 1:58:54 PM
cadsvgerap029-1.intra.caixa.gov.br
DrmExecute.label
 Completed
System
3 ms
06/17/2026, 1:58:54 PM
06/17/2026, 1:58:54 PM
cadsvgerap029-1.intra.caixa.gov.br
DrmExecute.label
 Completed
System
3 ms
06/17/2026, 1:58:54 PM
06/17/2026, 1:58:54 PM
cadsvgerap029-1.intra.caixa.gov.br
DrmExecute.label
 Completed
System
3 ms
06/17/2026, 1:58:54 PM
06/17/2026, 1:58:54 PM
cadsvgerap029-1.intra.caixa.gov.br
DrmExecute.label
 Completed
System
2 ms
06/17/2026, 1:58:54 PM
06/17/2026, 1:58:54 PM
cadsvgerap029-1.intra.caixa.gov.br
DrmExecute.label
 Completed
System
2 ms
06/17/2026, 1:58:54 PM
06/17/2026, 1:58:54 PM
cadsvgerap029-1.intra.caixa.gov.br
DrmExecute.label
 Completed
System
5 ms
06/17/2026, 1:58:54 PM
06/17/2026, 1:58:54 PM
cadsvgerap029-1.intra.caixa.gov.br
DrmExecute.label
 Completed
System
5 ms
06/17/2026, 1:58:54 PM
06/17/2026, 1:58:54 PM
cadsvgerap029-1.intra.caixa.gov.br
DrmExecute.label
 Completed
System
5 ms
06/17/2026, 1:58:54 PM
06/17/2026, 1:58:54 PM
cadsvgerap029-1.intra.caixa.gov.br
DrmExecute.label
 Completed
System
4 ms
06/17/2026, 1:58:54 PM
06/17/2026, 1:58:54 PM
cadsvgerap029-1.intra.caixa.gov.br
DrmExecute.label
 Completed
System
3 ms
06/17/2026, 1:58:54 PM
06/17/2026, 1:58:54 PM
cadsvgerap029-1.intra.caixa.gov.br
Manage Columns

All
More Tasks
1 - 25 of 136 items
First Page
Previous Page
1
 / 
6
Next Page
Last Page


Skip to main content

1 / 2

There are expired or expiring licenses in your inventory.
Manage your licenses


vSphere Client
CADDEAPLLX2673

p585600@corp.caixa.gov.br








 cadsvgerap027-1.intra.caixa.gov.br

 cadsvgerap028-1.intra.caixa.gov.br

 cadsvgerap029-1.intra.caixa.gov.br

 cadsvgerap030-1.intra.caixa.gov.br

 NPRD

 0_Migracao_P2V

 7259-NPRD

 7260

 7262

 7266

 7366

 7562

 _DTC_CTC_MIGRACAO

 _DTC_CTC_MIGRACAO_24_04_2023

 Bancario

 CEDES_P2V

 CETEL08

 Datacenters

 Discovered virtual machine

 HMP_SIFRA

 INVision

 kafka-nprd-9pjzw

 OKD_NPRD_WO0000077790621

 pdtcp4d01nprd-wgg6r

 pdtged01nprd-sqk84

 pdtwxd01nprd-r47rf

 pixnprd4-x44wk

 POC-InfoScale

 QUARENTENA

 Quarentena_Old

 RP_ESTEIRAS_AGEIS

 telemetria-nprd-phnvh

 Templates TELEDATA - Não Deletar

 Templates_Infrasimples

 TerraForm

 TERRAFORM_NPRD

 CADDEAPLLX0010

 CADDEAPLLX0011

 CADDEAPLLX0012

 CADDEAPLLX0013

 CADDEAPLLX012

 CADDEAPLLX1034

 CADDEAPLLX1067

 CADDEAPLLX1072

 CADDEAPLLX1078

 CADDEAPLLX1087

 CADDEAPLLX1132

 CADDEAPLLX1141

 CADDEAPLLX1151

 CADDEAPLLX1177

 CADDEAPLLX1209

 CADDEAPLLX1214

 CADDEAPLLX1230

 CADDEAPLLX1231

 CADDEAPLLX1234

 CADDEAPLLX1285

 CADDEAPLLX1307

 CADDEAPLLX1315

 CADDEAPLLX1355

 CADDEAPLLX1368

 CADDEAPLLX1369

 CADDEAPLLX1370

 CADDEAPLLX1371

 CADDEAPLLX1382

 CADDEAPLLX1385

 CADDEAPLLX1391

 CADDEAPLLX1394

 CADDEAPLLX1395

 CADDEAPLLX1398

 CADDEAPLLX1405

 CADDEAPLLX1410

 CADDEAPLLX1411

 CADDEAPLLX1429

 CADDEAPLLX1437

 CADDEAPLLX1441

 CADDEAPLLX1447

 CADDEAPLLX1451

 CADDEAPLLX1457

 CADDEAPLLX1459

 CADDEAPLLX1467

 CADDEAPLLX1499

 CADDEAPLLX1501

 CADDEAPLLX1502

 CADDEAPLLX1504

 CADDEAPLLX1505

 CADDEAPLLX1506

 CADDEAPLLX1508

 CADDEAPLLX1512

 CADDEAPLLX1519

 CADDEAPLLX1521

 CADDEAPLLX1522

 CADDEAPLLX1523

 CADDEAPLLX1524

 CADDEAPLLX1526

 CADDEAPLLX1529

 CADDEAPLLX1530

 CADDEAPLLX1531

 CADDEAPLLX1532

 CADDEAPLLX1533

 CADDEAPLLX1535

 CADDEAPLLX1536

 CADDEAPLLX1537

 CADDEAPLLX1538

 CADDEAPLLX1539

 CADDEAPLLX1540

 CADDEAPLLX1547

 CADDEAPLLX1550

 CADDEAPLLX1551

 CADDEAPLLX1553

 CADDEAPLLX1554

 CADDEAPLLX1555

 CADDEAPLLX1556

 CADDEAPLLX1557

 CADDEAPLLX1560

 CADDEAPLLX1561

 CADDEAPLLX1563

 CADDEAPLLX1572

 CADDEAPLLX1575

 CADDEAPLLX1576

 CADDEAPLLX1577

 CADDEAPLLX1578

 CADDEAPLLX1583

 CADDEAPLLX1600

 CADDEAPLLX1603

 CADDEAPLLX1604

 CADDEAPLLX1605

 CADDEAPLLX1606

 CADDEAPLLX1607

 CADDEAPLLX1609

 CADDEAPLLX1611

 CADDEAPLLX1614

 CADDEAPLLX1616

 CADDEAPLLX1617

 CADDEAPLLX1618

 CADDEAPLLX1619

 CADDEAPLLX1620

 CADDEAPLLX1622

 CADDEAPLLX1623

 CADDEAPLLX1625

 CADDEAPLLX1632

 CADDEAPLLX1633

 CADDEAPLLX1651

 CADDEAPLLX1653

 CADDEAPLLX1657

 CADDEAPLLX1659

 CADDEAPLLX1660

 CADDEAPLLX1661

 CADDEAPLLX1662

 CADDEAPLLX1663

 CADDEAPLLX1666

 CADDEAPLLX1667

 CADDEAPLLX1668

 CADDEAPLLX1669

 CADDEAPLLX1672

 CADDEAPLLX1675

 CADDEAPLLX1676

 CADDEAPLLX1677

 CADDEAPLLX1678

 CADDEAPLLX1682

 CADDEAPLLX1683

 CADDEAPLLX1684

 CADDEAPLLX1687

 CADDEAPLLX1692

 CADDEAPLLX1693

 CADDEAPLLX1694

 CADDEAPLLX1695

 CADDEAPLLX1696

 CADDEAPLLX1697

 CADDEAPLLX1698

 CADDEAPLLX1699

 CADDEAPLLX1700

 CADDEAPLLX1701

 CADDEAPLLX1702

 CADDEAPLLX1703

 CADDEAPLLX1704

 CADDEAPLLX1705

 CADDEAPLLX1706

 CADDEAPLLX1707

 CADDEAPLLX1713

 CADDEAPLLX1714

 CADDEAPLLX1715

 CADDEAPLLX1717

 CADDEAPLLX1718

 CADDEAPLLX1719

 CADDEAPLLX1720

 CADDEAPLLX1721

 CADDEAPLLX1722

 CADDEAPLLX1723

 CADDEAPLLX1724

 CADDEAPLLX1725

 CADDEAPLLX1730

 CADDEAPLLX1731

 CADDEAPLLX1732

 CADDEAPLLX1733

 CADDEAPLLX1734

 CADDEAPLLX1735

 CADDEAPLLX1736

 CADDEAPLLX1737

 CADDEAPLLX1738

 CADDEAPLLX1739

 CADDEAPLLX1740

 CADDEAPLLX1741

 CADDEAPLLX1745

 CADDEAPLLX1746

 CADDEAPLLX1747

 CADDEAPLLX1754

 CADDEAPLLX1764

 CADDEAPLLX1765

 CADDEAPLLX1766

 CADDEAPLLX1767

 CADDEAPLLX1768

 CADDEAPLLX1770

 CADDEAPLLX1772

 CADDEAPLLX1773

 CADDEAPLLX1774

 CADDEAPLLX1775

 CADDEAPLLX1777

 CADDEAPLLX1778

 CADDEAPLLX1779

 CADDEAPLLX1780

 CADDEAPLLX1781

 CADDEAPLLX1782

 CADDEAPLLX1783

 CADDEAPLLX1784

 CADDEAPLLX1785

 CADDEAPLLX1786

 CADDEAPLLX1789

 CADDEAPLLX1790

 CADDEAPLLX1791

 CADDEAPLLX1794

 CADDEAPLLX1795

 CADDEAPLLX1796

 CADDEAPLLX1798

 CADDEAPLLX1800

 CADDEAPLLX1801

 CADDEAPLLX1802

 CADDEAPLLX1844

 CADDEAPLLX1845

 CADDEAPLLX1846

 CADDEAPLLX1847

 CADDEAPLLX1849

 CADDEAPLLX1850

 CADDEAPLLX1855

 CADDEAPLLX1856

 CADDEAPLLX1860

 CADDEAPLLX1863

 CADDEAPLLX1864

 CADDEAPLLX1865

 CADDEAPLLX1866

 CADDEAPLLX1867

 CADDEAPLLX1868

 CADDEAPLLX1869

 CADDEAPLLX1870

 CADDEAPLLX1871

 CADDEAPLLX1874

 CADDEAPLLX1875

 CADDEAPLLX1876

 CADDEAPLLX1877

 CADDEAPLLX1878

 CADDEAPLLX1879

 CADDEAPLLX1880

 CADDEAPLLX1882

 caddeapllx1884

 CADDEAPLLX1885

 CADDEAPLLX1886

 CADDEAPLLX1887

 CADDEAPLLX1888

 CADDEAPLLX1890

 CADDEAPLLX1892

 CADDEAPLLX1893

 CADDEAPLLX1894

 CADDEAPLLX1906

 CADDEAPLLX1907

 CADDEAPLLX1908

 CADDEAPLLX1909

 CADDEAPLLX1910

 CADDEAPLLX1911

 CADDEAPLLX1912

 CADDEAPLLX1913

 CADDEAPLLX1914

 CADDEAPLLX1915

 CADDEAPLLX1916

 CADDEAPLLX1917

 CADDEAPLLX1918

 CADDEAPLLX1919

 CADDEAPLLX1920

 CADDEAPLLX1921

 CADDEAPLLX1922

 CADDEAPLLX1923

 CADDEAPLLX1924

 CADDEAPLLX1925

 CADDEAPLLX1926

 CADDEAPLLX193

 CADDEAPLLX1943

 CADDEAPLLX1944

 CADDEAPLLX1945

 CADDEAPLLX1946

 CADDEAPLLX1947

 CADDEAPLLX1950

 CADDEAPLLX1951

 CADDEAPLLX1952

 CADDEAPLLX1953

 CADDEAPLLX1954

 CADDEAPLLX1955

 CADDEAPLLX1956

 CADDEAPLLX1957

 CADDEAPLLX1958

 CADDEAPLLX1962

 CADDEAPLLX1963

 CADDEAPLLX1964

 CADDEAPLLX1965

 CADDEAPLLX1967

 CADDEAPLLX1968

 CADDEAPLLX1969

 CADDEAPLLX1970

 CADDEAPLLX1971

 CADDEAPLLX1972

 CADDEAPLLX1973

 CADDEAPLLX1974

 CADDEAPLLX1975

 CADDEAPLLX1976

 CADDEAPLLX1977

 CADDEAPLLX1978

 CADDEAPLLX1979

 CADDEAPLLX1985

 CADDEAPLLX1986

 CADDEAPLLX1987

 CADDEAPLLX1988

 CADDEAPLLX1989

 CADDEAPLLX1991

 CADDEAPLLX1992

 CADDEAPLLX1993

 CADDEAPLLX1994

 CADDEAPLLX1995

 CADDEAPLLX2002

 CADDEAPLLX2018

 CADDEAPLLX2035

 CADDEAPLLX2038

 CADDEAPLLX2039

 CADDEAPLLX2040

 CADDEAPLLX2044

 CADDEAPLLX2045

 CADDEAPLLX2046

 CADDEAPLLX2047

 CADDEAPLLX2052

 CADDEAPLLX2058

 CADDEAPLLX2073

 CADDEAPLLX2074

 CADDEAPLLX2075

 CADDEAPLLX2076

 CADDEAPLLX2079

 CADDEAPLLX2081

 CADDEAPLLX2082

 CADDEAPLLX2083

 CADDEAPLLX2086

 CADDEAPLLX2087

 CADDEAPLLX2091

 CADDEAPLLX2092

 CADDEAPLLX2093

 CADDEAPLLX2094

 CADDEAPLLX2095

 CADDEAPLLX2097

 CADDEAPLLX2098

 CADDEAPLLX2099

 CADDEAPLLX2100

 CADDEAPLLX2102

 CADDEAPLLX2105

 CADDEAPLLX2106

 CADDEAPLLX2107

 CADDEAPLLX2108

 CADDEAPLLX2109

 CADDEAPLLX2111

 CADDEAPLLX2113

 CADDEAPLLX2114

 CADDEAPLLX2118

 CADDEAPLLX2119

 CADDEAPLLX2121

 CADDEAPLLX2122

 CADDEAPLLX2123

 CADDEAPLLX2124

 CADDEAPLLX2125

 CADDEAPLLX2126

 CADDEAPLLX2127

 CADDEAPLLX2128

 CADDEAPLLX2129

 CADDEAPLLX2130

 CADDEAPLLX2131

 CADDEAPLLX2132

 CADDEAPLLX2133

 CADDEAPLLX2134

 CADDEAPLLX2136

 CADDEAPLLX2138

 CADDEAPLLX2141

 CADDEAPLLX2142

 CADDEAPLLX2143

 CADDEAPLLX2145

 CADDEAPLLX2153

 CADDEAPLLX2160

 CADDEAPLLX2161

 CADDEAPLLX2164

 CADDEAPLLX2170

 CADDEAPLLX2171

 CADDEAPLLX2172

 CADDEAPLLX2175

 CADDEAPLLX2176

 CADDEAPLLX2180

 CADDEAPLLX2184

 CADDEAPLLX2185

 CADDEAPLLX2187

 CADDEAPLLX2188

 CADDEAPLLX2189

 CADDEAPLLX2191

 CADDEAPLLX2192

 CADDEAPLLX2193

 CADDEAPLLX2195

 CADDEAPLLX2197

 CADDEAPLLX2198

 CADDEAPLLX2199

 CADDEAPLLX2200

 CADDEAPLLX2201

 CADDEAPLLX2202

 CADDEAPLLX2203

 CADDEAPLLX2204

 CADDEAPLLX2205

 CADDEAPLLX2206

 CADDEAPLLX2214

 CADDEAPLLX2215

 CADDEAPLLX2216

 CADDEAPLLX2218

 CADDEAPLLX2219

 CADDEAPLLX2220

 CADDEAPLLX2221

 CADDEAPLLX2226

 CADDEAPLLX2228

 CADDEAPLLX2229

 CADDEAPLLX2232

 CADDEAPLLX2234

 CADDEAPLLX2235

 CADDEAPLLX2236

 CADDEAPLLX2237

 CADDEAPLLX224

 CADDEAPLLX2249

 CADDEAPLLX2250

 CADDEAPLLX2251

 CADDEAPLLX2255

 CADDEAPLLX2256

 CADDEAPLLX2257

 CADDEAPLLX2258

 CADDEAPLLX2259

 CADDEAPLLX2260

 CADDEAPLLX2261

 CADDEAPLLX2262

 CADDEAPLLX2263

 CADDEAPLLX2264

 CADDEAPLLX2265

 CADDEAPLLX2266

 CADDEAPLLX2269

 CADDEAPLLX2271

 CADDEAPLLX2273

 CADDEAPLLX2274

 CADDEAPLLX2275

 CADDEAPLLX2276

 CADDEAPLLX2283

 CADDEAPLLX2312

 CADDEAPLLX2316

 CADDEAPLLX2317

 CADDEAPLLX2319

 CADDEAPLLX2320

 CADDEAPLLX2321

 CADDEAPLLX2322

 CADDEAPLLX2333

 CADDEAPLLX2334

 CADDEAPLLX2335

 CADDEAPLLX2336

 CADDEAPLLX2337

 CADDEAPLLX2339

 CADDEAPLLX2340

 CADDEAPLLX2341

 CADDEAPLLX2342

 CADDEAPLLX2346

 CADDEAPLLX2347

 CADDEAPLLX2349

 CADDEAPLLX2353

 CADDEAPLLX2365

 CADDEAPLLX2367

 CADDEAPLLX237

 CADDEAPLLX2371

 CADDEAPLLX2373

 CADDEAPLLX2376

 CADDEAPLLX2377

 CADDEAPLLX2378

 CADDEAPLLX2381

 CADDEAPLLX2382

 CADDEAPLLX2383

 CADDEAPLLX2384

 CADDEAPLLX2385

 CADDEAPLLX2386

 CADDEAPLLX2387

 CADDEAPLLX2390

 CADDEAPLLX2391

 CADDEAPLLX2392

 CADDEAPLLX2393

 CADDEAPLLX2394

 CADDEAPLLX2395

 CADDEAPLLX2402

 CADDEAPLLX2413

 CADDEAPLLX2419

 CADDEAPLLX2420

 CADDEAPLLX2421

 CADDEAPLLX2423

 CADDEAPLLX2426

 CADDEAPLLX2427

 CADDEAPLLX2428

 CADDEAPLLX2429

 CADDEAPLLX2430

 CADDEAPLLX2431

 CADDEAPLLX2432

 CADDEAPLLX2433

 CADDEAPLLX2434

 CADDEAPLLX2435

 CADDEAPLLX2436

 CADDEAPLLX2437

 CADDEAPLLX2438

 CADDEAPLLX2439

 CADDEAPLLX2440

 CADDEAPLLX2441

 CADDEAPLLX2442

 CADDEAPLLX2443

 CADDEAPLLX2444

 CADDEAPLLX2445

 CADDEAPLLX2446

 CADDEAPLLX2447

 CADDEAPLLX2448

 CADDEAPLLX2449

 CADDEAPLLX2450

 CADDEAPLLX2451

 CADDEAPLLX2452

 CADDEAPLLX2453

 CADDEAPLLX2454

 CADDEAPLLX2455

 CADDEAPLLX2456

 CADDEAPLLX2457

 CADDEAPLLX2458

 CADDEAPLLX2459

 CADDEAPLLX2460

 CADDEAPLLX2461

 CADDEAPLLX2462

 CADDEAPLLX2463

 CADDEAPLLX2464

 CADDEAPLLX2465

 CADDEAPLLX2466

 CADDEAPLLX2467

 CADDEAPLLX2469

 CADDEAPLLX2470

 CADDEAPLLX2471

 CADDEAPLLX2475

 CADDEAPLLX2476

 CADDEAPLLX2478

 CADDEAPLLX2479

 CADDEAPLLX248

 CADDEAPLLX2480

 CADDEAPLLX2481

 CADDEAPLLX2483

 CADDEAPLLX2484

 CADDEAPLLX2485

 CADDEAPLLX2486

 CADDEAPLLX2488

 CADDEAPLLX2489

 CADDEAPLLX249

 CADDEAPLLX2490

 CADDEAPLLX2491

 CADDEAPLLX2492

 CADDEAPLLX2493

 CADDEAPLLX2494

 CADDEAPLLX2495

 CADDEAPLLX2496

 CADDEAPLLX2498

 CADDEAPLLX2499

 CADDEAPLLX2500

 CADDEAPLLX2501

 CADDEAPLLX2502

 CADDEAPLLX2503

 CADDEAPLLX2504

 CADDEAPLLX2505

 CADDEAPLLX2506

 CADDEAPLLX2507

 CADDEAPLLX2508

 CADDEAPLLX2509

 CADDEAPLLX2510

 CADDEAPLLX2511

 CADDEAPLLX2512

 CADDEAPLLX2513

 CADDEAPLLX2514

 CADDEAPLLX2519

 CADDEAPLLX2520

 CADDEAPLLX2521

 CADDEAPLLX2522

 CADDEAPLLX2524

 CADDEAPLLX2528

 CADDEAPLLX2529

 CADDEAPLLX2531

 CADDEAPLLX2532

 CADDEAPLLX2533

 CADDEAPLLX2537

 CADDEAPLLX2538

 CADDEAPLLX2539

 CADDEAPLLX2540

 CADDEAPLLX2541

 CADDEAPLLX2542

 CADDEAPLLX2543

 CADDEAPLLX2545

 CADDEAPLLX2552

 CADDEAPLLX2553

 CADDEAPLLX2554

 CADDEAPLLX2555

 CADDEAPLLX2556

 CADDEAPLLX2557

 CADDEAPLLX2559

 CADDEAPLLX2560

 CADDEAPLLX2562

 CADDEAPLLX2565

 CADDEAPLLX2566

 CADDEAPLLX2567

 CADDEAPLLX2569

 CADDEAPLLX2570

 CADDEAPLLX2571

 CADDEAPLLX2572

 CADDEAPLLX2573

 CADDEAPLLX2574

 CADDEAPLLX2575

 CADDEAPLLX2576

 CADDEAPLLX2577

 CADDEAPLLX2580

 CADDEAPLLX2581

 CADDEAPLLX2582

 CADDEAPLLX2584

 CADDEAPLLX2589

 CADDEAPLLX2590

 CADDEAPLLX2591

 CADDEAPLLX2592

 CADDEAPLLX2593

 CADDEAPLLX2595

 CADDEAPLLX2597

 CADDEAPLLX2599

 CADDEAPLLX2601

 CADDEAPLLX2602

 CADDEAPLLX2603

 CADDEAPLLX2604

 CADDEAPLLX2605

 CADDEAPLLX2606

 CADDEAPLLX2607

 CADDEAPLLX2608

 CADDEAPLLX2609

 CADDEAPLLX2610

 CADDEAPLLX2611

 CADDEAPLLX2612

 CADDEAPLLX2613

 CADDEAPLLX2614

 CADDEAPLLX2616

 CADDEAPLLX2619

 CADDEAPLLX2620

 CADDEAPLLX2645

 CADDEAPLLX2646

 CADDEAPLLX2647

 CADDEAPLLX2650

 CADDEAPLLX2651

 CADDEAPLLX2652

 CADDEAPLLX2653

 CADDEAPLLX2654

 CADDEAPLLX2655

 CADDEAPLLX2656

 CADDEAPLLX2657

 CADDEAPLLX2658

 CADDEAPLLX2659

 CADDEAPLLX2660

 CADDEAPLLX2665

 CADDEAPLLX2666

 CADDEAPLLX2667

 CADDEAPLLX2668

 CADDEAPLLX2670

 CADDEAPLLX2671

 CADDEAPLLX2672

 CADDEAPLLX2673

 CADDEAPLLX2674

 CADDEAPLLX2675

 CADDEAPLLX2676

 CADDEAPLLX2677

 CADDEAPLLX2679

 CADDEAPLLX404

 CADDEAPLLX506

 CADDEAPLLX667

 CADDEAPLLX760

 CADDEAPLLX761

 CADDEAPLLX796

 CADDEAPLLX874_REQ000116760546

 CADDEAPLLX884

 CADDEAPLLX912

 CADDEAPLLX924

 CADDEAPLLX935

 CADDEAPLLX962

 CADDEAPLLX963

 CADDEAPLLX981

 CADDEAPLLX997

 CADDEAPLNT003_New

 CADDEAPLNT051

 CADDEAPLNT065

 CADDEAPLNT065_UPDATE

 CADDEAPLNT071

 CADDEAPLNT075

 CADDEAPLNT077

 CADDEAPLNT080

 CADDEAPLNT081

 CADDEAPLNT082

 CADDEAPLNT085

 CADDEAPLNT086

 CADDEAPRLX053

 CADDEAPRLX054

 CADDEAPRLX071

 CADDEAPRLX086

 CADDEAPRLX087

 CADDEAPRLX088

 CADDEAPRLX089

 CADDEAPRLX091

 CADDEAPRLX095

 CADDEAPRLX097

 CADDEAPRLX110

 CADDEAPRLX111

 CADDEAPRLX169

 CADDEAPRLX170

 CADDEAPRLX171

 CADDEAPRLX172

 CADDEAPRLX183

 CADDEAPRLX184

 CADDEAPRLX185

 CADDEAPRLX192

 CADDEAPRLX193

 CADDEAPRNT002_2019

 CADDEAPRNT003_2019

 CADDEAPRNT016

 CADDEAPRNT026

 CADDEAPRNT049

 CADDECLDLX005

 CADDECLDLX006

 CADDECLDLX007

 CADDECLDLX008

 CADDECLDLX009

 CADDECLDLX010

 CADDECLDLX011

 CADDECLDLX012

 CADDECLDLX013

 CADDECLDLX014

 CADDECLDLX015

 CADDECLDLX016

 CADDECLDLX017

 CADDECLDLX018

 CADDECLDLX019

 CADDECLDLX020

 CADDECLDLX021

 CADDECLDLX022

 CADDECLDLX026

 CADDECLDLX027

 CADDEDADNT019

 CADDEDADNT042

 CADDEDADNT043

 CADDEGERLX007

 CADDEGERLX021

 CADDEGERLX022

 CADDEGERLX030

 CADDEGERLX031

 CADHMAPLLX002

 CADHMAPLLX012

 CADHMAPLLX013

 CADHMAPLLX019

 CADHMAPLLX024

 CADHMAPLLX025

 CADHMAPLLX033

 CADHMAPLLX038

 CADHMAPLNT010

 CADHMAPLNT011

 CADHMAPRLX006

 CADHMAPRLX007

 CADHMAPRLX008

 CADHMAPRLX014

 CADHMAPRLX016

 CADHMAPRLX017

 CADHMAPRLX020

 CADHMAPRLX021

 CADHMAPRLX022

 CADHMAPRLX023

 CADHMAPRLX024

 CADHMAPRLX025

 CADHMAPRLX026

 CADHMAPRLX027

 CADHMAPRLX028

 CADHMAPRLX031

 CADHMAPRLX032

 CADHMAPRLX033

 CADHMAPRLX034

 CADHMAPRLX035

 CADHMAPRLX036

 CADHMAPRLX049_

 CADHMAPRLX053

 CADHMAPRLX056

 CADHMAPRLX057

 CADHMAPRLX060

 CADHMAPRNT010

 CADHMAPRNT011

 CADHMDADLX017

 CADHMDADLX021

 CADHMDADLX022

 CADHMDADLX023

 CADHMDADLX024

 CADHMDADLX025

 CADHMDADLX026

 CADHMDADLX027

 CADHMDADLX028

 CADHMDADLX029

 CADHMDADLX030

 CADHMDADLX031

 CADHMDADNT004

 CADHMDADNT009

 CADNPCLDLX1451

 CADNPCLDLX1452

 cadsvaprap003

 cadsvaprap007.intra.caixa.gov.br

 cadsvaprlx227.intra.caixa.gov.br

 cadsvaprlx228.intra.caixa.gov.br

 cadsvaprlx229.intra.caixa.gov.br

 cadsvaprlx231.intra.caixa.gov.br

 cadsvaprlx232.intra.caixa.gov.br

 cadsvaprlx411.intra.caixa.gov.br

 cadsvaprlx412.intra.caixa.gov.br

 CADSVGERLX195

 CADSVGERLX196

 CADSVGERNT185

 CADSVGERNT186

 CADSVGERNT187

 CADSVITRLX243

 CADTQAPLLX030

 CADTQAPLLX031

 CADTQAPLLX037

 CADTQAPLLX038

 CADTQAPLLX039

 CADTQAPLLX046_NEW

 CADTQAPLLX046_OLD

 CADTQAPLNT001

 CADTQAPRLX007

 CADTQAPRLX013

 CADTQAPRLX014

 CADTQAPRLX015

 CADTQAPRLX016

 CADTQAPRLX017

 CADTQAPRLX018

 CADTQAPRLX019

 CADTQAPRLX020

 CADTQAPRLX021

 CADTQAPRLX022

 CADTQAPRLX023

 CADTQAPRLX024

 CADTQAPRNT007_NEW

 CADTQAPRNT010

 CADTQAPRNT012

 CADTQDADLX014

 CADTQDADLX015

 CADTQDADNT005

 CADTQDADNT007

 CBRDEAPLLX010

 CBRDEAPLLX011

 CBRDEAPLLX025

 CBRDEAPLLX042

 CBRDEAPLLX257

 CBRDEAPLLX322

 CBRDEAPLLX336

 CBRDEAPLLX901

 CBRDEAPLLX902

 CBRDEAPLLX903

 CBRDEAPLLX904

 CBRDEAPLLX905

 CBRDEAPLLX906

 CBRDEAPLNT003

 CBRDEAPLNT006

 CBRDEAPLNT073

 CBRDEAPLNT119

 CBRDEAPLNT132

 CBRDEAPLNT143

 CBRDEAPLNT148

 CBRDEAPLNT151

 CBRDEAPLNT152

 CBRDEAPLNT153

 CBRDEAPLNT162

 CBRDEAPR001

 CBRDEAPRLX039

 CBRDEAPRLX046

 CBRDEAPRLX067

 CBRDEAPRLX086_16_JUL

 CBRDEAPRLX087

 CBRDEAPRLX088

 CBRDEAPRLX091

 CBRDEAPRLX139

 CBRDEAPRLX140_NOVA

 CBRDEAPRLX155

 CBRDEAPRLX156

 CBRDEAPRLX167

 CBRDEAPRLX186_NEW

 CBRDEAPRLX186_OLD

 CBRDEAPRLX187_NEW (inaccessible)

 CBRDEAPRLX187_OLD

 CBRDEAPRLX188_NEW (inaccessible)

 CBRDEAPRLX188_OLD

 CBRDEAPRLX189_NEW (inaccessible)

 CBRDEAPRLX189_OLD

 CBRDEAPRNT003

 CBRDEAPRNT059

 CBRDEDADLX047

 CBRDEDADLX048

 CBRDEDADNT012

 CBRHMAPLLX082

 CBRHMAPRLX020

 CBRHMAPRLX022

 CBRHMAPRLX024

 CBRHMAPRLX027

 CBRHMAPRLX029

 CBRHMAPRLX030

 CBRHMAPRNT014

 CBRHMAPRNT015

 CBRHMAPRNT016

 CBRTQAPLLX016_BKP

 CBRTQAPLLX023

 CBRTQAPLLX024

 CBRTQAPLLX025

 CBRTQAPLLX048

 CBRTQAPLLX055

 CBRTQAPLLX056

 CBRTQAPLLX057

 CBRTQAPLLX081

 CBRTQAPLLX107

 CBRTQAPLLX108

 CBRTQAPRLX005

 CBRTQAPRLX006

 CCSDEAPLLX001

 CCSDEAPLLX003

 CCSDEAPRLX001

 CCSHMAPLLX001

 CCSHMAPLNT001

 CCTDEAPLLX007

 CCTDEAPLLX014

 CCTDEAPRLX001

 CCTDEAPRNT002

 CCTDEDADNT008

 CCTHMAPLLX010

 CCTHMAPLNT005

 CCTRPTQSLX001

 CCTTQAPLNT004

 CCTTQAPLNT005

 CCTTQAPLNT006

 CEADECLDLX0003

 CEADECLDLX0004

 CEADECLDLX0005

 CEADECLDLX0006

 ceadecldlx044.nprd.caixa

 coreos_fedoraproject_WO0000070849900

 CRJDEAPLLX022

 CRJDEAPLLX055

 crjdeapllx069

 CRJDEAPRLX038

 CRJDEAPRLX039

 CRJDEAPRLX041

 CRJDEAPRLX081

 CRJDEAPRNT010

 CRJDEDADLX014

 CRJDEDADNT009

 CRJHMAPLLX037

 CRJHMAPLLX041

 CRJHMAPLLX043

 CRJHMAPRLX016

 CRJHMAPRLX022

 CRJHMAPRLX025

 CRJHMAPRLX027

 CRJHMAPRLX040

 CRJHMAPRLX042

 CRJHMAPRLX044

 CRJHMAPRLX063

 CRJHMAPRLX068

 CRJHMDADNT016

 CRJTQAPLLX034

 CRJTQAPRLX006

 CRJTQAPRLX007

 CSPDEAPLLX080

 CSPDEAPLLX081

 CSPDEAPLLX082

 CSPDEAPLLX083

 CSPDEAPLLX084

 CSPDEAPLLX085

 CSPDEAPRLX083

 CSPDEAPRLX084

 CSPDEAPRLX087

 CSPDEDADLX007

 CSPDEGERLX001

 CSPHMAPRLX006

 CSPHMAPRLX011

 CSPTQAPLLX030

 CSPTQAPLLX031

 CSPTQAPLLX032

 CXEXTRLX223

 CXEXTRLX296

 CXEXTRNT070

 DRJHMDADNT002

 DRJHMDADNT003

 DRJHMDADNT004

 DRJHMDADNT005

 DRJHMDADNT008

 okd_teste1

 okd_teste3

 okd_teste4

 okd_teste5

 okd_teste6

 okd_teste7

 okd_teste8

 okd_teste9

 RHEL_CSPDEAPLLX018

 RHEL_SSPDEAPLLX0032

 SBRDEAPLLX103_11_05_26

 SBRDEAPLNT039

 SBRDEAPRLX030

 SBRDEAPRLX031

 SBRHMAPLLX0044

 SBRHMAPRNT017

 SBRHMDADLX062

 SBRTQAPLLX0001

 SBRTQAPLLX0006

 SCTDEAPLLX0029

 SCTDEAPLLX0113

 SCTDEAPLLX0146

 SCTDEAPLLX0149

 SCTDEAPLLX0161

 SCTDEAPLNT0061

 SCTDEDADNT0021

 SCTHMDADLX0002

 SCTHMDADLX0015

 SCTTQAPLLX0025

 SRJDEAPLLX0048

 SRJDEAPLLX072_NEW

 SRJDEAPRNT0008_2019

 SRJDEAPRNT0009_2019

 SRJDEDADLX0004

 SRJDEDADNT030

 SRJHMAPRNT0018

 SRJTQAPRNT0003

 SSPDEAPLLX0016

 SSPDEAPLLX0024

 SSPDEAPLLX0065

 STSDEAPLLX0018_WO0000073866952

 TEMPLATE_RP_FILENET_HMP

 TESTE_ACI_NPCN2

 TESTE_Segurança

 controlm-21.200-AG-DATA-openjdk17-rhel93-v004

 controlm-21.200-AG-DATA-oracli-openjdk17-rhel93-v057

 controlm-21.200-AP-openjdk17-rhel93-v017

 controlm-21.300-AG-DATA-openjdk21-rhel93-v003

 controlm-21.300-AG-openjdk21-rhel93-v023

 controlm-plugins-v9-19-200-openjdk11-rhel79-v007

 controlm-plugins-v9-19-200-teste-openjdk11-rhel79-v009

 controlm9p-openjdk17-rhel93-v006_CLONE

 controlm9p-openjdk17-rhel93-v038_CLONE

 datagrid85-openjdk21-apache24-rhel93-v003

 eap70-jdk8-apache24-rhel79-v006_CLONE

 eap71-openjdk11-apache24-rhel79-v003_CLONE

 eap71-openjdk11-apache24-rhel79-v014

 eap74-openjdk11-apache24-rhel79-v042

 eap74-openjdk11-apache24-rhel79-v043

 eap74-openjdk17-apache24-rhel93-v006_CLONE

 eap74-openjdk8-apache24-rhel79-v018

 eap74-openjdk8-apache24-rhel79-v024

 eap74-openjdk8-apache24-rhel79-v025

 eap74-openjdk8-apache24-rhel93-v002

 eap74-openjdk8-apache24-rhel93-v010

 eap74-openjdk8-apache24-rhel93-v015

 eap80-openjdk17-apache24-rhel93-v005

 eap80-openjdk17-apache24-rhel93-v006

 eap80-openjdk21-apache24-rhel93-v003

 eap80-openjdk21-apache24-rhel93-v004

 RHEL-7.7-v02_Java-8

 RHEL-7.7-v02_Java-8_Clone

 rhel8-v001

 rhel93-v015
CADDEAPLLX2673

Actions
Summary
Monitor
Configure
Permissions
Datastores
Networks
Snapshots
Guest OS

Launch Remote Console 
Launch Web Console
Virtual Machine Details
Actions
Power Status	
 Powered On
Guest OS	 Red Hat Enterprise Linux 9 (64-bit)
VMware Tools	Running, version:12357 (Guest Managed) 
DNS Name (1)	
caddeapllx2673
IP Addresses (2)	
10.116.201.129
fe80::250:56ff:fe82:b8f3
Encryption	Not encrypted
Usage
Last updated: 6/17/26, 2:05 PM

CPU
 24 MHz used
Memory
 40 MB used
Storage
 37.08 GB used
View Stats
VM Hardware
CPU	2 CPU(s), 24 MHz used
Memory	4 GB, 0 GB memory active
Hard disk 1 (of 2)	
32 GB | Thick Provision Lazy Zeroed 
CTCHWNPRDC011_0029
See All Disks
Network adapter 1	
tn-NPRD+NPRD_AUTO_DES_BSB-ap+VL3676-ep+10.116.192.0 (connected) | 00:50:56:82:b8:f3
Compatibility	ESXi 7.0 U2 and later (VM version 19)
Edit
PCI Devices
No PCI devices
Edit
Related Objects
Cluster
 CTC_NPRDXF2488HV7_NPRD
Host
 cadsvgersh538.intra.caixa.gov.br
Resource pool
 RP_TERRAFORM_NPRD
Networks
 tn-NPRD+NPRD_AUTO_DES_BSB-ap+VL3676-ep+10.116.192.0
Storage
 DSC_CTCHWNPRDC011_NPRD
Tags
No tags assigned
Assign
Notes

Gerenciado pelo Packer/Terraform - Esteiras Ageis - ECAPT-BANCARIO-TQS - Template: eap80-openjdk17-apache24-rhel93-v006 - caddeapllx2673.agil.nprd.caixa.gov.br
Edit
Storage Policies
Check Compliance
Custom Attributes
Last Dell PowerProtect Backup	Backup Server=cadsvaprap003.intra.caixa.gov.br, Policy=721e04a9-f8b0-4a9d-a22f-f4886b2437e5, Stage=cdc0c151-07d2-e027-39ab-1387356c4ed6, StartTime=2026-06-17T00:35:23Z, EndTime=2026-06-17T00:36:23Z
Centro de CUSTO	
DATA CRIACAO	
Dell EMC PPDM Upgrade Rollback Type	
Dell VM Direct Engine Cleanup Descriptor	
Dell VM Direct Engine Session	
Funcao	
Responsavel	
SO	
Sistema	
Edit
Snapshots
No snapshot taken
Manage
 PowerProtect

Compute Policies
View all policies
vSphere HA
vSphere HA Protection		Protected 
Proactive HA		Manual
Host failure		Restart VMs
Host Isolation		Disabled
Datastore with Permanent Device Loss		Power off and restart VMs
Datastore with All Paths Down		Power off and restart VMs
Guest not heartbeating		Disabled

Settings

Recent Tasks
Alarms
Task Name

Use left or right key to resize the column
Target

Use left or right key to resize the column
Status

Use left or right key to resize the column
Details

Use left or right key to resize the column
Initiator

Use left or right key to resize the column
Queued For

Use left or right key to resize the column
Start Time

Use left or right key to resize the column
Completion Time

Use left or right key to resize the column
Server

Execute Storage vMotion for Storage DRS
 CADDEDADNT043
 Virtual machine is configured to use a device that prevents the operation: Device 'SCSI controller 1' is a SCSI controller engaged in bus-sharing.
Checking compatibility of the Virtual Machine
System
14 ms
06/17/2026, 2:04:36 PM
06/17/2026, 2:04:37 PM
cadsvgerap030-1.intra.caixa.gov.br
Execute Storage vMotion for Storage DRS
 CADDEDADNT043
 Virtual machine is configured to use a device that prevents the operation: Device 'SCSI controller 1' is a SCSI controller engaged in bus-sharing.
Checking compatibility of the Virtual Machine
System
5 ms
06/17/2026, 2:04:36 PM
06/17/2026, 2:04:37 PM
cadsvgerap030-1.intra.caixa.gov.br
DrmExecute.label
 Completed
System
35 ms
06/17/2026, 2:04:36 PM
06/17/2026, 2:04:36 PM
cadsvgerap030-1.intra.caixa.gov.br
Execute Storage vMotion for Storage DRS
 CADPCINTNT043
 Virtual machine is configured to use a device that prevents the operation: Device 'SCSI controller 1' is a SCSI controller engaged in bus-sharing.
Checking compatibility of the Virtual Machine
System
5 ms
06/17/2026, 2:04:00 PM
06/17/2026, 2:04:02 PM
cadsvgerap027-1.intra.caixa.gov.br
Execute Storage vMotion for Storage DRS
 CADPCINTNT043
 Virtual machine is configured to use a device that prevents the operation: Device 'SCSI controller 1' is a SCSI controller engaged in bus-sharing.
Checking compatibility of the Virtual Machine
System
4 ms
06/17/2026, 2:04:00 PM
06/17/2026, 2:04:02 PM
cadsvgerap027-1.intra.caixa.gov.br
Execute Storage vMotion for Storage DRS
 CADPCINTNT043
 Virtual machine is configured to use a device that prevents the operation: Device 'SCSI controller 1' is a SCSI controller engaged in bus-sharing.
Checking compatibility of the Virtual Machine
System
14 ms
06/17/2026, 2:04:00 PM
06/17/2026, 2:04:02 PM
cadsvgerap027-1.intra.caixa.gov.br
DrmExecute.label
 Completed
System
4 ms
06/17/2026, 2:04:00 PM
06/17/2026, 2:04:00 PM
cadsvgerap027-1.intra.caixa.gov.br
Execute Storage vMotion for Storage DRS
 CCTDCAPLNT0358

43%

Migrating Virtual Machine active state
System
2 ms
06/17/2026, 2:03:28 PM
cadsvgerap029-1.intra.caixa.gov.br
DrmExecute.label
 Completed
System
2 ms
06/17/2026, 2:03:28 PM
06/17/2026, 2:03:28 PM
cadsvgerap029-1.intra.caixa.gov.br
Execute Storage vMotion for Storage DRS
 CCTCOAPLLX053
 Completed
Changing Virtual Machine host and resource pool association
System
3 ms
06/17/2026, 2:03:08 PM
06/17/2026, 2:03:32 PM
cadsvgerap029-1.intra.caixa.gov.br
DrmExecute.label
 Completed
System
4 ms
06/17/2026, 2:03:08 PM
06/17/2026, 2:03:08 PM
cadsvgerap029-1.intra.caixa.gov.br
DrmExecute.label
 Completed
System
5 ms
06/17/2026, 1:58:54 PM
06/17/2026, 1:58:54 PM
cadsvgerap029-1.intra.caixa.gov.br
DrmExecute.label
 Completed
System
2 ms
06/17/2026, 1:58:54 PM
06/17/2026, 1:58:54 PM
cadsvgerap029-1.intra.caixa.gov.br
Apply Storage DRS recommendations
 DSC_CTCHWC001_CEAUS

12%

Reserving resources for operation
CORPCAIXA\p976713
55 ms
06/17/2026, 1:58:54 PM
cadsvgerap029-1.intra.caixa.gov.br
Apply Storage DRS recommendations
 DSC_CTCHWC001_CEAUS

12%

Resources currently in use by other operations. Waiting.
CORPCAIXA\p976713
55 ms
06/17/2026, 1:58:54 PM
cadsvgerap029-1.intra.caixa.gov.br
DrmExecute.label
 Completed
System
3 ms
06/17/2026, 1:58:54 PM
06/17/2026, 1:58:54 PM
cadsvgerap029-1.intra.caixa.gov.br
DrmExecute.label
 Completed
System
3 ms
06/17/2026, 1:58:54 PM
06/17/2026, 1:58:54 PM
cadsvgerap029-1.intra.caixa.gov.br
DrmExecute.label
 Completed
System
3 ms
06/17/2026, 1:58:54 PM
06/17/2026, 1:58:54 PM
cadsvgerap029-1.intra.caixa.gov.br
DrmExecute.label
 Completed
System
2 ms
06/17/2026, 1:58:54 PM
06/17/2026, 1:58:54 PM
cadsvgerap029-1.intra.caixa.gov.br
DrmExecute.label
 Completed
System
2 ms
06/17/2026, 1:58:54 PM
06/17/2026, 1:58:54 PM
cadsvgerap029-1.intra.caixa.gov.br
DrmExecute.label
 Completed
System
5 ms
06/17/2026, 1:58:54 PM
06/17/2026, 1:58:54 PM
cadsvgerap029-1.intra.caixa.gov.br
DrmExecute.label
 Completed
System
5 ms
06/17/2026, 1:58:54 PM
06/17/2026, 1:58:54 PM
cadsvgerap029-1.intra.caixa.gov.br
DrmExecute.label
 Completed
System
5 ms
06/17/2026, 1:58:54 PM
06/17/2026, 1:58:54 PM
cadsvgerap029-1.intra.caixa.gov.br
DrmExecute.label
 Completed
System
4 ms
06/17/2026, 1:58:54 PM
06/17/2026, 1:58:54 PM
cadsvgerap029-1.intra.caixa.gov.br
DrmExecute.label
 Completed
System
3 ms
06/17/2026, 1:58:54 PM
06/17/2026, 1:58:54 PM
cadsvgerap029-1.intra.caixa.gov.br
Manage Columns

All
More Tasks
1 - 25 of 136 items
First Page
Previous Page
1
 / 
6
Next Page
Last Page



