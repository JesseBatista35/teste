#!/bin/bash
NODES=(ceadecldlx007.nprd.caixa ceadecldlx008.nprd.caixa ceadecldlx009.nprd.caixa ceadecldlx010.nprd.caixa)
FILTER='port 443 and host 10.116.180.64'

for node in "${NODES[@]}"; do
  echo "Iniciando captura em $node..."
  oc debug node/"$node" -- chroot /host bash -c "tcpdump -i any -w /tmp/sigda-test-${node}.pcap '${FILTER}'" &
done

echo ""
echo "Capturas rodando em background nos 4 nós."
echo "Avise o Mateus para disparar o teste agora."
echo "Depois que ele confirmar, pressione ENTER aqui para parar tudo."
read -r

echo "Parando capturas..."
kill %1 %2 %3 %4 2>/dev/null
wait
echo "Capturas finalizadas. Os arquivos .pcap ficaram salvos em /tmp nos próprios nós."



NODES=(ceadecldlx007.nprd.caixa ceadecldlx008.nprd.caixa ceadecldlx009.nprd.caixa ceadecldlx010.nprd.caixa)

for node in "${NODES[@]}"; do
  echo "Copiando captura de $node..."
  oc debug node/"$node" -- cat /host/tmp/sigda-test-${node}.pcap > ./sigda-test-${node}.pcap
done


Pessoal, atualização: fomos verificar se as chamadas de teste ao menos chegam até o pod do SIGDA (sigda-api-quarkus-des) — e não chegam. O endpoint está saudável e é o único pod ativo, mas nenhuma requisição aparece nos logs da aplicação.

Subimos um nível, pra ver se a conexão pelo menos chega até o Router (HAProxy) do OKD4, que faz a terminação TLS antes de repassar pro pod. Só que não temos visibilidade nenhuma dessa camada também — o log de acesso do Router não fica no stdout do pod (por isso oc logs não mostra nada), ele vai direto pra um servidor syslog externo (10.221.24.35) ao qual não temos acesso imediato.

Resultado: não sabemos em qual ponto exato a conexão está parando — se nem chega no cluster, se para no Router, ou se para entre o Router e o pod. Pra descobrir isso com certeza, vamos capturar o tráfego direto nos nós do Router com tcpdump via oc debug, coordenado com um teste real.

Mateus, preciso que você:

Me avise 1 minuto antes de disparar a chamada de teste
Dispare a chamada real pra sigda-api-quarkus-des.apps.nprd.caixa (mesmo endpoint de sempre)
Me confirme o horário exato (com segundos) da chamada e se deu 408 de novo

Do nosso lado, vamos deixar o tcpdump já rodando nos nós do Router no momento combinado, pra capturar o tráfego real e cruzar com o horário que você confirmar.
