
-sh-4.2$ oc exec -it -n sicbc-des sicbc-backend-des-32-rljgv -- \curl -v http://localhost:8080/q/health
*   Trying ::1...
* TCP_NODELAY set
* Connected to localhost (::1) port 8080 (#0)
> GET /q/health HTTP/1.1
> Host: localhost:8080
> User-Agent: curl/7.61.1
> Accept: */*
>
< HTTP/1.1 404 Not Found
< content-type: text/html; charset=utf-8
< content-length: 53
<
* Connection #0 to host localhost left intact
<html><body><h1>Resource not found</h1></body></html>-sh-4.2$
