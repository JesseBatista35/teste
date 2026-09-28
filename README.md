Solicitamos a montagem do NFS conforme abaixo:

Criação do path: fs_sipcs_vcx no storage cpwsprd01. 

Segue evidência abaixo:

Redes:
NPRD: nprdnfs01.ad.caixa - 10.188.0.0/16

FQDN: nprdnfs01.ad.caixa
Path (alias):/fs_sipcs_vcx


Type      AppliesTo  Path                             Snap  Hard   Soft  Adv    Used   Reduction  Efficiency
-------------------------------------------------------------------------------------------------------------
directory DEFAULT    /fs_sipcs_vcx Yes   50.00G -     40.00G 32.00k -          0.00 : 1
-------------------------------------------------------------------------------------------------------------
Total: 1


                  Zone: nprd
                 Paths: /fs_sipcs_vcx
           Description: WO0000081726775
               Clients: 10.188.6.220
          Root Clients: 10.188.6.220
     Read Only Clients: -
    Read Write Clients: 10.188.6.220
Fri Sep 25 18:02:31 -03 2026

Att;
CESTI53


Histórico de Informações de Trabalho da Ordem de Trabalho
ID da Ordem de Trabalho	 WO0000081726775
Criado em	 28/09/2026 11:22:14
Criado por	 P722542
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezados,

Realizado o ajuste de permissionamento dos IPs para o NFS.

Tarefas de montagem do NFS no host e no mainframe encaminhadas às respectivas equipe responsáveis.
ID da Ordem de Trabalho	 WO0000081726775
Criado em	 25/09/2026 18:07:08
Criado por	 P542717
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Conforme solicitado, realizado a criação do path: fs_sipcs_vcx no storage cpwsprd01. Segue evidência abaixo:

Redes:
NPRD: nprdnfs01.ad.caixa - 10.188.0.0/16

FQDN: nprdnfs01.ad.caixa
Path (alias):/fs_sipcs_vcx


Type      AppliesTo  Path                             Snap  Hard   Soft  Adv    Used   Reduction  Efficiency
-------------------------------------------------------------------------------------------------------------
directory DEFAULT    /fs_sipcs_vcx Yes   50.00G -     40.00G 32.00k -          0.00 : 1
-------------------------------------------------------------------------------------------------------------
Total: 1


                  Zone: nprd
                 Paths: /fs_sipcs_vcx
           Description: WO0000081726775
               Clients: 10.188.6.220
          Root Clients: 10.188.6.220
     Read Only Clients: -
    Read Write Clients: 10.188.6.220
Fri Sep 25 18:02:31 -03 2026

Att;
CESTI53
ID da Ordem de Trabalho	 WO0000081726775
Criado em	 25/09/2026 17:55:55
Criado por	 P637135
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À
CESTI.
Demanda pré- deliberada pela CESTI33.
Demanda atendimento 24x7 conforme alinhado com a CESTI33.
Att,
CESTI53.
ID da Ordem de Trabalho	 WO0000081726775
Criado em	 25/09/2026 17:47:24
Criado por	 P542717
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Segue plano de ação para deleção do path: /fs_sipcs/

WO0000081726775 - Deleção NFS (fs_sipcs)
---------------------------------------------------------------------------------------------------------------------
AÇÃO: Remoção NFS (fs_sipcs)
---------------------------------------------------------------------------------------------------------------------
JUSTIFICATIVA: Remoção
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


============================================================================================================================================
                                                          PLANO DE AÇÃO/EXECUÇÃO
============================================================================================================================================

                                                     ETAPA 001 (PRODUÇÃO - PRIMÁRIO)

 CTC - HWPRD8101 (2102355HAL10R8100001)

Acessar a console via SSH: 10.222.66.67

># change cli silent_enabled=yes

Verificar se existe o compartilhamento:  

># show vstore
># change vstore view id=2

># show share nfs |filterRow column=Alias predict=match value=/fs_sipcs
># show share_permission nfs share_name=/fs_sipcs

