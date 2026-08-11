sh-4.2$
-sh-4.2$ env | grep -i proxy
http_proxy=http://proxyprd.caixa:80
https_proxy=http://proxyprd.caixa:80
no_proxy=10.122.154.12 10.122.154.13 10.122.154.11 cbrsvaprlx016.intra.caixa.gov.br cbrsvaprlx017.intra.caixa.gov.br cbrsvaprlx018.intra.caixa.gov.br 10.192.32.40 cx0000lx040.corecaixa puppet.suporte.caixa puppetca.suporte.caixa
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ timeout 10 curl -v -o /dev/null https://firebase.googleapis.com
  % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                                 Dload  Upload   Total   Spent    Left  Speed
  0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0* About to connect() to proxy proxyprd.caixa port 80 (#0)
*   Trying 10.252.32.220...
* Connected to proxyprd.caixa (10.252.32.220) port 80 (#0)
* Establish HTTP proxy tunnel to firebase.googleapis.com:443
> CONNECT firebase.googleapis.com:443 HTTP/1.1
> Host: firebase.googleapis.com:443
> User-Agent: curl/7.29.0
> Proxy-Connection: Keep-Alive
>
< HTTP/1.1 200 Connection established
< Via: 1.1 CX0000NT810
< Connection: Keep-Alive
< Proxy-Connection: Keep-Alive
<
* Proxy replied OK to CONNECT request
* Initializing NSS with certpath: sql:/etc/pki/nssdb
*   CAfile: /etc/pki/tls/certs/ca-bundle.crt
  CApath: none
* SSL connection using TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384
* Server certificate:
*       subject: CN=upload.video.google.com
*       start date: Jul 20 18:07:35 2026 GMT
*       expire date: Out 12 18:07:34 2026 GMT
*       common name: upload.video.google.com
*       issuer: CN=WR2,O=Google Trust Services,C=US
> GET / HTTP/1.1
> User-Agent: curl/7.29.0
> Host: firebase.googleapis.com
> Accept: */*
>
< HTTP/1.1 404 Not Found
< Content-Type: text/html; charset=utf-8
< Cache-Control: no-cache, no-store, max-age=0, must-revalidate
< Pragma: no-cache
< Expires: Mon, 01 Jan 1990 00:00:00 GMT
< Date: Tue, 11 Aug 2026 18:16:52 GMT
< Report-To: {"group":"coop_6f4778fde09b6fb7868744aa7c6e926e","max_age":2592000,"endpoints":[{"url":"https://csp.withgoogle.com/csp/report-to/6f4778fde09b6fb7868744aa7c6e926e"}]}
< Cross-Origin-Opener-Policy-Report-Only: same-origin; report-to="coop_6f4778fde09b6fb7868744aa7c6e926e"
< Server: ESF
< X-XSS-Protection: 0
< X-Frame-Options: SAMEORIGIN
< X-Content-Type-Options: nosniff
< Alt-Svc: h3=":443"; ma=2592000,h3-29=":443"; ma=2592000
< Accept-Ranges: none
< Vary: Accept-Encoding
< Transfer-Encoding: chunked
<
{ [data not shown]
100    38    0    38    0     0    117      0 --:--:-- --:--:-- --:--:--   118
* Connection #0 to host proxyprd.caixa left intact
-sh-4.2$
-sh-4.2$
-sh-4.2$
