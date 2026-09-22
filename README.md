-sh-4.2$ oc -n selenium-grid rsh firefox-4-n5rkq bash -c \
>  'getent hosts proxyprd.caixa; for ip in $(getent ahostsv4 proxyprd.caixa | awk "{print \$1}" | sort -u); do timeout 5 bash -c "</dev/tcp/$ip/80" && echo "$ip OK" || echo "$ip FALHA"; done'
10.252.32.136   proxyprd.caixa
10.252.32.220   proxyprd.caixa
10.252.32.136 OK
10.252.32.220 OK
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc -n selenium-grid rsh firefox-4-n5rkq \
>   curl -sv --max-time 15 -x http://proxyprd.caixa:80 -o /dev/null https://cdn.perfdrive.com/
*   Trying 10.252.32.220:80...
* Connected to (nil) (10.252.32.220) port 80 (#0)
* allocate connect buffer!
* Establish HTTP proxy tunnel to cdn.perfdrive.com:443
> CONNECT cdn.perfdrive.com:443 HTTP/1.1
> Host: cdn.perfdrive.com:443
> User-Agent: curl/7.81.0
> Proxy-Connection: Keep-Alive
>
< HTTP/1.1 200 Connection established
< Via: 1.1 CX0000NT810
< Connection: Keep-Alive
< Proxy-Connection: Keep-Alive
<
* Proxy replied 200 to CONNECT request
* CONNECT phase completed!
* ALPN, offering h2
* ALPN, offering http/1.1
*  CAfile: /etc/ssl/certs/ca-certificates.crt
*  CApath: /etc/ssl/certs
* TLSv1.0 (OUT), TLS header, Certificate Status (22):
} [5 bytes data]
* TLSv1.3 (OUT), TLS handshake, Client hello (1):
} [512 bytes data]
* TLSv1.2 (IN), TLS header, Certificate Status (22):
{ [5 bytes data]
* TLSv1.3 (IN), TLS handshake, Server hello (2):
{ [122 bytes data]
* TLSv1.2 (IN), TLS header, Finished (20):
{ [5 bytes data]
* TLSv1.2 (IN), TLS header, Supplemental data (23):
{ [5 bytes data]
* TLSv1.3 (IN), TLS handshake, Encrypted Extensions (8):
{ [19 bytes data]
* TLSv1.3 (IN), TLS handshake, Certificate (11):
{ [5890 bytes data]
* TLSv1.3 (IN), TLS handshake, CERT verify (15):
{ [264 bytes data]
* TLSv1.3 (IN), TLS handshake, Finished (20):
{ [52 bytes data]
* TLSv1.2 (OUT), TLS header, Finished (20):
} [5 bytes data]
* TLSv1.3 (OUT), TLS change cipher, Change cipher spec (1):
} [1 bytes data]
* TLSv1.2 (OUT), TLS header, Supplemental data (23):
} [5 bytes data]
* TLSv1.3 (OUT), TLS handshake, Finished (20):
} [52 bytes data]
* SSL connection using TLSv1.3 / TLS_AES_256_GCM_SHA384
* ALPN, server accepted to use h2
* Server certificate:
*  subject: CN=*.perfdrive.com
*  start date: Sep 16 09:23:54 2026 GMT
*  expire date: Apr  2 09:23:54 2027 GMT
*  subjectAltName: host "cdn.perfdrive.com" matched cert's "*.perfdrive.com"
*  issuer: C=US; O=GoDaddy.com; CN=GoDaddy TLS Intermediate CA DV - R1v1
*  SSL certificate verify ok.
* Using HTTP2, server supports multiplexing
* Connection state changed (HTTP/2 confirmed)
* Copying HTTP/2 data in stream buffer to connection buffer after upgrade: len=0
* TLSv1.2 (OUT), TLS header, Supplemental data (23):
} [5 bytes data]
* TLSv1.2 (OUT), TLS header, Supplemental data (23):
} [5 bytes data]
* TLSv1.2 (OUT), TLS header, Supplemental data (23):
} [5 bytes data]
* Using Stream ID: 1 (easy handle 0x55b726f25e90)
* TLSv1.2 (OUT), TLS header, Supplemental data (23):
} [5 bytes data]
> GET / HTTP/2
> Host: cdn.perfdrive.com
> user-agent: curl/7.81.0
> accept: */*
>
* TLSv1.2 (IN), TLS header, Supplemental data (23):
{ [5 bytes data]
* TLSv1.3 (IN), TLS handshake, Newsession Ticket (4):
{ [284 bytes data]
* TLSv1.3 (IN), TLS handshake, Newsession Ticket (4):
{ [284 bytes data]
* old SSL session ID is stale, removing
* TLSv1.2 (IN), TLS header, Supplemental data (23):
{ [5 bytes data]
* TLSv1.2 (OUT), TLS header, Supplemental data (23):
} [5 bytes data]
* TLSv1.2 (IN), TLS header, Supplemental data (23):
{ [5 bytes data]
* TLSv1.2 (IN), TLS header, Supplemental data (23):
{ [5 bytes data]
< HTTP/2 200
< content-type: application/xml; charset=UTF-8
< x-guploader-uploadid: AJjja9YwBjfdn4_HePfVHU1kRtWhJqcH0Dxlxz4253f0kKAD-KCWP3q3q2xjheUgRUQ9zjM2
< x-goog-metageneration: 5
< content-length: 13352
< date: Tue, 22 Sep 2026 22:13:48 GMT
< expires: Tue, 22 Sep 2026 22:13:48 GMT
< cache-control: private, max-age=0
< server: UploadServer
< vary: Accept-Encoding
< access-control-allow-origin: *
< access-control-allow-headers: Content-Type
< alt-svc: h3=":443"; ma=2592000
<
* TLSv1.2 (IN), TLS header, Supplemental data (23):
{ [5 bytes data]
* TLSv1.2 (IN), TLS header, Supplemental data (23):
{ [5 bytes data]
* TLSv1.2 (IN), TLS header, Supplemental data (23):
{ [5 bytes data]
* TLSv1.2 (IN), TLS header, Supplemental data (23):
{ [5 bytes data]
* TLSv1.2 (IN), TLS header, Supplemental data (23):
{ [5 bytes data]
* TLSv1.2 (IN), TLS header, Supplemental data (23):
{ [5 bytes data]
* TLSv1.2 (IN), TLS header, Supplemental data (23):
{ [5 bytes data]
* TLSv1.2 (IN), TLS header, Supplemental data (23):
{ [5 bytes data]
* TLSv1.2 (IN), TLS header, Supplemental data (23):
{ [5 bytes data]
* TLSv1.2 (IN), TLS header, Supplemental data (23):
{ [5 bytes data]
* TLSv1.2 (IN), TLS header, Supplemental data (23):
{ [5 bytes data]
* TLSv1.2 (IN), TLS header, Supplemental data (23):
{ [5 bytes data]
* TLSv1.2 (IN), TLS header, Supplemental data (23):
{ [5 bytes data]
* Connection #0 to host (nil) left intact
-sh-4.2$
