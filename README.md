[root@caddeapllx2484 p585600]# curl -vk https://sicmu-intranet-update.esteiras.des.caixa/sicmu 2>&1 | head -30
  % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                                 Dload  Upload   Total   Spent    Left  Speed
  0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0* About to connect() to sicmu-intranet-update.esteiras.des.caixa port 443 (#0)
*   Trying 10.116.180.22...
* Connected to sicmu-intranet-update.esteiras.des.caixa (10.116.180.22) port 443 (#0)
* Initializing NSS with certpath: sql:/etc/pki/nssdb
* skipping SSL peer certificate verification
* SSL connection using TLS_RSA_WITH_AES_256_CBC_SHA
* Server certificate:
*       subject: CN=*.esteiras.des.caixa,O=Caixa Economica Federal,C=BR
*       start date: Abr 18 14:57:45 2024 GMT
*       expire date: Abr 18 15:07:45 2029 GMT
*       common name: *.esteiras.des.caixa
*       issuer: CN=AC Icptestes Sub,O=Caixa Economica Federal,C=BR
> GET /sicmu HTTP/1.1
> User-Agent: curl/7.29.0
> Host: sicmu-intranet-update.esteiras.des.caixa
> Accept: */*
>
< HTTP/1.1 403 Forbidden
< Date: Thu, 11 Jun 2026 17:39:45 GMT
< Server: Apache/2.4.29 (Red Hat)
< Last-Modified: Fri, 17 Jan 2020 13:41:12 GMT
< ETag: "10f0-59c5618474e00"
< Accept-Ranges: bytes
< Content-Length: 4336
< Connection: close
< Content-Type: text/html; charset=UTF-8
<
{ [data not shown]
[root@caddeapllx2484 p585600]# ss -tlnp | grep 443
LISTEN     0      511       [::]:443                   [::]:*                   users:(("httpd",pid=19637,fd=6),("httpd",pid=19633,fd=6))
[root@caddeapllx2484 p585600]# ps aux | grep -iE "httpd|apache|nginx|haproxy"
root     19633  0.0  0.0 322692  6892 ?        Ss   14:27   0:00 /opt/httpd/sbin/httpd -f /opt/httpd/conf/httpd.conf -E /logs/httpd/httpd.log -k start
apache   19634  0.0  0.0 322036  4828 ?        S    14:27   0:00 /opt/httpd/sbin/httpd -f /opt/httpd/conf/httpd.conf -E /logs/httpd/httpd.log -k start
apache   19637  0.0  0.1 1637060 9292 ?        Sl   14:27   0:00 /opt/httpd/sbin/httpd -f /opt/httpd/conf/httpd.conf -E /logs/httpd/httpd.log -k start
root     23370  0.0  0.0 112832  1000 pts/0    S+   14:40   0:00 grep --color=auto -iE httpd|apache|nginx|haproxy
[root@caddeapllx2484 p585600]# find /etc -name "*.conf" 2>/dev/null | xargs grep -l "sicmu-intranet-update" 2>/dev/null
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
