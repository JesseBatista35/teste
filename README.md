Prezada Figura, bom dia.

Estamos encerrando esta REQ por orientação, pois o fluxo adequado para essa demanda é outro.

Como funciona hoje:

Provisionamento do NFS (Armazenamento): a criação do compartilhamento, com path, capacidade e liberação de acesso (ACL) para os IPs do servidor principal e do servidor de backup, deve ser solicitada ao time de Armazenamento pelo InfraFácil, via formulário de provisionamento. Hoje o Armazenamento não atende mais por WO direta e está em migração de rede (IPs na faixa 10.188.0.0/16).
Montagem na esteira (Esteiras DES/TQS): só depois que o compartilhamento existir e estiver liberado, abrimos a demanda para a esteira, informando por NFS: endpoint de origem, mount point de destino e tipo (ISILON ou VM). A esteira apenas monta o que já está provisionado e acessível.
Recriação da esteira com destruição da configuração: não é feita por este time. Se for realmente necessária, trata-se de reprovisionamento do ambiente e deve seguir pelo fluxo de INFRA, também pelo InfraFácil. Em geral, para evitar conflito de mount, basta ajustar as variáveis e reexecutar a esteira.

Próximos passos: após o Armazenamento concluir o provisionamento e confirmar a liberação de acesso, abra uma nova REQ para o time de Esteiras com a relação completa do DE/PARA, que atenderemos.

Permanecemos à disposição.
