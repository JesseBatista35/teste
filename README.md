Prezada Figura, bom dia.

Vamos atender a configuração dos NFS na esteira de DES. Para prosseguir, precisamos de algumas informações:

Relação completa do DE/PARA, informando por NFS: endpoint de origem (produção), endpoint a ser montado em DES, mount point de destino e tipo (ISILON ou VM), incluindo os compartilhamentos repetidos.
Confirmação da liberação de acesso (ACL) de cada export para o IP principal e para o IP de backup dos servidores de DES. No tipo VM, essa liberação é manual e feita pelo time de Armazenamento. Sem ela, a montagem falha por timeout ou permissão negada. Caso os exports ainda não estejam provisionados ou liberados, a solicitação deve ser feita ao Armazenamento pelo InfraFácil.

Sobre a recriação da esteira com destruição da configuração atual: não será feita de imediato. Com o DE/PARA em mãos, vamos analisar quais variáveis e mounts precisam ser ajustados ou limpos para o fluxo funcionar. A recriação completa só será executada se for realmente necessária, pois ela remove a configuração atual do servidor, incluindo montagens que hoje funcionam.
