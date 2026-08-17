ela disse isso

Fizemos essa  alteração na library para testar o vault e evitar conflito: _SECRET.DB_PASSWORD_0010, quando subimos uma branch que não está configurado o vault e ajustamos o nome da variável, acessa normalmente o banco.
 
Se o problema for no banco, é somente quando acessa a senha pelo vault
