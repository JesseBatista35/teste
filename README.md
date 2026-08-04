Pedi a criação de pastas no NFS, em DES e TQS, para o SIORF usar no processamento de arquivos (o gestor fará o upload do arquivo via aplicação). 

/siorf/Convenio/Processar
/siorf/Convenio/Resultado

Através das REQ000144998295 e REQ000144998297.

Preciso confirmar:

1. Aa pastas abaixo foram criadas em DES e TQS:
/siorf/Convenio/Processar
/siorf/Convenio/Resultado

2. O usuário de serviço está com acesso 777 nestas pastas? 
SORFDB01 e SORFTB01

3. O Jboss já foi configurado com estes paths? 
Podemos criar apenas um path e em tempo de execução completar com a pasta que se deseja usar? neste caso, somente um path seria criado. Em outro sistema que trabalho, cada pasta foi criado em path no jboss.


REQ000144998295

Histórico de Informações de Trabalho da Ordem de Trabalho
ID da Ordem de Trabalho	 WO0000081150811
Criado em	 27/07/2026 10:44:14
Criado por	 P585600
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À CAIXA

Prezados,

Informamos que esta demanda esta sendo atendida em conjunto com a WO0000081150812, referente a mesma solicitação de NFS para o sistema SIORF.

Serão configurados os dois ambientes, DES e TQS, conforme solicitado.

Novas atualizações estão sendo  registradas nesta WO.

Atenciosamente,

Jessé Mouta Pereira Batista
Analista
CTIS / CESTI Esteira DEVOPS DES TQS NPRD

ID da Ordem de Trabalho	 WO0000081150811
Criado em	 27/07/2026 09:54:35
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
ID da Ordem de Trabalho	 WO0000081150811
Criado em	 24/07/2026 12:56:32
Criado por	 C159703
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À Esteiras ,
Em atendimento à CESOB foi informado que o referido nfs deverá ser criado em ambiente de DES,não em PRD.

Att,
CESTI33
ID da Ordem de Trabalho	 WO0000081150811
Criado em	 23/07/2026 21:15:51
Criado por	 P694128
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À Esteiras,

segue para montagem conforme nota anterior
ID da Ordem de Trabalho	 WO0000081150811
Criado em	 23/07/2026 21:02:00
Criado por	 P542717
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Conforme plano de ação, realizado a criação do path: /fs_siorf. Evidência abaixo:

FQDN para acesso: hypernprd56.ad.caixa - 10.188.0.0/16

   Share ID  File System ID  Description      Local Path          Alias              CharSet  Lock Type  Audit Items  show_snapshot_enabled  fh_byte_alignment_switch  File System Name
 --------  --------------  ---------------  ------------------  -----------------  -------  ---------  -----------  ---------------------  ------------------------  ----------------
 145       187             WO81150811       /fs_siorf/          /fs_siorf          UTF-8    Mandatory  --           Disable                Disable                   fs_siorf

Att;
CESTI53
ID da Ordem de Trabalho	 WO0000081150811
Criado em	 23/07/2026 18:28:54
Criado por	 C071686
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Demanda autorizada conforme deliberado pela CESTI33. Att, CESTI91
ID da Ordem de Trabalho	 WO0000081150811
Criado em	 23/07/2026 17:04:00
Criado por	 P637135
Origem de Comunicação	 
Exibir Acesso	 Interno
Notas	 [SELO DE CONFORMIDADE  - SCR91001]
Este registro foi avaliado sob os aspectos dos prazos, da qualidade, da documentação do atendimento e do processo, e da conformidade procedimental e técnica visando resguardar a execução, a validação e eventual retorno.
ID da Ordem de Trabalho	 WO0000081150811
Criado em	 23/07/2026 17:02:49
Criado por	 P637135
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 [PAUTA CESTI]
Número: WO0000081150811
Ação: Criação do NFS fs_siorf no Storage HWPRD8106
Risco: Baixo
Impacto: Não
Ambiente: PRD
Segmento: Infraestrutura
Sistema: siorf
Destaque: Não
Site: DTC
Corte: 24/07/2026 06:00
Janela: 23/07/2026 20:00 - 24/07/2026 06:00
Prioridade: Baixa
ID da Ordem de Trabalho	 WO0000081150811
Criado em	 23/07/2026 16:28:06
Criado por	 C159703
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Demanda autorizada para atendimento conforme agendamento.

