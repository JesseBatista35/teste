Suporte ao ambiente de aplicação nas esteiras DevOps
Qual o nome do Sistema?*:	SIPGE-webhook
Qual o ambiente*:	DES
Selecione a sua Comunidade*:	Contratações e Logística
Formas de contato*:	Teams
Descrição da necessidade*:	Prezados(as) Na release do SIPGE-webhook está com erro de timeout.
E apresentando erro: "Não foram encontrados arquivos com segredos no diretório /usr/src/app/secrets_files", conforme anexo.

Já abri chamados para a segurança verificar credenciais e para a esteira verificar se há algo a mais a ser verificado na esteira.
A esteira diz que o problema está na segurança, REQs: REQ000145877393 e REQ000145975274
Porém conforme REQ000145878577 a segurança diz que as credenciais estão corretas e que não chega requisição para o cofre do SIPGE-webhook(print enviado pela equipe de segurança em anexo).

Solicitamos se possível resolvermos problema em conjunto para que seja solucionado.
Gentileza entrar em contato comigo para que eu possa intermediar ou com diretamente com a segurança antes de mudarem o status da demanda como concluída.
Com a segurança estive conversando com Pedro (C159073), que atendeu a REQ000145878577 e se disponibilizou para que fosse chamado para verificar se as requisições estão chegando.

Obs: O mesmo BT_CLIENT_ID cadastrado para SIPGE-BT-VAULT-SECRET-DES está cadastrado para SIPGE-BACKEND-BT-VAULT-DES que faz parte da esteira do SIPGE-backend, do qual apresenta sucesso na release.

No chamado REQ000145975274 há observação de que o BT_CLIENT_SECRET foi atualizado em 09/09/2026. Essa foi data que solicitamos o preenchimento. Antes dessa data a release só funcionava porque coloquei o valor diretamente na variável de ambiente da library até os valores do VAULT serem preenchido.

Release só falha quando é utilizado VAULT

Histórico de Informações de Trabalho da Ordem de Trabalho
ID da Ordem de Trabalho	 WO0000081624581
Criado em	 09/09/2026 14:55:41
Criado por	 P564449
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Boa tarde, Izabella.

Esse erro já ocorreu em outras oportunidades em projetos diferentes.
Nas ocasiões anteriores, o time de Segurança foi acionado e realizou a correção, que seguiu o mesmo padrão abaixo:
Ajustes realizados pelo time de Segurança
Em casos anteriores desse mesmo erro (“Não foram encontrados arquivos com segredos no diretório /usr/src/app/secrets_files”), o time de Segurança identificou ajustes necessários no cofre de senhas e realizou as seguintes correções:

O IP cadastrado na API do cofre de senhas estava diferente do IP de saída da esteira.
O segredo utilizado pela aplicação também foi ajustado.
Após esses ajustes, feitos pelo time de Segurança, a esteira foi executada novamente e a release foi concluída com sucesso.
Poderia por gentileza verificar?

At.te,
Kallebe M. Vieira
Analista
CTIS / CESTI Esteira DEVOPS DES TQS NPRD
ID da Ordem de Trabalho	 WO0000081624581
Criado em	 09/09/2026 14:50:27
Criado por	 P558217
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezado(a),



Informamos que sua solicitação foi recebida.  



Nosso SLA para atendimento é de até 24h úteis, analisaremos a solicitação para nos certificarmos que o atendimento está dentro do escopo de atuação da nossa equipe.



Caso seja identificado que o atendimento não corresponde ao nosso escopo, a solicitação será redirecionada à equipe responsável.



Novas informações e atualizações serão registradas diretamente nesta WO.



Atte.



Esteira Devops DES TQS NPRD
ID da Ordem de Trabalho	 WO0000081624581
Criado em	 09/09/2026 14:46:04
Criado por	 Remedy Application Service
Origem de Comunicação	 E-mail
Exibir Acesso	 Interno
Notas	 Este ticket foi criado a partir do sistema de solicitação de serviço.
Impresso por P585600 em Terça-feira, 15/09/2026 15:31:54




Histórico de Informações de Trabalho da Ordem de Trabalho
ID da Ordem de Trabalho	 WO0000081652883
Criado em	 14/09/2026 15:57:38
Criado por	 P602532
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 A
Caixa

A causa raiz mais provável é uma falha de autenticação ou autorização no BeyondTrust durante a obtenção do segredo:

SIPGE_DES/CLISERPGE_SSO_INTRA

Recomenda-se validar junto à equipe de Segurança, responsável pelo BeyondTrust:

