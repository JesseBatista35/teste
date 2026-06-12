me mandaram essa demanda me colocaram na ssla ae pediram pra mim verificar o NFS


sou analista de esterias devops. me ajuda a verificar isso porfavor com passo a passo etou perdido

1 nova atividade
2 novas notificações
Há menu de contexto
Chat




Não lido
Canais
Chats
Mensagem não lidaÚltima mensagemChats em grupoChat de reuniãoChatFuncionários mencionadosMencionar todosImportanteUrgenteRascunhoRascunhoMudo ativadoReunião em andamentoReunião agora em andamentoVocê não pode enviar mensagens porque não é membro do chat.Não é possível enviar mensagens a este botPrivadoCompartilhadoTem um menu de contextoCanal mencionadoEquipe mencionadaFuncionários mencionadosNão lidoNão lidoReunião em andamentoNão lidoCanalEquipeTem mensagens fixadasVer maisComunidadeMostrar temporariamenteTem um menu de contextoChat com emblemaChats com emblema
Tem um menu de contexto

REQ000144464042-WO0000080696536-SIMPG-monolito


Chat

Compartilhado

Há menu de contexto

Reunir agora


7




Lista de Mensagens
Flavio de Almeida Gagliardi adicionou Gabriela Pires Klassmann e 2 outras ao chat.
Flavio de Almeida Gagliardi alterou o nome do grupo para REQ000144464042-WO0000080696536-SIMPG-monolito.
Boa tarde Patricia   Vourakis   Barbosa   ... por Flavio de Almeida Gagliardi
Flavio de Almeida Gagliardi
12:24

Boa tarde Patricia Vourakis Barbosa Braga e Thiago Rafael Cavalcante Pereira, tudo bem?

Preciso de um apoio de vcs pra verificar esta demanda REQ000144464042-WO0000080696536

 

 


👍🏻
1 reação Curtir com o tom de pele Light.

Gabriela Pires Klassmann adicionou Ronaldo Mota Geraldino ao chat.
Ela havia sido colocada em priorização ante... por Flavio de Almeida Gagliardi
Flavio de Almeida Gagliardi
12:26

Ela havia sido colocada em priorização ante-ontem, mas permanece em atendimento. 

Me parece que transitou entre nosso time de NPRD e de Armazenamento, que colocou a ultima nota a pouco:

 

12/06/2026 12:24:21, P668948,  
WO0000080696536 - ADD IP/ifs/CADSVISISD4/SERVIDORES/CETAD/SIMPG
--------------------------------------------------------------------------------------------------------------------- 
Ação: ADD IP /ifs/CADSVISISD4/SERVIDORES/CETAD/SIMPG
--------------------------------------------------------------------------------------------------------------------- 
Justificativa: ADD IP /ifs/CADSVISISD4/SERVIDORES/CETAD/SIMPG
--------------------------------------------------------------------------------------------------------------------- 
Risco: Baixo  
--------------------------------------------------------------------------------------------------------------------- 
Impacto: Sim ( )     Não (x)
--------------------------------------------------------------------------------------------------------------------- 
Sistemas, Clusters ou VMs afetados: 
--------------------------------------------------------------------------------------------------------------------- 
Janela: XX/XX/2026  22h00 até XX/XX/2026  06h00  
--------------------------------------------------------------------------------------------------------------------- 
VALIDAÇÃO: Sim (x)     Não ( )
--------------------------------------------------------------------------------------------------------------------- 
RETORNO: Sim ( X )     Não ( ) 
--------------------------------------------------------------------------------------------------------------------- 
Produção Online já informada:  
--------------------------------------------------------------------------------------------------------------------- 
Sala teams: Sim ( )     Não (x)
---------------------------------------------------------------------------------------------------------------------

 

0) A demanda Altera o Ambiente?
  Sim ( X )
  Não (   )
1) Avaliação de Risco: 
  Baixo ( X )
  Médio (   )
  Alto  (   ) 
