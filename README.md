Teste pela rota no navegador: https://sipcs-login-unico-jboss-okd-des.apps.nprd.caixa/login2/
O dev precisa testar o login de ponta a ponta, não só a abertura da tela. O siatcDS ainda dá “Connection is not valid”, e o LDAP também ainda não foi exercitado. Se o login falhar, o próximo passo é investigar o datasource.
O dev precisa levar o ajuste do pom para a branch principal. A branch de teste não pode ser a fonte da release definitiva.


<img width="1898" height="1000" alt="image" src="https://github.com/user-attachments/assets/654d14ca-c57f-42d1-8c3d-c5bfa429d69a" />


o ajuste no pm foi realizdo na branch Cesti-test001, me ajuda com  anota para fechar a demadna dessa forma nao é necesraio reuniao basta o time de desenvolvimento avaliar a aplicar os ajustes feitos no pom na branch atual, ou fazer pull request
