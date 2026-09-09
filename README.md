Solicitar Armazenamento
----------------------------------------------------
Solicitante: c148227
Centro de Custo: CESOB
Opção NAS: Sistema
Nome Sistema: sihdg
Ambiente: DES
Esteira OKD
Plataforma Armazenamento: OPEN
Tipo de Disco: NAS
Compartilhamento NOVO
Volumetria: 50GB
Custo Mensal: R$ 9,23
Custo Anual: R$ 110,67
----------------------------------------------------
Ponto de Montagem: /sihdg_sinaf
Tipo de Compartilhamento: NFS
Vai se Comunicar com Mainframe: SIM
Transformação de Caracteres? (EBC/DIC para ASCII): SIM
Versão do NFS: 3
---------------------------------
PARTIÇÕES MAINFRAME
---------------------------------
Partição: D1DF
IP1: 192.168.231.41

---------------------------------
HOSTS OKD
---------------------------------
Módulo: sihdg-jboss8
Ip Real: 10.116.220.211
Ip de Backup: 192.168.230.209, 192.168.230.210, 192.168.240.201, 192.168.235.248, 192.168.236.12, 192.168.236.13, 192.168.236.14, 192.168.236.15, 192.168.236.16, 192.168.236.17, 192.168.236.18, 192.168.236.20, 192.168.236.23, 192.168.236.28, 192.168.236.30, 192.168.236.35, 192.168.236.34, 192.168.236.39, 192.168.236.47, 192.168.229.250, 192.168.230.116, 192.168.230.137, 192.168.230.187, 192.168.231.31, 192.168.234.186, 192.168.236.143, 192.168.236.144, 192.168.236.145, 192.168.236.146, 192.168.236.147, 192.168.236.148, 192.168.236.149, 192.168.236.150, 192.168.236.151, 192.168.236.152, 192.168.236.153, 192.168.236.154, 192.168.236.200, 192.168.236.155, 192.168.236.156, 192.168.236.157, 192.168.236.158, 192.168.236.159, 192.168.236.160, 192.168.236.168, 192.168.236.161, 192.168.236.162, 192.168.236.163, 192.168.236.164, 192.168.236.165, 192.168.236.166, 192.168.236.167, 192.168.236.168, 192.168.236.170, 192.168.236.171, 192.168.236.172, 192.168.236.173, 192.168.251.90, 192.168.251.91, 192.168.251.92, 192.168.251.93, 192.168.251.94, 192.168.251.95, 192.168.251.96, 192.168.251.97, 192.168.251.98, 192.168.251.99, 192.168.231.135, 192.168.240.182, 192.168.240.183, 192.168.240.184, 192.168.240.185, 192.168.240.186, 192.168.240.187, 192.168.240.188, 192.168.240.189, 192.168.240.190, 192.168.240.191, 192.168.240.192, 192.168.240.193, 192.168.240.194, 192.168.240.195, 192.168.240.196, 192.168.240.197, 192.168.240.198, 192.168.240.199, 192.168.240.200, 10.188.3.208, 10.188.3.209, 10.188.3.210, 10.188.3.211, 10.188.3.212, 10.188.3.213, 10.188.3.214, 10.188.3.215, 10.188.3.216, 10.188.3.217, 10.188.3.218, 10.188.3.219, 10.188.3.220, 10.188.3.221, 10.188.3.222, 10.188.3.223, 10.188.3.224, 10.188.3.225, 10.188.3.226, 10.188.3.227, 10.188.3.228, 10.188.3.229, 10.188.3.230, 10.188.3.231, 10.188.3.232, 10.188.3.233, 10.188.3.234, 10.188.3.235, 10.188.3.236, 10.188.3.237, 10.188.3.238, 10.188.3.239, 10.188.3.240, 10.188.3.241, 10.188.3.242, 10.188.3.243, 10.188.3.244, 10.188.3.245, 10.188.3.246, 10.188.3.247, 10.188.3.248, 10.188.3.249, 10.188.3.250, 10.188.3.251, 10.188.3.252, 10.188.3.253, 10.188.3.254, 10.188.3.255, 10.188.4.7, 10.188.4.8, 10.188.4.9, 10.188.4.10, 10.188.4.11, 10.188.4.12, 10.188.4.13, 10.188.4.14, 10.188.4.15, 10.188.4.16, 10.188.4.17, 10.188.4.18, 10.188.4.19, 10.188.4.20, 10.188.4.21, 10.188.4.22, 10.188.4.23, 10.188.4.24, 10.188.4.25, 10.188.4.26
Hostname: sihdg-jboss8
----------------------------------------------------
Observações:
1. Solicito que seja criado um novo NFS para integração do SIHDG x SINAF:
- Origem: SIHDG-JBOSS8 [ CONTAINER ] [ DES ] [ OKD4_NPRD
- Tamanho: 50GB de capacidade via NFS.
- Ponto de montagem:  PATH_DESTINO = /sihdg_sinaf/

ATENÇÂO: Não sobrepor com o ponto de montagem já existente no servidor NFS que é  PATH_DESTINO = /sihdg/  (vide item 2.1.2)

*** Para mais detalhes sobre os dois pontos de montagem acessar a REQ000145740789 e REQ000145772523

2. Hoje tenho o NFS abaixo:
     SERVER_NFS = hypernprd56.ad.caixa
     PATH_NFS = /fs_sihdg
     PATH_DESTINO = /sihdg/        
     SIZE_VOLUME_SINAF=20Gi


3. No servidor NFS (fs_sihdg), preciso de 2 dois diretórios/exports (ponto de montagem) distintos, um para cada destino, tais como:
        /fs_sihdg
             sihdg_sinaf         (destino integração SIHDG x SINAF)
             sihdg  (destino integração SIHDG x POWERCENTER)



Histórico de Informações de Trabalho da Ordem de Trabalho
ID da Ordem de Trabalho	 WO0000081616760
Criado em	 09/09/2026 14:06:54
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
ID da Ordem de Trabalho	 WO0000081616760
Criado em	 09/09/2026 13:37:11
Criado por	 P656511
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Segue para avaliação e atendimento
ID da Ordem de Trabalho	 WO0000081616760
Criado em	 09/09/2026 12:02:45
Criado por	 P569415
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Para: Multi
Segue para montagem do NFS.

Att,
CESTI53
ID da Ordem de Trabalho	 WO0000081616760
Criado em	 09/09/2026 12:01:03
Criado por	 P747408
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezaods(a),

Bom dia.

Segue abaixo as informações para a montagem do novo compartilhamento:
FQDN: nprdnfs01.ad.caixa - 10.188.0.0/16
Path (alias):/fs_sihdg_sinaf

Evidência do compartilhamento e suas permissões:
isi nfs exports list --zone=nprd --path=/ifs/cpwsprd01/nprd/fs_sihdg_sinaf -v | head -n 8;date
                    ID: 11
                  Zone: nprd
                 Paths: /ifs/cpwsprd01/nprd/fs_sihdg_sinaf
           Description: WO0000081616760
               Clients: 10.188.3.208, 10.188.3.209, 10.188.3.210, 10.188.3.211, 10.188.3.212, 10.188.3.213, 10.188.3.214, 10.188.3.215, 10.188.3.216, 10.188.3.217, 10.188.3.218, 10.188.3.219, 10.188.3.220, 10.188.3.221, 10.188.3.222, 10.188.3.223, 10.188.3.224, 10.188.3.225, 10.188.3.226, 10.188.3.227, 10.188.3.228, 10.188.3.229, 10.188.3.230, 10.188.3.231, 10.188.3.232, 10.188.3.233, 10.188.3.234, 10.188.3.235, 10.188.3.236, 10.188.3.237, 10.188.3.238, 10.188.3.239, 10.188.3.240, 10.188.3.241, 10.188.3.242, 10.188.3.243, 10.188.3.244, 10.188.3.245, 10.188.3.246, 10.188.3.247, 10.188.3.248, 10.188.3.249, 10.188.3.250, 10.188.3.251, 10.188.3.252, 10.188.3.253, 10.188.3.254, 10.188.3.255, 10.188.4.7, 10.188.4.8, 10.188.4.9, 10.188.4.10, 10.188.4.11, 10.188.4.12, 10.188.4.13, 10.188.4.14, 10.188.4.15, 10.188.4.16, 10.188.4.17, 10.188.4.18, 10.188.4.19, 10.188.4.20, 10.188.4.21, 10.188.4.22, 10.188.4.23, 10.188.4.24, 10.188.4.25, 10.188.4.26

Atenciosamente,
Eduardo Cruz de Melo
ID da Ordem de Trabalho	 WO0000081616760
Criado em	 09/09/2026 10:14:54
Criado por	 P776093
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Demanda inicial sem viés de falha, erro, degradação ou esgotamento de infraestrutura, serviço, máquina, armazenamento, rotina ou situação que não esteja na iminência de tornar-se incidente. Previsto atendimento em até 72 horas. [CENTRAL-SID]
ID da Ordem de Trabalho	 WO0000081616760
Criado em	 09/09/2026 09:14:37
Criado por	 Remedy Application Service
Origem de Comunicação	 E-mail
Exibir Acesso	 Interno
Notas	 Este ticket foi criado a partir do sistema de solicitação de serviço.
Impresso por P585600 em Quarta-feira, 09/09/2026 20:40:09
             
