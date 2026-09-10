Prezados,

Em análise ao chamado sobre a esteira DevOps do SICCP-back, identificamos a causa da falha de leitura das variáveis DB_USER e PASS_DB pela aplicação.

Diagnostico:
A library SICCP-BACK-DES esta corretamente vinculada ao pipeline de Release, com escopo EC DES, e contem as chaves DB_USER e PASS_DB. Porem, apenas variaveis com o prefixo _ENV. sao injetadas pela esteira como variavel de ambiente real do container no deploy. As chaves DB_USER e PASS_DB estao cadastradas na library sem esse prefixo, por isso nunca chegam ao pod, o que explica os valores nulos observados no log da aplicacao (DB_USER env: null, PASS_DB env: null).

Pendencia (responsabilidade do time de desenvolvimento):
Na library SICCP-BACK-DES, criar as variaveis _ENV.DB_USER e _ENV.PASS_DB (esta ultima como secret) com os valores corretos de usuario e senha de acesso ao banco.

Pendencia em investigacao (esteira DevOps):
As variaveis ISTIO_INJECTION e CONTEXTO_JBOSS, referenciadas no script de deploy (linhas 82 e 92), tambem retornam "comando nao encontrado" e nao estao presentes na library SICCP-BACK-DES nem em nenhum outro variable group vinculado ao pipeline. Seguimos verificando se essas chaves deveriam estar definidas em outro variable group ou task group utilizado no deploy.

Proximo passo:
Apos o preenchimento de _ENV.DB_USER e _ENV.PASS_DB pelo time de desenvolvimento, executar novo deploy em DES e confirmar se as variaveis sao lidas corretamente pela aplicacao.