Validade do BT_CLIENT_ID;
Validade do BT_CLIENT_SECRET;
Associação correta entre CLIENT_ID e CLIENT_SECRET;
Permissões do cliente para acesso ao segredo SIPGE_DES/CLISERPGE_SSO_INTRA;
Possível rotação, alteração ou revogação de credenciais.

Adicionalmente, foi observado que o secret bt-client-secret-sipge-webhook-des foi recriado em 09/09/2026, e as falhas de deploy passaram a ocorrer de forma recorrente após esse período, o que reforça a necessidade de validação das credenciais utilizadas na integração com o BeyondTrust.

Atenciosamente,

Hugo de Sousa Oliveira
Analista
CTIS / CESTI Esteira DEVOPS DES TQS NPRD
ID da Ordem de Trabalho	 WO0000081652883
Criado em	 14/09/2026 15:57:12
Criado por	 P602532
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 A
Caixa

A causa raiz mais provável é uma falha de autenticação ou autorização no BeyondTrust durante a obtenção do segredo:

SIPGE_DES/CLISERPGE_SSO_INTRA

Recomenda-se validar junto à equipe de Segurança, responsável pelo BeyondTrust:

Validade do BT_CLIENT_ID;
Validade do BT_CLIENT_SECRET;
Associação correta entre CLIENT_ID e CLIENT_SECRET;
Permissões do cliente para acesso ao segredo SIPGE_DES/CLISERPGE_SSO_INTRA;
Possível rotação, alteração ou revogação de credenciais.

Adicionalmente, foi observado que o secret bt-client-secret-sipge-webhook-des foi recriado em 09/09/2026, e as falhas de deploy passaram a ocorrer de forma recorrente após esse período, o que reforça a necessidade de validação das credenciais utilizadas na integração com o BeyondTrust.

Atenciosamente,

Hugo de Sousa Oliveira
Analista
CTIS / CESTI Esteira DEVOPS DES TQS NPRD
ID da Ordem de Trabalho	 WO0000081652883
Criado em	 14/09/2026 15:54:32
Criado por	 P602532
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Em atendimento
ID da Ordem de Trabalho	 WO0000081652883
Criado em	 14/09/2026 12:12:03
Criado por	 C160717
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Segue a REQ já concluída aberta para a segurança: REQ000145878577
ID da Ordem de Trabalho	 WO0000081652883
Criado em	 14/09/2026 12:06:03
Criado por	 P767992
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Demanda inicial sem viés de falha, erro, degradação ou
esgotamento de infraestrutura, serviço, máquina, armazenamento,
rotina ou situação que não esteja na iminência de tornar-se
incidente. Previsto atendimento em até 24 horas úteis.

[CENTRAL-SID]
ID da Ordem de Trabalho	 WO0000081652883
Criado em	 14/09/2026 11:39:32
Criado por	 P558217
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezado(a),



Informamos que sua solicitação foi recebida.  



Nosso SLA para atendimento é de até 24h úteis, analisaremos a solicitação para nos certificarmos que o atendimento está dentro do escopo de atuação da nossa equipe.



Caso seja identificado que o atendimento não corresponde ao nosso escopo, a solicitação será redirecionada à equipe responsável.



Novas informações e atualizações serão registradas diretamente nesta WO.



Atte.



Esteira Devops DES TQS NPRD
ID da Ordem de Trabalho	 WO0000081652883
Criado em	 14/09/2026 11:34:27
Criado por	 C160717
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Anexo do Registro de Solicitação.
ID da Ordem de Trabalho	 WO0000081652883
Criado em	 14/09/2026 11:34:26
Criado por	 Remedy Application Service
Origem de Comunicação	 E-mail
Exibir Acesso	 Interno
Notas	 Este ticket foi criado a partir do sistema de solicitação de serviço.
Impresso por P585600 em Terça-feira, 15/09/2026 15:32:43


Histórico de Informações de Trabalho da Ordem de Trabalho
ID da Ordem de Trabalho	 WO0000081625081
Criado em	 14/09/2026 11:52:02
Criado por	 C159073
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 As configurações de BT_CLIENT_ID e BT_CLIENT_SECRET na library SIPGE-BT-VAULT-SECRET-DES e BT_SECRETS_LIST na library SIPGE-webhook-BT-VAULT-DES estão corretas, porém verificando os logs do cofre de senhas não existe requisição de consulta quando é gerada uma release do módulo SIPGE-WEBHOOK ambiente de DES.
Em conversa com o demandante será aberta uma REQ para o suporte a esteira devops para investigar o problema.

