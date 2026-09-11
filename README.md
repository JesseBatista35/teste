Jaqueline/Ricardo, bom dia!

A correção do service name (oratO2sc) funcionou - o datasource oraset conectou normalmente.

Porém apareceu um novo bloqueio, agora no datasource KeycloakDS: o usuário SSO_TQS_LOGX está com a conta bloqueada no Oracle:

ORA-28000: the account is locked

Poderiam desbloquear esse usuário (ALTER USER SSO_TQS_LOGX ACCOUNT UNLOCK) para eu tentar subir o JBoss novamente?

Obrigado!
