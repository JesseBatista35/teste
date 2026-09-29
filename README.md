Montagem realizada no host cbrdeapllx010 (NPRD) após a inclusão, pelo Armazenamento, do IP de backup NPRD 192.168.228.118 (eth2) no export.

Share: nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIGOT
Ponto de montagem: /SIGOT (nfs4 vers=4.0, persistido no /etc/fstab com _netdev)
df -hT /SIGOT: 10G, 907M usados (9%)
Teste de gravação e remoção OK com os usuários jboss e f599802.
Não há esteira associada a este host: as releases SIGOT no Azure DevOps são de aplicações OKD e a rotina batch (Control-M) não possui pipeline. O Puppet ativo no host não gerencia montagens; a entrada manual no fstab é preservada (validado com puppet agent --noop).

Observação: o IP 192.168.236.197, incluído inicialmente, não pertence a este host. Fica a critério do Armazenamento avaliar a remoção.
