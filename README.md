Corrigir
Variável	Valor atual (errado)	Valor correto
_ENV.QUARKUS_DATASOURCE_JDBC_URL	jdbc:sqlserver://AGSQLDES100...;databaseName=master;...	jdbc:sybase:Tds:bbrdedadux001.corecaixa:20113?ServiceName=SMNDB001
_ENV.QUARKUS_DATASOURCE_USERNAME	f710695	usuário de serviço do SMNDB001 em TQS (equivalente ao SSMNBD04 do DES; confirmar com o DBA ou o dev)
SYSBASEDB01_DBPASS (secreta)	senha atual	senha do usuário de serviço acima
Incluir (existem no DES e faltam no TQS)
Variável	Valor
_ENV.APL_AUTH_SERVICO_URL	https://login.des.caixa/auth/realms/intranet/protocol/openid-connect/token
_ENV.APL_LOG_OPERACAO_NU_SITE	1

O APL_AUTH_SERVICO_URL aponta para login.des porque o QUARKUS_OIDC_AUTH_SERVER_URL do próprio TQS já usa login.des.

Ajuste de segurança (recomendado)
Variável	Ajuste
_ENV.APL_EMAIL_CONFIG_SMTP_PASSWORD	Marcar como secreta (cadeado), como já está no DES. O valor continua o mesmo.
Opcional
Variável	Atual	Sugestão
_ENV.QUARKUS_LOG_LEVEL	DEBUG	INFO, como no DES. Deixe DEBUG se o dev estiver investigando algo.

Se o DBA ainda não tiver o usuário de serviço: para destravar agora, mantenha f710695 no USERNAME e atualize a SYSBASEDB01_DBPASS com a senha atual dessa matrícula. A URL já corrigida é o que faz a release passar. Depois troque pelo usuário de serviço.

Com o grupo salvo, reexecute o stage EC TQS.
