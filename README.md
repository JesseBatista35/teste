Fazer Disponibilização/Remoção de Espaço em Disco
Qual o atendimento a ser realizado?:	Solicitação de Armazenamento
----------------------------------------------------
Solicitante: c142832
Centro de Custo: CESOB
Opção NAS: Sistema
Nome Sistema: siorf
Ambiente: DES
Esteira OKD
Plataforma Armazenamento: OPEN
Tipo de Disco: NAS
Compartilhamento NOVO
Volumetria: 50GB
Custo Mensal: R$ 9,23
Custo Anual: R$ 110,67
----------------------------------------------------
Ponto de Montagem: /siorf/Convenio/Resultado
Tipo de Compartilhamento: NFS
Vai se Comunicar com Mainframe: NÃO

---------------------------------
HOSTS OKD
---------------------------------
Módulo: siorf-backend
Ip Real: 10.116.220.36
Ip de Backup: 192.168.230.209, 192.168.230.210, 192.168.240.201, 192.168.235.248, 192.168.236.12, 192.168.236.13, 192.168.236.14, 192.168.236.15, 192.168.236.16, 192.168.236.17, 192.168.236.18, 192.168.236.20, 192.168.236.23, 192.168.236.28, 192.168.236.30, 192.168.236.35, 192.168.236.34, 192.168.236.39, 192.168.236.47, 192.168.229.250, 192.168.230.116, 192.168.230.137, 192.168.230.187, 192.168.231.31, 192.168.234.186, 192.168.236.143, 192.168.236.144, 192.168.236.145, 192.168.236.146, 192.168.236.147, 192.168.236.148, 192.168.236.149, 192.168.236.150, 192.168.236.151, 192.168.236.152, 192.168.236.153, 192.168.236.154, 192.168.236.200, 192.168.236.155, 192.168.236.156, 192.168.236.157, 192.168.236.158, 192.168.236.159, 192.168.236.160, 192.168.236.168, 192.168.236.161, 192.168.236.162, 192.168.236.163, 192.168.236.164, 192.168.236.165, 192.168.236.166, 192.168.236.167, 192.168.236.168, 192.168.236.170, 192.168.236.171, 192.168.236.172, 192.168.236.173, 192.168.251.90, 192.168.251.91, 192.168.251.92, 192.168.251.93, 192.168.251.94, 192.168.251.95, 192.168.251.96, 192.168.251.97, 192.168.251.98, 192.168.251.99, 192.168.231.135, 192.168.240.182, 192.168.240.183, 192.168.240.184, 192.168.240.185, 192.168.240.186, 192.168.240.187, 192.168.240.188, 192.168.240.189, 192.168.240.190, 192.168.240.191, 192.168.240.192, 192.168.240.193, 192.168.240.194, 192.168.240.195, 192.168.240.196, 192.168.240.197, 192.168.240.198, 192.168.240.199, 192.168.240.200
Hostname: siorf-backend
----------------------------------------------------
Observações: usuário: SORFPD01
acesso: 777



Histórico de Informações de Trabalho da Ordem de Trabalho
ID da Ordem de Trabalho	 WO0000081150812
Criado em	 27/07/2026 08:50:45
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
ID da Ordem de Trabalho	 WO0000081150812
Criado em	 25/07/2026 13:25:47
Criado por	 P668948
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezados, em validação identificamos compartilhamento NFS no ambiente NPRS /fs__siorf , unico ip sem permissão 10.188.3.208, visto solicitação de um novo NFS, favor informar nome a ser configurado EX: /fs_siorf_tqs

Abaixo o NFS já configurado HWPRD8105:

p668948@Vstore_NPRD:/>show share_permission nfs share_name=/fs_siorf|filterColumn include columnList=Access\sName

 Access Name
 ------------
 10.188.3.209
 10.188.3.210
 10.188.3.211
 10.188.3.212
 10.188.3.213
 10.188.3.214
 10.188.3.215
 10.188.3.216
 10.188.3.217
 10.188.3.218
 10.188.3.219
 10.188.3.220
 10.188.3.221
 10.188.3.222
 10.188.3.223
 10.188.3.225
 10.188.3.226
 10.188.3.227
 10.188.3.228
 10.188.3.229
 10.188.3.230
 10.188.3.231
 10.188.3.232
 10.188.3.233
 10.188.3.234
 10.188.3.235
 10.188.3.236
 10.188.3.237
 10.188.3.238
 10.188.3.239
 10.188.3.240
 10.188.3.241
 10.188.3.242
 10.188.3.243
 10.188.3.244
 10.188.3.245
 10.188.3.246
 10.188.3.247
 10.188.3.248
 10.188.3.249
 10.188.3.250
 10.188.3.251
 10.188.3.252
 10.188.3.253
 10.188.3.254
 10.188.3.255
 10.188.4.7
 10.188.4.8
 10.188.4.9
 10.188.4.10
 10.188.4.11
 10.188.4.12
 10.188.4.13
 10.188.4.14
 10.188.4.15
 10.188.4.16
 10.188.4.17
 10.188.4.18
 10.188.4.19
 10.188.4.20
 10.188.4.21
 10.188.4.22
 10.188.4.23
 10.188.4.24
 10.188.4.25
 10.188.4.26
