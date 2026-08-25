Livia, tudo certo! Só pra alinhar: a variável _ENV.DB_PASSWORD_001 que você apontou ('${spgctr01_sqlserver}') já existe e está correta na library SIPGC-API-SEGURANCA-TQS — não precisa adicionar nada.

A que foi removida foi outra, _SECRET.DB_PASSWORD_001 (sem o zero no final, prefixo _SECRET. e não _ENV.) — essa sim era a legada, remanescente do padrão antigo de token, e era ela que estava causando o erro de mount duplicado no deploy. A _SECRET.DB_PASSWORD_0010 (com o zero, a atual/correta) continua intacta na library, igual ao DES.

Então essa parte de configuração de variáveis está toda certa e completa. O que segue pendente é só o erro de autenticação do BeyondTrust (Failed to authenticate due to one or more authentication rules), que não depende de ajuste de library — precisa da validação do time de Segurança no client 97f8f98c-9ce6-4a2f-bdf0-be70af3218ee (app TQS).
