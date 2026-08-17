Livia Pereira Oliveira Santos, achei um novo erro, a autenticação ta sendo rejeitada pelo SQL Server:
 
Login failed for user 'SPGCDR01' (Error 18456, State 1)
 
O BeyondTrust está funcionando corretamente ele carrega e resolve a senha do cofre sem erro. O problema é que essa senha está sendo recusada pelo SQL Server 10.116.92.247. 
 
nesse caso você precisa validar com o time de DBA
 
Se a senha cadastrada no cofre BeyondTrust (spgcdr01_sqlserver) está atualizada e confere com a senha atual do usuário SPGCDR01 no SQL Server;  e também se o usuário SPGCDR01 está ativo (não bloqueado/expirado).


Boa tarde,
 
Então, validei com o Lucas Vinicius e antes de configurarmos o vault, acessávamos normalmente o banco



<img width="1594" height="785" alt="image" src="https://github.com/user-attachments/assets/9b0fa93c-7274-4f1c-b2ed-836f593c8ac9" />