Att

CESTI33
ID da Ordem de Trabalho	 WO0000081150811
Criado em	 23/07/2026 16:21:45
Criado por	 P626562
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Plano de ação em anexo.


WO0000081150811 - Criação NFS (fs_siorf)
---------------------------------------------------------------------------------------------------------------------
AÇÃO: Criação NFS (fs_siorf)
---------------------------------------------------------------------------------------------------------------------
JUSTIFICATIVA: Criação
---------------------------------------------------------------------------------------------------------------------
SITE (CTC OU DTC) - CTC
---------------------------------------------------------------------------------------------------------------------
AMBIENTE (Bancário, Negocial, Social, NPRD, HMP, Departamental):
---------------------------------------------------------------------------------------------------------------------
RISCO: Baixo  
---------------------------------------------------------------------------------------------------------------------
IMPACTO: SIM (   ) NÃO ( X )
---------------------------------------------------------------------------------------------------------------------  
ITEM OU ITENS DE CONFIGURAÇÃO (IC):
---------------------------------------------------------------------------------------------------------------------
PLANO DE EXECUÇÃO: SIM ( X ) NÃO (   )
---------------------------------------------------------------------------------------------------------------------
VALIDAÇÃO: SIM ( X ) NÃO (   )
---------------------------------------------------------------------------------------------------------------------
RETORNO: SIM ( X ) NÃO (   )
---------------------------------------------------------------------------------------------------------------------
ID da Ordem de Trabalho	 WO0000081150811
Criado em	 23/07/2026 16:03:02
Criado por	 C142832
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 para ambiente de DES e TQS
ID da Ordem de Trabalho	 WO0000081150811
Criado em	 23/07/2026 13:59:03
Criado por	 P541274
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Ao Armazenamento,

1. Segue abaixo a lista de hosts e ip de backup da rede 10.188 do cluster OKD NPRD

