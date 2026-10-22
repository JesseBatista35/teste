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





-sh-4.2$
-sh-4.2$ tcpdump -nn -r /tmp/proxy.pcap 2>/dev/null | wc -l
75
-sh-4.2$
-sh-4.2$
-sh-4.2$ tcpdump -nn -A -r /tmp/proxy.pcap 2>/dev/null | grep -aoE "(CONNECT|GET|POST|PUT) [^ ]+ HTTP/1\.[01]" | sort | uniq -c | sort -rn
     10 CONNECT brazilsouth-1.in.applicationinsights.azure.com:443 HTTP/1.1
      4 CONNECT brazilsouth.livediagnostics.monitor.azure.com:443 HTTP/1.1
      4 CONNECT agent.azureserviceprofiler.net:443 HTTP/1.1
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ tcpdump -nn -r /tmp/proxy.pcap 2>/dev/null | grep -E "Flags \[S\]" | awk '{print $3}' | sort | uniq | head -30
10.116.94.211.45056
10.116.94.211.45058
10.116.94.211.45060
10.116.94.211.45080
10.116.94.211.45082
10.116.94.211.45092
10.116.94.211.45094
10.116.94.211.45116
10.116.94.211.45118
10.116.94.211.45132
10.116.94.211.45134
10.116.94.211.45144
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ ss -tnp | grep -E "10.252.32.6[35]:80" | awk '{print $1, $4, $6}' | sort > /tmp/ss_snap.txt; wc -l /tmp/ss_snap.txt; awk '{print $3}' /tmp/ss_snap.txt | grep -oE 'pid=[0-9]+' | sort | uniq -c
290 /tmp/ss_snap.txt
-sh-4.2$




[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]# for i in 1 2 3 4 5 6; do echo "$(date +%T) $(ss -tnp | grep 'pid=72951' | grep -cE '10.252.32.6[35]:80') $(ss -tnp | grep 'pid=72951' | grep -E '10.252.32.6[35]:80' | grep -c CLOSE-WAIT)"; sleep 60; done
15:28:49 330 152
15:29:49 287 149



[root@sbrdeapllx104 /]# timeout 120 tcpdump -i any -nn -s0 -w /tmp/proxy.pcap 'tcp dst port 80 and (dst host 10.252.32.63 or dst host 10.252.32.65)'
tcpdump: listening on any, link-type LINUX_SLL (Linux cooked), capture size 262144 bytes

