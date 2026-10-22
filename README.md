# Quais processos têm conexão com o proxy
ss -tnp | grep -E "10.252.32.6[35]:80" | grep -oE 'pid=[0-9]+' | sort | uniq -c

# Destino de cada CONNECT, com o PID dono da porta de origem
timeout 30 tcpdump -i any -nn -l -s0 'tcp dst port 80 and (dst host 10.252.32.63 or dst host 10.252.32.65)' 2>/dev/null \
 | grep --line-buffered -aoE "211\.[0-9]+ > .*CONNECT [^ ]+" \
 | while read l; do port=$(echo "$l" | cut -d' ' -f1 | cut -d. -f2); host=$(echo "$l" | awk '{print $NF}'); pid=$(ss -tnp "sport = :$port" | grep -oE 'pid=[0-9]+' | head -1); echo "$host $pid"; done \
 | sort | uniq -c | sort -rn

 ps -o pid,args -p <pids_separados_por_virgula> | cut -c1-160
ps -ef | grep -iE "omsagent|azuremonitor|mdsd|azure" | grep -v grep


dc


sed -n '855,862p' /opt/jboss/jboss-eap/dc/configuration/domain.xml
