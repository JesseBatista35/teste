
[p585600@cbrdeapllx473 tmp]$
[p585600@cbrdeapllx473 tmp]$ nc -zv 10.116.202.37 80
Ncat: Version 7.92 ( https://nmap.org/ncat )
Ncat: TIMEOUT.
[p585600@cbrdeapllx473 tmp]$ nc -zv 10.116.202.37 8080
Ncat: Version 7.92 ( https://nmap.org/ncat )
Ncat: TIMEOUT.
[p585600@cbrdeapllx473 tmp]$




[p585600@caddeapllx2835 ~]$
[p585600@caddeapllx2835 ~]$
[p585600@caddeapllx2835 ~]$ sudo tcpdump -ni any 'tcp and (port 80 or port 443) and host 10.116.97.79'
sudo: tcpdump: comando não encontrado
[p585600@caddeapllx2835 ~]$
