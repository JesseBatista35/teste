Eu entendo que os IPs 10.116.208.104 e 10.116.208.72 são ingress do seu cluster, se ele precisa fazer uma chamada para o banco de dados 10.116.100.127 eles nunca serão o seu egress, então para a chamada não faz diferença você mover o nó, visto que o IP de egress sempre será 10.116.221.183.
 
De todo modo eu tenho uma captura da origem 10.116.221.183 para o destino 10.116.100.127 e outra do tipo drop para ver se há drop de pacotes.
 