2) Plano de Execução:
  Sim ( X )
  Não (   )

 

1. Acessar o storage CADSVISISD4 via putty --> 10.122.148.76:22;

Executar os comandos abaixo:             

 

#> isi nfs exports list --zone=SERVIDORES --path=/ifs/CADSVISISD4/SERVIDORES/CETAD/SIMPG -v | head;date
#> isi nfs exports modify --add-clients='192.168.242.150' --add-root-clients='192.168.242.150' --add-read-write-clients='192.168.242.150' --zone=SERVIDORES --id=726
#> isi nfs exports list --zone=SERVIDORES --path=/ifs/CADSVISISD4/SERVIDORES/CETAD/SIMPG -v | head;date

 

4) Plano de Validação: 
  Sim ( X ) --> isi nfs exports list --zone=SERVIDORES --path=/ifs/CADSVISISD4/SERVIDORES/CETAD/SIMPG -v | head;date
  Não (   )

 

5) Plano de retorno: 
  Sim ( X ) --> #> isi nfs exports modify --remove-clients='192.168.242.150' --remove-root-clients='192.168.242.150' --remove-read-write-clients='192.168.242.150' --zone=SERVIDORES --id=726
  Não (   )

pelo que entendi o NFS foi montado   por Flavio de Almeida Gagliardi
Flavio de Almeida Gagliardi
12:28

pelo que entendi o NFS foi montado

 

Verifiquem por gentileza se ja podemos test... por Flavio de Almeida Gagliardi
Flavio de Almeida Gagliardi
12:29

Verifiquem por gentileza se ja podemos testar, ou se falta algum ajuste de disponibilização de disco por favor!

A demandante está em sala conosco

Gabriela Pires Klassmann adicionou Welinton da Silva Oliveira ao chat e compartilhou todo o histórico de chats.
Boa tarde, pessoal! E muito obrigada, Flavi... por Gabriela Pires Klassmann
Gabriela Pires Klassmann
12:32

Boa tarde, pessoal! E muito obrigada, Flavio!


🤝
1 Aperto de mãos reação.

Patricia Vourakis Barbosa Braga adicionou Jesse Mouta Pereira Batista ao chat e compartilhou todo o histórico de chats.
Jesse   Mouta   Pereira   Batista  boa tard... por Patricia Vourakis Barbosa Braga
Patricia Vourakis Barbosa Braga
12:37
Importante

Jesse Mouta Pereira Batista boa tarde, por favor verificar se o NFS acima WO0000080696536 já está montado realmente conforme solicitação do Flavio de Almeida Gagliardi. 

Flavio de Almeida Gagliardi
12/06/2026 12:29
Verifiquem por gentileza se ja podemos testar, ou se falta algum ajuste de disponibilização de disco por favor! A demandante está em sala conosco
 

Início da citação, Patricia Vourakis Barbos... por Jesse Mouta Pereira Batista
12:41
Jesse Mouta Pereira Batista

Patricia Vourakis Barbosa Braga
12/06/2026 12:37
Jesse Mouta Pereira Batista boa tarde, por favor verificar se o NFS acima WO0000080696536 já está montado realmente conforme solicitação do Flavio de Almeida Gagliardi.
Boa tarde, Patricia Vourakis Barbosa Braga, certo irie verificar!


❤️
1 Coração reação.

*irei por Jesse Mouta Pereira Batista
12:41
Jesse Mouta Pereira Batista

*irei

tem menu de contexto
Status de Thiago Rafael Cavalcante Pereira: Thiago Rafael Cavalcante Pereira - PREPOSTO NPRD Horário: 07h as 16h seg. a sex. Na minha ausência por favor entrar em contato com RO Rodrigo Almeida (p747342) , preposta Patrícia Vourakis Barbosa Braga P768728 ou preposta Elza Oliveira Leão (p507043)