ceadecldlx019.nprd.caixa - 10.188.3.208
ceadecldlx020.nprd.caixa - 10.188.3.209
ceadecldlx021.nprd.caixa - 10.188.3.210
ceadecldlx022.nprd.caixa - 10.188.3.211
ceadecldlx023.nprd.caixa - 10.188.3.212
ceadecldlx024.nprd.caixa - 10.188.3.213
ceadecldlx025.nprd.caixa - 10.188.3.214
ceadecldlx026.nprd.caixa - , 10.188.3.215
ceadecldlx027.nprd.caixa - 10.188.3.216
ceadecldlx028.nprd.caixa - 10.188.3.217
ceadecldlx029.nprd.caixa - 10.188.3.218
ceadecldlx030.nprd.caixa - 10.188.3.219
ceadecldlx031.nprd.caixa - 10.188.3.220
ceadecldlx032.nprd.caixa - 10.188.3.221
ceadecldlx033.nprd.caixa - 10.188.3.222
ceadecldlx034.nprd.caixa - 10.188.3.223
ceadecldlx035.nprd.caixa - 10.188.3.223
ceadecldlx036.nprd.caixa - 10.188.3.225
ceadecldlx037.nprd.caixa - 10.188.3.226
ceadecldlx038.nprd.caixa - 10.188.3.227
ceadecldlx039.nprd.caixa - 10.188.3.228
ceadecldlx040.nprd.caixa - 10.188.3.229
ceadecldlx041.nprd.caixa - 10.188.3.230
ceadecldlx042.nprd.caixa - 10.188.3.231
ceadecldlx043.nprd.caixa - 10.188.3.232
ceadecldlx044.nprd.caixa - 10.188.3.233
ceadecldlx045.nprd.caixa - 10.188.3.234
ceadecldlx046.nprd.caixa - 10.188.3.235
ceadecldlx047.nprd.caixa - 10.188.3.236
ceadecldlx048.nprd.caixa - 10.188.3.237
ceadecldlx049.nprd.caixa - 10.188.3.238
ceadecldlx050.nprd.caixa - 10.188.3.239
ceadecldlx051.nprd.caixa - 10.188.3.240
ceadecldlx052.nprd.caixa - 10.188.3.241
ceadecldlx053.nprd.caixa - 10.188.3.242
ceadecldlx054.nprd.caixa - 10.188.3.243
ceadecldlx055.nprd.caixa - 10.188.3.244
ceadecldlx056.nprd.caixa - 10.188.3.245
ceadecldlx057.nprd.caixa - 10.188.3.246
ceadecldlx058.nprd.caixa - 10.188.3.247
ceadecldlx059.nprd.caixa - 10.188.3.248
ceadecldlx060.nprd.caixa - 10.188.3.249
ceadecldlx061.nprd.caixa - 10.188.3.250
ceadecldlx062.nprd.caixa - 10.188.3.251
ceadecldlx063.nprd.caixa - 10.188.3.252
ceadecldlx064.nprd.caixa - 10.188.3.253
ceadecldlx065.nprd.caixa - 10.188.3.254
ceadecldlx066.nprd.caixa - 10.188.3.255
ceadecldlx067.nprd.caixa - 10.188.4.7
ceadecldlx068.nprd.caixa - 10.188.4.8
ceadecldlx069.nprd.caixa - 10.188.4.9
ceadecldlx070.nprd.caixa - 10.188.4.10
ceadecldlx071.nprd.caixa - 10.188.4.11
ceadecldlx072.nprd.caixa - 10.188.4.12
ceadecldlx073.nprd.caixa - 10.188.4.13
ceadecldlx074.nprd.caixa - 10.188.4.14
ceadecldlx075.nprd.caixa - 10.188.4.15
ceadecldlx076.nprd.caixa - 10.188.4.16
ceadecldlx077.nprd.caixa - 10.188.4.17
ceadecldlx078.nprd.caixa - 10.188.4.18
ceadecldlx079.nprd.caixa - 10.188.4.19
ceadecldlx080.nprd.caixa - 10.188.4.20
ceadecldlx081.nprd.caixa - 10.188.4.21
ceadecldlx082.nprd.caixa - 10.188.4.22
ceadecldlx083.nprd.caixa - 10.188.4.23
ceadecldlx084.nprd.caixa - 10.188.4.24
ceadecldlx085.nprd.caixa - 10.188.4.25
ceadecldlx086.nprd.caixa - 10.188.4.26


Atenciosamente,

Felipe Soares de Oliveira - P541274
CTIS/CESTI/ESTEIRAS DEVOPS
ID da Ordem de Trabalho	 WO0000081150811
Criado em	 23/07/2026 13:05:19
Criado por	 P747408
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezados(a),

Boa tarde.

As entregas de novos compartilhamento estão sendo feitas apenas nos novos storages, e para isso precisamos dos IPs da nova rede de backup dos storages. Favor informar os IPs da nova rede de backup:

10.188 nprd
10.184 prd
ID da Ordem de Trabalho	 WO0000081150811
Criado em	 23/07/2026 12:37:11
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
ID da Ordem de Trabalho	 WO0000081150811
Criado em	 23/07/2026 12:31:02
Criado por	 P730708
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 
Demanda inicial sem viés de falha, erro, degradação ou esgotamento de infraestrutura, serviço, máquina, armazenamento, rotina ou situação que não esteja na iminência de tornar-se incidente. Previsto atendimento no prazo indicado pelo demandante.[CENTRAL-SID]

ID da Ordem de Trabalho	 WO0000081150811
Criado em	 23/07/2026 11:26:29
Criado por	 Remedy Application Service
Origem de Comunicação	 E-mail
Exibir Acesso	 Interno
Notas	 Este ticket foi criado a partir do sistema de solicitação de serviço.
Impresso por P585600 em Terça-feira, 04/08/2026 13:48:31



REQ000144998297



Histórico de Informações de Trabalho da Ordem de Trabalho
ID da Ordem de Trabalho	 WO0000081150812
Criado em	 27/07/2026 21:28:13
Criado por	 P626562
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	  IP adicionado conforme solicitação, segue evidência.


FQDN: hyperprd56.ad.caixa - 10.184.0.0/14
FQDN: hypernprd56.ad.caixa - 10.188.0.0/16