Atenciosamente,
CEPRO
ID da Ordem de Trabalho	 WO0000081625081
Criado em	 11/09/2026 16:27:29
Criado por	 C160717
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezados(as), Caso verificarem a necessidade de remover BT_CLIENT_ID e BT_CLIENT_SECRET de SIPGE-BACKEND-BT-VAULT-DES e deixá-las apenas em SIPGE-BT-VAULT-SECRET-DES, gentileza antes de finalizar o chamado, entrar em contato via teams para verificarmos se ajuste corrigiu o que precisava e não afetou o módulo que já está funcionando
ID da Ordem de Trabalho	 WO0000081625081
Criado em	 10/09/2026 14:25:15
Criado por	 C160717
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Print com erro: "Nao foram encontrados arquivos com segredos no diretório 'usr/src/app/secrets_files"
ID da Ordem de Trabalho	 WO0000081625081
Criado em	 10/09/2026 14:24:26
Criado por	 C160717
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Antes de deixar apenas BT_CLIENT_ID e BT_CLIENT_SECRET apenas em SIPGE-BT-VAULT-SECRET-DES, gentileza verificar credenciais, pois estamos com erro: "Nao foram encontrados arquivos com segredos no diretório 'usr/src/app/secrets_files', conforme anexo
ID da Ordem de Trabalho	 WO0000081625081
Criado em	 09/09/2026 18:32:45
Criado por	 C160717
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezados(as), em conversa com nosso colega Pedro (c159073) recomendou também que deixasse apenas a library SIPGE-BT-VAULT-SECRET-DES com BT_CLIENT_ID e BT_CLIENT_SECRET.
ID da Ordem de Trabalho	 WO0000081625081
Criado em	 09/09/2026 15:22:52
Criado por	 Remedy Application Service
Origem de Comunicação	 E-mail
Exibir Acesso	 Interno
Notas	 Este ticket foi criado a partir do sistema de solicitação de serviço.
Impresso por P585600 em Terça-feira, 15/09/2026 15:33:25


P
sipge-webhook-des-28-96tbk
Init:CrashLoopBackOff

secrets-check

ERRO: Nao foram encontrados arquivos com segredos no diretorio '/usr/src/app/secrets_files'.






OKD


Jesse Mouta Pereira Batista

Administrator
Home
Overview
Projects
Search
API Explorer
Events
Operators
Workloads
Pods
Deployments
DeploymentConfigs
StatefulSets
Secrets
ConfigMaps
CronJobs
Jobs
DaemonSets
ReplicaSets
ReplicationControllers
HorizontalPodAutoscalers
PodDisruptionBudgets
Networking
Storage
Builds
Observe
Compute
User Management
Administration

Project: sipge-des
Pods
Pod details
Pod
P
sipge-webhook-des-28-96tbk
Init:CrashLoopBackOff

Actions
Details
Metrics
YAML
Environment
Logs
Events
Terminal
Log stream ended.

Container
C
secrets-agent-sidecar

Current log
Search

Wrap lines
|
Raw
|
Download
|
80 lines
return self.urlopen(
~~~~~~~~~~~~^
method,
^^^^^^^
...<13 lines>...
**response_kw,
^^^^^^^^^^^^^^
)
^
File "/usr/local/lib/python3.13/site-packages/urllib3/connectionpool.py", line 942, in urlopen
return self.urlopen(
~~~~~~~~~~~~^
method,
^^^^^^^
...<13 lines>...
**response_kw,
^^^^^^^^^^^^^^
)
^
File "/usr/local/lib/python3.13/site-packages/urllib3/connectionpool.py", line 942, in urlopen
return self.urlopen(
~~~~~~~~~~~~^
method,
^^^^^^^
...<13 lines>...
**response_kw,
^^^^^^^^^^^^^^
)
^
File "/usr/local/lib/python3.13/site-packages/urllib3/connectionpool.py", line 932, in urlopen
retries = retries.increment(method, url, response=response, _pool=self)
File "/usr/local/lib/python3.13/site-packages/urllib3/util/retry.py", line 519, in increment
raise MaxRetryError(_pool, url, reason) from reason # type: ignore[arg-type]
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
urllib3.exceptions.MaxRetryError: HTTPSConnectionPool(host='sicsn.caixa', port=443): Max retries exceeded with url: /BeyondTrust/api/public/v3/Auth/connect/token (Caused by ResponseError('too many 400 error responses'))
During handling of the above exception, another exception occurred:
Traceback (most recent call last):
File "/usr/src/app/get_secrets_from_secret_safe.py", line 78, in main
get_api_access_response = authentication_obj.get_api_access()
File "/usr/local/lib/python3.13/site-packages/secrets_safe_library/authentication.py", line 159, in get_api_access
oauth_response = self.oauth()
File "/usr/local/lib/python3.13/site-packages/secrets_safe_library/authentication.py", line 125, in oauth
response = self._req.post(
endpoint_url,
