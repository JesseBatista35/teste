Precisa solicitar um novo NFS específico para TQS — não dá para "evoluir" ou reaproveitar o mesmo compartilhamento do DES.

Isso porque DES e TQS são ambientes completamente segregados na esteira Caixa:

Storage: o NFS nprdnfs01.ad.caixa:/ifs/cpwsprd01/nprd/fs_sihdg_sinaf foi provisionado especificamente para o ambiente NPRD/DES. TQS normalmente usa outro server/path de storage (segregação por ambiente é padrão de segurança/governança).
Namespace: o PV/PVC que criamos (sihdg-sinaf-data-des) está no namespace sihdg-des. Em TQS, o namespace seria outro (sihdg-tqs), exigindo um novo PV/PVC próprios.
Variable group: as variáveis que configuramos ficaram em SIHDG-JBOSS8-DES. Existe um grupo separado SIHDG-JBOSS8-TQS (você mesmo viu isso no print do Azure DevOps lá atrás) que precisaria das variáveis equivalentes.
DeploymentConfig: o sihdg-jboss8-tqs (ou nome equivalente) é um DC diferente do sihdg-jboss8-des, com seu próprio conjunto de volumes.
