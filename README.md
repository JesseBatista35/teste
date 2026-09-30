Verificar os erros nas stages de DES e TQS do módulo SISPL-atendimento-loterico-OCP4-PLUS



Selecione a sua Comunidade*:	Loterias e Canais Parceiros
Qual o ambiente da falha?*:	Aplicação nas Esteiras DevOps
Qual o nome do Sistema?*:	SISPL-atendimento-loterico-OCP4-PLUS
Formas de Contato*:	teams
Descreva detalhadamente a falha*:	Solicitamos verificar os erros nas stages de DES e TQS do módulo SISPL-atendimento-loterico-OCP4-PLUS
https://devops.caixa/projetos/Caixa/_releaseProgress?_a=release-environment-logs&releaseId=529024&environmentId=2457703

Estamos tentando migrar o módulo para o Openshift Plus não até o momento o deploy continua dando erro


Histórico de Informações de Trabalho da Ordem de Trabalho
ID da Ordem de Trabalho	 WO0000081669519
Criado em	 29/09/2026 21:52:33
Criado por	 P507043
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Foi criada sala no teams com envolvimento das equipes de NPRD , Esteiras Devops e Nuvem a fim de descobrir quais são os agentes e nodes que estao cadastrados no ambiente para solicitarmos acesso ou regra de firewall .
Sala continuara amanha dia 30/09

Att
ID da Ordem de Trabalho	 WO0000081669519
Criado em	 29/09/2026 17:59:36
Criado por	 C151305
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À CTIS / CESTI / Esteira DEVOPS DES TQS NPRD

Prezados,

1. Em contato com o suporte para verificar os erros apresentados, foi constatado que o SISPL em DES está sendo migrado para o OCP-PLUS e neste ambiente não há liberação de regras de firewall para o cofre de senhas.

2. A solicitação de regra de firewall deve ser realizada utilizando o objeto COFRE_BEYOND_TRUST.

3. À disposição.

Atenciosamente,
CEPRO – CN Proteção em Segurança Digital
ID da Ordem de Trabalho	 WO0000081669519
Criado em	 28/09/2026 08:05:10
Criado por	 P558217
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 A


CEPRO,

Favor avaliar a demanda e a nota anterior

Segue erro abaixo:

ERRO: Nao foram encontrados arquivos com segredos no diretorio '/usr/src/app/secrets_files'


Segue em anexo a evidência


at.te

Thiago Pereira
Preposto p558217
CTIS / CESTI Esteira DEVOPS DES TQS NPRD
ID da Ordem de Trabalho	 WO0000081669519
Criado em	 28/09/2026 07:52:44
Criado por	 P719371
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Favor analisar os arquivos gerados no momento da execução do POD.
ID da Ordem de Trabalho	 WO0000081669519
Criado em	 28/09/2026 01:11:43
Criado por	 P510636
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezados,

Segue para análise de pertinência.

Atenciosamente,

Raimundo Vaz de Sousa - p510636
PREPOSTO - GLOBAL HITSS - SEGURANÇA DE PERÍMETRO
CEPRO - CN PROTEÇÕES EM SEGURANÇA DIGITAL
ID da Ordem de Trabalho	 WO0000081669519
Criado em	 28/09/2026 00:01:59
Criado por	 P761271
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezados,
Segue para análise de pertinência.

Segurança e Proteção de dados
HITSS/CEPRO
ID da Ordem de Trabalho	 WO0000081669519
Criado em	 28/09/2026 00:00:26
Criado por	 P554859
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezados,

Conforme nota anterior aqui da CEPRO, o erro apresentado é uma falha de conectividade. Não tratamos de erros relacionados à rotas e regras de firewall.

Atenciosamente,
P554859 - Plataforma Intermediária
HITSS/CEPRO20 - Identidade e acesso
ID da Ordem de Trabalho	 WO0000081669519
Criado em	 25/09/2026 19:19:57
Criado por	 P635388
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezados,

Informamos que ao verificar o POD ainda apresenta o erro abaixo ao tentar logar no cofre de senhas.

requests.exceptions.ConnectTimeout: HTTPSConnectionPool(host='sicsn.caixa', port=443): Max retries exceeded with url: /BeyondTrust/api/public/v3/Auth/connect/token (Caused by ConnectTimeoutError(<urllib3.connection.HTTPSConnection object at 0x7f6013bd0cd0>, 'Connection to sicsn.caixa timed out. (connect timeout=30)'))
2026-09-25 22:18:25,100 ERROR (be4eae00-b92e-11f1-bfb1-0a5819810664) There was an error in the execution: HTTPSConnectionPool(host='sicsn.caixa', port=443): Max retries exceeded with url: /BeyondTrust/api/public/v3/Auth/connect/token (Caused by ConnectTimeoutError(<urllib3.connection.HTTPSConnection object at 0x7f6013bd0cd0>, 'Connection to sicsn.caixa timed out. (connect timeout=30)'))


Solicitamos uma sala em conjunto com a equipe de infra responsável pelo OCP4 e a equipe de segurança para validarmos a conexão

https://console-openshift-console.apps.nctvmrh001.nuvem.caixa/

