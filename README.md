Prezada Figura, bom dia.

Estamos encerrando esta solicitação por orientação, pois a montagem na esteira depende de uma etapa anterior que não foi identificada.

Provisionamento do NFS (Armazenamento): a criação dos compartilhamentos, com path, capacidade e liberação de acesso (ACL) para o IP do servidor principal e o IP do servidor de backup, deve ser solicitada ao time de Armazenamento pelo InfraFácil, via formulário de provisionamento. Hoje o Armazenamento não atende mais por WO direta e está em migração de rede (IPs na faixa 10.188.0.0/16).
Configuração na esteira (Esteiras DES/TQS): assim que o Armazenamento concluir o provisionamento, a demanda é encaminhada ao nosso time, e então realizamos a configuração dos NFS na esteira de DES, com base no DE/PARA informado. A esteira apenas monta o que já está provisionado e liberado. Sem a ACL, a montagem falha por timeout ou permissão negada.
Recriação da esteira: será avaliada após o recebimento dos dados, analisando quais variáveis e mounts precisam ser ajustados ou limpos. A recriação completa só será executada se for realmente necessária.

Permanecemos à disposição.
