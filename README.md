timeout 120 tcpdump -i any -nn -l -s0 'tcp dst port 80 and (dst host 10.252.32.63 or dst host 10.252.32.65)' 2>/dev/null \
 | grep --line-buffered -aoE "211\.[0-9]+ > .*HTTP: [A-Z]+ [^ ]+" \
 | while read l; do port=$(echo "$l" | cut -d' ' -f1 | cut -d. -f2); req=$(echo "$l" | grep -oE "HTTP: [A-Z]+ [^ ]+"); pid=$(ss -tnp "sport = :$port" | grep -oE 'pid=[0-9]+' | head -1); echo "$req $pid"; done \
 | sort | uniq -c | sort -rn


 Em paralelo, noutra sessão, veja se a contagem cresce ao longo do tempo:

 for i in 1 2 3 4 5 6; do echo "$(date +%T) $(ss -tnp | grep 'pid=72951' | grep -cE '10.252.32.6[35]:80') $(ss -tnp | grep 'pid=72951' | grep -E '10.252.32.6[35]:80' | grep -c CLOSE-WAIT)"; sleep 60; done

 /usr/lib/jvm/jdk-1.8.0_471-oracle-x64/bin/jstack -F 72951 > /tmp/jstack_batch.txt 2>&1
grep -nE "proxy|Proxy|HttpURLConnection|servicebus|amqp|reactor-http|netty|SocketInputStream" /tmp/jstack_batch.txt | head -40
