Subimos o JBoss hoje novamente e deu o mesmo problema (ORA-01017: invalid username/password; logon denied) no datasource KeycloakDS.

Para isolar se o problema é no banco ou no Vault do JBoss, você consegue testar um login direto no Oracle com o usuário SSO_TQS_LOGX, sem precisar me passar a senha?

Basta rodar de onde você tiver acesso (sqlplus ou SQL Developer):

sqlplus SSO_TQS_LOGX/<senha>@cnpexdadvm01-scan2.extra.caixa.gov.br:1521/oratO2sc

Se conectar certo, o problema é isolado no Vault do JBoss aqui do servidor (senha decriptada errada) e aí preciso de ajuda de quem tem acesso ao Vault pra corrigir.
Se der o mesmo erro (ORA-01017) mesmo no teste direto, confirma que é algo do lado do banco/política de senha.
