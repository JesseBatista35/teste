Nota de Fechamento

Identificada falha na subida do POD no OKD4 devido a erro na descoberta do endpoint de autenticação (OIDC), com falha ao acessar a URL de login (retorno 404).

Realizado rollout restart do POD, restabelecendo a comunicação com o provedor de autenticação com sucesso — aplicação subiu normalmente e passou a processar as transações.

Validado também o pipeline de deploy no Azure DevOps, concluído com sucesso (Succeeded).

Ambiente normalizado e operante.

Jessé Batista, CTIS/CESTI — Esteira DevOps DES TQS NPRD
