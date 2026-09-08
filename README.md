2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]# find /opt/jboss-eap/standalone/data/content -iname "*.war" 2>/dev/null
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]# find /opt/jboss-eap/standalone/tmp/vfs -iname "*.xhtml" 2>/dev/null | grep -i -E "login|index"
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]# curl -v http://10.116.201.44:443/siarg/
*   Trying 10.116.201.44:443...
* Connected to 10.116.201.44 (10.116.201.44) port 443 (#0)
> GET /siarg/ HTTP/1.1
> Host: 10.116.201.44:443
> User-Agent: curl/7.76.1
> Accept: */*
>
* Mark bundle as not supporting multiuse
< HTTP/1.1 301 Moved Permanently
< Date: Tue, 08 Sep 2026 13:21:02 GMT
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
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]# curl -v http://10.116.201.44:443/siarg/index.xhtml
*   Trying 10.116.201.44:443...
* Connected to 10.116.201.44 (10.116.201.44) port 443 (#0)
> GET /siarg/index.xhtml HTTP/1.1
> Host: 10.116.201.44:443
> User-Agent: curl/7.76.1
> Accept: */*
>
* Mark bundle as not supporting multiuse
< HTTP/1.1 301 Moved Permanently
< Date: Tue, 08 Sep 2026 13:21:08 GMT
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
< Content-Type: application/xhtml+xml
<
* Closing connection 0
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
[root@caddeapllx2577 p585600]#
