oc get pods -n openshift-ingress -o wide


-sh-4.2$
-sh-4.2$ oc get pods -n openshift-ingress -o wide
NAME                              READY     STATUS    RESTARTS   AGE       IP              NODE                       NOMINATED NODE   READINESS GATES
router-default-556cdc9cb7-4lgb7   1/1       Running   0          408d      10.116.208.27   ceadecldlx008.nprd.caixa   <none>           <none>
router-default-556cdc9cb7-bjj7f   1/1       Running   0          408d      10.116.208.26   ceadecldlx007.nprd.caixa   <none>           <none>
router-default-556cdc9cb7-kr77m   1/1       Running   0          408d      10.116.208.28   ceadecldlx009.nprd.caixa   <none>           <none>
router-default-556cdc9cb7-rrqln   1/1       Running   0          408d      10.116.208.29   ceadecldlx010.nprd.caixa   <none>           <none>
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$


oc debug node/<nome-do-node>

chroot /host
tcpdump -i any -w /tmp/sigda-test.pcap 'host 10.245.153.18 and port 443'



Pessoal, atualização: fomos verificar se as chamadas de teste ao menos chegam até o pod do SIGDA (sigda-api-quarkus-des) — e não chegam. O endpoint está saudável e é o único pod ativo, mas nenhuma requisição aparece nos logs da aplicação.

Subimos um nível, pra ver se a conexão pelo menos chega até o Router (HAProxy) do OKD4, que faz a terminação TLS antes de repassar pro pod. Só que não temos visibilidade nenhuma dessa camada também — o log de acesso do Router não fica no stdout do pod (por isso oc logs não mostra nada), ele vai direto pra um servidor syslog externo (10.221.24.35) ao qual não temos acesso imediato.

Resultado: não sabemos em qual ponto exato a conexão está parando — se nem chega no cluster, se para no Router, ou se para entre o Router e o pod. Pra descobrir isso com certeza, vamos capturar o tráfego direto nos nós do Router com tcpdump via oc debug, coordenado com um teste real.

Mateus, preciso que você:

Me avise 1 minuto antes de disparar a chamada de teste
Dispare a chamada real pra sigda-api-quarkus-des.apps.nprd.caixa (mesmo endpoint de sempre)
Me confirme o horário exato (com segundos) da chamada e se deu 408 de novo

Do nosso lado, vamos deixar o tcpdump já rodando nos nós do Router no momento combinado, pra capturar o tráfego real e cruzar com o horário que você confirmar.

Fico no aguardo pra combinarmos o horário do teste.
