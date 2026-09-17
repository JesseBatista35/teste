
[p981778@sbrdeapllx093 sigfi-ecr_node1_lx0093]$ curl -k -v -H "Host: sigfi2.desenvolvimento.extracaixa" https://10.116.80.21/ecr
* About to connect() to 10.116.80.21 port 443 (#0)
*   Trying 10.116.80.21... connected
* Connected to 10.116.80.21 (10.116.80.21) port 443 (#0)
* Initializing NSS with certpath: sql:/etc/pki/nssdb
* warning: ignoring value of ssl.verifyhost
* skipping SSL peer certificate verification
* SSL connection using TLS_RSA_WITH_AES_256_CBC_SHA
* Server certificate:
*       subject: CN=sirta.des.caixa,O=Caixa Economica Federal,C=BR
*       start date: Dec 22 16:39:33 2023 GMT
*       expire date: Dec 22 16:49:33 2028 GMT
*       common name: sirta.des.caixa
*       issuer: CN=AC Icptestes Sub,O=Caixa Economica Federal,C=BR
> GET /ecr HTTP/1.1
> User-Agent: curl/7.19.7 (x86_64-redhat-linux-gnu) libcurl/7.19.7 NSS/3.27.1 zlib/1.2.3 libidn/1.18 libssh2/1.4.2
> Accept: */*
> Host: sigfi2.desenvolvimento.extracaixa
>
< HTTP/1.1 404 Not Found
< Age:          1
< Date: Thu, 17 Sep 2026 17:31:21 GMT
< Connection: Keep-Alive
< Via: NS-CACHE-10.0:  98
< ETag: "2021f-246-6030ef7175aba"
< Server: Apache
< X-Frame-Options: DENY
< Content-Security-Policy: frame-ancestors 'none';
< Last-Modified: Wed, 16 Aug 2023 19:04:30 GMT
< Accept-Ranges: bytes
< Content-Length: 582
< Content-Type: text/html
<
<html>
<body>
<br/><br/><br/>
<p align="center">Voce esta tentando acessar um sistema localizado no ambiente JBoss EAP 6.4 DES.</p>
<p align="center">O contexto que voce esta tentando acessar na aplicacao nao foi encontrado. Verifique se o mesmo esta correto ou existe e tente novamente.</p>
<p align="center"><img src="/images/caixa_logo.jpg" width=85% heigth=85% alt="Caixa"></p>
<p align="center">Sistema temporariamente indisponivel. Tente novamente mais tarde.</p>
<p align="center">Erro 404 - EAP64-DES-SBRDEAPRLX0002</p>
</body>
</html>
* Connection #0 to host 10.116.80.21 left intact
* Closing connection #0
[p981778@sbrdeapllx093 sigfi-ecr_node1_lx0093]$
