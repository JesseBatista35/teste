sudo su
for i in 1 2 3 4 5 6; do echo "$(date +%T) $(ss -tnp | grep 'pid=72951' | grep -cE '10.252.32.6[35]:80') $(ss -tnp | grep 'pid=72951' | grep -E '10.252.32.6[35]:80' | grep -c CLOSE-WAIT)"; sleep 60; done



# Captura de 2 min em arquivo
timeout 120 tcpdump -i any -nn -s0 -w /tmp/proxy.pcap 'tcp dst port 80 and (dst host 10.252.32.63 or dst host 10.252.32.65)'

# Teve pacote?
tcpdump -nn -r /tmp/proxy.pcap 2>/dev/null | wc -l

# Requisições feitas ao proxy (CONNECT/GET/POST) e a porta de origem
tcpdump -nn -A -r /tmp/proxy.pcap 2>/dev/null | grep -aoE "(CONNECT|GET|POST|PUT) [^ ]+ HTTP/1\.[01]" | sort | uniq -c | sort -rn
tcpdump -nn -r /tmp/proxy.pcap 2>/dev/null | grep -E "Flags \[S\]" | awk '{print $3}' | sort | uniq | head -30


Ainda durante a captura, noutra sessão como root, tire um retrato de qual porta pertence a qual processo:

bash


ss -tnp | grep -E "10.252.32.6[35]:80" | awk '{print $1, $4, $6}' | sort > /tmp/ss_snap.txt; wc -l /tmp/ss_snap.txt; awk '{print $3}' /tmp/ss_snap.txt | grep -oE 'pid=[0-9]+' | sort | uniq -c
