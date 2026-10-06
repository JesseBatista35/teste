Solicitar Armazenamento
----------------------------------------------------
Solicitante: c052958
Centro de Custo: CESOB
Opção NAS: Sistema
Nome Sistema: siccv
Ambiente: TQS
VM da Esteira
Plataforma Armazenamento: OPEN
Tipo de Disco: NAS
Compartilhamento NOVO
Volumetria: 50GB
Custo Mensal: R$ 9,23
Custo Anual: R$ 110,67
----------------------------------------------------
Ponto de Montagem: /siccv
Tipo de Compartilhamento: NFS
Vai se Comunicar com Mainframe: NÃO

---------------------------------
HOSTS ESTEIRA
---------------------------------
Módulo: siccv-batch
Ip Real: 10.116.202.23
Ip de Backup: 10.188.6.225
Hostname: caddeapllx2821.agil.nprd.caixa.gov.br
----------------------------------------------------


Histórico de Informações de Trabalho da Ordem de Trabalho
ID da Ordem de Trabalho	 WO0000081801601
Criado em	 06/10/2026 09:22:09
Criado por	 P768728
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezado(a),

Informamos que sua solicitação foi recebida.

Nosso SLA para atendimento é de até 24h úteis, analisaremos a solicitação para nos certificarmos que o atendimento está dentro do escopo de atuação da nossa equipe.

Caso seja identificado que o atendimento não corresponde ao nosso escopo, a solicitação será redirecionada à equipe responsável.

Novas informações e atualizações serão registradas diretamente nesta WO.

Atte.

Esteira Devops DES TQS NPRD
ID da Ordem de Trabalho	 WO0000081801601
Criado em	 05/10/2026 12:34:07
Criado por	 P722542
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezados,

Realizada a criação do NFS conforme solicitado.

Seguem informações para montagem:
FQDN: hypernprd12.ad.caixa - 10.188.0.0/16
PATH: /fs_siccv

Segue evidência:

 ID                     : 370
 Name                   : fs_siccv
 Capacity               : 50.000GB
 Description            : WO0000081801601
 Available Capacity     : 49.999GB
 Used Capacity Ratio(%) : 0.00

 Share Permission ID  Access Name   Access Type  Share Name
 -------------------  ------------  -----------  ----------
 7189                 10.188.6.225  Read Write   /fs_siccv

At.te,
Vinicius Pires
SONDA/CESTI53/ARMAZENAMENTO
ID da Ordem de Trabalho	 WO0000081801601
Criado em	 05/10/2026 12:14:09
Criado por	 P583155
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezado(a)
Acusamos o recebimento desta WO.
- Informamos que sua solicitação entrou em fila de atendimento.
- Esta demanda será atendida em breve
- Informações futuras serão adicionadas a esta WO.

Att
CESTI53
ID da Ordem de Trabalho	 WO0000081801601
Criado em	 05/10/2026 11:54:01
Criado por	 P776093
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Demanda inicial sem viés de falha, erro, degradação ou esgotamento de infraestrutura, serviço, máquina, armazenamento, rotina ou situação que não esteja na iminência de tornar-se incidente. Previsto atendimento em até 72 horas. [CENTRAL-SID]
ID da Ordem de Trabalho	 WO0000081801601
Criado em	 05/10/2026 07:06:31
Criado por	 Remedy Application Service
Origem de Comunicação	 E-mail
Exibir Acesso	 Interno
Notas	 Este ticket foi criado a partir do sistema de solicitação de serviço.
Impresso por P585600 em Terça-feira, 06/10/2026 09:55:36


