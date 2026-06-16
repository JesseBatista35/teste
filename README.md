[root@caddeapllx2484 p585600]# curl -v https://127.0.0.1:443/sicmu 2>&1 | head -20
* About to connect() to 127.0.0.1 port 443 (#0)
*   Trying 127.0.0.1...
  % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                                 Dload  Upload   Total   Spent    Left  Speed
  0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0* Connected to 127.0.0.1 (127.0.0.1) port 443 (#0)
* Initializing NSS with certpath: sql:/etc/pki/nssdb
*   CAfile: /etc/pki/tls/certs/ca-bundle.crt
  CApath: none
* NSS error -12263 (SSL_ERROR_RX_RECORD_TOO_LONG)
* SSL received a record that exceeded the maximum permissible length.
  0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
* Closing connection 0
curl: (35) SSL received a record that exceeded the maximum permissible length.
[root@caddeapllx2484 p585600]# ^C
[root@caddeapllx2484 p585600]# curl -v http://127.0.0.1:443/sicmu 2>&1 | head -20
* About to connect() to 127.0.0.1 port 443 (#0)
*   Trying 127.0.0.1...
  % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                                 Dload  Upload   Total   Spent    Left  Speed
  0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0* Connected to 127.0.0.1 (127.0.0.1) port 443 (#0)
> GET /sicmu HTTP/1.1
> User-Agent: curl/7.29.0
> Host: 127.0.0.1:443
> Accept: */*
>
< HTTP/1.1 302 Found
< Date: Tue, 16 Jun 2026 15:02:34 GMT
< Server: JBoss-EAP/7
< X-Powered-By: Undertow/1
< Location: http://127.0.0.1:443/sicmu/
< Content-Length: 0
<
  0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
* Connection #0 to host 127.0.0.1 left intact
[root@caddeapllx2484 p585600]#
