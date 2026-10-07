Encerramento – SISME-rotinas (TQS) – Falha na montagem do NFS no step "Configura Control-M"

Problema:
A release do SISME-rotinas (TQS) falhava no step Configura Control-M, na task Montando volume remoto, com o erro mount.nfs: Connection timed out ao montar nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISME_TQS_FGW em /sisme_fgw, no servidor caddeapllx2781.

Causa raiz:
A interface de backup do servidor (ens224) estava configurada com o IP 192.168.221.15/19, fora da rede de backup do Isilon (192.168.224.0/19 – BKP TSM NAO PRODUCAO NPRD, VLAN 3697). Sem rota pela interface de backup, o tráfego para o storage (192.168.224.102) saía pela interface de serviço, e a rede de serviço não se comunica com a rede de backup (confirmado pela CETEL/Rede – Valdir Soares).

Ações realizadas:

Diagnóstico de conectividade do servidor com o storage (portas 111/2049 sem resposta) e comparação com um servidor funcional (caddeapllx2193).
Alocação de novo IP na rede de backup via alocaIP: CADDEBKPLX1554 – 192.168.243.7/19 (VLAN 3697), conforme orientação da CETEL.
Atualização do IP de backup do servidor no InfraFácil.
Reexecução da release, que aplicou a nova configuração de rede e concluiu a montagem do NFS e a configuração do Control-M com sucesso.

Validação:

ens224 com IP 192.168.243.7/19
/sisme_fgw montado a partir do Isilon nfsctcnprd
Entrada persistente no /etc/fstab
Step Configura Control-M concluído sem falhas
