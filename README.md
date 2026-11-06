
[p585600@caddeapllx2835 ~]$
[p585600@caddeapllx2835 ~]$ sudo ss -tlno | egrep ':80 |:443 |:8080 |:8443 '

Presumimos que você recebeu as instruções de sempre do administrador
de sistema local. Basicamente, resume-se a estas três coisas:

    #1) Respeite a privacidade dos outros.
    #2) Pense antes de digitar.
    #3) Com grandes poderes vêm grandes responsabilidades.

[sudo] senha para p585600:
LISTEN 0      10000        0.0.0.0:8443       0.0.0.0:*
LISTEN 0      10000        0.0.0.0:8080       0.0.0.0:*
LISTEN 0      511                *:80               *:*
LISTEN 0      511                *:443              *:*
[p585600@caddeapllx2835 ~]$
[p585600@caddeapllx2835 ~]$
[p585600@caddeapllx2835 ~]$
[p585600@caddeapllx2835 ~]$
[p585600@caddeapllx2835 ~]$
[p585600@caddeapllx2835 ~]$
[p585600@caddeapllx2835 ~]$
[p585600@caddeapllx2835 ~]$
^C
[p585600@caddeapllx2835 ~]$
[p585600@caddeapllx2835 ~]$
[p585600@caddeapllx2835 ~]$ ps -ef | grep -E 'httpd|nginx' | grep -v grep
root      230547       1  0 out29 ?        00:00:20 /opt/httpd/sbin/httpd -f /opt/httpd/conf/httpd.conf -E /opt/httpd/logs/httpd.log -k start
apache    270519  230547  0 00:00 ?        00:00:00 /opt/httpd/sbin/httpd -f /opt/httpd/conf/httpd.conf -E /opt/httpd/logs/httpd.log -k start
apache    270522  230547  0 00:00 ?        00:00:01 /opt/httpd/sbin/httpd -f /opt/httpd/conf/httpd.conf -E /opt/httpd/logs/httpd.log -k start
[p585600@caddeapllx2835 ~]$
[p585600@caddeapllx2835 ~]$
[p585600@caddeapllx2835 ~]$
[p585600@caddeapllx2835 ~]$ curl -sv  http://localhost:80/      -o /dev/null
curl -sv  http://localhost:8080/    -o /dev/null
curl -skv https://localhost:8443/   -o /dev/null
curl -sv  http://localhost:8080/sibdo/ -o /dev/null
*   Trying ::1:80...
* Connected to localhost (::1) port 80 (#0)
> GET / HTTP/1.1
> Host: localhost
> User-Agent: curl/7.76.1
> Accept: */*
>
* Mark bundle as not supporting multiuse
< HTTP/1.1 302 Found
< Date: Fri, 06 Nov 2026 17:38:28 GMT
< Server: Apache
< Location: http://localhost/
< Content-Length: 201
< Content-Type: text/html; charset=iso-8859-1
<
{ [201 bytes data]
* Connection #0 to host localhost left intact
*   Trying ::1:8080...
* connect to ::1 port 8080 failed: Conexão recusada
*   Trying 127.0.0.1:8080...
* Connected to localhost (127.0.0.1) port 8080 (#0)
> GET / HTTP/1.1
> Host: localhost:8080
> User-Agent: curl/7.76.1
> Accept: */*
>
* Mark bundle as not supporting multiuse
< HTTP/1.1 200 OK
< Connection: keep-alive
< Last-Modified: Fri, 19 Jan 2024 09:03:52 GMT
< Content-Length: 1634
< Content-Type: text/html
< Accept-Ranges: bytes
< Date: Fri, 06 Nov 2026 17:38:28 GMT
<
{ [1634 bytes data]
* Connection #0 to host localhost left intact
*   Trying ::1:8443...
* connect to ::1 port 8443 failed: Conexão recusada
*   Trying 127.0.0.1:8443...
* Connected to localhost (127.0.0.1) port 8443 (#0)
* ALPN, offering h2
* ALPN, offering http/1.1
*  CAfile: /etc/pki/tls/certs/ca-bundle.crt
* TLSv1.0 (OUT), TLS header, Certificate Status (22):
} [5 bytes data]
* TLSv1.3 (OUT), TLS handshake, Client hello (1):
} [512 bytes data]
* TLSv1.2 (IN), TLS header, Certificate Status (22):
{ [5 bytes data]
* TLSv1.3 (IN), TLS handshake, Server hello (2):
{ [94 bytes data]
* TLSv1.2 (IN), TLS handshake, Certificate (11):
{ [729 bytes data]
* TLSv1.2 (IN), TLS handshake, Server key exchange (12):
{ [300 bytes data]
* TLSv1.2 (IN), TLS handshake, Server finished (14):
{ [4 bytes data]
* TLSv1.2 (OUT), TLS header, Certificate Status (22):
} [5 bytes data]
* TLSv1.2 (OUT), TLS handshake, Client key exchange (16):
} [37 bytes data]
* TLSv1.2 (OUT), TLS header, Finished (20):
} [5 bytes data]
* TLSv1.2 (OUT), TLS change cipher, Change cipher spec (1):
} [1 bytes data]
* TLSv1.2 (OUT), TLS header, Certificate Status (22):
} [5 bytes data]
* TLSv1.2 (OUT), TLS handshake, Finished (20):
} [16 bytes data]
* TLSv1.2 (IN), TLS header, Finished (20):
{ [5 bytes data]
* TLSv1.2 (IN), TLS header, Certificate Status (22):
{ [5 bytes data]
* TLSv1.2 (IN), TLS handshake, Finished (20):
{ [16 bytes data]
* SSL connection using TLSv1.2 / ECDHE-RSA-AES256-GCM-SHA384
* ALPN, server accepted to use h2
* Server certificate:
*  subject: CN=localhost
*  start date: Nov  6 17:38:29 2026 GMT
*  expire date: Nov  3 17:38:29 2036 GMT
*  issuer: CN=localhost
*  SSL certificate verify result: self-signed certificate (18), continuing anyway.
* Using HTTP2, server supports multi-use
* Connection state changed (HTTP/2 confirmed)
* Copying HTTP/2 data in stream buffer to connection buffer after upgrade: len=0
* TLSv1.2 (OUT), TLS header, Unknown (23):
} [5 bytes data]
* TLSv1.2 (OUT), TLS header, Unknown (23):
} [5 bytes data]
* TLSv1.2 (OUT), TLS header, Unknown (23):
} [5 bytes data]
* Using Stream ID: 1 (easy handle 0x556011057040)
* TLSv1.2 (OUT), TLS header, Unknown (23):
} [5 bytes data]
> GET / HTTP/2
> Host: localhost:8443
> user-agent: curl/7.76.1
> accept: */*
>
* TLSv1.2 (IN), TLS header, Unknown (23):
{ [5 bytes data]
* Connection state changed (MAX_CONCURRENT_STREAMS == 4294967295)!
* TLSv1.2 (OUT), TLS header, Unknown (23):
} [5 bytes data]
* TLSv1.2 (IN), TLS header, Unknown (23):
{ [5 bytes data]
* TLSv1.2 (IN), TLS header, Unknown (23):
{ [5 bytes data]
< HTTP/2 200
< last-modified: Fri, 19 Jan 2024 09:03:52 GMT
< content-length: 1634
< content-type: text/html
< accept-ranges: bytes
< date: Fri, 06 Nov 2026 17:38:29 GMT
<
{ [1634 bytes data]
* Connection #0 to host localhost left intact
*   Trying ::1:8080...
* connect to ::1 port 8080 failed: Conexão recusada
*   Trying 127.0.0.1:8080...
* Connected to localhost (127.0.0.1) port 8080 (#0)
> GET /sibdo/ HTTP/1.1
> Host: localhost:8080
> User-Agent: curl/7.76.1
> Accept: */*
>
* Mark bundle as not supporting multiuse
< HTTP/1.1 200 OK
< Connection: keep-alive
< Last-Modified: Tue, 13 Oct 2026 17:02:50 GMT
< Content-Type: text/html
< Content-Length: 4042
< Accept-Ranges: bytes
< Date: Fri, 06 Nov 2026 17:38:29 GMT
<
{ [4042 bytes data]
* Connection #0 to host localhost left intact
[p585600@caddeapllx2835 ~]$
[p585600@caddeapllx2835 ~]$
[p585600@caddeapllx2835 ~]$
[p585600@caddeapllx2835 ~]$
[p585600@caddeapllx2835 ~]$
[p585600@caddeapllx2835 ~]$ sudo firewall-cmd --list-all 2>/dev/null || sudo iptables -L -n | head -30
Chain INPUT (policy ACCEPT)
target     prot opt source               destination
ACCEPT     tcp  --  0.0.0.0/0            0.0.0.0/0            tcp dpt:80 flags:0x17/0x02 /* Accept new HTTP connections. */ ctstate NEW
ACCEPT     tcp  --  0.0.0.0/0            0.0.0.0/0            tcp dpt:443 flags:0x17/0x02 /* Accept new HTTP connections. */ ctstate NEW

Chain FORWARD (policy ACCEPT)
target     prot opt source               destination

Chain OUTPUT (policy ACCEPT)
target     prot opt source               destination
[p585600@caddeapllx2835 ~]$