Share Permission ID  Access Name   Share ID  Access Type  Sync Enabled  All Squash Enabled  Root Squash Enabled  Secure Enabled  Security Type  Share Name  KRB5 Access Type  KRB5I Access Type  KRB5P Access Type  Charset  Access Protocol
-------------------  ------------  --------  -----------  ------------  ------------------  -------------------  --------------  -------------  ----------  ----------------  -----------------  -----------------  -------  ---------------
1972                 10.188.3.209  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
1973                 10.188.3.210  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
1974                 10.188.3.211  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
1975                 10.188.3.212  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
1976                 10.188.3.213  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
1977                 10.188.3.214  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
1978                 10.188.3.215  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
1979                 10.188.3.216  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
1980                 10.188.3.217  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
1981                 10.188.3.218  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
1982                 10.188.3.219  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
1983                 10.188.3.220  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
1984                 10.188.3.221  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
1985                 10.188.3.222  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
1986                 10.188.3.223  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
1987                 10.188.3.225  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
1988                 10.188.3.226  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
1989                 10.188.3.227  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
1990                 10.188.3.228  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
1991                 10.188.3.229  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
1992                 10.188.3.230  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
1993                 10.188.3.231  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
1994                 10.188.3.232  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
1995                 10.188.3.233  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
1996                 10.188.3.234  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
1997                 10.188.3.235  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
1998                 10.188.3.236  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
1999                 10.188.3.237  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
2000                 10.188.3.238  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
2001                 10.188.3.239  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
2002                 10.188.3.240  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
2003                 10.188.3.241  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
2004                 10.188.3.242  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
2005                 10.188.3.243  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
2006                 10.188.3.244  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
2007                 10.188.3.245  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
2008                 10.188.3.246  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
2009                 10.188.3.247  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
2010                 10.188.3.248  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
2011                 10.188.3.249  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
2012                 10.188.3.250  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
2013                 10.188.3.251  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
2014                 10.188.3.252  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
2015                 10.188.3.253  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
2016                 10.188.3.254  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
2017                 10.188.3.255  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
2018                 10.188.4.7    145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
2019                 10.188.4.8    145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
2020                 10.188.4.9    145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
2021                 10.188.4.10   145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
2022                 10.188.4.11   145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
2023                 10.188.4.12   145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
2024                 10.188.4.13   145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
2025                 10.188.4.14   145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
2026                 10.188.4.15   145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
2027                 10.188.4.16   145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
2028                 10.188.4.17   145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
2029                 10.188.4.18   145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
2030                 10.188.4.19   145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
2031                 10.188.4.20   145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
2032                 10.188.4.21   145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
2033                 10.188.4.22   145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
2034                 10.188.4.23   145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
2035                 10.188.4.24   145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
2036                 10.188.4.25   145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
2037                 10.188.4.26   145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
2105                 10.188.3.208  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
ID da Ordem de Trabalho	 WO0000081150812
Criado em	 27/07/2026 21:05:22
Criado por	 P626562
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 IP adicionado conforme solicitação, segue evidência.


