
[root@caddeapllx2577 p585600]# curl -v http://10.1116.201.44:443/siarg/login
* Could not resolve host: 10.1116.201.44
* Closing connection 0
curl: (6) Could not resolve host: 10.1116.201.44
[root@caddeapllx2577 p585600]# curl -v http://10.116.201.44:443/siarg/login
*   Trying 10.116.201.44:443...
* Connected to 10.116.201.44 (10.116.201.44) port 443 (#0)
> GET /siarg/login HTTP/1.1
> Host: 10.116.201.44:443
> User-Agent: curl/7.76.1
> Accept: */*
>
* Mark bundle as not supporting multiuse
< HTTP/1.1 500 Internal Server Error
< Date: Tue, 08 Sep 2026 12:59:09 GMT
< Server: Apache/2.4.57 (Red Hat)
< Strict-Transport-Security: max-age=63072000; includeSubDomains; preload
< X-Frame-Options: DENY
< X-Content-Type-Options: nosniff
< Content-Length: 86
< Content-Type: text/html; charset=UTF-8
< Connection: close
<
* Closing connection 0
<html><head><title>Error</title></head><body>500 - Internal Server Error</body></html>[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]# httpd -S
bash: httpd: comando não encontrado
[root@caddeapllx2577 p585600]#

