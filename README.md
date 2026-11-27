Os resultados confirmam o que dava para esperar com o sistema ocioso, mas falta checar uma coisa antes de dar por encerrado.

O jcmd não está no PATH. A imagem tem o JDK completo (/usr/java/jdk-21.0.1, segundo o log de start), então dá para chamar pelo caminho completo:
bash
oc exec $POD -n sifap-des -- /usr/java/jdk-21.0.1/bin/jcmd 8 Thread.print > /tmp/sifap-threads.txt
O kill -3 funcionou. Não deu erro, então o PID 8 existe. O 0 no grep não prova que o dump saiu, porque pode só não ter caído nas últimas 2000 linhas. Confirme assim:
bash
oc logs $POD -n sifap-des --tail=5000 | grep -n 'Full thread dump'
oc logs $POD -n sifap-des --tail=5000 | grep -c '"executor-thread'

Se aparecer Full thread dump e as executor-thread estiverem em WAITING/parked no pool, e não em UniBlockingAwait, o backend está saudável agora. Faz sentido: às 17h de sexta ninguém está homologando.
