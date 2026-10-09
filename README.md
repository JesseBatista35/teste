Teste pela rota no navegador: https://sipcs-login-unico-jboss-okd-des.apps.nprd.caixa/login2/
O dev precisa testar o login de ponta a ponta, não só a abertura da tela. O siatcDS ainda dá “Connection is not valid”, e o LDAP também ainda não foi exercitado. Se o login falhar, o próximo passo é investigar o datasource.
O dev precisa levar o ajuste do pom para a branch principal. A branch de teste não pode ser a fonte da release definitiva.
