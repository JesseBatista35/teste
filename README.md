Sim, pode ser assim — não há problema técnico em ter topologias de storage diferentes entre DES e TQS. O que importa é que cada ponto de montagem funcione corretamente e esteja mapeado certinho na aplicação, não que os dois ambientes usem exatamente a mesma arquitetura de servidores NFS.

É bem comum, inclusive, que DES e TQS tenham storages distintos (servidores Isilon/NFS diferentes, criados em momentos diferentes, por equipes diferentes), então essa divergência de "1 servidor com 2 exports" vs "2 servidores com 1 export cada" é só uma diferença de como o storage foi provisionado em cada ambiente — não afeta o funcionamento da aplicação, desde que:

Os paths de destino dentro do container sejam os mesmos (ou equivalentes) nos dois ambientes — ex: /sihdg_sinaf e /sihdg_powercenter (ou /sihdg, no caso do DES antigo)
As variáveis de ambiente (NFS_PATH, PATH_DESTINO, SERVER_NFS, SIZE_VOLUME) estejam configuradas corretamente para refletir o servidor/path real de cada ambiente
O tamanho dos volumes não seja um bloqueio funcional (você tem 20G/50G em TQS vs 50G nos dois em DES — isso só importa se o SINAF ou o PowerCenter realmente precisarem de mais que 20G em TQS)

