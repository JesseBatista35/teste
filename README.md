O PR já foi aprovado (Margareth aprovou há 1h), mas o merge está bloqueado automaticamente pelo GitHub aguardando 2 checks obrigatórios que ainda não retornaram resultado:

QA / Quality Assurance — status "waiting", ainda não reportou;
CodeQL (code scanning) — aguardando resultado dos commits.

Não é algo que dá pra forçar/pular manualmente — é regra de proteção de branch do repositório. Assim que esses checks concluírem (sucesso ou falha), o merge libera ou aponta o que precisa ajustar.