2026-10-02T15:56:26.9247463Z ##[debug]Evaluating condition for step: 'Configura Control-M'
2026-10-02T15:56:26.9248285Z ##[debug]Evaluating: succeeded()
2026-10-02T15:56:26.9248529Z ##[debug]Evaluating succeeded:
2026-10-02T15:56:26.9248970Z ##[debug]=> True
2026-10-02T15:56:26.9249272Z ##[debug]Result: True
2026-10-02T15:56:26.9249585Z ##[section]Starting: Configura Control-M
2026-10-02T15:56:26.9253971Z ==============================================================================
2026-10-02T15:56:26.9254101Z Task         : Bash
2026-10-02T15:56:26.9254169Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-10-02T15:56:26.9254287Z Version      : 3.227.0
2026-10-02T15:56:26.9254360Z Author       : Microsoft Corporation
2026-10-02T15:56:26.9254448Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-10-02T15:56:26.9254582Z ==============================================================================
2026-10-02T15:56:26.9634035Z ##[debug]Invoking Method: System.Threading.Tasks.Task <RunAsync>b__9(). Attempt count: 0
2026-10-02T15:56:26.9675748Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-10-02T15:56:27.0390024Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-10-02T15:56:27.0390831Z ##[debug]loading inputs and endpoints
2026-10-02T15:56:27.0394528Z ##[debug]loading INPUT_TARGETTYPE
2026-10-02T15:56:27.0402832Z ##[debug]loading INPUT_FILEPATH
2026-10-02T15:56:27.0403693Z ##[debug]loading INPUT_SCRIPT
2026-10-02T15:56:27.0404195Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-10-02T15:56:27.0404826Z ##[debug]loading INPUT_FAILONSTDERR
2026-10-02T15:56:27.0406560Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-10-02T15:56:27.0407127Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-10-02T15:56:27.0408833Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-10-02T15:56:27.0413370Z ##[debug]loading SECRET_SENHASERVICO
2026-10-02T15:56:27.0414775Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-10-02T15:56:27.0416259Z ##[debug]loading SECRET_TOKEN_INFRAFACIL_MUDANCA
2026-10-02T15:56:27.0417796Z ##[debug]loading SECRET_GRAYLOG_PASSWORD
2026-10-02T15:56:27.0419386Z ##[debug]loading SECRET_ARM_ACCESS_KEY
2026-10-02T15:56:27.0420823Z ##[debug]loading SECRET_ANSIBLE_VAULT
2026-10-02T15:56:27.0421466Z ##[debug]loading SECRET_PW_ISILON
2026-10-02T15:56:27.0422024Z ##[debug]loading SECRET_FORTIFY_PASS
2026-10-02T15:56:27.0422595Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-10-02T15:56:27.0423158Z ##[debug]loading SECRET_PW_ALOCAIP
2026-10-02T15:56:27.0423707Z ##[debug]loading SECRET_OKD_TOKEN_PRODUTOS
2026-10-02T15:56:27.0424943Z ##[debug]loading SECRET_CV_SENHAORACLE
2026-10-02T15:56:27.0425476Z ##[debug]loading SECRET_AZPAT
2026-10-02T15:56:27.0426116Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-10-02T15:56:27.0427430Z ##[debug]loading SECRET_TERRAFORM_ESX_PASSWORD
2026-10-02T15:56:27.0427839Z ##[debug]loading SECRET_TOKEN_CRQ
2026-10-02T15:56:27.0428407Z ##[debug]loaded 24
2026-10-02T15:56:27.0432563Z ##[debug]Agent.ProxyUrl=undefined
2026-10-02T15:56:27.0433019Z ##[debug]Agent.CAInfo=undefined
2026-10-02T15:56:27.0433280Z ##[debug]Agent.ClientCert=undefined
2026-10-02T15:56:27.0433801Z ##[debug]Agent.SkipCertValidation=True
2026-10-02T15:56:27.0448834Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-10-02T15:56:27.0450962Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-10-02T15:56:27.0451297Z ##[debug]system.culture=en-US
2026-10-02T15:56:27.0459700Z ##[debug]failOnStderr=false
2026-10-02T15:56:27.0460268Z ##[debug]workingDirectory=/opt/ads-agent/_work/r19036/a
2026-10-02T15:56:27.0460682Z ##[debug]check path : /opt/ads-agent/_work/r19036/a
2026-10-02T15:56:27.0461645Z ##[debug]targetType=inline
2026-10-02T15:56:27.0462063Z ##[debug]bashEnvValue=undefined
2026-10-02T15:56:27.0462909Z ##[debug]script=REPO=$(echo _SICCV-batch | sed 's/_//')
ansible-playbook /opt/ads-agent/_work/r19036/a/esteira-jboss-vm-v2/site.yml --tags controlm,nfs --skip-tags "vm,dns,monitoracao,apache,git_conf,jboss,restart_jboss,stop_jboss,tsm" -e sistema_ambiente=tqs -e sistema_nome=SICCV-batch -e site=ctc_nprd -e centralizadora_operacoes=7261 -e centralizadora_desenvolvimento=7266 -e default_working_directory_tfs=/opt/ads-agent/_work/r19036/a -e build_repository_name_tfs=$REPO -e CTMSHOST=crjdeaprlx038 -e CTMPERMHOSTS=crjdeaprlx038,crjdeaprlx039 -e ATCMNDATA=18007 -e AGCMNDATA=18008
2026-10-02T15:56:27.0471214Z Generating script.
2026-10-02T15:56:27.0472925Z ##[debug]which 'bash'
2026-10-02T15:56:27.0478946Z ##[debug]found: '/bin/bash'
2026-10-02T15:56:27.0479335Z ##[debug]Agent.Version=3.225.2
2026-10-02T15:56:27.0479736Z ##[debug]agent.tempDirectory=/opt/ads-agent/_work/_temp
2026-10-02T15:56:27.0480122Z ##[debug]check path : /opt/ads-agent/_work/_temp
2026-10-02T15:56:27.0481586Z ========================== Starting Command Output ===========================
2026-10-02T15:56:27.0482645Z ##[debug]which '/bin/bash'
2026-10-02T15:56:27.0483487Z ##[debug]found: '/bin/bash'
2026-10-02T15:56:27.0484314Z ##[debug]/bin/bash arg: /opt/ads-agent/_work/_temp/51992cb2-6efa-489d-988a-92de1936c8bc.sh
2026-10-02T15:56:27.0486521Z ##[debug]exec tool: /bin/bash
2026-10-02T15:56:27.0487255Z ##[debug]arguments:
2026-10-02T15:56:27.0487575Z ##[debug]   /opt/ads-agent/_work/_temp/51992cb2-6efa-489d-988a-92de1936c8bc.sh
2026-10-02T15:56:27.0488734Z [command]/bin/bash /opt/ads-agent/_work/_temp/51992cb2-6efa-489d-988a-92de1936c8bc.sh
2026-10-02T15:56:29.2860997Z 
2026-10-02T15:56:29.2861702Z PLAY [local] *******************************************************************
2026-10-02T15:56:29.3152517Z 
2026-10-02T15:56:29.3153190Z PLAY [Configurando o DNS] ******************************************************
2026-10-02T15:56:29.5130194Z 
2026-10-02T15:56:29.5130709Z PLAY [local] *******************************************************************
2026-10-02T15:56:29.5214369Z 
2026-10-02T15:56:29.5215299Z PLAY [Verificando serviços] ****************************************************
2026-10-02T15:56:29.5267791Z 
2026-10-02T15:56:29.5268213Z PLAY [Configuração LDAP] *******************************************************
2026-10-02T15:56:29.5303782Z [WARNING]: Found variable using reserved name: when
2026-10-02T15:56:29.5309057Z 
2026-10-02T15:56:29.5309254Z PLAY [jboss] *******************************************************************
2026-10-02T15:56:29.5407657Z 
2026-10-02T15:56:29.5408199Z PLAY [Stack Jboss] *************************************************************
2026-10-02T15:56:29.5435868Z 
2026-10-02T15:56:29.5436218Z PLAY [jboss] *******************************************************************
2026-10-02T15:56:29.5476756Z 
2026-10-02T15:56:29.5477043Z PLAY [jboss] *******************************************************************
2026-10-02T15:56:29.5763567Z Friday 02 October 2026  12:56:29 -0300 (0:00:00.351)       0:00:00.351 ******** 
2026-10-02T15:56:30.1922138Z 
2026-10-02T15:56:30.1922661Z TASK [Verifica se o arquivo nfs_config.json existe] ****************************
2026-10-02T15:56:30.1922848Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-02T15:56:30.1938222Z Friday 02 October 2026  12:56:30 -0300 (0:00:00.617)       0:00:00.969 ******** 
2026-10-02T15:56:30.2502392Z included: /opt/ads-agent/_work/r19036/a/esteira-jboss-vm-v2/roles/nfs/tasks/get_nfs.yml for caddeapllx2821.agil.nprd.caixa.gov.br
2026-10-02T15:56:30.2550676Z Friday 02 October 2026  12:56:30 -0300 (0:00:00.061)       0:00:01.030 ******** 
2026-10-02T15:56:30.3181591Z 
2026-10-02T15:56:30.3182363Z TASK [nfs : Criar variáveis] ***************************************************
2026-10-02T15:56:30.3182587Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-02T15:56:30.3229345Z Friday 02 October 2026  12:56:30 -0300 (0:00:00.067)       0:00:01.098 ******** 
2026-10-02T15:56:30.8362826Z 
2026-10-02T15:56:30.8366468Z TASK [nfs : Coletar variáveis de ambiente] *************************************
2026-10-02T15:56:30.8368163Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-02T15:56:30.8399206Z Friday 02 October 2026  12:56:30 -0300 (0:00:00.517)       0:00:01.615 ******** 
2026-10-02T15:56:30.8971702Z 
2026-10-02T15:56:30.8972198Z TASK [nfs : Exibir resultado em JSON] ******************************************
2026-10-02T15:56:30.8975264Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br] => {
2026-10-02T15:56:30.8975443Z     "nfs_vars_json": {
2026-10-02T15:56:30.8975560Z         "changed": false, 
2026-10-02T15:56:30.8975885Z         "cmd": "cat /opt/ads-agent/_work/r19036/a/nfs_config.json", 
2026-10-02T15:56:30.8976042Z         "delta": "0:00:00.047009", 
2026-10-02T15:56:30.8976229Z         "end": "2026-10-02 12:56:30.818504", 
2026-10-02T15:56:30.8977795Z         "failed": false, 
2026-10-02T15:56:30.8977956Z         "rc": 0, 
2026-10-02T15:56:30.8978366Z         "start": "2026-10-02 12:56:30.771495", 
2026-10-02T15:56:30.8978486Z         "stderr": "", 
2026-10-02T15:56:30.8978598Z         "stderr_lines": [], 
2026-10-02T15:56:30.8978768Z         "stdout": "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SICCV\",\"NFS_MOUNT_POINT_ISILON\": \"/SICCV\"}]", 
2026-10-02T15:56:30.8978952Z         "stdout_lines": [
2026-10-02T15:56:30.8979745Z             "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SICCV\",\"NFS_MOUNT_POINT_ISILON\": \"/SICCV\"}]"
2026-10-02T15:56:30.8979909Z         ]
2026-10-02T15:56:30.8980003Z     }
2026-10-02T15:56:30.8980097Z }
2026-10-02T15:56:30.9008260Z Friday 02 October 2026  12:56:30 -0300 (0:00:00.060)       0:00:01.676 ******** 
2026-10-02T15:56:30.9616852Z 
2026-10-02T15:56:30.9618298Z TASK [nfs : Criar variáveis] ***************************************************
2026-10-02T15:56:30.9618884Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-02T15:56:30.9665870Z Friday 02 October 2026  12:56:30 -0300 (0:00:00.065)       0:00:01.742 ******** 
2026-10-02T15:56:33.4865245Z 
2026-10-02T15:56:33.4865681Z TASK [nfs : execute montagem script] *******************************************
2026-10-02T15:56:33.4865896Z changed: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-02T15:56:33.4929736Z Friday 02 October 2026  12:56:33 -0300 (0:00:02.524)       0:00:04.266 ******** 
2026-10-02T15:56:33.5530215Z 
2026-10-02T15:56:33.5531482Z TASK [nfs : ansible.builtin.debug] *********************************************
2026-10-02T15:56:33.5534475Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br] => {
2026-10-02T15:56:33.5534754Z     "changed": false, 
2026-10-02T15:56:33.5534968Z     "msg": {
2026-10-02T15:56:33.5535162Z         "changed": true, 
2026-10-02T15:56:33.5535326Z         "cmd": [
2026-10-02T15:56:33.5535489Z             "python", 
2026-10-02T15:56:33.5535932Z             "/opt/ads-agent/_work/r19036/a/esteira-jboss-vm-v2/roles/nfs/files/nfs.py", 
2026-10-02T15:56:33.5536134Z             "montagem", 
2026-10-02T15:56:33.5536272Z             "SICCV-batch", 
2026-10-02T15:56:33.5536377Z             "tqs", 
2026-10-02T15:56:33.5536478Z             "ctc_nprd", 
2026-10-02T15:56:33.5536673Z             "/opt/ads-agent/_work/r19036/a/esteira-jboss-vm-v2", 
2026-10-02T15:56:33.5536800Z             "C&t@d02", 
2026-10-02T15:56:33.5536993Z             "***", 
2026-10-02T15:56:33.5537165Z             "s736651@corp.caixa.gov.br", 
2026-10-02T15:56:33.5537336Z             "***", 
2026-10-02T15:56:33.5537563Z             "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SICCV\",\"NFS_MOUNT_POINT_ISILON\": \"/SICCV\"}]"
2026-10-02T15:56:33.5537783Z         ], 
2026-10-02T15:56:33.5537966Z         "delta": "0:00:02.133755", 
2026-10-02T15:56:33.5538385Z         "end": "2026-10-02 12:56:33.464020", 
2026-10-02T15:56:33.5538587Z         "failed": false, 
2026-10-02T15:56:33.5538738Z         "rc": 0, 
2026-10-02T15:56:33.5538988Z         "start": "2026-10-02 12:56:31.330265", 
2026-10-02T15:56:33.5539173Z         "stderr": "", 
2026-10-02T15:56:33.5539342Z         "stderr_lines": [], 
2026-10-02T15:56:33.5541462Z         "stdout": "[{u'NFS_MOUNT_POINT_ISILON': u'/SICCV', u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SICCV'}]\nNome                                Endpoint                            Mountpoint                          Tipo                                Ip                                  Ambiente                           \n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SICCV /SICCV                              ISILON                              nfsctcnprd.ctc.caixa                tqs                                \nException when callin ProtocolsApi->get_nfs_expor: (500)\nReason: Internal Server Error\nHTTP response headers: HTTPHeaderDict({'Transfer-Encoding': 'chunked', 'Server': 'Apache', 'Connection': 'close', 'Allow': 'GET, PUT, DELETE, HEAD', 'Date': 'Fri, 02 Oct 2026 15:56:32 GMT', 'X-Frame-Options': 'sameorigin', 'Content-Type': 'application/json'})\nHTTP response body: \n{\n\"errors\" : \n[\n\n{\n\"code\" : \"AEC_EXCEPTION\",\n\"message\" : \"error: empty client name\"\n}\n]\n}\n\n\n\nnfs_path=/SICCV\nnfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SICCV\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SICCV /SICCV                              ISILON                              nfsctcnprd.ctc.caixa                tqs                                ", 
2026-10-02T15:56:33.5542911Z         "stdout_lines": [
2026-10-02T15:56:33.5543333Z             "[{u'NFS_MOUNT_POINT_ISILON': u'/SICCV', u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SICCV'}]", 
2026-10-02T15:56:33.5543623Z             "Nome                                Endpoint                            Mountpoint                          Tipo                                Ip                                  Ambiente                           ", 
2026-10-02T15:56:33.5544157Z             "------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------", 
2026-10-02T15:56:33.5544638Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SICCV /SICCV                              ISILON                              nfsctcnprd.ctc.caixa                tqs                                ", 
2026-10-02T15:56:33.5544974Z             "Exception when callin ProtocolsApi->get_nfs_expor: (500)", 
2026-10-02T15:56:33.5545187Z             "Reason: Internal Server Error", 
2026-10-02T15:56:33.5545764Z             "HTTP response headers: HTTPHeaderDict({'Transfer-Encoding': 'chunked', 'Server': 'Apache', 'Connection': 'close', 'Allow': 'GET, PUT, DELETE, HEAD', 'Date': 'Fri, 02 Oct 2026 15:56:32 GMT', 'X-Frame-Options': 'sameorigin', 'Content-Type': 'application/json'})", 
2026-10-02T15:56:33.5546119Z             "HTTP response body: ", 
2026-10-02T15:56:33.5546258Z             "{", 
2026-10-02T15:56:33.5546410Z             "\"errors\" : ", 
2026-10-02T15:56:33.5546532Z             "[", 
2026-10-02T15:56:33.5546627Z             "", 
2026-10-02T15:56:33.5546722Z             "{", 
2026-10-02T15:56:33.5546824Z             "\"code\" : \"AEC_EXCEPTION\",", 
2026-10-02T15:56:33.5547003Z             "\"message\" : \"error: empty client name\"", 
2026-10-02T15:56:33.5547173Z             "}", 
2026-10-02T15:56:33.5547264Z             "]", 
2026-10-02T15:56:33.5547368Z             "}", 
2026-10-02T15:56:33.5547505Z             "", 
2026-10-02T15:56:33.5547629Z             "", 
2026-10-02T15:56:33.5547760Z             "", 
2026-10-02T15:56:33.5547931Z             "nfs_path=/SICCV", 
2026-10-02T15:56:33.5548310Z             "nfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SICCV", 
2026-10-02T15:56:33.5548630Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SICCV /SICCV                              ISILON                              nfsctcnprd.ctc.caixa                tqs                                "
2026-10-02T15:56:33.5548994Z         ]
2026-10-02T15:56:33.5549122Z     }
2026-10-02T15:56:33.5549252Z }
2026-10-02T15:56:33.5569134Z Friday 02 October 2026  12:56:33 -0300 (0:00:00.066)       0:00:04.332 ******** 
2026-10-02T15:56:33.9126662Z 
2026-10-02T15:56:33.9127659Z TASK [nfs : execute clean json] ************************************************
2026-10-02T15:56:33.9130563Z [DEPRECATION WARNING]: Distribution rhel 9.3 on host 
2026-10-02T15:56:33.9131601Z caddeapllx2821.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, 
2026-10-02T15:56:33.9131853Z but is using /usr/bin/python for backward compatibility with prior Ansible 
2026-10-02T15:56:33.9132024Z releases. A future Ansible release will default to using the discovered 
2026-10-02T15:56:33.9132196Z platform python for this host. See https://docs.ansible.com/ansible/2.9/referen
2026-10-02T15:56:33.9132375Z ce_appendices/interpreter_discovery.html for more information. This feature 
2026-10-02T15:56:33.9132633Z will be removed in version 2.12. Deprecation warnings can be disabled by 
2026-10-02T15:56:33.9132837Z setting deprecation_warnings=False in ansible.cfg.
2026-10-02T15:56:33.9132993Z changed: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-02T15:56:33.9169447Z Friday 02 October 2026  12:56:33 -0300 (0:00:00.359)       0:00:04.692 ******** 
2026-10-02T15:56:33.9767532Z 
2026-10-02T15:56:33.9768596Z TASK [nfs : result_new_string_json] ********************************************
2026-10-02T15:56:33.9771531Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br] => {
2026-10-02T15:56:33.9771887Z     "msg": {
2026-10-02T15:56:33.9772458Z         "ansible_facts": {
2026-10-02T15:56:33.9772709Z             "discovered_interpreter_python": "/usr/bin/python"
2026-10-02T15:56:33.9772842Z         }, 
2026-10-02T15:56:33.9772950Z         "changed": true, 
2026-10-02T15:56:33.9773623Z         "cmd": "echo '[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SICCV\",\"NFS_MOUNT_POINT_ISILON\": \"/SICCV\"}]' | sed 's/NFS_ENDPOINT_ISILON[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_ISILON[^\"]*/NFS_MOUNT_POINT/g; s/NFS_ENDPOINT_HUAWEI[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_HUAWEI[^\"]*/NFS_MOUNT_POINT/g; s/NFS_ENDPOINT_VM[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_VM[^\"]*/NFS_MOUNT_POINT/g'", 
2026-10-02T15:56:33.9774247Z         "delta": "0:00:00.003847", 
2026-10-02T15:56:33.9774369Z         "deprecations": [
2026-10-02T15:56:33.9774469Z             {
2026-10-02T15:56:33.9775013Z                 "msg": "Distribution rhel 9.3 on host caddeapllx2821.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, but is using /usr/bin/python for backward compatibility with prior Ansible releases. A future Ansible release will default to using the discovered platform python for this host. See https://docs.ansible.com/ansible/2.9/reference_appendices/interpreter_discovery.html for more information", 
2026-10-02T15:56:33.9775314Z                 "version": "2.12"
2026-10-02T15:56:33.9775423Z             }
2026-10-02T15:56:33.9775517Z         ], 
2026-10-02T15:56:33.9775687Z         "end": "2026-10-02 12:56:33.895092", 
2026-10-02T15:56:33.9775807Z         "failed": false, 
2026-10-02T15:56:33.9775913Z         "rc": 0, 
2026-10-02T15:56:33.9776073Z         "start": "2026-10-02 12:56:33.891245", 
2026-10-02T15:56:33.9776191Z         "stderr": "", 
2026-10-02T15:56:33.9776302Z         "stderr_lines": [], 
2026-10-02T15:56:33.9776465Z         "stdout": "[{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SICCV\",\"NFS_MOUNT_POINT\": \"/SICCV\"}]", 
2026-10-02T15:56:33.9776623Z         "stdout_lines": [
2026-10-02T15:56:33.9776777Z             "[{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SICCV\",\"NFS_MOUNT_POINT\": \"/SICCV\"}]"
2026-10-02T15:56:33.9776909Z         ]
2026-10-02T15:56:33.9776999Z     }
2026-10-02T15:56:33.9777188Z }
2026-10-02T15:56:33.9802111Z Friday 02 October 2026  12:56:33 -0300 (0:00:00.063)       0:00:04.756 ******** 
2026-10-02T15:56:34.0406849Z 
2026-10-02T15:56:34.0407425Z TASK [nfs : Parse JSON data] ***************************************************
2026-10-02T15:56:34.0407612Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-02T15:56:34.0437692Z Friday 02 October 2026  12:56:34 -0300 (0:00:00.063)       0:00:04.819 ******** 
2026-10-02T15:56:34.1039720Z 
2026-10-02T15:56:34.1040355Z TASK [nfs : result_new_json] ***************************************************
2026-10-02T15:56:34.1040785Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br] => {
2026-10-02T15:56:34.1040967Z     "msg": [
2026-10-02T15:56:34.1041109Z         {
2026-10-02T15:56:34.1041310Z             "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SICCV", 
2026-10-02T15:56:34.1041529Z             "NFS_MOUNT_POINT": "/SICCV"
2026-10-02T15:56:34.1041665Z         }
2026-10-02T15:56:34.1041796Z     ]
2026-10-02T15:56:34.1042033Z }
2026-10-02T15:56:34.1069887Z Friday 02 October 2026  12:56:34 -0300 (0:00:00.063)       0:00:04.882 ******** 
2026-10-02T15:56:34.1720757Z included: /opt/ads-agent/_work/r19036/a/esteira-jboss-vm-v2/roles/nfs/tasks/stack_nfs.yml for caddeapllx2821.agil.nprd.caixa.gov.br
2026-10-02T15:56:34.1781367Z Friday 02 October 2026  12:56:34 -0300 (0:00:00.071)       0:00:04.954 ******** 
2026-10-02T15:56:34.2356804Z 
2026-10-02T15:56:34.2357750Z TASK [nfs : Parse JSON data] ***************************************************
2026-10-02T15:56:34.2358007Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-02T15:56:34.2398888Z Friday 02 October 2026  12:56:34 -0300 (0:00:00.061)       0:00:05.015 ******** 
2026-10-02T15:56:34.2974442Z 
2026-10-02T15:56:34.2975111Z TASK [nfs : debug] *************************************************************
2026-10-02T15:56:34.2975388Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br] => {
2026-10-02T15:56:34.2975631Z     "msg": {
2026-10-02T15:56:34.2975867Z         "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SICCV", 
2026-10-02T15:56:34.2976117Z         "NFS_MOUNT_POINT": "/SICCV"
2026-10-02T15:56:34.2976285Z     }
2026-10-02T15:56:34.2976436Z }
2026-10-02T15:56:34.3010411Z Friday 02 October 2026  12:56:34 -0300 (0:00:00.061)       0:00:05.076 ******** 
2026-10-02T15:56:34.3573319Z 
2026-10-02T15:56:34.3573903Z TASK [nfs : debug] *************************************************************
2026-10-02T15:56:34.3574196Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br] => {
2026-10-02T15:56:34.3574408Z     "msg": "/SICCV"
2026-10-02T15:56:34.3574556Z }
2026-10-02T15:56:34.3611441Z Friday 02 October 2026  12:56:34 -0300 (0:00:00.060)       0:00:05.136 ******** 
2026-10-02T15:56:34.4212755Z 
2026-10-02T15:56:34.4213283Z TASK [nfs : debug] *************************************************************
2026-10-02T15:56:34.4213455Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br] => {
2026-10-02T15:56:34.4215488Z     "msg": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SICCV"
2026-10-02T15:56:34.4216634Z }
2026-10-02T15:56:34.4247636Z Friday 02 October 2026  12:56:34 -0300 (0:00:00.063)       0:00:05.200 ******** 
2026-10-02T15:56:34.4855068Z 
2026-10-02T15:56:34.4855958Z TASK [nfs : Verificando as variaveis] ******************************************
2026-10-02T15:56:34.4856588Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br] => {
2026-10-02T15:56:34.4856803Z     "changed": false, 
2026-10-02T15:56:34.4856921Z     "msg": "All assertions passed"
2026-10-02T15:56:34.4857021Z }
2026-10-02T15:56:34.4888532Z Friday 02 October 2026  12:56:34 -0300 (0:00:00.064)       0:00:05.264 ******** 
2026-10-02T15:56:38.0415557Z 
2026-10-02T15:56:38.0416066Z TASK [nfs : Instalando o NFS Client] *******************************************
2026-10-02T15:56:38.0416491Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-02T15:56:38.0455069Z Friday 02 October 2026  12:56:38 -0300 (0:00:03.556)       0:00:08.821 ******** 
2026-10-02T15:56:38.8137440Z 
2026-10-02T15:56:38.8140021Z TASK [nfs : Install networker lgtoclnt_url] ************************************
2026-10-02T15:56:38.8140713Z [WARNING]: Consider using the yum, dnf or zypper module rather than running
2026-10-02T15:56:38.8141218Z 'rpm'.  If you need to use command because yum, dnf or zypper is insufficient
2026-10-02T15:56:38.8141595Z you can add 'warn: false' to this command task or set 'command_warnings=False'
2026-10-02T15:56:38.8141856Z in ansible.cfg to get rid of this message.
2026-10-02T15:56:38.8143888Z fatal: [caddeapllx2821.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.505557", "end": "2026-10-02 12:56:38.795725", "msg": "non-zero return code", "rc": 1, "start": "2026-10-02 12:56:38.290168", "stderr": "aviso: /var/tmp/rpm-tmp.ANmsWI: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.ANmsWI: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm\nVerifying...                          ########################################\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm", "Verifying...                          ########################################", "Preparando...                         ########################################"]}
2026-10-02T15:56:38.8144891Z ...ignoring
2026-10-02T15:56:38.8178384Z Friday 02 October 2026  12:56:38 -0300 (0:00:00.772)       0:00:09.593 ******** 
2026-10-02T15:56:39.5216552Z 
2026-10-02T15:56:39.5217084Z TASK [nfs : Install networker lgtonmda_url] ************************************
2026-10-02T15:56:39.5222406Z fatal: [caddeapllx2821.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.449008", "end": "2026-10-02 12:56:39.504945", "msg": "non-zero return code", "rc": 1, "start": "2026-10-02 12:56:39.055937", "stderr": "aviso: /var/tmp/rpm-tmp.Dvev8t: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.Dvev8t: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm\nVerifying...                          ########################################\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm", "Verifying...                          ########################################", "Preparando...                         ########################################"]}
2026-10-02T15:56:39.5223410Z ...ignoring
2026-10-02T15:56:39.5258200Z Friday 02 October 2026  12:56:39 -0300 (0:00:00.707)       0:00:10.301 ******** 
2026-10-02T15:56:39.9602982Z 
2026-10-02T15:56:39.9603710Z TASK [nfs : Remove pacote jbcs-httpd] ******************************************
2026-10-02T15:56:39.9603888Z changed: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-02T15:56:39.9646063Z Friday 02 October 2026  12:56:39 -0300 (0:00:00.438)       0:00:10.740 ******** 
2026-10-02T15:56:40.2245181Z 
2026-10-02T15:56:40.2245643Z TASK [nfs : Create a symbolic link] ********************************************
2026-10-02T15:56:40.2245815Z changed: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-02T15:56:40.2282684Z Friday 02 October 2026  12:56:40 -0300 (0:00:00.263)       0:00:11.004 ******** 
2026-10-02T15:56:41.1403750Z 
2026-10-02T15:56:41.1404420Z TASK [nfs : Networker | Start networker] ***************************************
2026-10-02T15:56:41.1405085Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-02T15:56:41.1450353Z Friday 02 October 2026  12:56:41 -0300 (0:00:00.916)       0:00:11.920 ******** 
2026-10-02T15:56:41.4088824Z 
2026-10-02T15:56:41.4089418Z TASK [nfs : Executar o comando abaixo para limitar as portas] ******************
2026-10-02T15:56:41.4089700Z changed: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-02T15:56:41.4124201Z Friday 02 October 2026  12:56:41 -0300 (0:00:00.267)       0:00:12.188 ******** 
2026-10-02T15:56:51.8030056Z 
2026-10-02T15:56:51.8030572Z TASK [nfs : Networker | Restart networker] *************************************
2026-10-02T15:56:51.8030743Z changed: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-02T15:56:51.8061765Z Friday 02 October 2026  12:56:51 -0300 (0:00:10.393)       0:00:22.582 ******** 
2026-10-02T15:59:55.1462216Z 
2026-10-02T15:59:55.1462846Z TASK [nfs : Montando volume remoto] ********************************************
2026-10-02T15:59:55.1463116Z fatal: [caddeapllx2821.agil.nprd.caixa.gov.br]: FAILED! => {"changed": false, "msg": "Error mounting /SICCV: mount.nfs: Connection timed out\n"}
2026-10-02T15:59:55.1463889Z ...ignoring
2026-10-02T15:59:55.1490647Z Friday 02 October 2026  12:59:55 -0300 (0:03:03.342)       0:03:25.924 ******** 
2026-10-02T15:59:55.2196026Z 
2026-10-02T15:59:55.2196537Z TASK [nfs : Validando Montagem] ************************************************
2026-10-02T15:59:55.2198643Z fatal: [caddeapllx2821.agil.nprd.caixa.gov.br]: FAILED! => {
2026-10-02T15:59:55.2199317Z     "assertion": "'Connection refused' in mountnfs.msg", 
2026-10-02T15:59:55.2199508Z     "changed": false, 
2026-10-02T15:59:55.2199685Z     "evaluated_to": false, 
2026-10-02T15:59:55.2200462Z     "msg": "Erro desconhecido: Error mounting /SICCV: mount.nfs: Connection timed out\n"
2026-10-02T15:59:55.2201003Z }
2026-10-02T15:59:55.2205625Z 
2026-10-02T15:59:55.2205839Z PLAY RECAP *********************************************************************
2026-10-02T15:59:55.2206115Z caddeapllx2821.agil.nprd.caixa.gov.br : ok=27   changed=8    unreachable=0    failed=1    skipped=0    rescued=0    ignored=3   
2026-10-02T15:59:55.2206207Z 
2026-10-02T15:59:55.2206734Z Friday 02 October 2026  12:59:55 -0300 (0:00:00.071)       0:03:25.996 ******** 
2026-10-02T15:59:55.2207273Z =============================================================================== 
2026-10-02T15:59:55.2210668Z nfs : Montando volume remoto ------------------------------------------ 183.34s
2026-10-02T15:59:55.2211071Z nfs : Networker | Restart networker ------------------------------------ 10.39s
2026-10-02T15:59:55.2211301Z nfs : Instalando o NFS Client ------------------------------------------- 3.56s
2026-10-02T15:59:55.2211551Z nfs : execute montagem script ------------------------------------------- 2.52s
2026-10-02T15:59:55.2211772Z nfs : Networker | Start networker --------------------------------------- 0.92s
2026-10-02T15:59:55.2211997Z nfs : Install networker lgtoclnt_url ------------------------------------ 0.77s
2026-10-02T15:59:55.2212228Z nfs : Install networker lgtonmda_url ------------------------------------ 0.71s
2026-10-02T15:59:55.2212440Z Verifica se o arquivo nfs_config.json existe ---------------------------- 0.62s
2026-10-02T15:59:55.2212685Z nfs : Coletar variáveis de ambiente ------------------------------------- 0.52s
2026-10-02T15:59:55.2212915Z nfs : Remove pacote jbcs-httpd ------------------------------------------ 0.44s
2026-10-02T15:59:55.2213136Z nfs : execute clean json ------------------------------------------------ 0.36s
2026-10-02T15:59:55.2213358Z nfs : Executar o comando abaixo para limitar as portas ------------------ 0.27s
2026-10-02T15:59:55.2213584Z nfs : Create a symbolic link -------------------------------------------- 0.26s
2026-10-02T15:59:55.2213800Z nfs : Validando Montagem ------------------------------------------------ 0.07s
2026-10-02T15:59:55.2214020Z nfs : include_tasks ----------------------------------------------------- 0.07s
2026-10-02T15:59:55.2214339Z nfs : Criar variáveis --------------------------------------------------- 0.07s
2026-10-02T15:59:55.2214558Z nfs : ansible.builtin.debug --------------------------------------------- 0.07s
2026-10-02T15:59:55.2214770Z nfs : Criar variáveis --------------------------------------------------- 0.07s
2026-10-02T15:59:55.2214996Z nfs : Verificando as variaveis ------------------------------------------ 0.06s
2026-10-02T15:59:55.2215213Z nfs : result_new_string_json -------------------------------------------- 0.06s
2026-10-02T15:59:55.2215360Z Playbook run took 0 days, 0 hours, 3 minutes, 25 seconds
2026-10-02T15:59:55.2911617Z ##[debug]Exit code 2 received from tool '/bin/bash'
2026-10-02T15:59:55.2912010Z ##[debug]STDIO streams have closed for tool '/bin/bash'
2026-10-02T15:59:55.2947132Z ##[error]Bash exited with code '2'.
2026-10-02T15:59:55.2947826Z ##[debug]Processed: ##vso[task.issue type=error;]Bash exited with code '2'.
2026-10-02T15:59:55.2948578Z ##[debug]task result: Failed
2026-10-02T15:59:55.2949644Z ##[debug]Processed: ##vso[task.complete result=Failed;done=true;]
2026-10-02T15:59:55.2951079Z ##[warning]RetryHelper encountered task failure, will retry (attempt #: 1 out of 2) after 1000 ms
2026-10-02T15:59:56.2956270Z ##[debug]PERF: RetryHelper Method:System.Threading.Tasks.Task <RunAsync>b__9() : took 209332.1819 ms
2026-10-02T15:59:56.2956724Z ##[debug]PERF WARNING: RetryHelper Method:System.Threading.Tasks.Task <RunAsync>b__9() : took 209332.1819 ms
2026-10-02T15:59:56.2960047Z ##[debug]Invoking Method: System.Threading.Tasks.Task <RunAsync>b__9(). Attempt count: 1
2026-10-02T15:59:56.3032013Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-10-02T15:59:56.3753020Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-10-02T15:59:56.3760863Z ##[debug]loading inputs and endpoints
2026-10-02T15:59:56.3764340Z ##[debug]loading INPUT_TARGETTYPE
2026-10-02T15:59:56.3772482Z ##[debug]loading INPUT_FILEPATH
2026-10-02T15:59:56.3773931Z ##[debug]loading INPUT_SCRIPT
2026-10-02T15:59:56.3774429Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-10-02T15:59:56.3774992Z ##[debug]loading INPUT_FAILONSTDERR
2026-10-02T15:59:56.3777222Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-10-02T15:59:56.3777636Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-10-02T15:59:56.3778865Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-10-02T15:59:56.3783848Z ##[debug]loading SECRET_SENHASERVICO
2026-10-02T15:59:56.3785330Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-10-02T15:59:56.3786893Z ##[debug]loading SECRET_TOKEN_INFRAFACIL_MUDANCA
2026-10-02T15:59:56.3788679Z ##[debug]loading SECRET_GRAYLOG_PASSWORD
2026-10-02T15:59:56.3790024Z ##[debug]loading SECRET_ARM_ACCESS_KEY
2026-10-02T15:59:56.3791784Z ##[debug]loading SECRET_ANSIBLE_VAULT
2026-10-02T15:59:56.3792469Z ##[debug]loading SECRET_PW_ISILON
2026-10-02T15:59:56.3793020Z ##[debug]loading SECRET_FORTIFY_PASS
2026-10-02T15:59:56.3793645Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-10-02T15:59:56.3794269Z ##[debug]loading SECRET_PW_ALOCAIP
2026-10-02T15:59:56.3794785Z ##[debug]loading SECRET_OKD_TOKEN_PRODUTOS
2026-10-02T15:59:56.3796004Z ##[debug]loading SECRET_CV_SENHAORACLE
2026-10-02T15:59:56.3796660Z ##[debug]loading SECRET_AZPAT
2026-10-02T15:59:56.3797262Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-10-02T15:59:56.3798600Z ##[debug]loading SECRET_TERRAFORM_ESX_PASSWORD
2026-10-02T15:59:56.3799171Z ##[debug]loading SECRET_TOKEN_CRQ
2026-10-02T15:59:56.3799661Z ##[debug]loaded 24
2026-10-02T15:59:56.3804001Z ##[debug]Agent.ProxyUrl=undefined
2026-10-02T15:59:56.3804503Z ##[debug]Agent.CAInfo=undefined
2026-10-02T15:59:56.3804955Z ##[debug]Agent.ClientCert=undefined
2026-10-02T15:59:56.3805286Z ##[debug]Agent.SkipCertValidation=True
2026-10-02T15:59:56.3819881Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-10-02T15:59:56.3821890Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-10-02T15:59:56.3822662Z ##[debug]system.culture=en-US
2026-10-02T15:59:56.3830342Z ##[debug]failOnStderr=false
2026-10-02T15:59:56.3831065Z ##[debug]workingDirectory=/opt/ads-agent/_work/r19036/a
2026-10-02T15:59:56.3831387Z ##[debug]check path : /opt/ads-agent/_work/r19036/a
2026-10-02T15:59:56.3831903Z ##[debug]targetType=inline
2026-10-02T15:59:56.3832120Z ##[debug]bashEnvValue=undefined
2026-10-02T15:59:56.3833514Z ##[debug]script=REPO=$(echo _SICCV-batch | sed 's/_//')
ansible-playbook /opt/ads-agent/_work/r19036/a/esteira-jboss-vm-v2/site.yml --tags controlm,nfs --skip-tags "vm,dns,monitoracao,apache,git_conf,jboss,restart_jboss,stop_jboss,tsm" -e sistema_ambiente=tqs -e sistema_nome=SICCV-batch -e site=ctc_nprd -e centralizadora_operacoes=7261 -e centralizadora_desenvolvimento=7266 -e default_working_directory_tfs=/opt/ads-agent/_work/r19036/a -e build_repository_name_tfs=$REPO -e CTMSHOST=crjdeaprlx038 -e CTMPERMHOSTS=crjdeaprlx038,crjdeaprlx039 -e ATCMNDATA=18007 -e AGCMNDATA=18008
2026-10-02T15:59:56.3842049Z Generating script.
2026-10-02T15:59:56.3843824Z ##[debug]which 'bash'
2026-10-02T15:59:56.3849744Z ##[debug]found: '/bin/bash'
2026-10-02T15:59:56.3850162Z ##[debug]Agent.Version=3.225.2
2026-10-02T15:59:56.3850519Z ##[debug]agent.tempDirectory=/opt/ads-agent/_work/_temp
2026-10-02T15:59:56.3850830Z ##[debug]check path : /opt/ads-agent/_work/_temp
2026-10-02T15:59:56.3852962Z ========================== Starting Command Output ===========================
2026-10-02T15:59:56.3853948Z ##[debug]which '/bin/bash'
2026-10-02T15:59:56.3854797Z ##[debug]found: '/bin/bash'
2026-10-02T15:59:56.3855581Z ##[debug]/bin/bash arg: /opt/ads-agent/_work/_temp/ae7b8088-d2a3-4602-b534-62f82b862e71.sh
2026-10-02T15:59:56.3858245Z ##[debug]exec tool: /bin/bash
2026-10-02T15:59:56.3858536Z ##[debug]arguments:
2026-10-02T15:59:56.3858787Z ##[debug]   /opt/ads-agent/_work/_temp/ae7b8088-d2a3-4602-b534-62f82b862e71.sh
2026-10-02T15:59:56.3860461Z [command]/bin/bash /opt/ads-agent/_work/_temp/ae7b8088-d2a3-4602-b534-62f82b862e71.sh
2026-10-02T15:59:58.5652940Z 
2026-10-02T15:59:58.5653825Z PLAY [local] *******************************************************************
2026-10-02T15:59:58.5933463Z 
2026-10-02T15:59:58.5933976Z PLAY [Configurando o DNS] ******************************************************
2026-10-02T15:59:58.8314181Z 
2026-10-02T15:59:58.8315101Z PLAY [local] *******************************************************************
2026-10-02T15:59:58.8351628Z 
2026-10-02T15:59:58.8352279Z PLAY [Verificando serviços] ****************************************************
2026-10-02T15:59:58.8442082Z 
2026-10-02T15:59:58.8442696Z PLAY [Configuração LDAP] *******************************************************
2026-10-02T15:59:58.8479731Z [WARNING]: Found variable using reserved name: when
2026-10-02T15:59:58.8485099Z 
2026-10-02T15:59:58.8485311Z PLAY [jboss] *******************************************************************
2026-10-02T15:59:58.8582314Z 
2026-10-02T15:59:58.8583050Z PLAY [Stack Jboss] *************************************************************
2026-10-02T15:59:58.8609894Z 
2026-10-02T15:59:58.8610237Z PLAY [jboss] *******************************************************************
2026-10-02T15:59:58.8652522Z 
2026-10-02T15:59:58.8653086Z PLAY [jboss] *******************************************************************
2026-10-02T15:59:58.8949901Z Friday 02 October 2026  12:59:58 -0300 (0:00:00.390)       0:00:00.390 ******** 
2026-10-02T15:59:59.5221440Z 
2026-10-02T15:59:59.5221878Z TASK [Verifica se o arquivo nfs_config.json existe] ****************************
2026-10-02T15:59:59.5223298Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-02T15:59:59.5253859Z Friday 02 October 2026  12:59:59 -0300 (0:00:00.630)       0:00:01.021 ******** 
2026-10-02T15:59:59.5742216Z included: /opt/ads-agent/_work/r19036/a/esteira-jboss-vm-v2/roles/nfs/tasks/get_nfs.yml for caddeapllx2821.agil.nprd.caixa.gov.br
2026-10-02T15:59:59.5782452Z Friday 02 October 2026  12:59:59 -0300 (0:00:00.052)       0:00:01.074 ******** 
2026-10-02T15:59:59.6389212Z 
2026-10-02T15:59:59.6389868Z TASK [nfs : Criar variáveis] ***************************************************
2026-10-02T15:59:59.6390035Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-02T15:59:59.6450102Z Friday 02 October 2026  12:59:59 -0300 (0:00:00.066)       0:00:01.140 ******** 
2026-10-02T16:00:00.1684159Z 
2026-10-02T16:00:00.1685098Z TASK [nfs : Coletar variáveis de ambiente] *************************************
2026-10-02T16:00:00.1685392Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-02T16:00:00.1719487Z Friday 02 October 2026  13:00:00 -0300 (0:00:00.526)       0:00:01.667 ******** 
2026-10-02T16:00:00.2379467Z 
2026-10-02T16:00:00.2380305Z TASK [nfs : Exibir resultado em JSON] ******************************************
2026-10-02T16:00:00.2380640Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br] => {
2026-10-02T16:00:00.2380852Z     "nfs_vars_json": {
2026-10-02T16:00:00.2381047Z         "changed": false, 
2026-10-02T16:00:00.2381546Z         "cmd": "cat /opt/ads-agent/_work/r19036/a/nfs_config.json", 
2026-10-02T16:00:00.2381805Z         "delta": "0:00:00.044234", 
2026-10-02T16:00:00.2382101Z         "end": "2026-10-02 13:00:00.145989", 
2026-10-02T16:00:00.2382309Z         "failed": false, 
2026-10-02T16:00:00.2382485Z         "rc": 0, 
2026-10-02T16:00:00.2382759Z         "start": "2026-10-02 13:00:00.101755", 
2026-10-02T16:00:00.2382971Z         "stderr": "", 
2026-10-02T16:00:00.2383153Z         "stderr_lines": [], 
2026-10-02T16:00:00.2383468Z         "stdout": "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SICCV\",\"NFS_MOUNT_POINT_ISILON\": \"/SICCV\"}]", 
2026-10-02T16:00:00.2383767Z         "stdout_lines": [
2026-10-02T16:00:00.2384108Z             "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SICCV\",\"NFS_MOUNT_POINT_ISILON\": \"/SICCV\"}]"
2026-10-02T16:00:00.2384375Z         ]
2026-10-02T16:00:00.2384532Z     }
2026-10-02T16:00:00.2384684Z }
2026-10-02T16:00:00.2450654Z Friday 02 October 2026  13:00:00 -0300 (0:00:00.070)       0:00:01.737 ******** 
2026-10-02T16:00:00.3169950Z 
2026-10-02T16:00:00.3170657Z TASK [nfs : Criar variáveis] ***************************************************
2026-10-02T16:00:00.3171224Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-02T16:00:00.3224829Z Friday 02 October 2026  13:00:00 -0300 (0:00:00.080)       0:00:01.818 ******** 
2026-10-02T16:00:02.6951731Z 
2026-10-02T16:00:02.6952358Z TASK [nfs : execute montagem script] *******************************************
2026-10-02T16:00:02.6952554Z changed: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-02T16:00:02.6955913Z Friday 02 October 2026  13:00:02 -0300 (0:00:02.373)       0:00:04.191 ******** 
2026-10-02T16:00:02.7857880Z 
2026-10-02T16:00:02.7858949Z TASK [nfs : ansible.builtin.debug] *********************************************
2026-10-02T16:00:02.7867636Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br] => {
2026-10-02T16:00:02.7867976Z     "changed": false, 
2026-10-02T16:00:02.7868497Z     "msg": {
2026-10-02T16:00:02.7868695Z         "changed": true, 
2026-10-02T16:00:02.7868878Z         "cmd": [
2026-10-02T16:00:02.7869047Z             "python", 
2026-10-02T16:00:02.7869536Z             "/opt/ads-agent/_work/r19036/a/esteira-jboss-vm-v2/roles/nfs/files/nfs.py", 
2026-10-02T16:00:02.7869812Z             "montagem", 
2026-10-02T16:00:02.7870044Z             "SICCV-batch", 
2026-10-02T16:00:02.7870229Z             "tqs", 
2026-10-02T16:00:02.7870403Z             "ctc_nprd", 
2026-10-02T16:00:02.7870696Z             "/opt/ads-agent/_work/r19036/a/esteira-jboss-vm-v2", 
2026-10-02T16:00:02.7870913Z             "C&t@d02", 
2026-10-02T16:00:02.7871160Z             "***", 
2026-10-02T16:00:02.7871369Z             "s736651@corp.caixa.gov.br", 
2026-10-02T16:00:02.7871559Z             "***", 
2026-10-02T16:00:02.7871798Z             "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SICCV\",\"NFS_MOUNT_POINT_ISILON\": \"/SICCV\"}]"
2026-10-02T16:00:02.7872421Z         ], 
2026-10-02T16:00:02.7872576Z         "delta": "0:00:01.962092", 
2026-10-02T16:00:02.7872860Z         "end": "2026-10-02 13:00:02.669874", 
2026-10-02T16:00:02.7873035Z         "failed": false, 
2026-10-02T16:00:02.7873192Z         "rc": 0, 
2026-10-02T16:00:02.7873415Z         "start": "2026-10-02 13:00:00.707782", 
2026-10-02T16:00:02.7873582Z         "stderr": "", 
2026-10-02T16:00:02.7873714Z         "stderr_lines": [], 
2026-10-02T16:00:02.7876341Z         "stdout": "[{u'NFS_MOUNT_POINT_ISILON': u'/SICCV', u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SICCV'}]\nNome                                Endpoint                            Mountpoint                          Tipo                                Ip                                  Ambiente                           \n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SICCV /SICCV                              ISILON                              nfsctcnprd.ctc.caixa                tqs                                \nException when callin ProtocolsApi->get_nfs_expor: (500)\nReason: Internal Server Error\nHTTP response headers: HTTPHeaderDict({'Transfer-Encoding': 'chunked', 'Server': 'Apache', 'Connection': 'close', 'Allow': 'GET, PUT, DELETE, HEAD', 'Date': 'Fri, 02 Oct 2026 16:00:01 GMT', 'X-Frame-Options': 'sameorigin', 'Content-Type': 'application/json'})\nHTTP response body: \n{\n\"errors\" : \n[\n\n{\n\"code\" : \"AEC_EXCEPTION\",\n\"message\" : \"error: empty client name\"\n}\n]\n}\n\n\n\nnfs_path=/SICCV\nnfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SICCV\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SICCV /SICCV                              ISILON                              nfsctcnprd.ctc.caixa                tqs                                ", 
2026-10-02T16:00:02.7877569Z         "stdout_lines": [
2026-10-02T16:00:02.7877929Z             "[{u'NFS_MOUNT_POINT_ISILON': u'/SICCV', u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SICCV'}]", 
2026-10-02T16:00:02.7878550Z             "Nome                                Endpoint                            Mountpoint                          Tipo                                Ip                                  Ambiente                           ", 
2026-10-02T16:00:02.7879075Z             "------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------", 
2026-10-02T16:00:02.7879443Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SICCV /SICCV                              ISILON                              nfsctcnprd.ctc.caixa                tqs                                ", 
2026-10-02T16:00:02.7879791Z             "Exception when callin ProtocolsApi->get_nfs_expor: (500)", 
2026-10-02T16:00:02.7879992Z             "Reason: Internal Server Error", 
2026-10-02T16:00:02.7880671Z             "HTTP response headers: HTTPHeaderDict({'Transfer-Encoding': 'chunked', 'Server': 'Apache', 'Connection': 'close', 'Allow': 'GET, PUT, DELETE, HEAD', 'Date': 'Fri, 02 Oct 2026 16:00:01 GMT', 'X-Frame-Options': 'sameorigin', 'Content-Type': 'application/json'})", 
2026-10-02T16:00:02.7881042Z             "HTTP response body: ", 
2026-10-02T16:00:02.7881197Z             "{", 
2026-10-02T16:00:02.7881441Z             "\"errors\" : ", 
2026-10-02T16:00:02.7881593Z             "[", 
2026-10-02T16:00:02.7881735Z             "", 
2026-10-02T16:00:02.7881856Z             "{", 
2026-10-02T16:00:02.7882023Z             "\"code\" : \"AEC_EXCEPTION\",", 
2026-10-02T16:00:02.7882215Z             "\"message\" : \"error: empty client name\"", 
2026-10-02T16:00:02.7882511Z             "}", 
2026-10-02T16:00:02.7882650Z             "]", 
2026-10-02T16:00:02.7882771Z             "}", 
2026-10-02T16:00:02.7882906Z             "", 
2026-10-02T16:00:02.7883035Z             "", 
2026-10-02T16:00:02.7883169Z             "", 
2026-10-02T16:00:02.7883312Z             "nfs_path=/SICCV", 
2026-10-02T16:00:02.7883506Z             "nfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SICCV", 
2026-10-02T16:00:02.7883782Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SICCV /SICCV                              ISILON                              nfsctcnprd.ctc.caixa                tqs                                "
2026-10-02T16:00:02.7883999Z         ]
2026-10-02T16:00:02.7884197Z     }
2026-10-02T16:00:02.7884324Z }
2026-10-02T16:00:02.7914718Z Friday 02 October 2026  13:00:02 -0300 (0:00:00.095)       0:00:04.287 ******** 
2026-10-02T16:00:03.2403336Z 
2026-10-02T16:00:03.2403973Z TASK [nfs : execute clean json] ************************************************
2026-10-02T16:00:03.2408629Z [DEPRECATION WARNING]: Distribution rhel 9.3 on host 
2026-10-02T16:00:03.2409059Z caddeapllx2821.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, 
2026-10-02T16:00:03.2409290Z but is using /usr/bin/python for backward compatibility with prior Ansible 
2026-10-02T16:00:03.2409577Z releases. A future Ansible release will default to using the discovered 
2026-10-02T16:00:03.2409857Z platform python for this host. See https://docs.ansible.com/ansible/2.9/referen
2026-10-02T16:00:03.2410070Z ce_appendices/interpreter_discovery.html for more information. This feature 
2026-10-02T16:00:03.2410282Z will be removed in version 2.12. Deprecation warnings can be disabled by 
2026-10-02T16:00:03.2410465Z setting deprecation_warnings=False in ansible.cfg.
2026-10-02T16:00:03.2410614Z changed: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-02T16:00:03.2457049Z Friday 02 October 2026  13:00:03 -0300 (0:00:00.454)       0:00:04.741 ******** 
2026-10-02T16:00:03.3094582Z 
2026-10-02T16:00:03.3095208Z TASK [nfs : result_new_string_json] ********************************************
2026-10-02T16:00:03.3096595Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br] => {
2026-10-02T16:00:03.3096848Z     "msg": {
2026-10-02T16:00:03.3097384Z         "ansible_facts": {
2026-10-02T16:00:03.3097611Z             "discovered_interpreter_python": "/usr/bin/python"
2026-10-02T16:00:03.3097793Z         }, 
2026-10-02T16:00:03.3097956Z         "changed": true, 
2026-10-02T16:00:03.3099004Z         "cmd": "echo '[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SICCV\",\"NFS_MOUNT_POINT_ISILON\": \"/SICCV\"}]' | sed 's/NFS_ENDPOINT_ISILON[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_ISILON[^\"]*/NFS_MOUNT_POINT/g; s/NFS_ENDPOINT_HUAWEI[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_HUAWEI[^\"]*/NFS_MOUNT_POINT/g; s/NFS_ENDPOINT_VM[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_VM[^\"]*/NFS_MOUNT_POINT/g'", 
2026-10-02T16:00:03.3099342Z         "delta": "0:00:00.004010", 
2026-10-02T16:00:03.3099472Z         "deprecations": [
2026-10-02T16:00:03.3099573Z             {
2026-10-02T16:00:03.3100101Z                 "msg": "Distribution rhel 9.3 on host caddeapllx2821.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, but is using /usr/bin/python for backward compatibility with prior Ansible releases. A future Ansible release will default to using the discovered platform python for this host. See https://docs.ansible.com/ansible/2.9/reference_appendices/interpreter_discovery.html for more information", 
2026-10-02T16:00:03.3100416Z                 "version": "2.12"
2026-10-02T16:00:03.3100505Z             }
2026-10-02T16:00:03.3100596Z         ], 
2026-10-02T16:00:03.3100762Z         "end": "2026-10-02 13:00:03.220134", 
2026-10-02T16:00:03.3100887Z         "failed": false, 
2026-10-02T16:00:03.3100990Z         "rc": 0, 
2026-10-02T16:00:03.3101149Z         "start": "2026-10-02 13:00:03.216124", 
2026-10-02T16:00:03.3101398Z         "stderr": "", 
2026-10-02T16:00:03.3101718Z         "stderr_lines": [], 
2026-10-02T16:00:03.3101886Z         "stdout": "[{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SICCV\",\"NFS_MOUNT_POINT\": \"/SICCV\"}]", 
2026-10-02T16:00:03.3102043Z         "stdout_lines": [
2026-10-02T16:00:03.3102195Z             "[{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SICCV\",\"NFS_MOUNT_POINT\": \"/SICCV\"}]"
2026-10-02T16:00:03.3102337Z         ]
2026-10-02T16:00:03.3102421Z     }
2026-10-02T16:00:03.3102509Z }
2026-10-02T16:00:03.3130102Z Friday 02 October 2026  13:00:03 -0300 (0:00:00.067)       0:00:04.808 ******** 
2026-10-02T16:00:03.3756859Z 
2026-10-02T16:00:03.3757435Z TASK [nfs : Parse JSON data] ***************************************************
2026-10-02T16:00:03.3757660Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-02T16:00:03.3794051Z Friday 02 October 2026  13:00:03 -0300 (0:00:00.066)       0:00:04.875 ******** 
2026-10-02T16:00:03.4412174Z 
2026-10-02T16:00:03.4413314Z TASK [nfs : result_new_json] ***************************************************
2026-10-02T16:00:03.4413745Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br] => {
2026-10-02T16:00:03.4414293Z     "msg": [
2026-10-02T16:00:03.4414488Z         {
2026-10-02T16:00:03.4414720Z             "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SICCV", 
2026-10-02T16:00:03.4414904Z             "NFS_MOUNT_POINT": "/SICCV"
2026-10-02T16:00:03.4414998Z         }
2026-10-02T16:00:03.4415201Z     ]
2026-10-02T16:00:03.4415291Z }
2026-10-02T16:00:03.4457919Z Friday 02 October 2026  13:00:03 -0300 (0:00:00.066)       0:00:04.941 ******** 
2026-10-02T16:00:03.5138535Z included: /opt/ads-agent/_work/r19036/a/esteira-jboss-vm-v2/roles/nfs/tasks/stack_nfs.yml for caddeapllx2821.agil.nprd.caixa.gov.br
2026-10-02T16:00:03.5218417Z Friday 02 October 2026  13:00:03 -0300 (0:00:00.076)       0:00:05.017 ******** 
2026-10-02T16:00:03.5811617Z 
2026-10-02T16:00:03.5812678Z TASK [nfs : Parse JSON data] ***************************************************
2026-10-02T16:00:03.5812942Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-02T16:00:03.5845790Z Friday 02 October 2026  13:00:03 -0300 (0:00:00.062)       0:00:05.080 ******** 
2026-10-02T16:00:03.6435682Z 
2026-10-02T16:00:03.6436217Z TASK [nfs : debug] *************************************************************
2026-10-02T16:00:03.6438297Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br] => {
2026-10-02T16:00:03.6438508Z     "msg": {
2026-10-02T16:00:03.6438653Z         "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SICCV", 
2026-10-02T16:00:03.6438805Z         "NFS_MOUNT_POINT": "/SICCV"
2026-10-02T16:00:03.6438907Z     }
2026-10-02T16:00:03.6439002Z }
2026-10-02T16:00:03.6472237Z Friday 02 October 2026  13:00:03 -0300 (0:00:00.062)       0:00:05.143 ******** 
2026-10-02T16:00:03.7038347Z 
2026-10-02T16:00:03.7038941Z TASK [nfs : debug] *************************************************************
2026-10-02T16:00:03.7039216Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br] => {
2026-10-02T16:00:03.7039409Z     "msg": "/SICCV"
2026-10-02T16:00:03.7039570Z }
2026-10-02T16:00:03.7080467Z Friday 02 October 2026  13:00:03 -0300 (0:00:00.060)       0:00:05.203 ******** 
2026-10-02T16:00:03.7857345Z 
2026-10-02T16:00:03.7857991Z TASK [nfs : debug] *************************************************************
2026-10-02T16:00:03.7858436Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br] => {
2026-10-02T16:00:03.7858600Z     "msg": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SICCV"
2026-10-02T16:00:03.7858727Z }
2026-10-02T16:00:03.7894671Z Friday 02 October 2026  13:00:03 -0300 (0:00:00.081)       0:00:05.285 ******** 
2026-10-02T16:00:03.8519538Z 
2026-10-02T16:00:03.8520577Z TASK [nfs : Verificando as variaveis] ******************************************
2026-10-02T16:00:03.8520963Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br] => {
2026-10-02T16:00:03.8521165Z     "changed": false, 
2026-10-02T16:00:03.8521630Z     "msg": "All assertions passed"
2026-10-02T16:00:03.8522560Z }
2026-10-02T16:00:03.8565637Z Friday 02 October 2026  13:00:03 -0300 (0:00:00.067)       0:00:05.352 ******** 
2026-10-02T16:00:07.5447811Z 
2026-10-02T16:00:07.5448918Z TASK [nfs : Instalando o NFS Client] *******************************************
2026-10-02T16:00:07.5449490Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-02T16:00:07.5493457Z Friday 02 October 2026  13:00:07 -0300 (0:00:03.692)       0:00:09.045 ******** 
2026-10-02T16:00:09.3489799Z 
2026-10-02T16:00:09.3490618Z TASK [nfs : Install networker lgtoclnt_url] ************************************
2026-10-02T16:00:09.3490911Z [WARNING]: Consider using the yum, dnf or zypper module rather than running
2026-10-02T16:00:09.3491376Z 'rpm'.  If you need to use command because yum, dnf or zypper is insufficient
2026-10-02T16:00:09.3491738Z you can add 'warn: false' to this command task or set 'command_warnings=False'
2026-10-02T16:00:09.3491999Z in ansible.cfg to get rid of this message.
2026-10-02T16:00:09.3493788Z fatal: [caddeapllx2821.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:01.533683", "end": "2026-10-02 13:00:09.332449", "msg": "non-zero return code", "rc": 1, "start": "2026-10-02 13:00:07.798766", "stderr": "aviso: /var/tmp/rpm-tmp.cGqM7n: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.cGqM7n: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm\nVerifying...                          ########################################\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm", "Verifying...                          ########################################", "Preparando...                         ########################################"]}
2026-10-02T16:00:09.3494778Z ...ignoring
2026-10-02T16:00:09.3533424Z Friday 02 October 2026  13:00:09 -0300 (0:00:01.804)       0:00:10.849 ******** 
2026-10-02T16:00:10.1173961Z 
2026-10-02T16:00:10.1178550Z TASK [nfs : Install networker lgtonmda_url] ************************************
2026-10-02T16:00:10.1180624Z fatal: [caddeapllx2821.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.501064", "end": "2026-10-02 13:00:10.100946", "msg": "non-zero return code", "rc": 1, "start": "2026-10-02 13:00:09.599882", "stderr": "aviso: /var/tmp/rpm-tmp.zs59w7: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.zs59w7: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm\nVerifying...                          ########################################\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm", "Verifying...                          ########################################", "Preparando...                         ########################################"]}
2026-10-02T16:00:10.1181646Z ...ignoring
2026-10-02T16:00:10.1222527Z Friday 02 October 2026  13:00:10 -0300 (0:00:00.768)       0:00:11.618 ******** 
2026-10-02T16:00:10.5827263Z 
2026-10-02T16:00:10.5828250Z TASK [nfs : Remove pacote jbcs-httpd] ******************************************
2026-10-02T16:00:10.5828447Z changed: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-02T16:00:10.5877567Z Friday 02 October 2026  13:00:10 -0300 (0:00:00.465)       0:00:12.083 ******** 
2026-10-02T16:00:10.8427828Z 
2026-10-02T16:00:10.8428672Z TASK [nfs : Create a symbolic link] ********************************************
2026-10-02T16:00:10.8428967Z changed: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-02T16:00:10.8466060Z Friday 02 October 2026  13:00:10 -0300 (0:00:00.258)       0:00:12.342 ******** 
2026-10-02T16:00:11.8092543Z 
2026-10-02T16:00:11.8093068Z TASK [nfs : Networker | Start networker] ***************************************
2026-10-02T16:00:11.8093234Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-02T16:00:11.8139484Z Friday 02 October 2026  13:00:11 -0300 (0:00:00.967)       0:00:13.309 ******** 
2026-10-02T16:00:12.0840982Z 
2026-10-02T16:00:12.0841504Z TASK [nfs : Executar o comando abaixo para limitar as portas] ******************
2026-10-02T16:00:12.0841766Z changed: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-02T16:00:12.0880688Z Friday 02 October 2026  13:00:12 -0300 (0:00:00.274)       0:00:13.583 ******** 
2026-10-02T16:00:22.5135616Z 
2026-10-02T16:00:22.5136121Z TASK [nfs : Networker | Restart networker] *************************************
2026-10-02T16:00:22.5136288Z changed: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-02T16:00:22.5169116Z Friday 02 October 2026  13:00:22 -0300 (0:00:10.428)       0:00:24.012 ******** 
2026-10-02T16:03:24.0385444Z 
2026-10-02T16:03:24.0386317Z TASK [nfs : Montando volume remoto] ********************************************
2026-10-02T16:03:24.0389182Z fatal: [caddeapllx2821.agil.nprd.caixa.gov.br]: FAILED! => {"changed": false, "msg": "Error mounting /SICCV: mount.nfs: Connection timed out\n"}
2026-10-02T16:03:24.0389396Z ...ignoring
2026-10-02T16:03:24.0417011Z Friday 02 October 2026  13:03:24 -0300 (0:03:01.524)       0:03:25.537 ******** 
2026-10-02T16:03:24.1108828Z 
2026-10-02T16:03:24.1109354Z TASK [nfs : Validando Montagem] ************************************************
2026-10-02T16:03:24.1109862Z fatal: [caddeapllx2821.agil.nprd.caixa.gov.br]: FAILED! => {
2026-10-02T16:03:24.1110205Z     "assertion": "'Connection refused' in mountnfs.msg", 
2026-10-02T16:03:24.1110324Z     "changed": false, 
2026-10-02T16:03:24.1112311Z     "evaluated_to": false, 
2026-10-02T16:03:24.1112871Z     "msg": "Erro desconhecido: Error mounting /SICCV: mount.nfs: Connection timed out\n"
2026-10-02T16:03:24.1113006Z }
2026-10-02T16:03:24.1137599Z 
2026-10-02T16:03:24.1199404Z PLAY RECAP *********************************************************************
2026-10-02T16:03:24.1199831Z caddeapllx2821.agil.nprd.caixa.gov.br : ok=27   changed=8    unreachable=0    failed=1    skipped=0    rescued=0    ignored=3   
2026-10-02T16:03:24.1199990Z 
2026-10-02T16:03:24.1200516Z Friday 02 October 2026  13:03:24 -0300 (0:00:00.070)       0:03:25.608 ******** 
2026-10-02T16:03:24.1200818Z =============================================================================== 
2026-10-02T16:03:24.1201277Z nfs : Montando volume remoto ------------------------------------------ 181.52s
2026-10-02T16:03:24.1201663Z nfs : Networker | Restart networker ------------------------------------ 10.43s
2026-10-02T16:03:24.1202016Z nfs : Instalando o NFS Client ------------------------------------------- 3.69s
2026-10-02T16:03:24.1202368Z nfs : execute montagem script ------------------------------------------- 2.37s
2026-10-02T16:03:24.1202731Z nfs : Install networker lgtoclnt_url ------------------------------------ 1.80s
2026-10-02T16:03:24.1204896Z nfs : Networker | Start networker --------------------------------------- 0.97s
2026-10-02T16:03:24.1205348Z nfs : Install networker lgtonmda_url ------------------------------------ 0.77s
2026-10-02T16:03:24.1205747Z Verifica se o arquivo nfs_config.json existe ---------------------------- 0.63s
2026-10-02T16:03:24.1206150Z nfs : Coletar variáveis de ambiente ------------------------------------- 0.53s
2026-10-02T16:03:24.1206601Z nfs : Remove pacote jbcs-httpd ------------------------------------------ 0.47s
2026-10-02T16:03:24.1237832Z nfs : execute clean json ------------------------------------------------ 0.45s
2026-10-02T16:03:24.1238187Z nfs : Executar o comando abaixo para limitar as portas ------------------ 0.27s
2026-10-02T16:03:24.1238501Z nfs : Create a symbolic link -------------------------------------------- 0.26s
2026-10-02T16:03:24.1238800Z nfs : ansible.builtin.debug --------------------------------------------- 0.10s
2026-10-02T16:03:24.1239033Z nfs : debug ------------------------------------------------------------- 0.08s
2026-10-02T16:03:24.1239261Z nfs : Criar variáveis --------------------------------------------------- 0.08s
2026-10-02T16:03:24.1239489Z nfs : include_tasks ----------------------------------------------------- 0.08s
2026-10-02T16:03:24.1239702Z nfs : Validando Montagem ------------------------------------------------ 0.07s
2026-10-02T16:03:24.1239926Z nfs : Exibir resultado em JSON ------------------------------------------ 0.07s
2026-10-02T16:03:24.1240152Z nfs : result_new_string_json -------------------------------------------- 0.07s
2026-10-02T16:03:24.1240312Z Playbook run took 0 days, 0 hours, 3 minutes, 25 seconds
2026-10-02T16:03:24.1818901Z ##[debug]Exit code 2 received from tool '/bin/bash'
2026-10-02T16:03:24.1856472Z ##[debug]STDIO streams have closed for tool '/bin/bash'
2026-10-02T16:03:24.1857383Z ##[error]Bash exited with code '2'.
2026-10-02T16:03:24.1859722Z ##[debug]Processed: ##vso[task.issue type=error;]Bash exited with code '2'.
2026-10-02T16:03:24.1860068Z ##[debug]task result: Failed
2026-10-02T16:03:24.1860936Z ##[debug]Processed: ##vso[task.complete result=Failed;done=true;]
2026-10-02T16:03:24.1861719Z ##[warning]RetryHelper encountered task failure, will retry (attempt #: 2 out of 2) after 4000 ms
2026-10-02T16:03:28.1857826Z ##[debug]PERF: RetryHelper Method:System.Threading.Tasks.Task <RunAsync>b__9() : took 211890.0458 ms
2026-10-02T16:03:28.1858324Z ##[debug]PERF WARNING: RetryHelper Method:System.Threading.Tasks.Task <RunAsync>b__9() : took 211890.0458 ms
2026-10-02T16:03:28.1859318Z ##[debug]Invoking Method: System.Threading.Tasks.Task <RunAsync>b__9(). Attempt count: 2
2026-10-02T16:03:28.1902039Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-10-02T16:03:28.2684041Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-10-02T16:03:28.2692196Z ##[debug]loading inputs and endpoints
2026-10-02T16:03:28.2695208Z ##[debug]loading INPUT_TARGETTYPE
2026-10-02T16:03:28.2703109Z ##[debug]loading INPUT_FILEPATH
2026-10-02T16:03:28.2704013Z ##[debug]loading INPUT_SCRIPT
2026-10-02T16:03:28.2704694Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-10-02T16:03:28.2705548Z ##[debug]loading INPUT_FAILONSTDERR
2026-10-02T16:03:28.2706922Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-10-02T16:03:28.2707872Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-10-02T16:03:28.2709290Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-10-02T16:03:28.2714388Z ##[debug]loading SECRET_SENHASERVICO
2026-10-02T16:03:28.2715759Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-10-02T16:03:28.2717253Z ##[debug]loading SECRET_TOKEN_INFRAFACIL_MUDANCA
2026-10-02T16:03:28.2718891Z ##[debug]loading SECRET_GRAYLOG_PASSWORD
2026-10-02T16:03:28.2720312Z ##[debug]loading SECRET_ARM_ACCESS_KEY
2026-10-02T16:03:28.2721854Z ##[debug]loading SECRET_ANSIBLE_VAULT
2026-10-02T16:03:28.2722516Z ##[debug]loading SECRET_PW_ISILON
2026-10-02T16:03:28.2723165Z ##[debug]loading SECRET_FORTIFY_PASS
2026-10-02T16:03:28.2723856Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-10-02T16:03:28.2724367Z ##[debug]loading SECRET_PW_ALOCAIP
2026-10-02T16:03:28.2725549Z ##[debug]loading SECRET_OKD_TOKEN_PRODUTOS
2026-10-02T16:03:28.2726123Z ##[debug]loading SECRET_CV_SENHAORACLE
2026-10-02T16:03:28.2726814Z ##[debug]loading SECRET_AZPAT
2026-10-02T16:03:28.2727483Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-10-02T16:03:28.2729201Z ##[debug]loading SECRET_TERRAFORM_ESX_PASSWORD
2026-10-02T16:03:28.2729729Z ##[debug]loading SECRET_TOKEN_CRQ
2026-10-02T16:03:28.2730397Z ##[debug]loaded 24
2026-10-02T16:03:28.2735076Z ##[debug]Agent.ProxyUrl=undefined
2026-10-02T16:03:28.2735510Z ##[debug]Agent.CAInfo=undefined
2026-10-02T16:03:28.2735756Z ##[debug]Agent.ClientCert=undefined
2026-10-02T16:03:28.2736360Z ##[debug]Agent.SkipCertValidation=True
2026-10-02T16:03:28.2752293Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-10-02T16:03:28.2753903Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-10-02T16:03:28.2754544Z ##[debug]system.culture=en-US
2026-10-02T16:03:28.2762929Z ##[debug]failOnStderr=false
2026-10-02T16:03:28.2763576Z ##[debug]workingDirectory=/opt/ads-agent/_work/r19036/a
2026-10-02T16:03:28.2763993Z ##[debug]check path : /opt/ads-agent/_work/r19036/a
2026-10-02T16:03:28.2764393Z ##[debug]targetType=inline
2026-10-02T16:03:28.2764778Z ##[debug]bashEnvValue=undefined
2026-10-02T16:03:28.2766171Z ##[debug]script=REPO=$(echo _SICCV-batch | sed 's/_//')
ansible-playbook /opt/ads-agent/_work/r19036/a/esteira-jboss-vm-v2/site.yml --tags controlm,nfs --skip-tags "vm,dns,monitoracao,apache,git_conf,jboss,restart_jboss,stop_jboss,tsm" -e sistema_ambiente=tqs -e sistema_nome=SICCV-batch -e site=ctc_nprd -e centralizadora_operacoes=7261 -e centralizadora_desenvolvimento=7266 -e default_working_directory_tfs=/opt/ads-agent/_work/r19036/a -e build_repository_name_tfs=$REPO -e CTMSHOST=crjdeaprlx038 -e CTMPERMHOSTS=crjdeaprlx038,crjdeaprlx039 -e ATCMNDATA=18007 -e AGCMNDATA=18008
2026-10-02T16:03:28.2774655Z Generating script.
2026-10-02T16:03:28.2776882Z ##[debug]which 'bash'
2026-10-02T16:03:28.2782977Z ##[debug]found: '/bin/bash'
2026-10-02T16:03:28.2783392Z ##[debug]Agent.Version=3.225.2
2026-10-02T16:03:28.2783794Z ##[debug]agent.tempDirectory=/opt/ads-agent/_work/_temp
2026-10-02T16:03:28.2784251Z ##[debug]check path : /opt/ads-agent/_work/_temp
2026-10-02T16:03:28.2785451Z ========================== Starting Command Output ===========================
2026-10-02T16:03:28.2786727Z ##[debug]which '/bin/bash'
2026-10-02T16:03:28.2787607Z ##[debug]found: '/bin/bash'
2026-10-02T16:03:28.2788509Z ##[debug]/bin/bash arg: /opt/ads-agent/_work/_temp/c7a52973-5628-42a0-ba25-7fc364207f16.sh
2026-10-02T16:03:28.2790988Z ##[debug]exec tool: /bin/bash
2026-10-02T16:03:28.2791588Z ##[debug]arguments:
2026-10-02T16:03:28.2792208Z ##[debug]   /opt/ads-agent/_work/_temp/c7a52973-5628-42a0-ba25-7fc364207f16.sh
2026-10-02T16:03:28.2793719Z [command]/bin/bash /opt/ads-agent/_work/_temp/c7a52973-5628-42a0-ba25-7fc364207f16.sh
2026-10-02T16:03:30.4734352Z 
2026-10-02T16:03:30.4734861Z PLAY [local] *******************************************************************
2026-10-02T16:03:30.5040639Z 
2026-10-02T16:03:30.5041278Z PLAY [Configurando o DNS] ******************************************************
2026-10-02T16:03:30.7019199Z 
2026-10-02T16:03:30.7019721Z PLAY [local] *******************************************************************
2026-10-02T16:03:30.7076418Z 
2026-10-02T16:03:30.7077282Z PLAY [Verificando serviços] ****************************************************
2026-10-02T16:03:30.7221662Z 
2026-10-02T16:03:30.7222924Z PLAY [Configuração LDAP] *******************************************************
2026-10-02T16:03:30.7268700Z [WARNING]: Found variable using reserved name: when
2026-10-02T16:03:30.7273058Z 
2026-10-02T16:03:30.7273418Z PLAY [jboss] *******************************************************************
2026-10-02T16:03:30.7415301Z 
2026-10-02T16:03:30.7415830Z PLAY [Stack Jboss] *************************************************************
2026-10-02T16:03:30.7452940Z 
2026-10-02T16:03:30.7453563Z PLAY [jboss] *******************************************************************
2026-10-02T16:03:30.7502000Z 
2026-10-02T16:03:30.7502613Z PLAY [jboss] *******************************************************************
2026-10-02T16:03:30.7801449Z Friday 02 October 2026  13:03:30 -0300 (0:00:00.367)       0:00:00.367 ******** 
2026-10-02T16:03:31.3769014Z 
2026-10-02T16:03:31.3769802Z TASK [Verifica se o arquivo nfs_config.json existe] ****************************
2026-10-02T16:03:31.3770431Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-02T16:03:31.3804974Z Friday 02 October 2026  13:03:31 -0300 (0:00:00.601)       0:00:00.969 ******** 
2026-10-02T16:03:31.4359344Z included: /opt/ads-agent/_work/r19036/a/esteira-jboss-vm-v2/roles/nfs/tasks/get_nfs.yml for caddeapllx2821.agil.nprd.caixa.gov.br
2026-10-02T16:03:31.4407408Z Friday 02 October 2026  13:03:31 -0300 (0:00:00.060)       0:00:01.029 ******** 
2026-10-02T16:03:31.5020694Z 
2026-10-02T16:03:31.5021570Z TASK [nfs : Criar variáveis] ***************************************************
2026-10-02T16:03:31.5021748Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-02T16:03:31.5080438Z Friday 02 October 2026  13:03:31 -0300 (0:00:00.067)       0:00:01.096 ******** 
2026-10-02T16:03:32.0331191Z 
2026-10-02T16:03:32.0331903Z TASK [nfs : Coletar variáveis de ambiente] *************************************
2026-10-02T16:03:32.0332099Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-02T16:03:32.0370420Z Friday 02 October 2026  13:03:32 -0300 (0:00:00.528)       0:00:01.625 ******** 
2026-10-02T16:03:32.0952840Z 
2026-10-02T16:03:32.0953611Z TASK [nfs : Exibir resultado em JSON] ******************************************
2026-10-02T16:03:32.0953780Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br] => {
2026-10-02T16:03:32.0955535Z     "nfs_vars_json": {
2026-10-02T16:03:32.0955725Z         "changed": false, 
2026-10-02T16:03:32.0956092Z         "cmd": "cat /opt/ads-agent/_work/r19036/a/nfs_config.json", 
2026-10-02T16:03:32.0956258Z         "delta": "0:00:00.043985", 
2026-10-02T16:03:32.0958860Z         "end": "2026-10-02 13:03:32.014027", 
2026-10-02T16:03:32.0959418Z         "failed": false, 
2026-10-02T16:03:32.0959854Z         "rc": 0, 
2026-10-02T16:03:32.0960168Z         "start": "2026-10-02 13:03:31.970042", 
2026-10-02T16:03:32.0960303Z         "stderr": "", 
2026-10-02T16:03:32.0960436Z         "stderr_lines": [], 
2026-10-02T16:03:32.0960612Z         "stdout": "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SICCV\",\"NFS_MOUNT_POINT_ISILON\": \"/SICCV\"}]", 
2026-10-02T16:03:32.0960780Z         "stdout_lines": [
2026-10-02T16:03:32.0962458Z             "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SICCV\",\"NFS_MOUNT_POINT_ISILON\": \"/SICCV\"}]"
2026-10-02T16:03:32.0962643Z         ]
2026-10-02T16:03:32.0962730Z     }
2026-10-02T16:03:32.0962823Z }
2026-10-02T16:03:32.0988597Z Friday 02 October 2026  13:03:32 -0300 (0:00:00.061)       0:00:01.687 ******** 
2026-10-02T16:03:32.1600588Z 
2026-10-02T16:03:32.1601277Z TASK [nfs : Criar variáveis] ***************************************************
2026-10-02T16:03:32.1603249Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-02T16:03:32.1649497Z Friday 02 October 2026  13:03:32 -0300 (0:00:00.066)       0:00:01.753 ******** 
2026-10-02T16:03:35.4721500Z 
2026-10-02T16:03:35.4722458Z TASK [nfs : execute montagem script] *******************************************
2026-10-02T16:03:35.4723232Z changed: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-02T16:03:35.4759188Z Friday 02 October 2026  13:03:35 -0300 (0:00:03.308)       0:00:05.062 ******** 
2026-10-02T16:03:35.5352740Z 
2026-10-02T16:03:35.5353225Z TASK [nfs : ansible.builtin.debug] *********************************************
2026-10-02T16:03:35.5353463Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br] => {
2026-10-02T16:03:35.5354057Z     "changed": false, 
2026-10-02T16:03:35.5354650Z     "msg": {
2026-10-02T16:03:35.5354870Z         "changed": true, 
2026-10-02T16:03:35.5355011Z         "cmd": [
2026-10-02T16:03:35.5355181Z             "python", 
2026-10-02T16:03:35.5356162Z             "/opt/ads-agent/_work/r19036/a/esteira-jboss-vm-v2/roles/nfs/files/nfs.py", 
2026-10-02T16:03:35.5356391Z             "montagem", 
2026-10-02T16:03:35.5356538Z             "SICCV-batch", 
2026-10-02T16:03:35.5356983Z             "tqs", 
2026-10-02T16:03:35.5357337Z             "ctc_nprd", 
2026-10-02T16:03:35.5357699Z             "/opt/ads-agent/_work/r19036/a/esteira-jboss-vm-v2", 
2026-10-02T16:03:35.5357845Z             "C&t@d02", 
2026-10-02T16:03:35.5358124Z             "***", 
2026-10-02T16:03:35.5358260Z             "s736651@corp.caixa.gov.br", 
2026-10-02T16:03:35.5358383Z             "***", 
2026-10-02T16:03:35.5358587Z             "[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SICCV\",\"NFS_MOUNT_POINT_ISILON\": \"/SICCV\"}]"
2026-10-02T16:03:35.5358861Z         ], 
2026-10-02T16:03:35.5359000Z         "delta": "0:00:02.911719", 
2026-10-02T16:03:35.5359185Z         "end": "2026-10-02 13:03:35.450024", 
2026-10-02T16:03:35.5359310Z         "failed": false, 
2026-10-02T16:03:35.5359406Z         "rc": 0, 
2026-10-02T16:03:35.5359574Z         "start": "2026-10-02 13:03:32.538305", 
2026-10-02T16:03:35.5359698Z         "stderr": "", 
2026-10-02T16:03:35.5359813Z         "stderr_lines": [], 
2026-10-02T16:03:35.5361375Z         "stdout": "[{u'NFS_MOUNT_POINT_ISILON': u'/SICCV', u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SICCV'}]\nNome                                Endpoint                            Mountpoint                          Tipo                                Ip                                  Ambiente                           \n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SICCV /SICCV                              ISILON                              nfsctcnprd.ctc.caixa                tqs                                \nException when callin ProtocolsApi->get_nfs_expor: (500)\nReason: Internal Server Error\nHTTP response headers: HTTPHeaderDict({'Transfer-Encoding': 'chunked', 'Server': 'Apache', 'Connection': 'close', 'Allow': 'GET, PUT, DELETE, HEAD', 'Date': 'Fri, 02 Oct 2026 16:03:33 GMT', 'X-Frame-Options': 'sameorigin', 'Content-Type': 'application/json'})\nHTTP response body: \n{\n\"errors\" : \n[\n\n{\n\"code\" : \"AEC_EXCEPTION\",\n\"message\" : \"error: empty client name\"\n}\n]\n}\n\n\n\nnfs_path=/SICCV\nnfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SICCV\nnfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SICCV /SICCV                              ISILON                              nfsctcnprd.ctc.caixa                tqs                                ", 
2026-10-02T16:03:35.5362277Z         "stdout_lines": [
2026-10-02T16:03:35.5362534Z             "[{u'NFS_MOUNT_POINT_ISILON': u'/SICCV', u'NFS_ENDPOINT_ISILON': u'nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SICCV'}]", 
2026-10-02T16:03:35.5362742Z             "Nome                                Endpoint                            Mountpoint                          Tipo                                Ip                                  Ambiente                           ", 
2026-10-02T16:03:35.5363114Z             "------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------", 
2026-10-02T16:03:35.5363357Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SICCV /SICCV                              ISILON                              nfsctcnprd.ctc.caixa                tqs                                ", 
2026-10-02T16:03:35.5363597Z             "Exception when callin ProtocolsApi->get_nfs_expor: (500)", 
2026-10-02T16:03:35.5363738Z             "Reason: Internal Server Error", 
2026-10-02T16:03:35.5364154Z             "HTTP response headers: HTTPHeaderDict({'Transfer-Encoding': 'chunked', 'Server': 'Apache', 'Connection': 'close', 'Allow': 'GET, PUT, DELETE, HEAD', 'Date': 'Fri, 02 Oct 2026 16:03:33 GMT', 'X-Frame-Options': 'sameorigin', 'Content-Type': 'application/json'})", 
2026-10-02T16:03:35.5364477Z             "HTTP response body: ", 
2026-10-02T16:03:35.5364580Z             "{", 
2026-10-02T16:03:35.5364679Z             "\"errors\" : ", 
2026-10-02T16:03:35.5364777Z             "[", 
2026-10-02T16:03:35.5364863Z             "", 
2026-10-02T16:03:35.5365005Z             "{", 
2026-10-02T16:03:35.5365147Z             "\"code\" : \"AEC_EXCEPTION\",", 
2026-10-02T16:03:35.5365269Z             "\"message\" : \"error: empty client name\"", 
2026-10-02T16:03:35.5365421Z             "}", 
2026-10-02T16:03:35.5365532Z             "]", 
2026-10-02T16:03:35.5365664Z             "}", 
2026-10-02T16:03:35.5365777Z             "", 
2026-10-02T16:03:35.5365880Z             "", 
2026-10-02T16:03:35.5366004Z             "", 
2026-10-02T16:03:35.5366097Z             "nfs_path=/SICCV", 
2026-10-02T16:03:35.5366228Z             "nfs_src=nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SICCV", 
2026-10-02T16:03:35.5366459Z             "nfsctcnprd.ctc.caixa                /ifs/CADSVISISD4/SERVIDORES/CEPTISP/SICCV /SICCV                              ISILON                              nfsctcnprd.ctc.caixa                tqs                                "
2026-10-02T16:03:35.5366607Z         ]
2026-10-02T16:03:35.5366743Z     }
2026-10-02T16:03:35.5366862Z }
2026-10-02T16:03:35.5388148Z Friday 02 October 2026  13:03:35 -0300 (0:00:00.065)       0:00:05.127 ******** 
2026-10-02T16:03:35.9314536Z 
2026-10-02T16:03:35.9315046Z TASK [nfs : execute clean json] ************************************************
2026-10-02T16:03:35.9319642Z [DEPRECATION WARNING]: Distribution rhel 9.3 on host 
2026-10-02T16:03:35.9320071Z caddeapllx2821.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, 
2026-10-02T16:03:35.9320269Z but is using /usr/bin/python for backward compatibility with prior Ansible 
2026-10-02T16:03:35.9320432Z releases. A future Ansible release will default to using the discovered 
2026-10-02T16:03:35.9320611Z platform python for this host. See https://docs.ansible.com/ansible/2.9/referen
2026-10-02T16:03:35.9320780Z ce_appendices/interpreter_discovery.html for more information. This feature 
2026-10-02T16:03:35.9320938Z will be removed in version 2.12. Deprecation warnings can be disabled by 
2026-10-02T16:03:35.9321409Z setting deprecation_warnings=False in ansible.cfg.
2026-10-02T16:03:35.9321544Z changed: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-02T16:03:35.9365163Z Friday 02 October 2026  13:03:35 -0300 (0:00:00.397)       0:00:05.525 ******** 
2026-10-02T16:03:35.9978227Z 
2026-10-02T16:03:35.9978863Z TASK [nfs : result_new_string_json] ********************************************
2026-10-02T16:03:35.9979693Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br] => {
2026-10-02T16:03:35.9979855Z     "msg": {
2026-10-02T16:03:35.9979958Z         "ansible_facts": {
2026-10-02T16:03:35.9980109Z             "discovered_interpreter_python": "/usr/bin/python"
2026-10-02T16:03:35.9980228Z         }, 
2026-10-02T16:03:35.9980352Z         "changed": true, 
2026-10-02T16:03:35.9980989Z         "cmd": "echo '[{\"NFS_ENDPOINT_ISILON\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SICCV\",\"NFS_MOUNT_POINT_ISILON\": \"/SICCV\"}]' | sed 's/NFS_ENDPOINT_ISILON[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_ISILON[^\"]*/NFS_MOUNT_POINT/g; s/NFS_ENDPOINT_HUAWEI[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_HUAWEI[^\"]*/NFS_MOUNT_POINT/g; s/NFS_ENDPOINT_VM[^\"]*/NFS_ENDPOINT/g; s/NFS_MOUNT_POINT_VM[^\"]*/NFS_MOUNT_POINT/g'", 
2026-10-02T16:03:35.9981309Z         "delta": "0:00:00.003879", 
2026-10-02T16:03:35.9981491Z         "deprecations": [
2026-10-02T16:03:35.9981632Z             {
2026-10-02T16:03:35.9982194Z                 "msg": "Distribution rhel 9.3 on host caddeapllx2821.agil.nprd.caixa.gov.br should use /usr/libexec/platform-python, but is using /usr/bin/python for backward compatibility with prior Ansible releases. A future Ansible release will default to using the discovered platform python for this host. See https://docs.ansible.com/ansible/2.9/reference_appendices/interpreter_discovery.html for more information", 
2026-10-02T16:03:35.9982781Z                 "version": "2.12"
2026-10-02T16:03:35.9982885Z             }
2026-10-02T16:03:35.9982977Z         ], 
2026-10-02T16:03:35.9983150Z         "end": "2026-10-02 13:03:35.913904", 
2026-10-02T16:03:35.9983273Z         "failed": false, 
2026-10-02T16:03:35.9983375Z         "rc": 0, 
2026-10-02T16:03:35.9983533Z         "start": "2026-10-02 13:03:35.910025", 
2026-10-02T16:03:35.9983656Z         "stderr": "", 
2026-10-02T16:03:35.9983767Z         "stderr_lines": [], 
2026-10-02T16:03:35.9983930Z         "stdout": "[{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SICCV\",\"NFS_MOUNT_POINT\": \"/SICCV\"}]", 
2026-10-02T16:03:35.9984086Z         "stdout_lines": [
2026-10-02T16:03:35.9984234Z             "[{\"NFS_ENDPOINT\": \"nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SICCV\",\"NFS_MOUNT_POINT\": \"/SICCV\"}]"
2026-10-02T16:03:35.9984364Z         ]
2026-10-02T16:03:35.9984453Z     }
2026-10-02T16:03:35.9984540Z }
2026-10-02T16:03:36.0012941Z Friday 02 October 2026  13:03:35 -0300 (0:00:00.064)       0:00:05.590 ******** 
2026-10-02T16:03:36.0633337Z 
2026-10-02T16:03:36.0633959Z TASK [nfs : Parse JSON data] ***************************************************
2026-10-02T16:03:36.0634224Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-02T16:03:36.0664055Z Friday 02 October 2026  13:03:36 -0300 (0:00:00.065)       0:00:05.655 ******** 
2026-10-02T16:03:36.1277293Z 
2026-10-02T16:03:36.1280748Z TASK [nfs : result_new_json] ***************************************************
2026-10-02T16:03:36.1281340Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br] => {
2026-10-02T16:03:36.1282108Z     "msg": [
2026-10-02T16:03:36.1282459Z         {
2026-10-02T16:03:36.1282708Z             "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SICCV", 
2026-10-02T16:03:36.1282937Z             "NFS_MOUNT_POINT": "/SICCV"
2026-10-02T16:03:36.1283131Z         }
2026-10-02T16:03:36.1283270Z     ]
2026-10-02T16:03:36.1283415Z }
2026-10-02T16:03:36.1313416Z Friday 02 October 2026  13:03:36 -0300 (0:00:00.064)       0:00:05.720 ******** 
2026-10-02T16:03:36.1959667Z included: /opt/ads-agent/_work/r19036/a/esteira-jboss-vm-v2/roles/nfs/tasks/stack_nfs.yml for caddeapllx2821.agil.nprd.caixa.gov.br
2026-10-02T16:03:36.2019836Z Friday 02 October 2026  13:03:36 -0300 (0:00:00.070)       0:00:05.790 ******** 
2026-10-02T16:03:36.2633469Z 
2026-10-02T16:03:36.2633991Z TASK [nfs : Parse JSON data] ***************************************************
2026-10-02T16:03:36.2634168Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-02T16:03:36.2663420Z Friday 02 October 2026  13:03:36 -0300 (0:00:00.064)       0:00:05.855 ******** 
2026-10-02T16:03:36.3236713Z 
2026-10-02T16:03:36.3237749Z TASK [nfs : debug] *************************************************************
2026-10-02T16:03:36.3238550Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br] => {
2026-10-02T16:03:36.3238774Z     "msg": {
2026-10-02T16:03:36.3238921Z         "NFS_ENDPOINT": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SICCV", 
2026-10-02T16:03:36.3239069Z         "NFS_MOUNT_POINT": "/SICCV"
2026-10-02T16:03:36.3239181Z     }
2026-10-02T16:03:36.3239282Z }
2026-10-02T16:03:36.3269338Z Friday 02 October 2026  13:03:36 -0300 (0:00:00.060)       0:00:05.915 ******** 
2026-10-02T16:03:36.3819186Z 
2026-10-02T16:03:36.3819872Z TASK [nfs : debug] *************************************************************
2026-10-02T16:03:36.3820229Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br] => {
2026-10-02T16:03:36.3820358Z     "msg": "/SICCV"
2026-10-02T16:03:36.3820463Z }
2026-10-02T16:03:36.3865806Z Friday 02 October 2026  13:03:36 -0300 (0:00:00.058)       0:00:05.973 ******** 
2026-10-02T16:03:36.4413787Z 
2026-10-02T16:03:36.4414977Z TASK [nfs : debug] *************************************************************
2026-10-02T16:03:36.4415261Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br] => {
2026-10-02T16:03:36.4415722Z     "msg": "nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SICCV"
2026-10-02T16:03:36.4415853Z }
2026-10-02T16:03:36.4459645Z Friday 02 October 2026  13:03:36 -0300 (0:00:00.060)       0:00:06.034 ******** 
2026-10-02T16:03:36.5035407Z 
2026-10-02T16:03:36.5036167Z TASK [nfs : Verificando as variaveis] ******************************************
2026-10-02T16:03:36.5036643Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br] => {
2026-10-02T16:03:36.5037339Z     "changed": false, 
2026-10-02T16:03:36.5037581Z     "msg": "All assertions passed"
2026-10-02T16:03:36.5037689Z }
2026-10-02T16:03:36.5070458Z Friday 02 October 2026  13:03:36 -0300 (0:00:00.061)       0:00:06.095 ******** 
2026-10-02T16:03:40.0224205Z 
2026-10-02T16:03:40.0225238Z TASK [nfs : Instalando o NFS Client] *******************************************
2026-10-02T16:03:40.0225447Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-02T16:03:40.0276885Z Friday 02 October 2026  13:03:40 -0300 (0:00:03.520)       0:00:09.616 ******** 
2026-10-02T16:03:40.7724743Z 
2026-10-02T16:03:40.7725414Z TASK [nfs : Install networker lgtoclnt_url] ************************************
2026-10-02T16:03:40.7726017Z [WARNING]: Consider using the yum, dnf or zypper module rather than running
2026-10-02T16:03:40.7728582Z 'rpm'.  If you need to use command because yum, dnf or zypper is insufficient
2026-10-02T16:03:40.7729385Z you can add 'warn: false' to this command task or set 'command_warnings=False'
2026-10-02T16:03:40.7729644Z in ansible.cfg to get rid of this message.
2026-10-02T16:03:40.7752185Z fatal: [caddeapllx2821.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.490756", "end": "2026-10-02 13:03:40.753347", "msg": "non-zero return code", "rc": 1, "start": "2026-10-02 13:03:40.262591", "stderr": "aviso: /var/tmp/rpm-tmp.C4Aqme: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.C4Aqme: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtoclnt-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm\nVerifying...                          ########################################\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtoclnt-19.8.0.2-1.x86_64.rpm", "Verifying...                          ########################################", "Preparando...                         ########################################"]}
2026-10-02T16:03:40.7753346Z ...ignoring
2026-10-02T16:03:40.7808249Z Friday 02 October 2026  13:03:40 -0300 (0:00:00.750)       0:00:10.366 ******** 
2026-10-02T16:03:41.4831727Z 
2026-10-02T16:03:41.4832233Z TASK [nfs : Install networker lgtonmda_url] ************************************
2026-10-02T16:03:41.4833638Z fatal: [caddeapllx2821.agil.nprd.caixa.gov.br]: FAILED! => {"changed": true, "cmd": ["rpm", "-ivh", "--relocate", "/usr=/opt/networker", "http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm"], "delta": "0:00:00.447735", "end": "2026-10-02 13:03:41.460820", "msg": "non-zero return code", "rc": 1, "start": "2026-10-02 13:03:41.013085", "stderr": "aviso: /var/tmp/rpm-tmp.hR11vy: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY\n\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado", "stderr_lines": ["aviso: /var/tmp/rpm-tmp.hR11vy: Cabeçalho V3 RSA/SHA256 Signature, ID da chave ff48d101: NOKEY", "\to pacote lgtonmda-19.8.0.2-1.x86_64 já está instalado"], "stdout": "Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm\nVerifying...                          ########################################\nPreparando...                         ########################################", "stdout_lines": ["Obtendo http://10.122.154.12/deploy/lgtonmda-19.8.0.2-1.x86_64.rpm", "Verifying...                          ########################################", "Preparando...                         ########################################"]}
2026-10-02T16:03:41.4834524Z ...ignoring
2026-10-02T16:03:41.4834755Z Friday 02 October 2026  13:03:41 -0300 (0:00:00.704)       0:00:11.070 ******** 
2026-10-02T16:03:41.9501269Z 
2026-10-02T16:03:41.9502158Z TASK [nfs : Remove pacote jbcs-httpd] ******************************************
2026-10-02T16:03:41.9502365Z changed: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-02T16:03:41.9544556Z Friday 02 October 2026  13:03:41 -0300 (0:00:00.472)       0:00:11.543 ******** 
2026-10-02T16:03:42.2019730Z 
2026-10-02T16:03:42.2020649Z TASK [nfs : Create a symbolic link] ********************************************
2026-10-02T16:03:42.2020858Z changed: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-02T16:03:42.2059755Z Friday 02 October 2026  13:03:42 -0300 (0:00:00.251)       0:00:11.794 ******** 
2026-10-02T16:03:43.2439358Z 
2026-10-02T16:03:43.2440016Z TASK [nfs : Networker | Start networker] ***************************************
2026-10-02T16:03:43.2440453Z ok: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-02T16:03:43.2486491Z Friday 02 October 2026  13:03:43 -0300 (0:00:01.042)       0:00:12.837 ******** 
2026-10-02T16:03:43.5084107Z 
2026-10-02T16:03:43.5084820Z TASK [nfs : Executar o comando abaixo para limitar as portas] ******************
2026-10-02T16:03:43.5085004Z changed: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-02T16:03:43.5118996Z Friday 02 October 2026  13:03:43 -0300 (0:00:00.263)       0:00:13.100 ******** 
2026-10-02T16:03:53.8941060Z 
2026-10-02T16:03:53.8941595Z TASK [nfs : Networker | Restart networker] *************************************
2026-10-02T16:03:53.8942001Z changed: [caddeapllx2821.agil.nprd.caixa.gov.br]
2026-10-02T16:03:53.8974116Z Friday 02 October 2026  13:03:53 -0300 (0:00:10.385)       0:00:23.486 ******** 
2026-10-02T16:06:57.0334821Z 
2026-10-02T16:06:57.0335527Z TASK [nfs : Montando volume remoto] ********************************************
2026-10-02T16:06:57.0335800Z fatal: [caddeapllx2821.agil.nprd.caixa.gov.br]: FAILED! => {"changed": false, "msg": "Error mounting /SICCV: mount.nfs: Connection timed out\n"}
2026-10-02T16:06:57.0337834Z ...ignoring
2026-10-02T16:06:57.0367170Z Friday 02 October 2026  13:06:57 -0300 (0:03:03.139)       0:03:26.625 ******** 
2026-10-02T16:06:57.1169975Z 
2026-10-02T16:06:57.1170579Z TASK [nfs : Validando Montagem] ************************************************
2026-10-02T16:06:57.1171456Z fatal: [caddeapllx2821.agil.nprd.caixa.gov.br]: FAILED! => {
2026-10-02T16:06:57.1171956Z     "assertion": "'Connection refused' in mountnfs.msg", 
2026-10-02T16:06:57.1172346Z     "changed": false, 
2026-10-02T16:06:57.1172535Z     "evaluated_to": false, 
2026-10-02T16:06:57.1172781Z     "msg": "Erro desconhecido: Error mounting /SICCV: mount.nfs: Connection timed out\n"
2026-10-02T16:06:57.1172987Z }
2026-10-02T16:06:57.1181375Z 
2026-10-02T16:06:57.1182069Z PLAY RECAP *********************************************************************
2026-10-02T16:06:57.1182307Z caddeapllx2821.agil.nprd.caixa.gov.br : ok=27   changed=8    unreachable=0    failed=1    skipped=0    rescued=0    ignored=3   
2026-10-02T16:06:57.1182412Z 
2026-10-02T16:06:57.1182727Z Friday 02 October 2026  13:06:57 -0300 (0:00:00.081)       0:03:26.707 ******** 
2026-10-02T16:06:57.1182907Z =============================================================================== 
2026-10-02T16:06:57.1183230Z nfs : Montando volume remoto ------------------------------------------ 183.14s
2026-10-02T16:06:57.1183464Z nfs : Networker | Restart networker ------------------------------------ 10.39s
2026-10-02T16:06:57.1183693Z nfs : Instalando o NFS Client ------------------------------------------- 3.52s
2026-10-02T16:06:57.1183922Z nfs : execute montagem script ------------------------------------------- 3.31s
2026-10-02T16:06:57.1184162Z nfs : Networker | Start networker --------------------------------------- 1.04s
2026-10-02T16:06:57.1184665Z nfs : Install networker lgtoclnt_url ------------------------------------ 0.75s
2026-10-02T16:06:57.1184888Z nfs : Install networker lgtonmda_url ------------------------------------ 0.70s
2026-10-02T16:06:57.1185113Z Verifica se o arquivo nfs_config.json existe ---------------------------- 0.60s
2026-10-02T16:06:57.1185408Z nfs : Coletar variáveis de ambiente ------------------------------------- 0.53s
2026-10-02T16:06:57.1185637Z nfs : Remove pacote jbcs-httpd ------------------------------------------ 0.47s
2026-10-02T16:06:57.1185856Z nfs : execute clean json ------------------------------------------------ 0.40s
2026-10-02T16:06:57.1186067Z nfs : Executar o comando abaixo para limitar as portas ------------------ 0.26s
2026-10-02T16:06:57.1186300Z nfs : Create a symbolic link -------------------------------------------- 0.25s
2026-10-02T16:06:57.1186519Z nfs : Validando Montagem ------------------------------------------------ 0.08s
2026-10-02T16:06:57.1186754Z nfs : include_tasks ----------------------------------------------------- 0.07s
2026-10-02T16:06:57.1186969Z nfs : Criar variáveis --------------------------------------------------- 0.07s
2026-10-02T16:06:57.1187262Z nfs : Criar variáveis --------------------------------------------------- 0.07s
2026-10-02T16:06:57.1187500Z nfs : ansible.builtin.debug --------------------------------------------- 0.07s
2026-10-02T16:06:57.1187717Z nfs : Parse JSON data --------------------------------------------------- 0.07s
2026-10-02T16:06:57.1187930Z nfs : result_new_string_json -------------------------------------------- 0.06s
2026-10-02T16:06:57.1188168Z Playbook run took 0 days, 0 hours, 3 minutes, 26 seconds
2026-10-02T16:06:57.1865536Z ##[debug]Exit code 2 received from tool '/bin/bash'
2026-10-02T16:06:57.1889873Z ##[debug]STDIO streams have closed for tool '/bin/bash'
2026-10-02T16:06:57.1890337Z ##[error]Bash exited with code '2'.
2026-10-02T16:06:57.1890796Z ##[debug]Processed: ##vso[task.issue type=error;]Bash exited with code '2'.
2026-10-02T16:06:57.1891109Z ##[debug]task result: Failed
2026-10-02T16:06:57.1892191Z ##[debug]Processed: ##vso[task.complete result=Failed;done=true;]
2026-10-02T16:06:57.1907612Z ##[debug]Failure attempting to call the restapi and retry counter is exhausted
2026-10-02T16:06:57.1908119Z ##[debug]PERF: RetryHelper Method:System.Threading.Tasks.Task <RunAsync>b__9() : took 209004.9195 ms
2026-10-02T16:06:57.1908292Z ##[debug]PERF WARNING: RetryHelper Method:System.Threading.Tasks.Task <RunAsync>b__9() : took 209004.9195 ms
2026-10-02T16:06:57.1909497Z ##[section]Finishing: Configura Control-M

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
SICCV-batch
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
All pipelines

SICCV

SICCV-batch
Predefined variables
Usuario-Azure-DevOps (12)
Scopes: Release
OKD-PRODUTOS (8)
Credenciais para o Cluster OKD4 de PRODUTOS
Scopes: Release
SonarQube Variables (1)
Variáveis com dados do SonarQube
Scopes: Release
MONITORACAO_LOGS (4)
REQ000143540550 - Conforme autorizado na req por FLAVIO ALMEIDA GAGLIARDI, removido as variáveis JAVA_OPTS_MONITORING e URL_APM_SERVER, por entrar em conflitos com releases que utilizam o Application Insights
Scopes: Release
TERRAFORM-ESTEIRA-COMMON (6)
WO0000079295714 - add variável INFRAFACIL
Scopes: Release
ANSIBLE_JBOSS_VM_VERSION_3 (11)
WO0000072264656 - Config Portal Infrafácil NO_PROXY cadsvgerap027-1.intra.caixa.gov.br, 10.122.144.168
Scopes: Release
ADAPTER_VARIABLES (9)
Variáveis disponíveis para todas os projetos do tipo ADAPTER.
Scopes: Release
TERRAFORM-ESTEIRA-NPRD (17)
Variáveis do terraform para automação de ambientes
Scopes: EC DES,EC TQS,EC HMP
sample-java-des (13)
WO0000081293906 - SISME
Scopes: EC DES,EC TQS
Compartilhamentos (4)
Scopes: EC DES,EC TQS,EC HMP,EC PRD CTC,EC PRD DTC
SICCV-batch-des (7)
WO0000079799413
Scopes: EC DES
CV_SENHAORACLE
********
CV_USUARIOORACLE
CCVUSR02
NFS_ENDPOINT_ISILON
nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SICCV
NFS_MOUNT_POINT_ISILON
/SICCV
SENHASERVICO
********
USUARIOSERVICO
SCCVD001
aaaaaaa
aaaa
SICCV-batch-tqs (7)
WO0000081782658

Scopes: EC TQS
CV_SENHAORACLE
********
CV_USUARIOORACLE
CCVUSR02
NFS_ENDPOINT_ISILON
nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTISP/SICCV
NFS_MOUNT_POINT_ISILON
/SICCV
SENHASERVICO
********
USUARIOSERVICO
SCCVD001
aaaaaaa
aaaa
sample-java-hmp (13)
WO0000081430821
Scopes: EC HMP
TERRAFORM-ESTEIRA-PRD-CTC-NPCN (17)
Variáveis do terraform para automação de ambientes TERRAFORM_VSPHERE_POOL - RP_ESTEIRAS_AGEIS_NPCN_CTC_V7 13/03/2025
Scopes: EC PRD CTC
sample-java-prd (10)
Scopes: EC PRD CTC,EC PRD DTC
TERRAFORM-ESTEIRA-PRD-DTC-PCN (15)
Variáveis do terraform para automação de ambientes
Scopes: EC PRD DTC
|Manage variable groups
Collapsed

Expanded

Expanded

Collapsed

121 pipelines found

Select a release pipeline to view its releases

3 pipelines found

Select a release pipeline to view its releases

1 pipelines found

Row 2

Row 2

Showing filters 1 through 2



