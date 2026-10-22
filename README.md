root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]# grep -nE "SIGEC-PORTABILIDADE-BATCH|deploy" /opt/jboss/jboss-eap/dc/log/host-controller.log | tail -40
[root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]#
[root@sbrdeapllx069 p585600]#





[root@sbrdeapllx104 p585600]# getent hosts proxydes.caixa 10.252.32.63 10.252.32.65
10.252.32.65    proxydes.caixa
10.252.32.63    proxydes.caixa
10.252.32.63    DADNGITRNT002.intra.caixa.gov.br
10.252.32.65    proxydes.corecaixa
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]# ss -tnp | grep "pid=72951" | grep -E "10.252.32.6[35]:80" | awk '{print $1}' | sort | uniq -c
     81 CLOSE-WAIT
    226 ESTAB
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]#
[root@sbrdeapllx104 p585600]# timeout 60 tcpdump -i any -A -s0 -c 20 'dst host 10.252.32.65 or dst host 10.252.32.63' 2>/dev/null | grep -aiE "CONNECT |Host:"
14:37:58.053245 IP sbrdeapllx104.47256 > DADNGITRNT002.intra.caixa.gov.br.http: Flags [P.], seq 0:127, ack 1, win 229, options [nop,nop,TS val 3694077594 ecr 1847069324], length 127: HTTP: CONNECT brazilsouth.livediagnostics.monitor.azure.com:443 HTTP/1.1
.CONNECT brazilsouth.livediagnostics.monitor.azure.com:443 HTTP/1.1
host: brazilsouth.livediagnostics.monitor.azure.com:443
14:37:58.055621 IP sbrdeapllx104.47258 > DADNGITRNT002.intra.caixa.gov.br.http: Flags [P.], seq 0:127, ack 1, win 229, options [nop,nop,TS val 3694077596 ecr 1847069324], length 127: HTTP: CONNECT brazilsouth.livediagnostics.monitor.azure.com:443 HTTP/1.1
.CONNECT brazilsouth.livediagnostics.monitor.azure.com:443 HTTP/1.1
host: brazilsouth.livediagnostics.monitor.azure.com:443
14:38:01.732072 IP sbrdeapllx104.47262 > DADNGITRNT002.intra.caixa.gov.br.http: Flags [P.], seq 0:129, ack 1, win 229, options [nop,nop,TS val 3694081273 ecr 1847069692], length 129: HTTP: CONNECT brazilsouth-1.in.applicationinsights.azure.com:443 HTTP/1.1
./4.n...CONNECT brazilsouth-1.in.applicationinsights.azure.com:443 HTTP/1.1
host: brazilsouth-1.in.applicationinsights.azure.com:443
[root@sbrdeapllx104 p585600]#
