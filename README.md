


[root@caddeapllx1369 p585600]# curl -s "http://binario.caixa:8081/service/rest/v1/search?repository=yum-internal&q=jdk" | grep -oiE '"name" *: *"[^"]*jdk[^"]*"' | sort -u
[root@caddeapllx1369 p585600]# curl -s "http://binario.caixa:8081/service/rest/v1/search?repository=yum-all&q=java-17" | grep -oiE '"name" *: *"[^"]*java[^"]*"' | sort -u
[root@caddeapllx1369 p585600]# cat /etc/yum.repos.d/*.repo 2>/dev/null | grep -A2 baseurl
baseurl=http://cbrsvaprlx017.intra.caixa.gov.br/repos/el7-epel-x86_64/
gpgcheck=0
enable=1
[root@caddeapllx1369 p585600]#
[root@caddeapllx1369 p585600]#
[root@caddeapllx1369 p585600]#
[root@caddeapllx1369 p585600]#
[root@caddeapllx1369 p585600]#
