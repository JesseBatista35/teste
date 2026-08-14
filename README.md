Analisando o deploy e os logs, o carregamento do vault está funcionando certinho — os secrets do BeyondTrust foram encontrados e a senha foi resolvida com sucesso. Então o vault em si não é o problema.

Encontrei dois pontos na configuração que podem estar causando o 500:

Não há a variável ASPNETCORE_ENVIRONMENT no grupo SIPGC-API-SEGURANCA-DES, então a aplicação está subindo como Production mesmo em DES (confirmado no log: "Hosting environment: Production"). Isso pode estar carregando configurações erradas.
A variável _ENV.DB_PASSWORD_001 está com aspas simples em volta do placeholder ('${spgcdr01_sqlserver}'). Se essas aspas forem literais, a senha final pode sair errada depois de resolvida, quebrando a autenticação no banco.

Por enquanto não precisa abrir chamado — são ajustes de configuração no grupo de variáveis, não é caso de liberação de acesso/multiplataforma. Vou revisar esses dois pontos e, se possível, ajustar antes da segunda-feira. Combinamos de testar a aplicação na segunda, certo?

Bom final de semana!
