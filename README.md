Jesse Mouta Pereira Batista
Wladimir Vieira de Souza e Livia Pereira Oliveira Santos   Sobre o caso do SIPGC TQS: já corrigi o problema de mountPath duplicado, tinha uma variável de senha legada  _SECRET.DB_PASSWORD_001  = '${s…
Essa variável é que contém a senha de acesso ao banco e resolve o vault. Ele precisa existir na library 
 
'${spgctr01_sqlserver}'
 
_ENV.DB_PASSWORD_001
 
A secret , era do modo antigo, guardada na variável: 
_SECRET.DB_PASSWORD_0010
 
Jesse Mouta Pereira Batista o item apontado pela colega Livia Pereira Oliveira Santos precisa de ação da segurança? Ou pode ser visto por ti. Em tempo, vou procurar algum colega da equipe do Lucas
 
