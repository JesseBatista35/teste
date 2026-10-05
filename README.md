Assunto: Liberação de acesso NFS – host caddeapllx2781 (TQS) → Isilon nfsctcnprd.ctc.caixa

Solicito liberação de comunicação do servidor caddeapllx2781.agil.nprd.caixa.gov.br (10.116.201.252), utilizado pelo sistema SISME-rotinas em TQS, para o storage Isilon nfsctcnprd.ctc.caixa (192.168.224.102), a fim de montar o export /ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW.

Portas: TCP/UDP 111 (rpcbind) e TCP/UDP 2049 (NFS), além das portas auxiliares de NFSv3 (mountd/NLM/NSM) conforme o padrão do Isilon.

Evidências: a partir do host, as conexões às portas 111 e 2049 resultam em timeout, rpcinfo -p e showmount -e não respondem, e a montagem na release 535994 falha com mount.nfs: Connection timed out nas 3 tentativas. O export existe e foi validado pela automação da esteira.
