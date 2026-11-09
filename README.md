Variável	Valor
_ENV.QUARKUS_DATASOURCE_JDBC_URL	jdbc:sybase:Tds:bbrdedadux001.corecaixa:20113?ServiceName=SMNDB001

Isso tira os ; e resolve o erro do oc set env.

Se o pod precisar subir conectando no banco, entra mais uma:

Variável	Valor
SYSBASEDB01_DBPASS	senha atual da f710695 (ou a do usuário de serviço, se trocar o USERNAME junto)

Sem isso, o deploy passa mas continua o JZ00L.

O resto (as duas variáveis a incluir, deixar o SMTP como secreto, o log level) é melhoria e pode ficar para depois.
