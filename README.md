
[root@caddeapllx2577 p585600]# curl -v -L http://10.116.201.44:443/siarg/
*   Trying 10.116.201.44:443...
* Connected to 10.116.201.44 (10.116.201.44) port 443 (#0)
> GET /siarg/ HTTP/1.1
> Host: 10.116.201.44:443
> User-Agent: curl/7.76.1
> Accept: */*
>
* Mark bundle as not supporting multiuse
< HTTP/1.1 301 Moved Permanently
< Date: Tue, 08 Sep 2026 13:22:00 GMT
< Server: Apache/2.4.57 (Red Hat)
< Strict-Transport-Security: max-age=63072000; includeSubDomains; preload
< X-Frame-Options: DENY
< X-Content-Type-Options: nosniff
< X-Frame-Options: DENY
< Location: http://10.116.201.44:443/siarg/index
< Referrer-Policy: strict-origin-when-cross-origin
< Content-Security-Policy: frame-ancestors 'none';
< Connection: close
< Strict-Transport-Security: max-age=63072000; includeSubDomains
< X-Content-Type-Options: nosniff
< Content-Length: 0
<
* Closing connection 0
* Issue another request to this URL: 'http://10.116.201.44:443/siarg/index'
* Hostname 10.116.201.44 was found in DNS cache
*   Trying 10.116.201.44:443...
* Connected to 10.116.201.44 (10.116.201.44) port 443 (#1)
> GET /siarg/index HTTP/1.1
> Host: 10.116.201.44:443
> User-Agent: curl/7.76.1
> Accept: */*
>
* Mark bundle as not supporting multiuse
< HTTP/1.1 404 Not Found
< Date: Tue, 08 Sep 2026 13:22:00 GMT
< Server: Apache/2.4.57 (Red Hat)
< Strict-Transport-Security: max-age=63072000; includeSubDomains; preload
< X-Frame-Options: DENY
< X-Content-Type-Options: nosniff
< Content-Length: 74
< Content-Type: text/html; charset=UTF-8
<
* Connection #1 to host 10.116.201.44 left intact
<html><head><title>Error</title></head><body>404 - Not Found</body></html>[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