Share Permission ID  Access Name   Share ID  Access Type  Sync Enabled  All Squash Enabled  Root Squash Enabled  Secure Enabled  Security Type  Share Name  KRB5 Access Type  KRB5I Access Type  KRB5P Access Type  Charset  Access Protocol
 -------------------  ------------  --------  -----------  ------------  ------------------  -------------------  --------------  -------------  ----------  ----------------  -----------------  -----------------  -------  ---------------
 1972                 10.188.3.209  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
 1973                 10.188.3.210  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
 1974                 10.188.3.211  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
 1975                 10.188.3.212  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
 1976                 10.188.3.213  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
 1977                 10.188.3.214  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
 1978                 10.188.3.215  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
 1979                 10.188.3.216  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
 1980                 10.188.3.217  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
 1981                 10.188.3.218  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
 1982                 10.188.3.219  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
 1983                 10.188.3.220  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
 1984                 10.188.3.221  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
 1985                 10.188.3.222  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
 1986                 10.188.3.223  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
 1987                 10.188.3.225  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
 1988                 10.188.3.226  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
 1989                 10.188.3.227  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
 1990                 10.188.3.228  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
 1991                 10.188.3.229  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
 1992                 10.188.3.230  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
 1993                 10.188.3.231  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
 1994                 10.188.3.232  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
 1995                 10.188.3.233  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
 1996                 10.188.3.234  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
 1997                 10.188.3.235  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
 1998                 10.188.3.236  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
 1999                 10.188.3.237  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
 2000                 10.188.3.238  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
 2001                 10.188.3.239  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
 2002                 10.188.3.240  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
 2003                 10.188.3.241  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
 2004                 10.188.3.242  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
 2005                 10.188.3.243  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
 2006                 10.188.3.244  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
 2007                 10.188.3.245  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
 2008                 10.188.3.246  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
 2009                 10.188.3.247  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
 2010                 10.188.3.248  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
 2011                 10.188.3.249  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
 2012                 10.188.3.250  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
 2013                 10.188.3.251  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
 2014                 10.188.3.252  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
 2015                 10.188.3.253  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
 2016                 10.188.3.254  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
 2017                 10.188.3.255  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
 2018                 10.188.4.7    145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
 2019                 10.188.4.8    145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
 2020                 10.188.4.9    145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
 2021                 10.188.4.10   145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
 2022                 10.188.4.11   145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
 2023                 10.188.4.12   145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
 2024                 10.188.4.13   145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
 2025                 10.188.4.14   145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
 2026                 10.188.4.15   145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
 2027                 10.188.4.16   145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
 2028                 10.188.4.17   145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
 2029                 10.188.4.18   145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
 2030                 10.188.4.19   145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
 2031                 10.188.4.20   145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
 2032                 10.188.4.21   145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
 2033                 10.188.4.22   145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
 2034                 10.188.4.23   145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
 2035                 10.188.4.24   145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
 2036                 10.188.4.25   145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
 2037                 10.188.4.26   145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
 2105                 10.188.3.208  145       Read Write   Yes           No                  No                   No              unix           /fs_siorf   No Permission     No Permission      No Permission      default  NFSv3 and NFSv4
ID da Ordem de Trabalho	 WO0000081150812
Criado em	 27/07/2026 18:53:11
Criado por	 C071686
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Demanda autorizada conforme deliberado pela CESTI33. Att, CESTI91
ID da Ordem de Trabalho	 WO0000081150812
Criado em	 27/07/2026 17:56:00
Criado por	 P637135
Origem de Comunicação	 
Exibir Acesso	 Interno
Notas	 [SELO DE CONFORMIDADE  - SCR91001]
Este registro foi avaliado sob os aspectos dos prazos, da qualidade, da documentação do atendimento e do processo, e da conformidade procedimental e técnica visando resguardar a execução, a validação e eventual retorno.
ID da Ordem de Trabalho	 WO0000081150812
Criado em	 27/07/2026 17:55:54
Criado por	 P637135
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 [PAUTA CESTI]
Número: WO0000081150812
Ação: Adição de IP NFS (fs_siorf) no Storage HWPRD8105
Risco: Baixo
Impacto: Não
Ambiente: PRD
Segmento: Infraestrutura
Sistema: SIORF
Destaque: Não
Site: DTC E CTC
Corte: 28/07/2026 06:00
Janela: 27/07/2026 20:00 - 28/07/2026 06:00
Prioridade: Baixa
ID da Ordem de Trabalho	 WO0000081150812
Criado em	 27/07/2026 17:39:08
Criado por	 P544858
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 1 - Informamos que o NFS foi montado com sucesso conforme solciitado:

sh-4.2$ df -h
Filesystem                      Size  Used Avail Use% Mounted on
hypernprd56.ad.caixa:/fs_siorf   50G     0   50G   0% /siorf/Convenio/Resultado


Att.,
Thiago Augusto Jardim
Suporte a Esteira Devops DES e TQS - NPRD
ID da Ordem de Trabalho	 WO0000081150812
Criado em	 27/07/2026 17:08:55
Criado por	 C159703
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Demanda autorizada para atendimento conforme agendamento.

Att

CESTI33
ID da Ordem de Trabalho	 WO0000081150812
Criado em	 27/07/2026 16:58:29
Criado por	 P626562
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Segue plano de ação:


