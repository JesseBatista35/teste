-sh-4.2$ curl -v -X POST https://siinp-nucleo-tqs.apps.nprd.caixa/inic-pagto/nucleo/v1/jornada \
>   -H "Content-Type: application/json" \
>   -d '{"valor": "25.00"}' -k
* About to connect() to siinp-nucleo-tqs.apps.nprd.caixa port 443 (#0)
*   Trying 10.116.180.64...
* Connected to siinp-nucleo-tqs.apps.nprd.caixa (10.116.180.64) port 443 (#0)
* Initializing NSS with certpath: sql:/etc/pki/nssdb
* skipping SSL peer certificate verification
* SSL connection using TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256
* Server certificate:
*       subject: CN=*.apps.nprd.caixa,O=Caixa Economica Federal,C=BR
*       start date: Jul 18 15:07:38 2024 GMT
*       expire date: Jul 18 15:17:38 2029 GMT
*       common name: *.apps.nprd.caixa
*       issuer: CN=AC Icptestes Sub,O=Caixa Economica Federal,C=BR
> POST /inic-pagto/nucleo/v1/jornada HTTP/1.1
> User-Agent: curl/7.29.0
> Host: siinp-nucleo-tqs.apps.nprd.caixa
> Accept: */*
> Content-Type: application/json
> Content-Length: 18
>
* upload completely sent off: 18 out of 18 bytes
< HTTP/1.1 401 Unauthorized
< www-authenticate: Bearer
< inp-api-build: 1.77.0.17
< content-length: 0
< set-cookie: 60f748c0f68d5a7f039f7811f05a8aed=cf84b24f54d4ccf1f6833bf8fe3a0f38; path=/; HttpOnly; Secure; SameSite=None
<
* Connection #0 to host siinp-nucleo-tqs.apps.nprd.caixa left intact
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ -sh-4.2$ curl -v -X POST https://integra.iniciadora.caixa.gov.br/inic-pagto/nucleo/v1/jornada \
> >   -H "Content-Type: application/json" \
> >   -d '{"valor": "25.00"}' -k
* About to connect() to integra.iniciadora.caixa.gov.br port 443 (#0)
*   Trying 200.201.168.58...
^C
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ curl -v -X POST https://integra.iniciadora.caixa.gov.br/inic-pagto/nucleo/v1/jornada \ -H "Content-Type: application/json" \ -d '{"valor": "25.00"}' -k
* About to connect() to integra.iniciadora.caixa.gov.br port 443 (#0)
*   Trying 200.201.168.58...

-sh: -sh-4.2$: comando não encontrado
-sh-4.2$ * About to connect() to integra.iniciadora.caixa.gov.br port 443 (#0)
-sh: erro de sintaxe próximo do `token' não esperado `('
-sh-4.2$ *   Trying 200.201.168.58...
-sh: Accept:: comando não encontrado
-sh-4.2$ ^C
-sh: :s^C: substitution failed
-sh-4.2$ -sh-4.2$
-sh: -sh-4.2$: comando não encontrado
-sh-4.2$ -sh-4.2$
-sh: -sh-4.2$: comando não encontrado
-sh-4.2$ -sh-4.2$
-sh: -sh-4.2$: comando não encontrado
-sh-4.2$ -sh-4.2$ curl -v -X POST https://integra.iniciadora.caixa.gov.br/inic-pagto/nucleo/v1/jornada \ -H "Content-Type: application/json" \ -d '{"valor": "25.00"}' -k
-sh: -sh-4.2$: comando não encontrado
-sh-4.2$ * About to connect() to integra.iniciadora.caixa.gov.br port 443 (#0)
-sh: erro de sintaxe próximo do `token' não esperado `('
-sh-4.2$ *   Trying 200.201.168.58...
-sh: Accept:: comando não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc port-forward svc/siinp-nucleo-web-tqs 8080:8080 &
[1] 52809
-sh-4.2$ sleep 2
Forwarding from 127.0.0.1:8080 -> 8080
Forwarding from [::1]:8080 -> 8080
-sh-4.2$ curl -X POST http://localhost:8080/inic-pagto/nucleo/v1/jornada \
>   -H "Content-Type: application/json" \
>   -d '{"valor": "25.00"}'
