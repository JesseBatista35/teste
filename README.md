Sobre o caso do SIPGC TQS: já corrigimos o problema de mountPath duplicado (tinha uma variável de senha legada — _SECRET.DB_PASSWORD_001 — sobrando no grupo SIPGC-API-SEGURANCA-TQS, removemos e o pod passou a ser criado normalmente).

Só que agora o pod (sipgc-api-seguranca-tqs-17-cgdjk) ficou travado em Init:CrashLoopBackOff, porque o secrets-agent-sidecar não consegue autenticar no BeyondTrust:

Failed to authenticate due to one or more authentication rules.

Esse erro é específico do client:

Client ID: 97f8f98c-9ce6-4a2f-bdf0-be70af3218ee (app TQS)
Endpoint: https://sicsn.caixa/BeyondTrust/api/public/v3
Horário: 25/08/2026 14:17:37
