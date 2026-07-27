Nota de Fechamento

Durante o deploy da aplicacao sigfa-api-openfinance-des no ambiente DES, o pod permaneceu preso em PodInitializing e o rollout atingiu timeout na etapa de validacao de status de deployment.

Analise dos logs do init container secrets-agent-sidecar identificou falha na obtencao dos segredos junto ao BeyondTrust, com o erro "Invalid secret path: 0, check your path and title separator, separator must be: /". Verificado no Azure DevOps que a variavel BT_SECRETS_LIST, no variable group SIGFA-API-OPENFINANCE-BT-VAULT-DES, estava configurada incorretamente com o valor "0" em vez do path valido do segredo cadastrado no cofre.

O path correto foi fornecido pelo demandante via SLA Temais e atualizado na variavel BT_SECRETS_LIST. Novo deploy realizado no ambiente DES com sucesso, pod inicializado normalmente.

Encerrada a demanda.

Jessé Batista / CTIS/CESTI — Esteira DevOps DES TQS NPRD
