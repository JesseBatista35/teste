Criação de diretórios no NFS e montagem na esteira do SIEXC

***ATENÇÃO!!!***

NO ARQUIVO EM ANEXO HÁ INSTRUÇÕES DE ESTRUTURA DE DIRETORIOS E PERMISSÕES QUE DEVEM SER CRIADOS NO NFS. É IMPORTANTE ANEXAR O ARQUIVO NA PASSAGEM PARA A EQUIPE DE ARMAZENAMENTO

Criação de diretórios no NFS e montagem na esteira do SIEXC

Link esteira do SIEXC:

https://devops.caixa/projetos/Caixa/_git/SIEXC-web-aplicacao-config

Datalhes de como deve ser feita a montagem no documento em anexo

A/C Time de Armazenamento


Histórico de Informações de Trabalho da Ordem de Trabalho
ID da Ordem de Trabalho	 WO0000080992068
Criado em	 22/09/2026 13:29:59
Criado por	 P768728
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À CAIXA,

Em razão do tempo decorrido entre a abertura desta WO (07/07/26) e sua efetiva chegada à nossa fila de atendimento (22/06/2026), ocorrida já com o SLA expirado, gostaríamos de registrar que o SLA sob responsabilidade da Esteira DevOps NPRD é de 24 horas úteis, contadas a partir do momento em que a demanda é direcionada para nossa equipe.

Dessa forma, solicitamos que eventuais sanções decorrentes da quebra de SLA não sejam atribuídas à nossa esteira, uma vez que não possuímos governança sobre os fluxos de atendimento, tratativas e encaminhamentos realizados pelas demais macrocélulas envolvidas no processo.

Contamos com a compreensão de todos.

Atenciosamente,

Esteira DevOps - NPRD
ID da Ordem de Trabalho	 WO0000080992068
Criado em	 22/09/2026 09:28:03
Criado por	 P558217
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezado(a),


Informamos que será retomado nesta data.  

Iremos realizar uma nova análise conforme as informações adicionais registradas na sua última nota.

Ressaltamos que um novo SLA de 24h úteis passa a vigorar a partir de agora.

Todas as atualizações e evoluções do atendimento serão registradas diretamente nesta WO.


Atte.  

CTIS / CESTI Esteira DEVOPS DES TQS NPRD
ID da Ordem de Trabalho	 WO0000080992068
Criado em	 22/09/2026 09:12:46
Criado por	 P541274
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À Esteiras DES / TQS,

1. Segue solicitação de montagem NFS em ambiente DES.

Atenciosamente,

Felipe Soares de Oliveira - P541274
CTIS/CESTI/ESTEIRAS DEVOPS
ID da Ordem de Trabalho	 WO0000080992068
Criado em	 22/09/2026 08:21:59
Criado por	 P767992
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Demanda inicial sem viés de falha, erro, degradação ou
esgotamento de infraestrutura, serviço, máquina, armazenamento,
rotina ou situação que não esteja na iminência de tornar-se
incidente. Previsto atendimento em até 72 horas.

[CENTRAL-SID]
ID da Ordem de Trabalho	 WO0000080992068
Criado em	 22/09/2026 08:03:40
Criado por	 P656511
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Segue para analise, o servidor se refere a um terraform.
ID da Ordem de Trabalho	 WO0000080992068
Criado em	 22/09/2026 08:00:59
Criado por	 P569415
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À MULTI,

Segue para equipe de montagem.

Att,
CESTI53
ID da Ordem de Trabalho	 WO0000080992068
Criado em	 22/09/2026 07:37:34
Criado por	 P583155
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezado(a)

Acusamos o recebimento desta WO.
- Informamos que sua solicitação entrou em fila de atendimento.
- Informações futuras serão adicionadas a esta WO.


Att,
CESTI53
ID da Ordem de Trabalho	 WO0000080992068
Criado em	 07/07/2026 15:33:34
Criado por	 C160402
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezados,

No documento anexado à essa REQ há as informações do NFS que já foi criado via Infrafácil. A solicitação ésó a criação de uma série de diretórios dentro do NFS.Para mais detalhes, ver o arquivo em anexo (PDF)

Att,
c160402
ID da Ordem de Trabalho	 WO0000080992068
Criado em	 07/07/2026 14:36:00
Criado por	 P569415
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezados


Conforme alinhado com a CESTI33, para darmos continuidade ao atendimento desta solicitação faz-se necessário o registro por meio do catálogo INFRAFÁCIL.

Segue o link para abertura de solicitação: https://infrafacil.caixa/#/
Segue link para orientação de como abrir:  WikiFácil - https://wikifacil.caixa/

Importante:

Caso ocorra erro de senha ou matrícula inválida ao acessar o INFRAFÁCIL, entre em contato com a equipe responsável pelo sistema para orientação sobre o procedimento de acesso.

Att,
CESTI53
ID da Ordem de Trabalho	 WO0000080992068
Criado em	 07/07/2026 14:14:51
Criado por	 C160402
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Anexo do Registro de Solicitação.
ID da Ordem de Trabalho	 WO0000080992068
Criado em	 07/07/2026 14:14:49
Criado por	 Remedy Application Service
Origem de Comunicação	 E-mail
Exibir Acesso	 Interno
Notas	 Este ticket foi criado a partir do sistema de solicitação de serviço.
Impresso por P585600 em Terça-feira, 22/09/2026 14:32:40


Montagem NFS com Estrutura de Diretórios
Montagem da seguinte estrutura de diretórios no NFS do SIEXC
Servidor da aplicação SIEXC: 10.116.199.181 (DES)
NFS do SIEXC: nfsctcnprd.ctc.caixa - 192.168.224.0/19
Path do NFS: /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC
OBS: informações de acesso ao NFS obtidas a partir da REQ000144249814. Para mais detalhes, favor
consultar a REQ.
SWIFT
Criar Estrutura de Diretórios no NFS
Criar no path NFS:
/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC/SWIFT
a seguinte estrutura de diretórios:
├── lost+found
└── SWIFT
├── BACKUP
│  
 └── Temp
├── RECEBIDAS
├── TRANSMITE
│  
 └── temp
├── TRANSMITIDOS
└── TRASH
Variaveis de montagem na esteira
Pré-requisito: que o ponto de montagem do NFS esteja sempre disponível para acesso pelo servidor, com os
arquivos sempre disponiveis, independente de quantos restarts/releases fazemos na aplicação
NFS_ENDPOINT_ISILON = /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC/SWIFT
NFS_MOUNT_POINT_ISILON = /SWIFT
Permissões Requeridas
Todos os diretórios listados acima devem atender aos seguintes requisitos:
Proprietário (Owner): jboss no servidor da aplicação SIEXC
Permissões: rwx (leitura, escrita e execução)



me ajda a fazer isso e encerrrar essa deamnda



Last login: Tue Sep 22 13:50:14 2026 from 10.211.12.98
[p585600@cadsvitrlx100 ~]$ ssh 10.116.199.181
p585600@10.116.199.181's password:
[p585600@caddeapllx2193 ~]$
[p585600@caddeapllx2193 ~]$
[p585600@caddeapllx2193 ~]$
[p585600@caddeapllx2193 ~]$ hotname -f
-sh: hotname: comando não encontrado
[p585600@caddeapllx2193 ~]$ hostname -f
caddeapllx2193.agil.nprd.caixa.gov.br
[p585600@caddeapllx2193 ~]$