ID da Ordem de Trabalho	 WO0000081150812
Criado em	 24/07/2026 16:37:47
Criado por	 P544858
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À
Equipe de Armazenamento.

Segue listagem dos IPs da rede NPRD:

10.188.3.208
10.188.3.209
10.188.3.210
10.188.3.211
10.188.3.212
10.188.3.213
10.188.3.214
10.188.3.215
10.188.3.216
10.188.3.217
10.188.3.218
10.188.3.219
10.188.3.220
10.188.3.221
10.188.3.222
10.188.3.223
10.188.3.223
10.188.3.225
10.188.3.226
10.188.3.227
10.188.3.228
10.188.3.229
10.188.3.230
10.188.3.231
10.188.3.232
10.188.3.233
10.188.3.234
10.188.3.235
10.188.3.236
10.188.3.237
10.188.3.238
10.188.3.239
10.188.3.240
10.188.3.241
10.188.3.242
10.188.3.243
10.188.3.244
10.188.3.245
10.188.3.246
10.188.3.247
10.188.3.248
10.188.3.249
10.188.3.250
10.188.3.251
10.188.3.252
10.188.3.253
10.188.3.254
10.188.3.255
10.188.4.7
10.188.4.8
10.188.4.9
10.188.4.10
10.188.4.11
10.188.4.12
10.188.4.13
10.188.4.14
10.188.4.15
10.188.4.16
10.188.4.17
10.188.4.18
10.188.4.19
10.188.4.20
10.188.4.21
10.188.4.22
10.188.4.23
10.188.4.24
10.188.4.25
10.188.4.26

Att.,
Thiago Augusto Jardim
Suporte a Esteira Devops DES e TQS - NPRD
ID da Ordem de Trabalho	 WO0000081150812
Criado em	 24/07/2026 13:11:20
Criado por	 C159703
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À Esteiras ,
Em atendimento à CESOB foi informado que o referido nfs deverá ser criado em ambiente de DES.

Att,
CESTI33
ID da Ordem de Trabalho	 WO0000081150812
Criado em	 23/07/2026 16:01:56
Criado por	 C142832
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 para o ambiente de desenvolvimento e TQS
ID da Ordem de Trabalho	 WO0000081150812
Criado em	 23/07/2026 13:04:30
Criado por	 P747408
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezados(a),

Boa tarde.

As entregas de novos compartilhamento estão sendo feitas apenas nos novos storages, e para isso precisamos dos IPs da nova rede de backup dos storages. Favor informar os IPs da nova rede de backup:

10.188 nprd
10.184 prd

ID da Ordem de Trabalho	 WO0000081150812
Criado em	 23/07/2026 12:38:12
Criado por	 P521571
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezado(a)
Acusamos o recebimento desta WO.
- Informamos que sua solicitação entrou em fila de atendimento.
- Esta demanda será atendida em breve
- Informações futuras serão adicionadas a esta WO.

Att
Taynara Fernandes
CESTI53
ID da Ordem de Trabalho	 WO0000081150812
Criado em	 23/07/2026 12:31:09
Criado por	 P730708
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 
Demanda inicial sem viés de falha, erro, degradação ou esgotamento de infraestrutura, serviço, máquina, armazenamento, rotina ou situação que não esteja na iminência de tornar-se incidente. Previsto atendimento no prazo indicado pelo demandante.[CENTRAL-SID]
ID da Ordem de Trabalho	 WO0000081150812
Criado em	 23/07/2026 11:33:57
Criado por	 Remedy Application Service
Origem de Comunicação	 E-mail
Exibir Acesso	 Interno
Notas	 Este ticket foi criado a partir do sistema de solicitação de serviço.
Impresso por P585600 em Segunda-feira, 27/07/2026 10:34:24
