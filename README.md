
[root@caddeapllx2484 p585600]# curl -v http://127.0.0.1/sicmu 2>&1 | head -20
* About to connect() to 127.0.0.1 port 80 (#0)
*   Trying 127.0.0.1...
  % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                                 Dload  Upload   Total   Spent    Left  Speed
  0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0* Connected to 127.0.0.1 (127.0.0.1) port 80 (#0)
> GET /sicmu HTTP/1.1
> User-Agent: curl/7.29.0
> Host: 127.0.0.1
> Accept: */*
>
< HTTP/1.1 302 Found
< Date: Thu, 11 Jun 2026 18:01:17 GMT
< Server: Apache/2.4.37 (Red Hat)
< Location: http://sicmu-intranet-update.esteiras.des.caixa/sicmu
< Content-Length: 237
< Content-Type: text/html; charset=iso-8859-1
<
{ [data not shown]
100   237  100   237    0     0   275k      0 --:--:-- --:--:-- --:--:--  231k
* Connection #0 to host 127.0.0.1 left intact
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
[root@caddeapllx2484 p585600]#
