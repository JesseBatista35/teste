
Nota de Fechamento

Identificada indisponibilidade na aplicação SIGEC Portabilidade (DES), instância Batch, com retorno de erro 404 ao acessar o endpoint da aplicação.

Realizada verificação junto ao Domain Controller JBoss, constatando que as instâncias sigec-portabilidade-batch_node1_lx104 e sigec-portabilidade2_node1_lx104 encontravam-se paradas no host sbrdeapllx104_credito.

Efetuado reinício das instâncias via JBoss CLI, com posterior validação de acesso à aplicação, confirmando normalização do serviço.

Chamado encerrado com sucesso.

Jessé Batista, CTIS/CESTI — Esteira DevOps DES TQS NPRD
