À
CTIS/CESTI/Esteiras - DEVOPS DES TQS NPRD

Prezados, qual é o path NFS em questão e quais são os IPs da rede de backup que precisam de permissão

Arquivos anexados a demanda não informam o NFS do Storage, sem essa informação Armazenamento não consegue apoiar no atendimento.

RE-Lembrando: "/export/sigdb/sicql" não é o path NFS do Storage.

Caso não tenham essa informação por gentileza encaminhar demanda para Multi - Suporte a Sistemas Operacionais.

Obrigado.

Att,
CESTI53.


A Equipe 

Multi Suporte S.O

Conforme nota adicionada pelo nosso analista NPRD no dia 20/07 as 16:16 nós não possuímos as informações do IP de Backup. 

Encaminhamos essa WO para atendimento conforme orientação passada pela equipe de Armazenamento para que possam disponibilizar as informações dos IPs de Backup.

Atte.

Esteira Devops NPRD


1. Os endereços IPs foram informados na nota de 20/07 - 16h58

2. Necessário informar a equipe de armazenamento o FQDN do NFS montado nos servidores, conforme solicitado na nota 20/07 - 16h37.



A CAIXA, 

Gentileza considerar a aplicação do SLA de 24 horas para este atendimento a partir deste momento, visto que a demanda foi direcionada à nossa fila já com o prazo expirado.

Desde já agradecemos a compreensão.

Atte.

Esteira Devops DES e TQS - NPRD



ta uma confusao isso aqui:

segue todo o contexto:


Histórico de Informações de Trabalho da Ordem de Trabalho
ID da Ordem de Trabalho	 WO0000081109164
Criado em	 22/07/2026 09:58:19
Criado por	 P768728
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 A CAIXA,

Gentileza considerar a aplicação do SLA de 24 horas para este atendimento a partir deste momento, visto que a demanda foi direcionada à nossa fila já com o prazo expirado.

Desde já agradecemos a compreensão.

Atte.

Esteira Devops DES e TQS - NPRD
ID da Ordem de Trabalho	 WO0000081109164
Criado em	 21/07/2026 16:07:11
Criado por	 P573005
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 1. Os endereços IPs foram informados na nota de 20/07 - 16h58

2. Necessário informar a equipe de armazenamento o FQDN do NFS montado nos servidores, conforme solicitado na nota 20/07 - 16h37.
ID da Ordem de Trabalho	 WO0000081109164
Criado em	 21/07/2026 14:58:54
Criado por	 P768728
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 A Equipe

Multi Suporte S.O

Conforme nota adicionada pelo nosso analista NPRD no dia 20/07 as 16:16 nós não possuímos as informações do IP de Backup.

Encaminhamos essa WO para atendimento conforme orientação passada pela equipe de Armazenamento para que possam disponibilizar as informações dos IPs de Backup.

Atte.

Esteira Devops NPRD
ID da Ordem de Trabalho	 WO0000081109164
Criado em	 21/07/2026 14:13:05
Criado por	 P669476
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À
Esteira DES TQS,

Segue demanda para avaliação e tratamento.

Atenciosamente,
André Hebert dos Santos
Preposto
CTIS/CESTI/ESTEIRA - APLICAÇÃO/DEVOPS
ID da Ordem de Trabalho	 WO0000081109164
Criado em	 21/07/2026 11:02:41
Criado por	 P580900
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Ambiente de esteiras, segue para atendimento.
ID da Ordem de Trabalho	 WO0000081109164
Criado em	 21/07/2026 10:26:26
Criado por	 P768728
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 A Equipe

Multi Suporte S.O

Segue WO conforme solicitado na nota anterior.

Atte.

Esteira Devops DES TQS  - NPRD
ID da Ordem de Trabalho	 WO0000081109164
Criado em	 20/07/2026 18:56:59
Criado por	 P637135
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À
CTIS/CESTI/Esteiras - DEVOPS DES TQS NPRD

Prezados, qual é o path NFS em questão e quais são os IPs da rede de backup que precisam de permissão

Arquivos anexados a demanda não informam o NFS do Storage, sem essa informação Armazenamento não consegue apoiar no atendimento.

RE-Lembrando: "/export/sigdb/sicql" não é o path NFS do Storage.

Caso não tenham essa informação por gentileza encaminhar demanda para Multi - Suporte a Sistemas Operacionais.

Obrigado.

Att,
CESTI53.
ID da Ordem de Trabalho	 WO0000081109164
Criado em	 20/07/2026 16:58:35
Criado por	 P585600
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À CAIXA

Prezados

Em resposta à solicitação, seguem os paths NFS confirmados conforme anexo original de abertura da demanda:

SICQL
Path do NFS (Storage 10.116.88.160): /export/sigdb/sicql
Ponto de montagem na esteira: /opt/sigdb


SITEC
Path do NFS (Storage 10.116.88.160): /export/sigdb/sitec
Ponto de montagem na esteira: /opt/sigdb/sitec


BOVESPA
Path do NFS (Storage 10.116.88.160): /export/sicql_bovespa
Ponto de montagem na esteira: /opt/jboss/bovespa

ARQUIVOS
Path do NFS (Storage 10.116.88.160): /export/upload_prd
Ponto de montagem na esteira: /upload


IPs dos servidores de aplicação da esteira:

