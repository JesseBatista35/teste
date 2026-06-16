[root@caddeapllx2484 p585600]# sudo /opt/httpd/sbin/httpd -f /opt/httpd/conf/httpd.conf -E /logs/httpd/httpd.log -k stop
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]# sudo /opt/httpd/sbin/httpd -f /opt/httpd/conf/httpd.conf -E /logs/httpd/httpd.log -k start
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]# ps aux | grep httpd | grep -v grep
root     14811  0.0  0.0 320696  6604 ?        Ss   11:58   0:00 /opt/httpd/sbin/httpd -f /opt/httpd/conf/httpd.conf -E /logs/httpd/httpd.log -k start
apache   14812  0.0  0.0 322104  4864 ?        S    11:58   0:00 /opt/httpd/sbin/httpd -f /opt/httpd/conf/httpd.conf -E /logs/httpd/httpd.log -k start
apache   14814  0.0  0.0 701172  7276 ?        Sl   11:58   0:00 /opt/httpd/sbin/httpd -f /opt/httpd/conf/httpd.conf -E /logs/httpd/httpd.log -k start
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]# curl -vk https://sicmu-intranet-update.esteiras.des.caixa/sicmu 2>&1 | head -20
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
[root@caddeapllx2484 p585600]#
