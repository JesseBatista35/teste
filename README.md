Agora reproduza
Abra uma aba anônima e aperte F12.
Na aba Network, marque Preserve log. Deixe também o Console visível.
Acesse https://siepr-curso-bec3-frontend-des.apps.nprd.caixa.

O que observar:

a) Redirecionamento para o Login CAIXA. Na Network, clique na chamada auth?client_id=cli-web-epr... e copie o redirect_uri. Ele precisa apontar para https://siepr-curso-bec3-frontend-des.apps.nprd.caixa/....

b) Página de CPF. Confirme se o waitOFDB is not defined aparece no Console, como no print do solicitante.

c) Login completo. Informe CPF e senha:

Avançou e voltou ao SIBEC3 (302 para a rota com ?code=): o fluxo funciona, e o waitOFDB é só um erro do Login CAIXA, sem impacto.
Travou no CPF: o erro é bloqueante.
Erro depois da senha (redirect_uri, client not found ou volta com erro): o problema é no cadastro do client cli-web-epr.

d) Teste de comparação. Em outra aba anônima, abra a página de conta do mesmo realm:

https://logindes.caixa.gov.br/auth/realms/internet/account

Se o waitOFDB também aparecer no Console, o problema é geral do Login CAIXA.

Me mande o redirect_uri, até onde o login avançou e o resultado do teste de comparação.
