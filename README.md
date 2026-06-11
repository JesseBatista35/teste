[root@caddeapllx2484 p585600]# curl -v http://sicmu-intranet-update.esteiras.des.caixa/sicmu 2>&1 | head -20
  % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                                 Dload  Upload   Total   Spent    Left  Speed
  0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0* About to connect() to sicmu-intranet-update.esteiras.des.caixa port 80 (#0)
*   Trying 10.116.180.22...
* Connected to sicmu-intranet-update.esteiras.des.caixa (10.116.180.22) port 80 (#0)
> GET /sicmu HTTP/1.1
> User-Agent: curl/7.29.0
> Host: sicmu-intranet-update.esteiras.des.caixa
> Accept: */*
>
< HTTP/1.1 302 Found : Moved Temporarily
< Location: https://sicmu-intranet-update.esteiras.des.caixa/sicmu
< Connection: close
< Cache-Control: no-cache
< Pragma: no-cache
<
{ [data not shown]
  0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
* Closing connection 0
[root@caddeapllx2484 p585600]# cat /etc/httpd/conf.d/vhost.conf | grep -i "sicmu-intranet-update\|ServeName\|SererAlias"
cat: /etc/httpd/conf.d/vhost.conf: Arquivo ou diretório não encontrado
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]# systemctl status httpd
Unit httpd.service could not be found.
[root@caddeapllx2484 p585600]#
