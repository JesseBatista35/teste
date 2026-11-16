Análise concluída – Login CAIXA / SIBEC3 (DES)

Os erros relatados na página de CPF (Uncaught ReferenceError: waitOFDB is not defined e HTTP 400 no favicon.ico) vêm do tema da própria página do Login CAIXA (realm internet, logindes.caixa.gov.br). Não são gerados pelo SIBEC3 e não impedem a autenticação.

Validação realizada: acesso a https://siepr-curso-bec3-frontend-des.apps.nprd.caixa com o CPF de teste 03848489074 (client cli-web-epr). O login no Login CAIXA foi concluído e o retorno ao SIBEC3 ocorreu normalmente, com o usuário identificado na tela e o token obtido com sucesso (HTTP 200).

Observação: depois do login, o SIBEC3 exibe “Usuário sem acesso ao sistema” porque as chamadas ao backend (parametros-portal, hora, invalidar) retornam HTTP 500 (“Parâmetro da certificação não informado no header”). Esse comportamento é do backend do SIEPR e não tem relação com o SSO. Identificamos que o siepr-backend-des está indisponível desde 13/11 por falha de autenticação no cofre de senhas (BeyondTrust), e que a origem do SIBEC3 não está liberada no CORS desse backend. Esses pontos devem ser tratados em demanda própria. A massa de dados citada pelo time (cadastro pendente em outro sistema) também deve ser concluída para o perfil de acesso.

Demanda encerrada quanto ao escopo de SSO.
