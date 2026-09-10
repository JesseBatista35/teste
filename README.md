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
