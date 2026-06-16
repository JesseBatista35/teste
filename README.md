[root@caddeapllx2484 p585600]# curl -v http://10.116.180.22:443/sicmu 2>&1 | head -25
* About to connect() to 10.116.180.22 port 443 (#0)
*   Trying 10.116.180.22...
  % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                                 Dload  Upload   Total   Spent    Left  Speed
  0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0* Connected to 10.116.180.22 (10.116.180.22) port 443 (#0)
> GET /sicmu HTTP/1.1
> User-Agent: curl/7.29.0
> Host: 10.116.180.22:443
> Accept: */*
>
* Recv failure: Conexão fechada pela outra ponta
  0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
* Closing connection 0
curl: (56) Recv failure: Conexão fechada pela outra ponta
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]#
[root@caddeapllx2484 p585600]# curl -v http://10.116.180.22/sicmu 2>&1 | head -25
* About to connect() to 10.116.180.22 port 80 (#0)
*   Trying 10.116.180.22...
  % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                                 Dload  Upload   Total   Spent    Left  Speed
  0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0* Connected to 10.116.180.22 (10.116.180.22) port 80 (#0)
> GET /sicmu HTTP/1.1
> User-Agent: curl/7.29.0
> Host: 10.116.180.22
> Accept: */*
>
< HTTP/1.1 302 Found : Moved Temporarily
< Location: https://10.116.180.22/sicmu
< Connection: close
< Cache-Control: no-cache
< Pragma: no-cache
<
{ [data not shown]
  0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
* Closing connection 0
[root@caddeapllx2484 p585600]#
