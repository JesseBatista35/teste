for i in $(seq 1 10); do getent hosts nfsctcnprd.ctc.caixa; sleep 30; done

timeout 5 bash -c 'cat < /dev/null > /dev/tcp/<IP_1>/2049' && echo "IP_1 ABERTA" || echo "IP_1 FECHADA"
timeout 5 bash -c 'cat < /dev/null > /dev/tcp/<IP_2>/2049' && echo "IP_2 ABERTA" || echo "IP_2 FECHADA"
