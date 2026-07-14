Lawrence, bom dia! Sobre o SIOUV (REQ000144870440): fizemos uma nova verificação agora e o cenário mudou.

Confirmamos que a connection-url do datasource OracleSiouvDS já estava corrigida no domain controller desde ontem à tarde (~14h49), apontando pro host novo (oracle-nprd-1000.caixa). Ontem à noite (~20h) o servidor passou por um restart/redeploy, e a partir desse momento os logs não mostram mais nenhum erro de conexão com o banco.

Acabei de checar o log de hoje (14/07, 11h01) e a aplicação está processando normalmente — rotina de tratamento de ocorrências BACEN rodando do início ao fim sem erro.

Ou seja: o problema parece resolvido. Não sei se ainda faz sentido montar a sala com o time do SIOUV, mas segue a atualização pra vocês decidirem. Qualquer coisa posso mandar os logs/prints do diagnóstico.