Lista de vStore:
Vstore_PRD    Id: 1
Vstore_NPRD   Id: 2

Confirmar que o FS está vazio

># show file_system general|filterRow column=Name predict=match value=fs_sipcs|filterColumn include columnList=Name,ID,Capacity,Available\sCapacity,Used\sCapacity\sRatio(%)
># show share nfs |filterRow column=Local\sPath predict=match value=/fs_sipcs/

Remover o Par "FS" do Hypermetro

># show hyper_metro_pair general |filterRow column=Local\sName predict=match value=fs_sipcs
># delete hyper_metro_pair general pair_id=210094d2bc2470ec0000000000000149

Confirmar e remover Share
># show share nfs |filterRow column=Local\sPath predict=match value=/fs_sipcs/
># delete share nfs share_name=/fs_sipcs

============================================================================================================================================

                                                   ETAPA 002 (PRODUÇÃO - PRIMÁRIO)

                                               DTC - HWPRD8102 (2102355HAL10R8100002)

Acessar a console via SSH: 10.122.66.68

># change cli silent_enabled=yes

Verificar se existe o compartilhamento:  

># show vstore
># change vstore view id=2

># show share nfs |filterRow column=Alias predict=match value=/fs_sipcs
># show share_permission nfs share_name=/fs_sipcs

Lista de vStore:
Vstore_PRD    Id: 1
Vstore_NPRD   Id: 2

Confirmar que o FS está vazio

># show file_system general|filterRow column=Name predict=match value=fs_sipcs|filterColumn include columnList=Name,ID,Capacity,Available\sCapacity,Used\sCapacity\sRatio(%)
># show share nfs |filterRow column=Local\sPath predict=match value=/fs_sipcs/

Confirmar e remover Share
># show share nfs |filterRow column=Local\sPath predict=match value=/fs_sipcs/
># delete share nfs share_name=/fs_sipcs

=========================================================================================================================================
PLANO DE RETORNO
=========================================================================================================================================

Abertura de nova demanda pelo Infrafácil solicitando a criação da estrutura.

=========================================================================================================================================
PLANO DE VALIDAÇÃO
=========================================================================================================================================


                              -------------------------------------------------------------------------
 (PRODUÇÃO - PRIMÁRIO)
CTC - HWPRD8101 (2102355HAL10R8100001)


># show share nfs |filterRow column=Alias predict=match value=/fs_sipcs
># show hyper_metro_pair general |filterRow column=Local\sName predict=match value=fs_sipcs


                              -------------------------------------------------------------------------
                                                   ETAPA 002 (PRODUÇÃO - PRIMÁRIO)

                                               CTC - HWPRD8101 (2102355HAL10R8100001)

Acessar a console via SSH: 10.122.66.67

># show share nfs |filterRow column=Alias predict=match value=/fs_sipcs

Att;
CESTI53
 
ID da Ordem de Trabalho	 WO0000081726775
Criado em	 25/09/2026 17:46:21
Criado por	 P542717
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Segue plano de ação para criação do path /fs_sipcs_vcx no ambiente NPRD. Acrescentado o "vcx" ao final do nome pois já existe um path no ambiente PRD com o nome "fs_sipcs".

WO0000081726775 - Criação novo NFS no PowerScale   
--------------------------------------------------------------
Ação: Criação NFS
--------------------------------------------------------------
Justificativa: sipcs
--------------------------------------------------------------
Risco: Baixo  
--------------------------------------------------------------
Impacto: Sim (   )     Não ( x )
--------------------------------------------------------------
Sistemas, Clusters ou VMs afetados:   
--------------------------------------------------------------
Vai Comunicar com Mainframe:
--------------------------------------------------------------
Janela:   
--------------------------------------------------------------
Validação: Sim ( x )     Não (   )
--------------------------------------------------------------
Retorno: Sim ( x )     Não (   )
--------------------------------------------------------------
Produção Online já informada:  
--------------------------------------------------------------
Sala teams: Sim (   )     Não ( x )

