No ambiente antigo o SIROT era disponibilizado como um EJB externo no servidor, por isso a aplicação precisava declarar a dependência.
 
Agora identificamos que o sirotcon-ejb e o sirotcon-ejb-lib podem ser consumidos via Maven e empacotados junto da aplicação.
 
entendeu? eu vou subir esse ajuste no boleto 
 
entendi sim, no boleto, para destravar o deploy, ajustamos o jboss-deployment-structure.xml para deployment.sirotcon-ejb.jar e o EJB está sendo implantado pela esteira. 
 
 
 
entendi...mas agora nem vai precisar mais disso ai
 
removi isso rs
 
isso
 
ah sim te mostrei pois achei que nao tinha removido.
 
show então pode aplicar o ajuste e rodar a release ser de algum erro pode me chamar.
 
no caso voce padronizou como no intranet né?
 
valeuuu
 
Jesse Mouta Pereira Batista
no caso voce padronizou como no intranet né?
estou fazendo a mesma coisa no intranet
 
sem a dependência externa
 
blz
 
e no internet?
 
internet vou falar com o outro dev pra fazer a mesma coisa
 
show
 
muito obrigado
 
eu que agradeço :0
 