Histórico de Informações de Trabalho da Ordem de Trabalho
ID da Ordem de Trabalho	 WO0000080696536
Criado em	 12/06/2026 12:51:42
Criado por	 P521571
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 WO0000080696536
Ação: Adicionar IP no ifs/CADSVISISD4/SERVIDORES/CETAD/SIMPG
Risco: Baixo
Impacto: Não
Ambiente: PRD
Segmento: Infraestrutura
Sistema:  SIMPG
Destaque: Não
Site: CTC
Corte: 16/06/2026 09:00
Janela: 15/06/2026 20:00 - 16/6/2026 06:00
Obs.: Não
ID da Ordem de Trabalho	 WO0000080696536
Criado em	 12/06/2026 12:24:21
Criado por	 P668948
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 WO0000080696536 - ADD IP/ifs/CADSVISISD4/SERVIDORES/CETAD/SIMPG
---------------------------------------------------------------------------------------------------------------------
Ação: ADD IP /ifs/CADSVISISD4/SERVIDORES/CETAD/SIMPG
---------------------------------------------------------------------------------------------------------------------
Justificativa: ADD IP /ifs/CADSVISISD4/SERVIDORES/CETAD/SIMPG
---------------------------------------------------------------------------------------------------------------------
Risco: Baixo  
---------------------------------------------------------------------------------------------------------------------
Impacto: Sim ( )     Não (x)
---------------------------------------------------------------------------------------------------------------------
Sistemas, Clusters ou VMs afetados:
---------------------------------------------------------------------------------------------------------------------
Janela: XX/XX/2026  22h00 até XX/XX/2026  06h00  
---------------------------------------------------------------------------------------------------------------------
VALIDAÇÃO: Sim (x)     Não ( )
---------------------------------------------------------------------------------------------------------------------
RETORNO: Sim ( X )     Não ( )
---------------------------------------------------------------------------------------------------------------------
Produção Online já informada:  
---------------------------------------------------------------------------------------------------------------------
Sala teams: Sim ( )     Não (x)
---------------------------------------------------------------------------------------------------------------------


0) A demanda Altera o Ambiente?
Sim ( X )
Não (   )
1) Avaliação de Risco:
Baixo ( X )
Médio (   )
Alto  (   )
2) Plano de Execução:
Sim ( X )
Não (   )

1. Acessar o storage CADSVISISD4 via putty --> 10.122.148.76:22;

Executar os comandos abaixo:             

#> isi nfs exports list --zone=SERVIDORES --path=/ifs/CADSVISISD4/SERVIDORES/CETAD/SIMPG -v | head;date
#> isi nfs exports modify --add-clients='192.168.242.150' --add-root-clients='192.168.242.150' --add-read-write-clients='192.168.242.150' --zone=SERVIDORES --id=726
#> isi nfs exports list --zone=SERVIDORES --path=/ifs/CADSVISISD4/SERVIDORES/CETAD/SIMPG -v | head;date

4) Plano de Validação:
Sim ( X ) --> isi nfs exports list --zone=SERVIDORES --path=/ifs/CADSVISISD4/SERVIDORES/CETAD/SIMPG -v | head;date
Não (   )

5) Plano de retorno:
Sim ( X ) --> #> isi nfs exports modify --remove-clients='192.168.242.150' --remove-root-clients='192.168.242.150' --remove-read-write-clients='192.168.242.150' --zone=SERVIDORES --id=726
Não (   )


ID da Ordem de Trabalho	 WO0000080696536
Criado em	 12/06/2026 11:59:37
Criado por	 P649560
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 CONFORME SOLICITADO, FOI ADICIONADO O IP 192.168.242.150 NO SERVIDOR caddeapllx1979 VLAN 3697




[root@caddeapllx1979 network-scripts]# ip a | grep ens224
3: ens224: <BROADCAST,MULTICAST,UP,LOWER_UP> mtu 1500 qdisc mq state UP group default qlen 1000
   inet 192.168.242.150/19 brd 192.168.255.255 scope global noprefixroute ens224