DES: 10.116.199.181
TQS: 10.116.201.141

IPs de rede de backup:
DES: 192.168.233.69
TQS: 192.168.242.137

Conforme o FREI original, é necessário liberar tanto os IPs de aplicação quanto os IPs de backup dos servidores acima para que a montagem seja efetiva.
ID da Ordem de Trabalho	 WO0000081109164
Criado em	 20/07/2026 16:37:05
Criado por	 P637135
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À
CTIS/CESTI/Esteiras - DEVOPS DES TQS NPRD

Prezados, qual é o path NFS em questão e quais são os IPs da rede de backup que precisam de permissão

Lembrando: /export/sigdb/sicql não é o path NFS do Storage.

Obrigado.

Att,
CESTI53.
ID da Ordem de Trabalho	 WO0000081109164
Criado em	 20/07/2026 16:31:20
Criado por	 C160402
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À Armazenamento.

Prezados(as),

Como consta no documento de montagem presente nesta REQ, é necessário liberação para os IPs do servidores de DES e TQS da esteira. Podem verificar por lá, mas repito aqui:

Servidor da aplicação SIEXC: 10.116.199.181 (DES)
Servidor da aplicação SIEXC: 10.116.201.141 (TQS)

Importante liberar também nos servidores de backup de cada uma das instâncias. Ja temos uma liberação de exemplo como indicado pelo Jessé na mensagem dele.

Esses NFSs se comunicam com o mainframe (uso do SIGDB), caso seja necessário alguma liberação neste sentido também, peço por favor que incluam no planejamento das liberações.

Grato.

Atenciosamente,
Figura Carrijo Viana Figur
Analista Junior
CESOB - Comunicade Câmbio e Tesouraria
ID da Ordem de Trabalho	 WO0000081109164
Criado em	 20/07/2026 16:16:03
Criado por	 P585600
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À Armazenamento

Prezados,

Em atendimento à solicitação de montagem dos novos compartilhamentos NFS na esteira do sistema SIEXC (ambiente DES), informo o que foi realizado e o ponto pendente que requer atuação da equipe de Armazenamento.

Após o ajuste, a esteira passou a processar corretamente o tipo de compartilhamento e avançou até a etapa efetiva de montagem no servidor.


Ponto pendente — acesso ao storage 10.116.88.160:
Na etapa de montagem, o servidor de destino não concede acesso ao host de origem. Testes de conectividade realizados diretamente na VM confirmam o cenário:

Tentativa de mount manual retorna: mount.nfs: failed to prepare mount: Operation not permitted
Teste de conexão nas portas 2049 e 111 (NFS/portmapper): sem resposta do destino
Comandos rpcinfo -p e showmount -e para o destino: sem retorno

Servidor de origem (cliente NFS): caddeapllx2193.agil.nprd.caixa.gov.br
IPs do servidor de origem:

10.116.199.181 (interface ens192)
192.168.233.69 (interface ens224)

Storage de destino: 10.116.88.160
Exports solicitados:

/export/sigdb/sicql
/export/sigdb/sitec
/export/sicql_bovespa
/export/upload_prd

Solicito a verificação se o(s) IP(s) do servidor de origem estão autorizados na lista de clientes (ACL) desses exports no storage 10.116.88.160, e a liberação necessária para viabilizar o acesso.
Como referência, este mesmo servidor já monta com sucesso outros 3 compartilhamentos hospedados em nfsctcnprd.ctc.caixa (Isilon), utilizando o IP 10.116.199.181.


Encaminho para a equipe de Armazenamento para análise e liberação do acesso solicitado.

Atenciosamente,

Jessé Mouta Pereira Batista
Analista
CTIS / CESTI Esteira DEVOPS DES TQS NPRD
ID da Ordem de Trabalho	 WO0000081109164
Criado em	 20/07/2026 12:22:39
Criado por	 P730708
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Demanda inicial sem viés de falha, erro, degradação ou
esgotamento de infraestrutura, serviço, máquina, armazenamento,
rotina ou situação que não esteja na iminência de tornar-se
incidente. Previsto atendimento em até 24 horas úteis.

[CENTRAL-SID]
ID da Ordem de Trabalho	 WO0000081109164
Criado em	 20/07/2026 12:07:20
Criado por	 P768728
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezado(a),

Informamos que sua solicitação foi recebida.

Nosso SLA para atendimento é de até 24h úteis, analisaremos a solicitação para nos certificarmos que o atendimento está dentro do escopo de atuação da nossa equipe.

Caso seja identificado que o atendimento não corresponde ao nosso escopo, a solicitação será redirecionada à equipe responsável.

Novas informações e atualizações serão registradas diretamente nesta WO.

Atte.

CTIS / CESTI Esteira DEVOPS DES TQS NPRD
ID da Ordem de Trabalho	 WO0000081109164
Criado em	 20/07/2026 11:44:09
Criado por	 C160402
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Anexo do Registro de Solicitação.
ID da Ordem de Trabalho	 WO0000081109164
Criado em	 20/07/2026 11:44:08
Criado por	 Remedy Application Service
Origem de Comunicação	 E-mail
Exibir Acesso	 Interno
Notas	 Este ticket foi criado a partir do sistema de solicitação de serviço.
Impresso por P585600 em Quarta-feira, 22/07/2026 10:17:11
