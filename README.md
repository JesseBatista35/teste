p585600@cadsvitrlx100 ~]$ ssh 10.116.201.140
p585600@10.116.201.140's password:
Last login: Thu Jul 30 17:35:18 2026 from 10.122.150.31
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ ping -c 10.166.198.210
Usage: ping [-aAbBdDfhLnOqrRUvV64] [-c count] [-i interval] [-I interface]
            [-m mark] [-M pmtudisc_option] [-l preload] [-p pattern] [-Q tos]
            [-s packetsize] [-S sndbuf] [-t ttl] [-T timestamp_option]
            [-w deadline] [-W timeout] [hop1 ...] destination
Usage: ping -6 [-aAbBdDfhLnOqrRUvV] [-c count] [-i interval] [-I interface]
             [-l preload] [-m mark] [-M pmtudisc_option]
             [-N nodeinfo_option] [-p pattern] [-Q tclass] [-s packetsize]
             [-S sndbuf] [-t ttl] [-T timestamp_option] [-w deadline]
             [-W timeout] destination
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ nslookup 10.166.198.210
** server can't find 210.198.166.10.in-addr.arpa.: NXDOMAIN

-sh-4.2$ getnet hosts 10.116.198.210
-sh: getnet: comando não encontrado
-sh-4.2$ curl -v --connect-timeout 5 http://10.116.198.210:8080
* About to connect() to 10.116.198.210 port 8080 (#0)
*   Trying 10.116.198.210...
* Não há rota para o host
* Failed connect to 10.116.198.210:8080; Não há rota para o host
* Closing connection 0
curl: (7) Failed connect to 10.116.198.210:8080; Não há rota para o host
-sh-4.2$
