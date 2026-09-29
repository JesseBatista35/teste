Prezados, a montagem no host cbrdeapllx010 (siafr, NPRD) falhou porque o IP de origem do host não está liberado no export.

O host acessa o nfsctcnprd.ctc.caixa pela interface de backup NPRD eth2 – 192.168.228.118:
ip route get 192.168.224.108 → dev eth2 src 192.168.228.118

Teste de montagem:
mount -t nfs nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIGOT /SIGOT
mount.nfs: ... failed, reason given by server: No such file or directory (rc=32)

O showmount -e confirma que o export existe, mas não contém 192.168.228.118. O IP incluído nesta WO (192.168.236.197) não pertence a este host.

Solicitamos a inclusão de 192.168.228.118 em Clients, Read Write Clients e Root Clients do export /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIGOT, e a avaliação da remoção do 192.168.236.197, caso tenha sido incluído por engano. Após a liberação, concluiremos a montagem em /SIGOT.

O diretório /SIGOT já ficou criado no host. Quando liberarem, basta repetir o mount, testar a escrita com o usuário da aplicação e persistir no /etc/fstab.
