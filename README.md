À CAIXA,

Em atendimento à WO0000080992068, referente à criação de estrutura de diretórios no NFS do SIEXC e montagem na esteira, informamos o seguinte.

Foi criada, no servidor da aplicação SIEXC (caddeapllx2193.agil.nprd.caixa.gov.br), a estrutura de diretórios solicitada no path NFS /ifs/CADSVISISD4/SERVIDORES/CEPTIBR/SIEXC/SWIFT, contemplando SWIFT/BACKUP/Temp, SWIFT/RECEBIDAS, SWIFT/TRANSMITE/temp, SWIFT/TRANSMITIDOS e SWIFT/TRASH, todos com proprietário jboss:jboss e permissão 770, conforme especificado no documento anexo à requisição.

O ponto de montagem foi configurado como persistente no /etc/fstab do servidor, garantindo disponibilidade do NFS independentemente de restarts ou releases da aplicação. A montagem foi validada com sucesso via remontagem manual (umount/mount -a).

Adicionalmente, foram criadas na Library da esteira (variable group SIEXC-web-aplicacao-des, escopo EC DES) as variáveis NFS_ENDPOINT_ISILON_4 e NFS_MOUNT_POINT_ISILON_4, seguindo o padrão já existente, para que a montagem também seja aplicada automaticamente nos releases da esteira SIEXC-web-aplicacao.

Durante a validação, identificamos que a task de montagem automática da esteira (nfs : execute montagem script, role nfs do esteira-jboss-vm-v2) falha de forma reproduzível ao processar mais de 3 pares NFS_ENDPOINT_ISILON, com erro IndexError no script nfs.py. Esse comportamento foi reportado separadamente ao time responsável pela manutenção da esteira-jboss-vm-v2 para avaliação e correção, e não impacta a estrutura de diretórios e a montagem manual já criadas e validadas no servidor, que atendem ao escopo desta WO.

Diante do exposto, consideramos concluído o atendimento desta WO.

Atenciosamente,
Jessé Batista - P585600
CTIS/CESTI Esteira DevOps DES/TQS NPRD
