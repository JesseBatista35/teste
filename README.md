O comando falhou porque o <pod> ficou literal: o shell entendeu < como redirecionamento de arquivo. O 0 que apareceu não quer dizer nada, porque o jcmd nem chegou a rodar. Troque pelo nome do pod. Outro detalhe: o log do App Insights mostrou que a JVM roda com PID 8, e não 1.

bash
POD=sifap-centralizadora-backend-intranet-des-123-tpf5l

# confirma o PID da JVM
oc exec $POD -n sifap-des -- jcmd -l

# dump de threads (ajuste o PID se o comando acima mostrar outro)
oc exec $POD -n sifap-des -- jcmd 8 Thread.print > /tmp/sifap-threads.txt

# quantas threads presas esperando chamada externa
grep -c 'UniBlockingAwait' /tmp/sifap-threads.txt
grep -c '"executor-thread' /tmp/sifap-threads.txt

Se a imagem não tiver jcmd ("executable file not found"), use o sinal da JVM. O dump sai direto no log do pod:

bash
oc exec $POD -n sifap-des -- kill -3 8
oc logs $POD -n sifap-des --tail=2000 | grep -c 'UniBlockingAwait'

O dump só mostra algo se for tirado durante a lentidão. Agora, com o sistema ocioso, o esperado é dar 0 mesmo. Vale combinar com a Carine ou o Ricardo de te avisarem na hora em que travar, para você rodar o comando nesse momento. Se aparecerem várias executor-thread paradas em UniBlockingAwait → SiicoPessoaService ou FarmaciaService, a causa está confirmada.