[root@caddeapllx1979 network-scripts]#
[root@caddeapllx1979 network-scripts]#
[root@caddeapllx1979 network-scripts]# ping 192.168.224.1
PING 192.168.224.1 (192.168.224.1) 56(84) bytes de dados.
64 bytes de 192.168.224.1: icmp_seq=1 ttl=64 tempo=0.199 ms
64 bytes de 192.168.224.1: icmp_seq=2 ttl=64 tempo=0.176 ms
64 bytes de 192.168.224.1: icmp_seq=3 ttl=64 tempo=0.185 ms
64 bytes de 192.168.224.1: icmp_seq=4 ttl=64 tempo=0.177 ms
64 bytes de 192.168.224.1: icmp_seq=5 ttl=64 tempo=0.185 ms
64 bytes de 192.168.224.1: icmp_seq=6 ttl=64 tempo=0.162 ms
^C
--- 192.168.224.1 estatísticas de ping ---
6 pacotes transmitidos, 6 recebidos, 0% packet loss, time 5136ms
rtt min/avg/max/mdev = 0.162/0.180/0.199/0.011 ms
[root@caddeapllx1979 network-scripts]#
[root@caddeapllx1979 network-scripts]#
[root@caddeapllx1979 network-scripts]# date
sex 12 jun 2026 11:56:31 -03
[root@caddeapllx1979 network-scripts]#
ID da Ordem de Trabalho	 WO0000080696536
Criado em	 12/06/2026 09:19:10
Criado por	 P665576
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezados,

Segue conforme solicitado em nota de 11/06 as 20:23h.

Atenciosamente,
TELEDATA / CETEL / REDE DATA CENTER
ID da Ordem de Trabalho	 WO0000080696536
Criado em	 12/06/2026 09:17:37
Criado por	 P705068
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À

TELEDATA/CETEL/REDES

Segue o ip de backup alocado na rede solicitado.

CADDEAPLLX1979 - 192.168.242.150 - Gateway :192.168.224.1 - Mascara: 255.255.224.0 - VLAN: 3697

Att,
Weverton de Oliveira Silva
Analista de infraestrutura - Redes
TELEDATA/CETEL/REDES
ID da Ordem de Trabalho	 WO0000080696536
Criado em	 11/06/2026 20:23:50
Criado por	 P507043
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 A equipe de redes,

conforme nota da equipe de armazenamento  


"Visto que o NFS solicitado é no storage CADSVISISD4, informamos que para acesso é necessário que o host possua um IP na rede 192.168.224.0/19.
O IP informado que começa com 10.184. não possui acesso.

At.te,
Vinicius Pires
SONDA/CESTI53/ARMAZENAMENTO


Favor informar um IP valido dentro do range informado na nota.

Att
ID da Ordem de Trabalho	 WO0000080696536
Criado em	 11/06/2026 19:13:08
Criado por	 P694128
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À Esteiras DES e TQS,
A/c WELLINGTON DA SILVA,

Segue para verificação conforme nota anterior
ID da Ordem de Trabalho	 WO0000080696536
Criado em	 11/06/2026 17:55:35
Criado por	 P722542
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezados,

Visto que o NFS solicitado é no storage CADSVISISD4, informamos que para acesso é necessário que o host possua um IP na rede 192.168.224.0/19.
O IP informado que começa com 10.184. não possui acesso.

At.te,
Vinicius Pires
SONDA/CESTI53/ARMAZENAMENTO
ID da Ordem de Trabalho	 WO0000080696536
Criado em	 11/06/2026 15:59:02
Criado por	 P744064
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Boa tarde!

informamos que o ip de bkp foi montado e agora barrou na permissão do NFS:

- IP ok:

