
p585600@10.116.94.211's password:
Last login: Thu Oct 22 14:26:19 2026 from 10.122.150.31
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$  for i in 1 2 3 4 5 6; do echo "$(date +%T) $(ss -tnp | grep 'pid=72951' | grep -cE '10.252.32.6[35]:80') $(ss -tnp | grep 'pid=72951' | grep -E '10.252.32.6[35]:80' | grep -c CLOSE-WAIT)"; sleep 60; done
14:50:55 0 0
14:51:55 0 0
14:52:55 0 0
14:53:55 0 0
14:54:55 0 0
14:55:55 0 0
-sh-4.2$



[root@sbrdeapllx104 /]# timeout 120 tcpdump -i any -nn -l -s0 'tcp dst port 80 and (dst host 10.252.32.63 or dst host 10.252.32.65)' 2>/dev/null \
>  | grep --line-buffered -aoE "211\.[0-9]+ > .*HTTP: [A-Z]+ [^ ]+" \
>  | while read l; do port=$(echo "$l" | cut -d' ' -f1 | cut -d. -f2); req=$(echo "$l" | grep -oE "HTTP: [A-Z]+ [^ ]+"); pid=$(ss -tnp "sport = :$port" | grep -oE 'pid=[0-9]+' | head -1); echo "$req $pid"; done \
>  | sort | uniq -c | sort -rn
Terminado
[root@sbrdeapllx104 /]#
