# confirma ambiente
whoami; echo $CONTROLM

# portas configuradas
grep -E "AGENT_TO_SERVER_PORT|SERVER_TO_AGENT_PORT|CTMSHOST|CTMPERMHOSTS" $CONTROLM/data/CONFIG.dat

# em qual porta o servidor responde
for ip in 10.116.99.99 10.116.99.100; do for p in 7005 7006 7015 7016 7105 7115; do timeout 3 bash -c "</dev/tcp/$ip/$p" 2>/dev/null && echo "$ip:$p ABERTA"; done; done

# ping agente -> servidor
ag_ping








