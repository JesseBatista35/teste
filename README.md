Consegue me mostrar o log do SIEMP , e o problema detectado , pq tenho que sair umas 16:30 ai qualquer coisa deixo a equipe vendo
 
Denilson Socrates de Sousa o siemp.des.caixa está intermitente porque ficou com dois IPs no DNS: o antigo (10.116.80.1) e o novo da esteira 7.4 (10.116.180.9). 
 
Testei os dois:
 
10.116.80.1 (antigo): 404 em /siemp e em /siemp_java. Ele não atende o SIEMP por esse nome; o certificado é de outro sistema (siecm).

10.116.180.9 (novo): 200, SIEMP 14.37.0.6 funcionando.
 
precisamos da sala com o Paulo e vocês do Siemp para definir se podemos solicitar a cetel para remover o IP antigo. 
 
ah entendi !! por isso que alguns tem acesso e outros não 
 
isso
 
pra mim aqui hora acessa outra hora não
 
mas mesmo assim tem outro erro dentro do sistema e esse eu queria o log
 
so um momento vou te madnar ai



 cara chato da muletia me ajdua a pegar esse log pra ele
 