Att
ID da Ordem de Trabalho	 WO0000081669519
Criado em	 25/09/2026 14:20:39
Criado por	 P745682
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezados(as)

A equipe de Multiplataformas e SO não tem acesso aos servidores do BeyondTrust, são mantido pela equipe de segurança.

Se houver dúvidas, podemos esclarecer via Teams.

Atenciosamente,

[ Jose Vidal ]
[ CTIS | CESTI | Multi - Suporte a SO ]
[ p745682@corp.caixa.gov.br ]
[ jose.vidalm@sonda.com ]
ID da Ordem de Trabalho	 WO0000081669519
Criado em	 25/09/2026 09:34:30
Criado por	 P768728
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À Equipe

Multi Suporte S.O

Solicitamos apoio para atendimento dessa demanda.
A equipe NPRD atua apenas em servidores Linux, impossibilitando o atendimento.

Desde já agradecemos a compreensão.

Atte.

ESTEIRAS DEVOPS DES TQS
ID da Ordem de Trabalho	 WO0000081669519
Criado em	 25/09/2026 08:52:23
Criado por	 P558217
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À CAIXA,



Em razão do tempo decorrido entre a abertura desta WO e sua efetiva chegada à nossa fila de atendimento, ocorrida já com o SLA expirado, gostaríamos de registrar que o SLA sob responsabilidade da Esteira DevOps NPRD é de 24 horas úteis, contadas a partir do momento em que a demanda é direcionada para nossa equipe.



Dessa forma, solicitamos que eventuais sanções decorrentes da quebra de SLA não sejam atribuídas à nossa esteira, uma vez que não possuímos governança sobre os fluxos de atendimento, tratativas e encaminhamentos realizados pelas demais macrocélulas envolvidas no processo.



Contamos com a compreensão de todos e permanecemos à disposição para quaisquer esclarecimentos.



Atenciosamente,



Esteira DevOps NPRD
ID da Ordem de Trabalho	 WO0000081669519
Criado em	 21/09/2026 14:03:49
Criado por	 C054346
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezado(a)

1. A solução do cofre de senhas é composta por um conjunto de servidores. Segue a relação:
Servidores

   DADNPAPLNT020.intra.caixa.gov.br (10.221.68.28) - Console de gerência
   CADNPAPLNT005.intra.caixa.gov.br (10.121.68.153)
   CADNPAPLNT006.intra.caixa.gov.br (10.121.68.154)
   CADNPAPLNT021.intra.caixa.gov.br (10.121.68.202)
   CADNPAPLNT022.intra.caixa.gov.br (10.121.68.203)
   CADNPAPLNT024.intra.caixa.gov.br (10.121.68.205)
   CADNPAPLNT025.intra.caixa.gov.br (10.121.68.180)
   DADNPAPLNT021.intra.caixa.gov.br (10.221.68.29)
   DADNPAPLNT022.intra.caixa.gov.br (10.221.68.30)
   DADNPAPLNT029.intra.caixa.gov.br (10.221.68.43)
   DADNPAPLNT030.intra.caixa.gov.br (10.221.68.36)
   DADNPAPLNT031.intra.caixa.gov.br (10.221.68.37)

2. A URL de gerência foi testada. O servidor está operacional. Segue evidência (20260921_WO0000081669519.png) em anexo.

