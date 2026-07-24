Histórico de Informações de Trabalho da Ordem de Trabalho
ID da Ordem de Trabalho	 WO0000081132605
Criado em	 23/07/2026 17:39:17
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
ID da Ordem de Trabalho	 WO0000081132605
Criado em	 23/07/2026 16:28:14
Criado por	 P626562
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 O IP informado não pertence a VLAn do NFS, os novos NFS e SMB estão sendo entregues nos novos storages e para as novas redes.

PRD: 10.184.0.0/14
NPRD: 10.188.0.0/16

Caso não tenham uma interface (rede) configurado, devem solicitar a adição de uma nova e também o IP .



At.te.:
Renato C. Santos
SONDA\CESTI\ARMAZENAMENTO OPEN
ID da Ordem de Trabalho	 WO0000081132605
Criado em	 23/07/2026 15:45:26
Criado por	 P981778
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 IP de backup no Vcenter 192.168.237.16
ID da Ordem de Trabalho	 WO0000081132605
Criado em	 23/07/2026 14:31:29
Criado por	 P903171
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Falta IP de rede de backup do Hostname crjtqapllx046
IP 10.116.26.200
ID da Ordem de Trabalho	 WO0000081132605
Criado em	 23/07/2026 10:19:16
Criado por	 P668948
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 FQDN: hypernprd56.ad.caixa - 10.188.0.0/16
ID da Ordem de Trabalho	 WO0000081132605
Criado em	 23/07/2026 10:18:01
Criado por	 P668948
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Solicitação atendida:

p668948@Vstore_NPRD:/>show share nfs |filterRow column=Alias predict=match value=/fs_sippg_tqs_fgw

 Share ID  File System ID  Description      Local Path          Alias              File System Name
 --------  --------------  ---------------  ------------------  -----------------  ----------------
 144       186             WO0000081132605  /fs_sippg_tqs_fgw/  /fs_sippg_tqs_fgw  fs_sippg_tqs_fgw

p668948@Vstore_NPRD:/>show share_permission nfs share_name=/fs_sippg_tqs_fgw

 Share Permission ID  Access Name   Share ID  Access Type  Sync Enabled  All Squash Enabled  Root Squash Enabled  Secure Enabled  Security Type  Share Name         KRB5 Access Type  KRB5I Access Type  KRB5P Access Type  Charset  Access Protocol
 -------------------  ------------  --------  -----------  ------------  ------------------  -------------------  --------------  -------------  -----------------  ----------------  -----------------  -----------------  -------  ---------------
 1971                 10.188.5.179  144       Read Write   Yes           No                  No                   No              unix           /fs_sippg_tqs_fgw  No Permission     No
 
ID da Ordem de Trabalho	 WO0000081132605
Criado em	 23/07/2026 09:26:43
Criado por	 C099028
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Autorizamos a demanda.
Att.,
CESTI33
ID da Ordem de Trabalho	 WO0000081132605
Criado em	 22/07/2026 11:24:39
Criado por	 P765995
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Segue plano de ação, foi informado apenas um IP de backup em notas anteriores , NOME DO NFS CORRIGIDO
ID da Ordem de Trabalho	 WO0000081132605
Criado em	 22/07/2026 11:21:41
Criado por	 P765995
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 DESCONSIDERAR NOTA ANTERIOR
ID da Ordem de Trabalho	 WO0000081132605
Criado em	 22/07/2026 11:00:32
Criado por	 P765995
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Segue plano de ação, foi informado apenas um IP de backup em notas anteriores
ID da Ordem de Trabalho	 WO0000081132605
Criado em	 22/07/2026 01:54:46
Criado por	 P568291
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 WO0000081132605 - Criação NFS (fs_sippg)
---------------------------------------------------------------------------------------------------------------------
AÇÃO: Criação NFS (fs_sippg)
---------------------------------------------------------------------------------------------------------------------
JUSTIFICATIVA: Criação
---------------------------------------------------------------------------------------------------------------------
SITE (CTC OU DTC) - CTC
---------------------------------------------------------------------------------------------------------------------
AMBIENTE (Bancário, Negocial, Social, NPRD, HMP, Departamental): NPRD
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

Att.,
Glauber Farias
Armazenamento Open
ID da Ordem de Trabalho	 WO0000081132605
Criado em	 21/07/2026 22:09:30
Criado por	 P635388
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezados,

Favor encaminhar à equipe de armazenamento.

Segue ip de backup da VM

10.188.5.179

Att
ID da Ordem de Trabalho	 WO0000081132605
Criado em	 21/07/2026 20:35:31
Criado por	 P719768
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezados,
Devido ao processo de migração dos compartilhamentos NFS para o novo ambiente, solicitamos informar os IPs de backup dos hosts que necessitarão de acesso ao compartilhamento,
obrigatoriamente pertencentes a uma das redes abaixo:

Backup Produção (PRD): 10.184.0.0/14 (VLAN 1140)
Backup Não Produção (NPRD): 10.188.0.0/16 (VLAN 1141)

Após o envio dessas informações, poderemos dar prosseguimento ao provisionamento do acesso no novo ambiente.
Ficamos no aguardo.

Atenciosamente,
Armazenamento Sonda.
ID da Ordem de Trabalho	 WO0000081132605
Criado em	 21/07/2026 20:15:51
Criado por	 P779123
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Demanda inicial sem viés de falha, erro, degradação ou esgotamento de infraestrutura, serviço, máquina, armazenamento, rotina ou situação que não esteja na iminência de tornar-se incidente. Previsto atendimento em até 72 horas. [CENTRAL-SID]
ID da Ordem de Trabalho	 WO0000081132605
Criado em	 21/07/2026 19:50:42
Criado por	 P571997
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezado(a),

Acusamos o recebimento desta WO.
- Informamos que sua solicitação entrou em fila de atendimento.
- Informações futuras serão adicionadas a esta WO.

Qualquer dúvida, estamos à disposição

Preposto Armazenamento
CTIS / CESTI / Armazenamento CESTI53.
ID da Ordem de Trabalho	 WO0000081132605
Criado em	 21/07/2026 19:44:22
Criado por	 Remedy Application Service
Origem de Comunicação	 E-mail
Exibir Acesso	 Interno
Notas	 Este ticket foi criado a partir do sistema de solicitação de serviço.
Impresso por P585600 em Sexta-feira, 24/07/2026 09:29:34