[p744064@caddeapllx1979 ~]$ ip a | grep -i inet
   inet 127.0.0.1/8 scope host lo
   inet6 ::1/128 scope host
   inet 10.116.198.236/19 brd 10.116.223.255 scope global noprefixroute ens192
   inet6 fe80::250:56ff:fe82:6f25/64 scope link
   inet 10.184.22.74/19 brd 10.184.31.255 scope global noprefixroute ens224
   inet6 fe80::250:56ff:fe82:6cda/64 scope link noprefixroute
[p744064@caddeapllx1979 ~]$

- NFS nok:

nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIMPG /simpg-tqs

2026-06-11T18:55:59.8836402Z fatal: [caddeapllx1979.agil.nprd.caixa.gov.br]: FAILED! => {"changed": false, "msg": "Error mounting /simpg-tqs: mount.nfs: Connection timed out\n"

Obs. Será direcionado para armazenamento dar permissão ao ip para o NFS.

At.te,

Wellington Silva
ID da Ordem de Trabalho	 WO0000080696536
Criado em	 11/06/2026 12:24:15
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
ID da Ordem de Trabalho	 WO0000080696536
Criado em	 11/06/2026 11:42:33
Criado por	 P665576
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezados,

Conforme nota anterior, o IP de backup foi alocado.

Atenciosamente,
TELEDATA / CETEL / REDE DATA CENTER
ID da Ordem de Trabalho	 WO0000080696536
Criado em	 11/06/2026 10:21:16
Criado por	 P705068
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À

TELEDATA/CETEL/REDES

Segue o ip de backup alocado.

CADDEAPLLX1979 - 10.184.22.74 - Gateway :10.184.0.1 - Mascara: 255.252.0.0 - VLAN: 1140

Att,
Weverton de Oliveira Silva
Analista de infraestrutura - Redes
TELEDATA/CETEL/REDES
ID da Ordem de Trabalho	 WO0000080696536
Criado em	 10/06/2026 17:27:07
Criado por	 P744064
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Boa noite!

Favor direcionar para a Multi para informarem o range correto para configuração do ip de bkp no server.

At.te,

Wellington Silva
ID da Ordem de Trabalho	 WO0000080696536
Criado em	 10/06/2026 16:37:45
Criado por	 P919724
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À equipe NPRD.

O ajuste de IP solicitado não é possível pois:

1 - IP de backup solicitado é de PRD e não NPRD.

2 - Conforme evidência anexa, há IPs de backup disponíveis no ambiente NPRD.

3 - Na library, o ponto de montagem menciona 1 NFS em ISILON, porém o Endpoint e Mountpoint está configurado para VM --> Favor, seguir documentação: https://wiki.suporte.caixa/index.php/Montagem_de_NFS_para_VM

OBS: Após ajustes, criar uma NOVA Release e realizar deploy.

Estamos à disposição para maiores esclarecimentos.

At.te,
Thiago Jorge Araújo
Analista
CTIS/CESTI/ESTEIRA - DEVOPS PRD
ID da Ordem de Trabalho	 WO0000080696536
Criado em	 09/06/2026 17:13:31
Criado por	 P744064
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Boa tarde!

Demanda será direcionada a equipe do Terraform para ajuste do ip.

At.te,

Wellington Silva
ID da Ordem de Trabalho	 WO0000080696536
Criado em	 09/06/2026 16:05:35
Criado por	 P658275
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Á Esteiras

Prezados, gostaria de rever se devemos mesmo seguir com a adição de interface de forma manual.

Ao checar o servidor envolvido, detectamos que o mesmo é provisionado via Terraform, portanto qualquer ação manual será desfeita quando houver um novo deploy do servidor.

CADDEAPLLX1979 Red Hat Enterprise Linux 9 (64-bit) 10.116.198.236 10.116.198.236 Gerenciado pelo Packer/Terraform - Esteiras Ageis - SIMPG-MONOLITO-TQS - Template: eap74-openjdk8-apache24-rhel93-v002 - caddeapllx1979.agil.nprd.caixa.gov.br

Recomendo analisar com os analistas que detêm conhecimento do terraform avaliem se o processo de adição da interface é feito de forma automática via pipelie ou se se devemos prosseguir de forma manual.

Atenciosamente,
Jalisson P. S. Xavier
Responsável Operacional - SONDA
CTIS/CESTI/Multi - Suporte a Sistemas Operacionais
ID da Ordem de Trabalho	 WO0000080696536
Criado em	 09/06/2026 10:39:46
Criado por	 P558217
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezado(a),



Informamos que sua solicitação PRIORIZADA foi recebida .  



Nosso SLA para atendimento é de até 8h úteis, analisaremos a solicitação para nos certificarmos que o atendimento está dentro do escopo de atuação da nossa equipe.



Caso seja identificado que o atendimento não corresponde ao nosso escopo, a solicitação será redirecionada à equipe responsável.



Novas informações e atualizações serão registradas diretamente nesta WO.



Atte.



CTIS / CESTI Esteira DEVOPS DES TQS NPRD
ID da Ordem de Trabalho	 WO0000080696536
Criado em	 09/06/2026 10:29:27
Criado por	 P590588
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Demanda ordinária com atendimento em até 72 horas. [E11-C2]
ID da Ordem de Trabalho	 WO0000080696536
Criado em	 09/06/2026 10:25:20
Criado por	 P689732
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 A
Multi S.O

Favor alocar um IP no range range 10.184.0.0 vlan 1140, o portgroup "tn-BACKUP|BACKUP-NPRD-ap|BACKUP-NPRD-ep" já foi incluído na VM CADDEAPLLX1979
ID da Ordem de Trabalho	 WO0000080696536
Criado em	 09/06/2026 09:32:15
Criado por	 P669476
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À
Multiplataforma,

Segue demanda para avaliação e tratamento, uma vez que existe nota informando que a maquina esta sem interface na rede de backup.

Atenciosamente,
André Hebert dos Santos
Preposto
CTIS/CESTI/ESTEIRA - APLICAÇÃO/DEVOPS
ID da Ordem de Trabalho	 WO0000080696536
Criado em	 09/06/2026 09:30:19
Criado por	 P695115
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezados,
Bom dia.

Informamos que  servidor esta sem interface de rede para comunicação com o ambiente de backup.

Evidencia segue abaixo.


[root@caddeapllx1979 ~]# cat /etc/fstab

#
# /etc/fstab
# Created by anaconda on Tue May 21 13:53:25 2024
#
# Accessible filesystems, by reference, are maintained under '/dev/disk/'.
# See man pages fstab(5), findfs(8), mount(8) and/or blkid(8) for more info.
#
# After editing this file, run 'systemctl daemon-reload' to update systemd
# units generated from this file.
#
/dev/mapper/VG_PRINCIPAL-LV_BARRA /                       xfs     defaults        0 0
UUID=918583d9-8fe6-4f6d-9c52-c3832ce08d27 /boot                   xfs     defaults        0 0
/dev/mapper/VG_PRINCIPAL-LV_LOGS /logs                   xfs     nodev           0 0
/dev/mapper/VG_PRINCIPAL-LV_OPT /opt                    xfs     nodev           0 0
/dev/mapper/VG_PRINCIPAL-LV_TMP /tmp                    xfs     nodev           0 0
/dev/mapper/VG_PRINCIPAL-LV_VAR /var                    xfs     nodev           0 0
/dev/mapper/VG_PRINCIPAL-LV_SWAP none                    swap    defaults        0 0
nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SIMPG /simpg-tqs nfs rw,sync,hard 0 0
[root@caddeapllx1979 ~]# mount -a
mount.nfs: Connection timed out
mount: (hint) your fstab has been modified, but systemd still uses
      the old version; use 'systemctl daemon-reload' to reload.
[root@caddeapllx1979 ~]# systemctl daemon-reload
[root@caddeapllx1979 ~]# ifco
-bash: ifco: comando não encontrado
[root@caddeapllx1979 ~]# ip a
1: lo: <LOOPBACK,UP,LOWER_UP> mtu 65536 qdisc noqueue state UNKNOWN group default qlen 1000
   link/loopback 00:00:00:00:00:00 brd 00:00:00:00:00:00
   inet 127.0.0.1/8 scope host lo
      valid_lft forever preferred_lft forever
   inet6 ::1/128 scope host
      valid_lft forever preferred_lft forever
2: ens192: <BROADCAST,MULTICAST,UP,LOWER_UP> mtu 1500 qdisc mq state UP group default qlen 1000
   link/ether 00:50:56:82:ea:04 brd ff:ff:ff:ff:ff:ff
   altname enp11s0
   inet 10.116.198.236/19 brd 10.116.223.255 scope global noprefixroute ens192
      valid_lft forever preferred_lft forever
   inet6 fe80::250:56ff:fe82:ea04/64 scope link
      valid_lft forever preferred_lft forever
[root@caddeapllx1979 ~]# mount -a



Informamos que a maquina é do ambiente agil e pode ser recriada.

caddeapllx1979.agil.nprd.caixa.gov.br

Favor verificar.

Atenciosamente,
Marcos Cavaco
CTIS / CESTI / ESTEIRAS – Aplicação e Apresentação
ID da Ordem de Trabalho	 WO0000080696536
Criado em	 09/06/2026 07:17:46
Criado por	 P558217
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 À Equipe  

Esteira Devops

Segue para avaliação da pertinência e tratamento, conforme nota do analista no dia 08/06/26 às 21h47

Atte.

CTIS / CESTI Esteira DEVOPS DES TQS
ID da Ordem de Trabalho	 WO0000080696536
Criado em	 09/06/2026 07:14:04
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
ID da Ordem de Trabalho	 WO0000080696536
Criado em	 08/06/2026 21:47:07
Criado por	 P744064
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Boa noite!

Informamos que não está montando o NFS devido as máquinas não estarem com IP de Backup.

Demanda será direcionada a equipe de infra para montagem dos IPs.

Obs após o ip configurado, deve ser direcionado a demanda para o pessoal de armazenamento dar permissão ao NFS para este mesmo ip.

At.te,

Wellington Silva
ID da Ordem de Trabalho	 WO0000080696536
Criado em	 08/06/2026 19:53:50
Criado por	 P787287
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Demanda inicial sem viés de falha, erro, degradação ou esgotamento de infraestrutura, serviço, máquina, armazenamento, rotina ou situação que não esteja na iminência de tornar-se incidente. Previsto atendimento em até 24 horas.[CENTRAL-SID]
ID da Ordem de Trabalho	 WO0000080696536
Criado em	 08/06/2026 19:17:34
Criado por	 P507043
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Prezado(a),



Informamos que sua solicitação foi recebida.  



Nosso SLA para atendimento é de até 24h úteis, analisaremos a solicitação para nos certificarmos que o atendimento está dentro do escopo de atuação da nossa equipe.



Caso seja identificado que o atendimento não corresponde ao nosso escopo, a solicitação será redirecionada à equipe responsável.



Novas informações e atualizações serão registradas diretamente nesta WO.



Atte.



CTIS / CESTI Esteira DEVOPS DES TQS NPRD
ID da Ordem de Trabalho	 WO0000080696536
Criado em	 08/06/2026 18:52:20
Criado por	 F710695
Origem de Comunicação	 
Exibir Acesso	 Público
Notas	 Anexo do Registro de Solicitação.
ID da Ordem de Trabalho	 WO0000080696536
Criado em	 08/06/2026 18:52:18
Criado por	 Remedy Application Service
Origem de Comunicação	 E-mail
Exibir Acesso	 Interno
Notas	 Este ticket foi criado a partir do sistema de solicitação de serviço.
Impresso por P585600 em Sexta-feira, 12/06/2026 12:54:28