2.1 A URL de (https://sicsn.caixa) está operacional. Segue evidência (20290921_REQ000146023827) em anexo.

3. Caso seja necessário reiniciar algum dos servidores que atendem a URL https://sicsn.caixa, esta ação será executada pela CESTI.


Atenciosamente

CEPRO20
ID da Ordem de Trabalho	 WO0000081669519
Criado em	 21/09/2026 13:10:49
Criado por	 P548031
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezado,

O erro para inicializar o conteiner se deve a indisponibilidade do BeyondTrust.

Segue evidência em anexo.

Atenciosamente
ID da Ordem de Trabalho	 WO0000081669519
Criado em	 21/09/2026 10:53:18
Criado por	 P564239
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À CAIXA
C/C
IGOR D LIMA MACEDO

Aguardando acesso para o devops.caixa.

Atenciosamente,
Taironne Matos
CTIS /CESTI/Nuvem Publica
ID da Ordem de Trabalho	 WO0000081669519
Criado em	 18/09/2026 12:07:30
Criado por	 P670581
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezados(as),

Ao tentar realizar tratativa da demanda, foi verificado que o projeto se encontra no DEVOPS.CAIXA. Não temos permissão para acessar nem o cluster e nem a pipeline informada.

Atenciosamente,
Rayanna Ernesto
CTIS/CESTI/Suporte Nuvem Publica
ID da Ordem de Trabalho	 WO0000081669519
Criado em	 18/09/2026 07:05:52
Criado por	 P558217
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À

Nuvem Pública,


Favor analisar a demanda conforme nota do analista no dia 17/09/206 às 15h13. Necessário parecer técnico.

Atte.

CTIS / CESTI Esteira DEVOPS DES TQS NPRD
ID da Ordem de Trabalho	 WO0000081669519
Criado em	 17/09/2026 23:46:56
Criado por	 P780924
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À Equipe  Esteira

Segue para análise.


Atenciosamente,
Weslei Souza
Preposto
CTIS /CESTI/Nuvem Publica
ID da Ordem de Trabalho	 WO0000081669519
Criado em	 17/09/2026 15:13:06
Criado por	 P635388
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezados,

Solicitamos encaminhar o chamado para a equipe de Nuvem

À
Equipe,

Conforme nota da segurança, solicitamos verificar a conectividade dos nodes do OCP4 com o cofre de senha.

Informamos que não temos os nodes cadastrados para o OCP4
https://console-openshift-console.apps.nctvmrh001.nuvem.caixa

Att
ID da Ordem de Trabalho	 WO0000081669519
Criado em	 17/09/2026 13:35:31
Criado por	 P535215
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Acrescentando que não existe ação pela equipe de segurança no momento, uma vez que não ocorreu autenticação. Avisos não são erros, apenas informam que algo que deveria ocorrer antes não aconteceu.

Atenciosamente,
P535215 - Baixa Plataforma
HITSS/CEPRO20 - Gestão de Identidade e acesso
ID da Ordem de Trabalho	 WO0000081669519
Criado em	 17/09/2026 13:33:19
Criado por	 P535215
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 REITERANDO

A CESTI\NPRD
Não se trata de erro de autenticação, e sim conectividade. Verificar:
- Rotas
- Firewall

O erro apresentado éfalha de conectividade TCP para sicsn.caixa:443, resultando em timeout após 30 segundos.
Se não tiver conexão, não tem autenticação, verificar conexão antes para depois seguir para outros passos
Recomendo verificar:
1. DNS
2. Conectividade TCP
3. HTTPS
4. Verificar execução no pod

Atenciosamente,
P535215 - Baixa Plataforma
HITSS/CEPRO20 - Gestão de Identidade e acesso
ID da Ordem de Trabalho	 WO0000081669519
Criado em	 17/09/2026 09:39:00
Criado por	 P558217
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 A


CEPRO,


Favor analista a demanda conforme nota técnica dos dias 16/09 as 16h02 e 17/09 as 09h31

Atte.



CTIS / CESTI Esteira DEVOPS DES TQS NPRD
ID da Ordem de Trabalho	 WO0000081669519
Criado em	 17/09/2026 09:31:44
Criado por	 P719371
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Favor verificar o erro apresentado no momento da execução do POD. Segue em anexo print com o erro mencionado.
ID da Ordem de Trabalho	 WO0000081669519
Criado em	 17/09/2026 07:25:54
Criado por	 P535215
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 A CESTI\NPRD
           Não se trata de erro de autenticação, e sim conectividade. Verificar:
- Rotas
- Firewall

O erro apresentado éfalha de conectividade TCP para sicsn.caixa:443, resultando em timeout após 30 segundos.

Atenciosamente,
P535215 - Baixa Plataforma
HITSS/CEPRO20 - Gestão de Identidade e acesso

ID da Ordem de Trabalho	 WO0000081669519
Criado em	 16/09/2026 16:02:15
Criado por	 P635388
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezados,

Solicitamos encaminhar o chamado para a equipe de segurança

À
CEPRO

Solicitamos verificar o valores cadastrados na library de VAULT do SISPL-atendimento-loterico-OCP4-PLUS

https://devops.caixa/projetos/Caixa/_apps/hub/ms.vss-distributed-task.hub-library?itemType=VariableGroups&view=VariableGroupView&variableGroupId=16770&path=SISPL-ATENDIMENTO-LOTERICO-BT-VAULT-DES

Ao iniciar o POD está apresentando erro de conexão com o cofre conforme log anexo.

Att
ID da Ordem de Trabalho	 WO0000081669519
Criado em	 16/09/2026 15:46:33
Criado por	 P779123
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Demanda inicial com viés de falha, erro, degradação ou esgotamento de infraestrutura, serviço, máquina, armazenamento, rotina ou situação que esteja na iminência de tornar-se incidente. Previsto atendimento no prazo indicado pelo demandante. [CENTRAL-SID]
ID da Ordem de Trabalho	 WO0000081669519
Criado em	 16/09/2026 15:17:44
Criado por	 P558217
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezado(a),



Informamos que sua solicitação de FALHA DE AMBIENTE foi recebida .  



Nosso SLA para atendimento é de até 4h úteis, analisaremos a solicitação para nos certificarmos que o atendimento está dentro do escopo de atuação da nossa equipe.



Caso seja identificado que o atendimento não corresponde ao nosso escopo, a solicitação será redirecionada à equipe responsável.



Novas informações e atualizações serão registradas diretamente nesta WO.



Atte.



Esteira Devops DES TQS NPRD  
ID da Ordem de Trabalho	 WO0000081669519
Criado em	 16/09/2026 15:15:01
Criado por	 Remedy Application Service
Origem de Comunicação	 E-mail
Exibir Acesso	 Interno
Notas	 Este ticket foi criado a partir do sistema de solicitação de serviço.
Impresso por P585600 em Quarta-feira, 30/09/2026 09:13:04


2026-09-28T10:45:59.2370516Z ##[debug]Evaluating condition for step: 'Verificando Status do Deployment'
2026-09-28T10:45:59.2371160Z ##[debug]Evaluating: succeeded()
2026-09-28T10:45:59.2371311Z ##[debug]Evaluating succeeded:
2026-09-28T10:45:59.2371617Z ##[debug]=> True
2026-09-28T10:45:59.2371784Z ##[debug]Result: True
2026-09-28T10:45:59.2371966Z ##[section]Starting: Verificando Status do Deployment
2026-09-28T10:45:59.2375034Z ==============================================================================
2026-09-28T10:45:59.2375127Z Task         : Bash
2026-09-28T10:45:59.2375170Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-28T10:45:59.2375259Z Version      : 3.227.0
2026-09-28T10:45:59.2375305Z Author       : Microsoft Corporation
2026-09-28T10:45:59.2375360Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-28T10:45:59.2375441Z ==============================================================================
2026-09-28T10:45:59.2960783Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-09-28T10:45:59.3762237Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-09-28T10:45:59.3769608Z ##[debug]loading inputs and endpoints
2026-09-28T10:45:59.3776468Z ##[debug]loading INPUT_TARGETTYPE
2026-09-28T10:45:59.3784297Z ##[debug]loading INPUT_FILEPATH
2026-09-28T10:45:59.3786371Z ##[debug]loading INPUT_SCRIPT
2026-09-28T10:45:59.3786822Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-09-28T10:45:59.3787226Z ##[debug]loading INPUT_FAILONSTDERR
2026-09-28T10:45:59.3787803Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-09-28T10:45:59.3788299Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-09-28T10:45:59.3790542Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-09-28T10:45:59.3795759Z ##[debug]loading SECRET_OKD_TOKEN_REGISTRY
2026-09-28T10:45:59.3797465Z ##[debug]loading SECRET_ALOCAIP_SENHA
2026-09-28T10:45:59.3799122Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-09-28T10:45:59.3801072Z ##[debug]loading SECRET_PASSWORD_CGC
2026-09-28T10:45:59.3802655Z ##[debug]loading SECRET_OPENSHIFT_LOTERIAS_TOKEN_NPRD
2026-09-28T10:45:59.3803887Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-09-28T10:45:59.3804420Z ##[debug]loading SECRET_BT_CLIENT_SECRET
2026-09-28T10:45:59.3805086Z ##[debug]loading SECRET_TOKEN_CRQ
2026-09-28T10:45:59.3805685Z ##[debug]loading SECRET_AZPAT
2026-09-28T10:45:59.3806285Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-09-28T10:45:59.3807045Z ##[debug]loading SECRET_GRAYLOG_PASSWORD
2026-09-28T10:45:59.3807598Z ##[debug]loading SECRET_VAULT_LOCATION
2026-09-28T10:45:59.3809381Z ##[debug]loading SECRET_FORTIFY_PASS
2026-09-28T10:45:59.3809757Z ##[debug]loaded 21
2026-09-28T10:45:59.3815564Z ##[debug]Agent.ProxyUrl=undefined
2026-09-28T10:45:59.3815862Z ##[debug]Agent.CAInfo=undefined
2026-09-28T10:45:59.3816106Z ##[debug]Agent.ClientCert=undefined
2026-09-28T10:45:59.3816349Z ##[debug]Agent.SkipCertValidation=True
2026-09-28T10:45:59.3831571Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-09-28T10:45:59.3833221Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-09-28T10:45:59.3833533Z ##[debug]system.culture=en-US
2026-09-28T10:45:59.3842012Z ##[debug]failOnStderr=false
2026-09-28T10:45:59.3842699Z ##[debug]workingDirectory=/opt/ads-agent/_work/r1031/a
2026-09-28T10:45:59.3842974Z ##[debug]check path : /opt/ads-agent/_work/r1031/a
2026-09-28T10:45:59.3844379Z ##[debug]targetType=inline
2026-09-28T10:45:59.3844618Z ##[debug]bashEnvValue=undefined
2026-09-28T10:45:59.3845392Z ##[debug]script=if [[ -n "$SITE" && "$SITE" =~ (okd4|ocp|openshift) ]];
then
  app="sispl-atendimento-loterico-des"
else
  app="sispl-atendimento-loterico-des-esteiras"
fi

oc rollout status deployment/"$app"  --request-timeout=600 -n sispl-des
if [ "$?" -ne "0" ]; then
  echo "A aplicação não foi iniciada com sucesso!"
  echo "Os logs da aplicação estão disponíveis na próxima task: Logs da Aplicação"
  exit 1
fi
2026-09-28T10:45:59.3854342Z Generating script.
2026-09-28T10:45:59.3856174Z ##[debug]which 'bash'
2026-09-28T10:45:59.3865676Z ##[debug]found: '/usr/bin/bash'
2026-09-28T10:45:59.3866549Z ##[debug]Agent.Version=3.236.1
2026-09-28T10:45:59.3866800Z ##[debug]agent.tempDirectory=/opt/ads-agent/_work/_temp
2026-09-28T10:45:59.3867052Z ##[debug]check path : /opt/ads-agent/_work/_temp
2026-09-28T10:45:59.3871242Z ========================== Starting Command Output ===========================
2026-09-28T10:45:59.3873267Z ##[debug]which '/usr/bin/bash'
2026-09-28T10:45:59.3874714Z ##[debug]found: '/usr/bin/bash'
2026-09-28T10:45:59.3875664Z ##[debug]/usr/bin/bash arg: /opt/ads-agent/_work/_temp/7b98377d-2512-4664-b1e0-d993c5a187ff.sh
2026-09-28T10:45:59.3879780Z ##[debug]exec tool: /usr/bin/bash
2026-09-28T10:45:59.3880159Z ##[debug]arguments:
2026-09-28T10:45:59.3880427Z ##[debug]   /opt/ads-agent/_work/_temp/7b98377d-2512-4664-b1e0-d993c5a187ff.sh
2026-09-28T10:45:59.3882620Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/7b98377d-2512-4664-b1e0-d993c5a187ff.sh
2026-09-28T10:45:59.4805413Z Waiting for deployment "sispl-atendimento-loterico-des" rollout to finish: 1 old replicas are pending termination...
2026-09-28T10:46:03.5866954Z ##[debug]Agent environment resources - Disk: / Available 54005.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 16.26%
2026-09-28T10:46:08.5869129Z ##[debug]Agent environment resources - Disk: / Available 54005.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 14.70%
2026-09-28T10:46:13.5875628Z ##[debug]Agent environment resources - Disk: / Available 53988.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 13.40%
2026-09-28T10:46:18.5889933Z ##[debug]Agent environment resources - Disk: / Available 53989.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 12.32%
2026-09-28T10:46:23.5898861Z ##[debug]Agent environment resources - Disk: / Available 53989.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 11.41%
2026-09-28T10:46:28.5912441Z ##[debug]Agent environment resources - Disk: / Available 53989.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 10.62%
2026-09-28T10:46:33.5916578Z ##[debug]Agent environment resources - Disk: / Available 53983.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 9.93%
2026-09-28T10:46:38.5922677Z ##[debug]Agent environment resources - Disk: / Available 53983.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 9.34%
2026-09-28T10:46:43.5930739Z ##[debug]Agent environment resources - Disk: / Available 53983.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 8.82%
2026-09-28T10:46:48.5940525Z ##[debug]Agent environment resources - Disk: / Available 53983.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 8.35%
2026-09-28T10:46:53.5946663Z ##[debug]Agent environment resources - Disk: / Available 53984.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 7.92%
2026-09-28T10:46:58.5945656Z ##[debug]Agent environment resources - Disk: / Available 53984.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 7.55%
2026-09-28T10:47:03.5956299Z ##[debug]Agent environment resources - Disk: / Available 53985.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 7.20%
2026-09-28T10:47:08.5963766Z ##[debug]Agent environment resources - Disk: / Available 53984.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 6.89%
2026-09-28T10:47:13.5969197Z ##[debug]Agent environment resources - Disk: / Available 53984.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 6.61%
2026-09-28T10:47:18.5976709Z ##[debug]Agent environment resources - Disk: / Available 53984.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 6.36%
2026-09-28T10:47:23.5988381Z ##[debug]Agent environment resources - Disk: / Available 53984.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 6.11%
2026-09-28T10:47:28.6003307Z ##[debug]Agent environment resources - Disk: / Available 53984.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 5.88%
2026-09-28T10:47:33.6015902Z ##[debug]Agent environment resources - Disk: / Available 53976.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 5.68%
2026-09-28T10:47:38.6022743Z ##[debug]Agent environment resources - Disk: / Available 53976.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 5.48%
2026-09-28T10:47:43.6042419Z ##[debug]Agent environment resources - Disk: / Available 53973.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 5.30%
2026-09-28T10:47:48.6049010Z ##[debug]Agent environment resources - Disk: / Available 53974.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 5.15%
2026-09-28T10:47:53.6058666Z ##[debug]Agent environment resources - Disk: / Available 53974.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.98%
2026-09-28T10:47:58.6066737Z ##[debug]Agent environment resources - Disk: / Available 53974.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.84%
2026-09-28T10:48:03.6065720Z ##[debug]Agent environment resources - Disk: / Available 53974.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.70%
2026-09-28T10:48:08.6065647Z ##[debug]Agent environment resources - Disk: / Available 53974.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.56%
2026-09-28T10:48:13.6070642Z ##[debug]Agent environment resources - Disk: / Available 53966.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.44%
2026-09-28T10:48:18.6074524Z ##[debug]Agent environment resources - Disk: / Available 53966.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.32%
2026-09-28T10:48:23.6082774Z ##[debug]Agent environment resources - Disk: / Available 53966.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.21%
2026-09-28T10:48:28.6093614Z ##[debug]Agent environment resources - Disk: / Available 53966.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.10%
2026-09-28T10:48:33.6103298Z ##[debug]Agent environment resources - Disk: / Available 53958.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 4.01%
2026-09-28T10:48:38.6110956Z ##[debug]Agent environment resources - Disk: / Available 53958.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.91%
2026-09-28T10:48:43.6119590Z ##[debug]Agent environment resources - Disk: / Available 53958.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.82%
2026-09-28T10:48:48.6119175Z ##[debug]Agent environment resources - Disk: / Available 53958.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.74%
2026-09-28T10:48:53.6130452Z ##[debug]Agent environment resources - Disk: / Available 53942.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.65%
2026-09-28T10:48:58.6135747Z ##[debug]Agent environment resources - Disk: / Available 53942.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.58%
2026-09-28T10:49:03.6138749Z ##[debug]Agent environment resources - Disk: / Available 53942.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.50%
2026-09-28T10:49:08.6148107Z ##[debug]Agent environment resources - Disk: / Available 53942.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.43%
2026-09-28T10:49:13.6170851Z ##[debug]Agent environment resources - Disk: / Available 53942.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.36%
2026-09-28T10:49:18.6179932Z ##[debug]Agent environment resources - Disk: / Available 53942.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.29%
2026-09-28T10:49:23.6195451Z ##[debug]Agent environment resources - Disk: / Available 53942.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.23%
2026-09-28T10:49:28.6203041Z ##[debug]Agent environment resources - Disk: / Available 53942.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.17%
2026-09-28T10:49:33.6208557Z ##[debug]Agent environment resources - Disk: / Available 53942.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.11%
2026-09-28T10:49:38.6222221Z ##[debug]Agent environment resources - Disk: / Available 53942.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.06%
2026-09-28T10:49:43.6229618Z ##[debug]Agent environment resources - Disk: / Available 53941.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 3.00%
2026-09-28T10:49:48.6240345Z ##[debug]Agent environment resources - Disk: / Available 53934.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.95%
2026-09-28T10:49:53.6252471Z ##[debug]Agent environment resources - Disk: / Available 53934.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.90%
2026-09-28T10:49:58.6258826Z ##[debug]Agent environment resources - Disk: / Available 53934.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.85%
2026-09-28T10:50:03.6270065Z ##[debug]Agent environment resources - Disk: / Available 53934.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.80%
2026-09-28T10:50:08.6278141Z ##[debug]Agent environment resources - Disk: / Available 53934.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.76%
2026-09-28T10:50:13.6279415Z ##[debug]Agent environment resources - Disk: / Available 53934.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.72%
2026-09-28T10:50:18.6288563Z ##[debug]Agent environment resources - Disk: / Available 53934.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.67%
2026-09-28T10:50:23.6301467Z ##[debug]Agent environment resources - Disk: / Available 53934.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.63%
2026-09-28T10:50:28.6308369Z ##[debug]Agent environment resources - Disk: / Available 53934.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.60%
2026-09-28T10:50:33.6315687Z ##[debug]Agent environment resources - Disk: / Available 53934.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.56%
2026-09-28T10:50:38.6328469Z ##[debug]Agent environment resources - Disk: / Available 53934.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.52%
2026-09-28T10:50:43.6337882Z ##[debug]Agent environment resources - Disk: / Available 53934.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.49%
2026-09-28T10:50:48.6353988Z ##[debug]Agent environment resources - Disk: / Available 53934.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.45%
2026-09-28T10:50:53.6358546Z ##[debug]Agent environment resources - Disk: / Available 53934.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.41%
2026-09-28T10:50:58.6373181Z ##[debug]Agent environment resources - Disk: / Available 53934.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.39%
2026-09-28T10:51:03.6374620Z ##[debug]Agent environment resources - Disk: / Available 53926.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.35%
2026-09-28T10:51:08.6377635Z ##[debug]Agent environment resources - Disk: / Available 53926.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.32%
2026-09-28T10:51:13.6389980Z ##[debug]Agent environment resources - Disk: / Available 53926.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.29%
2026-09-28T10:51:18.6396196Z ##[debug]Agent environment resources - Disk: / Available 53926.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.26%
2026-09-28T10:51:23.6395585Z ##[debug]Agent environment resources - Disk: / Available 53934.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.24%
2026-09-28T10:51:28.6403315Z ##[debug]Agent environment resources - Disk: / Available 53934.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.21%
2026-09-28T10:51:33.6405389Z ##[debug]Agent environment resources - Disk: / Available 53934.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.18%
2026-09-28T10:51:38.6422277Z ##[debug]Agent environment resources - Disk: / Available 53934.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.16%
2026-09-28T10:51:43.6427713Z ##[debug]Agent environment resources - Disk: / Available 53932.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.13%
2026-09-28T10:51:48.6442243Z ##[debug]Agent environment resources - Disk: / Available 53933.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.11%
2026-09-28T10:51:53.6453030Z ##[debug]Agent environment resources - Disk: / Available 53933.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.08%
2026-09-28T10:51:58.6458770Z ##[debug]Agent environment resources - Disk: / Available 53933.00 MB out of 122356.00 MB, Unable to get memory info, exception: "free" utility is unavailable. Exception: An error occurred trying to start process 'free' with working directory '/opt/ads-agent/bin'. No such file or directory, CPU: Usage 2.06%
2026-09-28T10:51:59.2432175Z ##[debug]Started cancellation of executing script
2026-09-28T10:51:59.2439358Z ##[debug]Exit code null received from tool '/usr/bin/bash'
2026-09-28T10:52:06.7496209Z ##[error]The task has timed out.
2026-09-28T10:52:06.7497239Z ##[section]Finishing: Verificando Status do Deployment


2026-09-28T10:52:06.7519915Z ##[debug]Evaluating condition for step: 'Logs da Aplicação'
2026-09-28T10:52:06.7520478Z ##[debug]Evaluating: always()
2026-09-28T10:52:06.7520622Z ##[debug]Evaluating always:
2026-09-28T10:52:06.7521417Z ##[debug]=> True
2026-09-28T10:52:06.7521680Z ##[debug]Result: True
2026-09-28T10:52:06.7521852Z ##[section]Starting: Logs da Aplicação
2026-09-28T10:52:06.7524880Z ==============================================================================
2026-09-28T10:52:06.7524959Z Task         : Bash
2026-09-28T10:52:06.7525010Z Description  : Run a Bash script on macOS, Linux, or Windows
2026-09-28T10:52:06.7525073Z Version      : 3.227.0
2026-09-28T10:52:06.7525125Z Author       : Microsoft Corporation
2026-09-28T10:52:06.7525177Z Help         : https://docs.microsoft.com/azure/devops/pipelines/tasks/utility/bash
2026-09-28T10:52:06.7525251Z ==============================================================================
2026-09-28T10:52:06.8167193Z ##[debug]Using node path: /opt/ads-agent/externals/node16/bin/node
2026-09-28T10:52:06.8871614Z ##[debug]agent.TempDirectory=/opt/ads-agent/_work/_temp
2026-09-28T10:52:06.8879579Z ##[debug]loading inputs and endpoints
2026-09-28T10:52:06.8886320Z ##[debug]loading INPUT_TARGETTYPE
2026-09-28T10:52:06.8894031Z ##[debug]loading INPUT_FILEPATH
2026-09-28T10:52:06.8895157Z ##[debug]loading INPUT_SCRIPT
2026-09-28T10:52:06.8895858Z ##[debug]loading INPUT_WORKINGDIRECTORY
2026-09-28T10:52:06.8897757Z ##[debug]loading INPUT_FAILONSTDERR
2026-09-28T10:52:06.8898143Z ##[debug]loading ENDPOINT_AUTH_SYSTEMVSSCONNECTION
2026-09-28T10:52:06.8898438Z ##[debug]loading ENDPOINT_AUTH_SCHEME_SYSTEMVSSCONNECTION
2026-09-28T10:52:06.8900059Z ##[debug]loading ENDPOINT_AUTH_PARAMETER_SYSTEMVSSCONNECTION_ACCESSTOKEN
2026-09-28T10:52:06.8904687Z ##[debug]loading SECRET_OKD_TOKEN_REGISTRY
2026-09-28T10:52:06.8905909Z ##[debug]loading SECRET_ALOCAIP_SENHA
2026-09-28T10:52:06.8907671Z ##[debug]loading SECRET_OKD_TOKEN_KAFKA
2026-09-28T10:52:06.8909351Z ##[debug]loading SECRET_PASSWORD_CGC
2026-09-28T10:52:06.8910907Z ##[debug]loading SECRET_OPENSHIFT_LOTERIAS_TOKEN_NPRD
2026-09-28T10:52:06.8912211Z ##[debug]loading SECRET_FORTIFY_APITOKEN
2026-09-28T10:52:06.8912769Z ##[debug]loading SECRET_BT_CLIENT_SECRET
2026-09-28T10:52:06.8913407Z ##[debug]loading SECRET_TOKEN_CRQ
2026-09-28T10:52:06.8914094Z ##[debug]loading SECRET_AZPAT
2026-09-28T10:52:06.8914659Z ##[debug]loading SECRET_BT_SECRETS_PATH
2026-09-28T10:52:06.8915268Z ##[debug]loading SECRET_GRAYLOG_PASSWORD
2026-09-28T10:52:06.8915782Z ##[debug]loading SECRET_VAULT_LOCATION
2026-09-28T10:52:06.8917128Z ##[debug]loading SECRET_FORTIFY_PASS
2026-09-28T10:52:06.8917671Z ##[debug]loaded 21
2026-09-28T10:52:06.8921628Z ##[debug]Agent.ProxyUrl=undefined
2026-09-28T10:52:06.8922019Z ##[debug]Agent.CAInfo=undefined
2026-09-28T10:52:06.8922287Z ##[debug]Agent.ClientCert=undefined
2026-09-28T10:52:06.8922583Z ##[debug]Agent.SkipCertValidation=True
2026-09-28T10:52:06.8937054Z ##[debug]check path : /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-09-28T10:52:06.8939146Z ##[debug]adding resource file: /opt/ads-agent/_work/_tasks/Bash_6c731c3c-3c68-459a-a5c9-bde6e6595b5b/3.227.0/task.json
2026-09-28T10:52:06.8939510Z ##[debug]system.culture=en-US
2026-09-28T10:52:06.8946967Z ##[debug]failOnStderr=false
2026-09-28T10:52:06.8948063Z ##[debug]workingDirectory=/opt/ads-agent/_work/r1031/a
2026-09-28T10:52:06.8948381Z ##[debug]check path : /opt/ads-agent/_work/r1031/a
2026-09-28T10:52:06.8949564Z ##[debug]targetType=inline
2026-09-28T10:52:06.8949854Z ##[debug]bashEnvValue=undefined
2026-09-28T10:52:06.8950612Z ##[debug]script=#!/bin/bash
set -o errexit
set -o pipefail
set -x

shopt -s expand_aliases

if [[ -n "$SITE" && "openshift_nprd_loterias" =~ "ocp" ]]
then
  app="sispl-atendimento-loterico-des"

  arquivo="/usr/local/bin/oc-v4.13"
  if [ -e "$arquivo" ]; then 
    alias oc="$arquivo"
  fi
elif [[ -n "$SITE" && "$SITE" =~ (okd4|openshift) ]];
then
app="sispl-atendimento-loterico-des"
else
  app="sispl-atendimento-loterico-des-esteiras"
fi

oc version

last_pod=$(oc get pod -l name="$app" -n sispl-des -o jsonpath='{range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp  | tac | grep -v '^$' | head -n1)

echo "Logs do POD: $last_pod"
oc logs $last_pod -c "$app" -n sispl-des
2026-09-28T10:52:06.8960190Z Generating script.
2026-09-28T10:52:06.8962802Z ##[debug]which 'bash'
2026-09-28T10:52:06.8968607Z ##[debug]found: '/usr/bin/bash'
2026-09-28T10:52:06.8969437Z ##[debug]Agent.Version=3.236.1
2026-09-28T10:52:06.8969796Z ##[debug]agent.tempDirectory=/opt/ads-agent/_work/_temp
2026-09-28T10:52:06.8970109Z ##[debug]check path : /opt/ads-agent/_work/_temp
2026-09-28T10:52:06.8975093Z ========================== Starting Command Output ===========================
2026-09-28T10:52:06.8975498Z ##[debug]which '/usr/bin/bash'
2026-09-28T10:52:06.8975802Z ##[debug]found: '/usr/bin/bash'
2026-09-28T10:52:06.8976125Z ##[debug]/usr/bin/bash arg: /opt/ads-agent/_work/_temp/a8f8e75f-d849-4d50-948f-e222224f9676.sh
2026-09-28T10:52:06.8977340Z ##[debug]exec tool: /usr/bin/bash
2026-09-28T10:52:06.8977616Z ##[debug]arguments:
2026-09-28T10:52:06.8977926Z ##[debug]   /opt/ads-agent/_work/_temp/a8f8e75f-d849-4d50-948f-e222224f9676.sh
2026-09-28T10:52:06.8979626Z [command]/usr/bin/bash /opt/ads-agent/_work/_temp/a8f8e75f-d849-4d50-948f-e222224f9676.sh
2026-09-28T10:52:06.9034921Z + shopt -s expand_aliases
2026-09-28T10:52:06.9035134Z + [[ -n openshift_nprd_loterias ]]
2026-09-28T10:52:06.9035293Z + [[ openshift_nprd_loterias =~ ocp ]]
2026-09-28T10:52:06.9035483Z + [[ -n openshift_nprd_loterias ]]
2026-09-28T10:52:06.9035632Z + [[ openshift_nprd_loterias =~ (okd4|openshift) ]]
2026-09-28T10:52:06.9035828Z + app=sispl-atendimento-loterico-des
2026-09-28T10:52:06.9035935Z + oc version
2026-09-28T10:52:06.9764537Z Client Version: v4.2.0-alpha.0-1394-g45460a5
2026-09-28T10:52:06.9764869Z Kubernetes Version: v1.33.12
2026-09-28T10:52:06.9794901Z ++ oc get pod -l name=sispl-atendimento-loterico-des -n sispl-des -o 'jsonpath={range .items[*]}{.metadata.name}{"\n"}' --sort-by=.metadata.creationTimestamp
2026-09-28T10:52:06.9795396Z ++ tac
2026-09-28T10:52:06.9795580Z ++ grep -v '^$'
2026-09-28T10:52:06.9796972Z ++ head -n1
2026-09-28T10:52:07.0682301Z + last_pod=sispl-atendimento-loterico-des-75f65768d4-hs69m
2026-09-28T10:52:07.0682634Z + echo 'Logs do POD: sispl-atendimento-loterico-des-75f65768d4-hs69m'
2026-09-28T10:52:07.0682896Z + oc logs sispl-atendimento-loterico-des-75f65768d4-hs69m -c sispl-atendimento-loterico-des -n sispl-des
2026-09-28T10:52:07.0683154Z Logs do POD: sispl-atendimento-loterico-des-75f65768d4-hs69m
2026-09-28T10:52:07.1513947Z Error from server (BadRequest): container "sispl-atendimento-loterico-des" in pod "sispl-atendimento-loterico-des-75f65768d4-hs69m" is waiting to start: PodInitializing
2026-09-28T10:52:07.1550082Z ##[debug]Exit code 1 received from tool '/usr/bin/bash'
2026-09-28T10:52:07.1554162Z ##[debug]STDIO streams have closed for tool '/usr/bin/bash'
2026-09-28T10:52:07.1582773Z ##[error]Bash exited with code '1'.
2026-09-28T10:52:07.1583275Z ##[debug]Processed: ##vso[task.issue type=error;]Bash exited with code '1'.
2026-09-28T10:52:07.1583832Z ##[debug]task result: Failed
2026-09-28T10:52:07.1584871Z ##[debug]Processed: ##vso[task.complete result=Failed;done=true;]
2026-09-28T10:52:07.1594894Z ##[section]Finishing: Logs da Aplicação

