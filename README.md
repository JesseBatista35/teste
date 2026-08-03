sh-4.2$
sh-4.2$
sh-4.2$ curl -v telnet://10.192.224.100:1415 --connect-timeout 3
* About to connect() to 10.192.224.100 port 1415 (#0)
*   Trying 10.192.224.100...
* Connected to 10.192.224.100 (10.192.224.100) port 1415 (#0)
^C
sh-4.2$
sh-4.2$
sh-4.2$ find /opt/jboss/standalone/log -type f -newer /opt/jboss/standalone/log/gc.log
find: '/opt/jboss/standalone/log/gc.log': No such file or directory
sh-4.2$
sh-4.2$
sh-4.2$ curl -v -m 5 http://localhost:8080/
* About to connect() to localhost port 8080 (#0)
*   Trying ::1...
* Connection refused
*   Trying 127.0.0.1...
* Connected to localhost (127.0.0.1) port 8080 (#0)
> GET / HTTP/1.1
> User-Agent: curl/7.29.0
> Host: localhost:8080
> Accept: */*
>
< HTTP/1.1 404 Not Found
< Connection: keep-alive
< X-Powered-By: Undertow/1
< Server: JBoss-EAP/7
< Content-Length: 74
< Content-Type: text/html
< Date: Mon, 03 Aug 2026 21:03:27 GMT
<
* Connection #0 to host localhost left intact
<html><head><title>Error</title></head><body>404 - Not Found</body></html>sh-4.2$
sh-4.2$
sh-4.2$
sh-4.2$