WO0000081150812 - Adição de IP NFS (fs_siorf)
---------------------------------------------------------------------------------------------------------------------
AÇÃO: Adição de IP NFS (fs_siorf)
---------------------------------------------------------------------------------------------------------------------
JUSTIFICATIVA: Adição de IP
---------------------------------------------------------------------------------------------------------------------
SITE (CTC OU DTC) - CTC
---------------------------------------------------------------------------------------------------------------------
AMBIENTE (Bancário, Negocial, Social, PRD, NPRD, HMP, Departamental): PRD
---------------------------------------------------------------------------------------------------------------------
RISCO: Baixo  
---------------------------------------------------------------------------------------------------------------------
IMPACTO: SIM (   ) NÃO ( X )
---------------------------------------------------------------------------------------------------------------------  
ITEM OU ITENS DE CONFIGURAÇÃO (IC):
---------------------------------------------------------------------------------------------------------------------
PLANO DE EXECUÇÃO: SIM ( X ) NÃO (   )
---------------------------------------------------------------------------------------------------------------------
VALIDAÇÃO: SIM ( X ) NÃO (   )
---------------------------------------------------------------------------------------------------------------------
RETORNO: SIM ( X ) NÃO (   )
---------------------------------------------------------------------------------------------------------------------


============================================================================================================================================                                                     PLANO DE EXECUÇÃO
============================================================================================================================================



                                                    (PRODUÇÃO - PRIMÁRIO)

                                               CTC - HWPRD8105 (2102355HAL10R8100005)

Acessar a console via SSH: 10.122.66.65

Verificar se já existe algum compartilhamento com este nome:

># change cli silent_enabled=yes

># show vstore_pair general
># show vstore
Lista de vStore:
Vstore_PRD    Id: 1
Vstore_NPRD   Id: 2

># change vstore view id=2

># show share nfs |filterRow column=Alias predict=match value=/fs_siorf


Adicionar IPs aos compartilhamento "/fs_siorf"

># create share_permission nfs access_name=10.188.3.208 share_name=/fs_siorf access_type=read_write all_squash_enabled=no root_squash_enabled=no

=========================================================================================================================================
PLANO DE RETORNO
=========================================================================================================================================

Abertura de nova demanda no Infrafácil solicitando a remoção.


=========================================================================================================================================
PLANO DE VALIDAÇÃO
=========================================================================================================================================


PROCEDIMENTOS A SEREM EXECUTADOS NO STORAGE CTC - HWPRD8105 (2102355HAL10R8100005)

Acessar a console via ssh: 10.122.66.65

Verificar se já existe algum compartilhamento com este nome:

># change cli silent_enabled=yes

># show vstore

># change vstore view id=1

># show share nfs |filterRow column=Alias predict=match value=/fs_siorf
># show share_permission nfs share_name=/fs_siorf

># show hyper_metro_pair general |filterRow column=Local\sName predict=match value=fs_siorf
ID da Ordem de Trabalho	 WO0000081150812
Criado em	 27/07/2026 13:28:24
Criado por	 P544858
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 No aguardo da informação solicitada.
ID da Ordem de Trabalho	 WO0000081150812
Criado em	 27/07/2026 13:27:44
Criado por	 P544858
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À
Comunidade

1 - Informamos que para montarmos o NFS são necessárias as seguintes informações "Path_NFS":

SERVER_NFS: nfsctcnprd.ctc.caixa
PATH_NFS:
PATH_DESTINO: /siorf/Convenio/Resultado
SIZE_VOLUME: 50Gi

Att.,
Thiago Augusto Jardim
Suporte a Esteira Devops DES e TQS - NPRD
ID da Ordem de Trabalho	 WO0000081150812
Criado em	 27/07/2026 10:40:32
Criado por	 P544858
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À
Comunidade

1 - Informamos que para montarmos o NFS são necessárias as seguintes informações "Path_NFS e Path_Destino":

SERVER_NFS: nfsctcnprd.ctc.caixa
PATH_NFS:
PATH_DESTINO:
SIZE_VOLUME: 50Gi

Att.,
Thiago Augusto Jardim
Suporte a Esteira Devops DES e TQS - NPRD
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
Impresso por P585600 em Terça-feira, 04/08/2026 13:49:26
