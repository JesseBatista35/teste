
-sh-4.2$ curl -v -m 5 http://localhost:8080/sispl-canal-webhook-pix/
* About to connect() to localhost port 8080 (#0)
*   Trying ::1...
* Conexão recusada
*   Trying 127.0.0.1...
* Conexão recusada
* Failed connect to localhost:8080; Conexão recusada
* Closing connection 0
curl: (7) Failed connect to localhost:8080; Conexão recusada
-sh-4.2$ ^C
-sh-4.2$ curl -v -m 5 -k https://sispl-canal-webhook-pix-tqs.apps.nctvmrh001.nuvem.caixa/sispl-canal-webhook-pix/
* About to connect() to sispl-canal-webhook-pix-tqs.apps.nctvmrh001.nuvem.caixa port 443 (#0)
*   Trying 10.190.12.5...
* Connected to sispl-canal-webhook-pix-tqs.apps.nctvmrh001.nuvem.caixa (10.190.12.5) port 443 (#0)
* Initializing NSS with certpath: sql:/etc/pki/nssdb
* skipping SSL peer certificate verification
* SSL connection using TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256
* Server certificate:
*       subject: CN=*.apps.nctvmrh001.nuvem.caixa,O=Caixa Economica Federal,C=BR
*       start date: Jun 29 12:17:58 2026 GMT
*       expire date: Jun 29 12:27:58 2031 GMT
*       common name: *.apps.nctvmrh001.nuvem.caixa
*       issuer: CN=AC Icptestes Sub,O=Caixa Economica Federal,C=BR
> GET /sispl-canal-webhook-pix/ HTTP/1.1
> User-Agent: curl/7.29.0
> Host: sispl-canal-webhook-pix-tqs.apps.nctvmrh001.nuvem.caixa
> Accept: */*
>
< HTTP/1.1 404 Not Found
< x-powered-by: Undertow/1
< server: JBoss-EAP/7
< content-length: 74
< content-type: text/html
< date: Mon, 03 Aug 2026 21:10:36 GMT
< set-cookie: d2e5d56964760c749e1bf2ea520dcbca=55173edfc49dce7e1b31080a4f6773e6; path=/; HttpOnly; Secure; SameSite=None
<
* Connection #0 to host sispl-canal-webhook-pix-tqs.apps.nctvmrh001.nuvem.caixa left intact
<html><head><title>Error</title></head><body>404 - Not Found</body></html>-sh-4.2$
