
-sh-4.2$ curl -vk https://sicmu-intranet-update.esteiras.des.caixa/sicmu 2>&1 | head -25
  % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                                 Dload  Upload   Total   Spent    Left  Speed
  0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0* About to connect() to sicmu-intranet-update.esteiras.des.caixa port 443 (#0)
*   Trying 10.116.181.177...
* Connected to sicmu-intranet-update.esteiras.des.caixa (10.116.181.177) port 443 (#0)
* Initializing NSS with certpath: sql:/etc/pki/nssdb
* skipping SSL peer certificate verification
* SSL connection using TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256
* Server certificate:
*       subject: CN=*.esteiras.des.caixa,O=Caixa Economica Federal,C=BR
*       start date: Abr 18 14:57:45 2024 GMT
*       expire date: Abr 18 15:07:45 2029 GMT
*       common name: *.esteiras.des.caixa
*       issuer: CN=AC Icptestes Sub,O=Caixa Economica Federal,C=BR
> GET /sicmu HTTP/1.1
> User-Agent: curl/7.29.0
> Host: sicmu-intranet-update.esteiras.des.caixa
> Accept: */*
>
* SSL read: errno -5961 (PR_CONNECT_RESET_ERROR)
* TCP connection reset by peer
  0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0
* Closing connection 0
curl: (56) TCP connection reset by peer
-sh-4.2$


