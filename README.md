O pedido de regra da CRQ000001499711 foi atendido corretamente porque os testes de conectividade que são o packet-tracer e o ping tcp funcionam.
 
No seu teste de conectividade utilizando o loop com for o output obtido na evidência das 11:27 é o mesmo para o IP da regra solicitada e para o IP do banco que você diz que funciona, não há uma evidência de erro ou falha de conectividade, não é mostrado um timeout ou perda de pacote, muito pelo contrário, o resultado é o mesmo.
 
Sobre o trecho "Se o tráfego estiver saindo com outra origem (por exemplo o IP de um dos nós), ele não aparece nesse filtro."

Eu acho que você já sabe, mas não custa relembrar que o OKD funciona em duas partes né, os IPs do cluster que recebem a conexão e o IP de saída do projeto.

Se o IP 10.116.221.46 informado por você é o IP de saída do projeto mesmo existe alguma falha de configuração em algum ponto porque os pacotes testados não chegam no firewall, nem para o IP solicitado e nem para o IP que você diz que funciona.
 
Sobre o trecho "Podem refazer a captura em AUTO_DES_APRES só por destino: host 10.116.29.201 e host 10.116.29.23?".

Fica impraticável não especificar a origem porque eles são bancos de dados consumidos por vários projetos, o buffer ficaria full e eu não conseguiria assumir que aquele seria o seu IP de origem correto porque vários IPs fazem a requisição.
 
<imagem de show conn>
 
De todo modo, eu criei novas capturas mantendo o IP de origem informado e não especificando o destino e para o 10.116.29.23 como destino.
 


<img width="800" height="170" alt="image" src="https://github.com/user-attachments/assets/2c7eb516-2ede-4a86-8413-a32ea6ca5765" />



 <img width="613" height="110" alt="image" src="https://github.com/user-attachments/assets/6d25dbdf-760b-4584-ae37-cf0cc9c9d89f" />
