Prezados,

Informamos que a configuração do novo NFS para integração SIHDG x SINAF foi concluída com sucesso no ambiente DES.

Resumo das ações realizadas:

Criados o PersistentVolume e o PersistentVolumeClaim sihdg-sinaf-data-des no namespace sihdg-des, apontando para o compartilhamento liberado pelo time de armazenamento:
Servidor: nprdnfs01.ad.caixa
Path: /ifs/cpwsprd01/nprd/fs_sihdg_sinaf
Capacidade: 50GB
Volume associado ao DeploymentConfig sihdg-jboss8-des, montado no path /sihdg_sinaf, sem impacto no ponto de montagem já existente (/sihdg_des, utilizado na integração SIHDG x PowerCenter).
Variáveis correspondentes atualizadas no variable group SIHDG-JBOSS8-DES (Azure DevOps).
Novo release executado com sucesso via esteira, e validado que o mount /sihdg_sinaf persiste corretamente após o deploy:
sihdg-sinaf-data-des    /sihdg_sinaf
sihdg-jboss8-data-des   /sihdg_des

Confirmado via df -h que o volume está montado e disponível com 50GB para uso.

Considerando concluída a demanda de configuração da esteira. Encaminhamos para validação/encerramento.

Atenciosamente,
Jessé Batista (P585600)
CTIS/CESTI/ESTEIRA - APLICAÇÃO/DEVOPS
