Prezados,

Informamos que a inclusão do módulo de compartilhamento NFS solicitada para o sistema SISNS (ambiente TQS) foi implementada com sucesso através de nova Release da esteira SISNS-backend (SISNS-backend-3.0.0.5).

Foram criados o PersistentVolume e o PersistentVolumeClaim referentes ao compartilhamento nfsctcnprd.ctc.caixa:/ifs/CADSVISISD4/SERVIDORES/CETAD/SISNS_TQS_FGW, e o DeploymentConfig sisns-backend-tqs foi atualizado para utilização do volume criado.

Validação realizada no pod em execução (sisns-backend-tqs-119-gjln8) confirmou o mount ativo em /opt/SISNS/SIB2B/GECIN/DOWNLOAD, com o volume de 5.0G disponível e acessível, contendo os dados esperados.

Diante do exposto, consideramos a demanda concluída com sucesso.

Atenciosamente,
Esteira Devops DES TQS NPRD
