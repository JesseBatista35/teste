
[root@caddeapllx1369 p585600]# curl -s -o /dev/null -w "%{http_code}\n" --max-time 5 https://github.com
000
[root@caddeapllx1369 p585600]# curl -s -o /dev/null -w "%{http_code}\n" --max-time 5 https://api.adoptium.net
000
[root@caddeapllx1369 p585600]#
