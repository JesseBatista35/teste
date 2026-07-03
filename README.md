[p585600@caddeapllx2577 ~]$ curl -k -v https://siarg-interno.esteiras.des.caixa/siarg/login tail -f /logs/jboss/jboss-eap/standalone/siarg-interno/server.log
*   Trying 10.116.201.44:443...
* Connected to siarg-interno.esteiras.des.caixa (10.116.201.44) port 443 (#0)
* ALPN, offering h2
* ALPN, offering http/1.1
*  CAfile: /etc/pki/tls/certs/ca-bundle.crt
* TLSv1.0 (OUT), TLS header, Certificate Status (22):
* TLSv1.3 (OUT), TLS handshake, Client hello (1):
* TLSv1.2 (IN), TLS header, Certificate Status (22):
* TLSv1.3 (IN), TLS handshake, Server hello (2):
* TLSv1.2 (IN), TLS header, Finished (20):
* TLSv1.2 (IN), TLS header, Unknown (23):
* TLSv1.3 (IN), TLS handshake, Encrypted Extensions (8):
* TLSv1.2 (IN), TLS header, Unknown (23):
* TLSv1.3 (IN), TLS handshake, Certificate (11):
* TLSv1.2 (IN), TLS header, Unknown (23):
* TLSv1.3 (IN), TLS handshake, CERT verify (15):
* TLSv1.2 (IN), TLS header, Unknown (23):
* TLSv1.3 (IN), TLS handshake, Finished (20):
* TLSv1.2 (OUT), TLS header, Finished (20):
* TLSv1.3 (OUT), TLS change cipher, Change cipher spec (1):
* TLSv1.2 (OUT), TLS header, Unknown (23):
* TLSv1.3 (OUT), TLS handshake, Finished (20):
* SSL connection using TLSv1.3 / TLS_AES_256_GCM_SHA384
* ALPN, server accepted to use http/1.1
* Server certificate:
*  subject: C=BR; O=Caixa Economica Federal; CN=siarg-interno.esteiras.des.caixa
*  start date: Apr 17 20:09:07 2026 GMT
*  expire date: Apr 17 20:19:07 2031 GMT
*  issuer: C=BR; O=Caixa Economica Federal; CN=AC Icptestes Sub
*  SSL certificate verify result: unable to get local issuer certificate (20), continuing anyway.
* TLSv1.2 (OUT), TLS header, Unknown (23):
> GET /siarg/login HTTP/1.1
> Host: siarg-interno.esteiras.des.caixa
> User-Agent: curl/7.76.1
> Accept: */*
>
* TLSv1.2 (IN), TLS header, Unknown (23):
* TLSv1.3 (IN), TLS handshake, Newsession Ticket (4):
* TLSv1.2 (IN), TLS header, Unknown (23):
* TLSv1.3 (IN), TLS handshake, Newsession Ticket (4):
* old SSL session ID is stale, removing
* TLSv1.2 (IN), TLS header, Unknown (23):
* Mark bundle as not supporting multiuse
< HTTP/1.1 500 Internal Server Error
< Date: Fri, 03 Jul 2026 00:36:02 GMT
< Server: Apache/2.4.57 (Red Hat)
< Strict-Transport-Security: max-age=63072000; includeSubDomains; preload
< X-Frame-Options: DENY
< X-Content-Type-Options: nosniff
< Content-Length: 86
< Content-Type: text/html; charset=UTF-8
< Connection: close
* The requested URL returned error: 500
* Closing connection 0
* TLSv1.2 (OUT), TLS header, Unknown (23):
* TLSv1.3 (OUT), TLS alert, close notify (256):
curl: (22) The requested URL returned error: 500
* Could not resolve host: tail
* Closing connection 1
curl: (6) Could not resolve host: tail
* Closing connection -1
curl: (3) URL using bad/illegal format or missing URL
[p585600@caddeapllx2577 ~]$ ^C
[p585600@caddeapllx2577 ~]$