===============================================================================================================================================================================================
OBJETIVO
===============================================================================================================================================================================================
Criação de NFS no Esteira OKD "fs_sipcs_vcx" - Ambiente NPRD - DES

===============================================================================================================================================================================================
PLANO DE AÇÃO  
===============================================================================================================================================================================================

1) Para atendimento serão necessárias as seguintes ações:

2) Acessar o cluster CPWSPRD01 (CTC) via putty através do IP 10.122.66.91;

3) Criar o diretório:
#> mkdir -m 777 /ifs/cpwsprd01/nprd/fs_sipcs_vcx

#> chmod +a user everyone allow dir_gen_all /ifs/cpwsprd01/nprd/fs_sipcs_vcx

4) Criar a cota:
#> isi quota create --type=directory --container=true --enforced=yes --include-snapshots=yes --force --thresholds-on=physicalsize --hard-threshold=50GB --path=/ifs/cpwsprd01/nprd/fs_sipcs_vcx

ou #> isi quota modify --path=/ifs/cpwsprd01/nprd/fs_sipcs_vcx --type=directory --percent-advisory-threshold=80

5) Criar o Export NFS:
#> isi nfs exports create --zone=nprd --paths=/ifs/cpwsprd01/nprd/fs_sipcs_vcx --description='WO0000081726775' --all-dirs=yes --clients='10.188.6.220' --read-write-clients='10.188.6.220' --root-clients='10.188.6.220'

6) Criar o alias
#> isi nfs aliases create --zone=prd --path=/ifs/cpwsprd01/nprd/fs_sipcs_vcx --name=/fs_sipcs_vcx  


8) Informar o FQDN:
  Redes:
  NPRD: nprdnfs01.ad.caixa - 10.188.0.0/16

FQDN: nprdnfs01.ad.caixa
Path (alias):/fs_sipcs_vcx

===============================================================================================================================================================================================
VALIDAÇÃO  
===============================================================================================================================================================================================
09) Validação:

#> isi quota list --path=/ifs/cpwsprd01/nprd/fs_sipcs_vcx
#> isi nfs exports list --zone=nprd --path=/ifs/cpwsprd01/nprd/fs_sipcs_vcx -v | head -n 8;date
#> isi nfs alias view --zone=nprd --name=/fs_sipcs_vcx

Obs.: Não evidência o path completo "--path=/ifs/cpwsprd01/nprd/fs_sipcs_vcx"
Obs.: Evidência o alias "--name=/fs_sipcs_vcx"

===============================================================================================================================================================================================
 RETORNO  
===============================================================================================================================================================================================

Registrar e planejar um novo serviço (WO) para a remoção da estrutura acima, não utilizada, na janela do final de semana.

Att;
CESTI53
ID da Ordem de Trabalho	 WO0000081726775
Criado em	 25/09/2026 17:32:09
Criado por	 P590474
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Demanda inicial sem viés de falha, erro, degradação ou esgotamento de infraestrutura, serviço, máquina, armazenamento, rotina ou situação que não esteja na iminência de tornar-se incidente. Previsto atendimento em até 72 horas. [CENTRAL-SID]
ID da Ordem de Trabalho	 WO0000081726775
Criado em	 25/09/2026 17:14:01
Criado por	 C099028
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 A desmontagem do compartilhamento criado na WO0000081711179 está sendo feita na REQ000146215521
ID da Ordem de Trabalho	 WO0000081726775
Criado em	 25/09/2026 16:43:11
Criado por	 P637135
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Demanda ordinária com prazo de atendimento em até 72 horas [33-C2]
ID da Ordem de Trabalho	 WO0000081726775
Criado em	 25/09/2026 16:38:02
Criado por	 Remedy Application Service
Origem de Comunicação	 E-mail
Exibir Acesso	 Interno
Notas	 Este ticket foi criado a partir do sistema de solicitação de serviço.
Impresso por P585600 em Segunda-feira, 28/09/2026 12:20:44


nao enteid qual minha atuaça nessa tarfa é aprimeira vexz que pego uma assim

