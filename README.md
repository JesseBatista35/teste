
[root@caddeapllx2577 p585600]# ss -tlnp | grep 8009
LISTEN 0      10000        0.0.0.0:8009       0.0.0.0:*    users:(("java",pid=709283,fd=502))
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]# tail -20 /logs/httpd/siarg-interno.caixa-access.log
10.211.16.89 - - [08/Sep/2026:08:42:29 -0300] "\x16\x03\x01\x076\x01" 400 226 "-" "-"
10.211.16.89 - - [08/Sep/2026:08:42:29 -0300] "\x16\x03\x01\x06\xf6\x01" 400 226 "-" "-"
10.211.16.89 - - [08/Sep/2026:08:42:29 -0300] "\x16\x03\x01\x076\x01" 400 226 "-" "-"
10.211.16.89 - - [08/Sep/2026:08:42:29 -0300] "\x16\x03\x01\x07\x16\x01" 400 226 "-" "-"
10.211.16.89 - - [08/Sep/2026:08:42:31 -0300] "\x16\x03\x01\x06\xf6\x01" 400 226 "-" "-"
10.211.16.89 - - [08/Sep/2026:08:42:31 -0300] "\x16\x03\x01\x06\xf6\x01" 400 226 "-" "-"
10.211.16.89 - - [08/Sep/2026:08:42:31 -0300] "\x16\x03\x01\x076\x01" 400 226 "-" "-"
10.211.16.89 - - [08/Sep/2026:08:42:31 -0300] "\x16\x03\x01\x06\xd6\x01" 400 226 "-" "-"
::1 - - [08/Sep/2026:09:53:36 -0300] "\x16\x03\x01\x02" 400 226 "-" "-"
::1 - - [08/Sep/2026:09:54:57 -0300] "\x16\x03\x01\x02" 400 226 "-" "-"
10.116.201.44 - - [08/Sep/2026:09:59:09 -0300] "GET /siarg/login HTTP/1.1" 500 86 "-" "curl/7.76.1"
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
< Date: Tue, 08 Sep 2026 13:13:33 GMT
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
[root@caddeapllx2577 p585600]# tail -20 /logs/httpd/siarg-interno.caixa-error.log
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]# tail -20 /logs/httpd/siarg-interno.caixa-access.log
10.211.16.89 - - [08/Sep/2026:08:42:29 -0300] "\x16\x03\x01\x076\x01" 400 226 "-" "-"
10.211.16.89 - - [08/Sep/2026:08:42:29 -0300] "\x16\x03\x01\x06\xf6\x01" 400 226 "-" "-"
10.211.16.89 - - [08/Sep/2026:08:42:29 -0300] "\x16\x03\x01\x076\x01" 400 226 "-" "-"
10.211.16.89 - - [08/Sep/2026:08:42:29 -0300] "\x16\x03\x01\x07\x16\x01" 400 226 "-" "-"
10.211.16.89 - - [08/Sep/2026:08:42:31 -0300] "\x16\x03\x01\x06\xf6\x01" 400 226 "-" "-"
10.211.16.89 - - [08/Sep/2026:08:42:31 -0300] "\x16\x03\x01\x06\xf6\x01" 400 226 "-" "-"
10.211.16.89 - - [08/Sep/2026:08:42:31 -0300] "\x16\x03\x01\x076\x01" 400 226 "-" "-"
10.211.16.89 - - [08/Sep/2026:08:42:31 -0300] "\x16\x03\x01\x06\xd6\x01" 400 226 "-" "-"
::1 - - [08/Sep/2026:09:53:36 -0300] "\x16\x03\x01\x02" 400 226 "-" "-"
::1 - - [08/Sep/2026:09:54:57 -0300] "\x16\x03\x01\x02" 400 226 "-" "-"
10.116.201.44 - - [08/Sep/2026:09:59:09 -0300] "GET /siarg/login HTTP/1.1" 500 86 "-" "curl/7.76.1"
10.116.201.44 - - [08/Sep/2026:10:13:33 -0300] "GET /siarg/login HTTP/1.1" 500 86 "-" "curl/7.76.1"
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
