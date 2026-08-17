Livia, achamos a causa. O erro não é mais de configuração da esteira — é autenticação rejeitada pelo SQL Server:

Login failed for user 'SPGCDR01' (Error 18456, State 1)

O BeyondTrust está funcionando corretamente (carrega e resolve a senha do cofre sem erro). O problema é que essa senha está sendo recusada pelo SQL Server 10.116.92.247. Precisamos validar com o time de banco de dados/DBA:

Se a senha cadastrada no cofre BeyondTrust (spgcdr01_sqlserver) está atualizada e confere com a senha atual do usuário SPGCDR01 no SQL Server;
Se o usuário SPGCDR01 está ativo (não bloqueado/expirado);
Se a instância aceita autenticação SQL (mixed mode).

Recomendo abrir chamado com o time de DBA/banco para validação da credencial — esse ponto está fora do escopo de configuração de pipeline/vault.
