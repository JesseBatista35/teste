-sh-4.2$ oc delete route integra.iniciadora.caixa.gov.br
route.route.openshift.io "integra.iniciadora.caixa.gov.br" deleted




-sh-4.2$ -sh-4.2$ oc get routes -n siinp-tqs
siinp-nucleo-tqs                  siinp-nucleo-tqs.apps.nprd.caixa                      siinp-nucleo-tqs            web       edge/Redirect   None
siinp-nucleo-tqs2-tqs             siinp-nucleo-tqs2-tqs.apps.nprd.caixa                 siinp-nucleo-tqs2-tqs       web       edge/Redirect   None
siinp-nucleo-web-tqs              siinp-nucleo-web-tqs.apps.nprd.caixa                  siinp-nucleo-web-tqs        web       edge/Redirect   None
siinp-nucleo-web-tqs2-tqs         siinp-nucleo-web-tqs2-tqs.apps.nprd.caixa             siinp-nucleo-web-tqs2-tqs   web       edge/Redirect   None
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
> User-Agent-sh: -sh-4.2$: comando não encontrado
: curl/7.29.0
> Host: siinp-nucleo-tqs.apps.nprd.caixa
> Accept: */*
> Content-Type: application/json
-sh-4.2$ NAME                              HOST/PORT                                   PATH      SERVICES                    PORT      TERMINATION     WILDCARD
> Content-Length: 18
>
* upload completely sent off: 18 out of 18 bytes
< HTTP/1.1 401 Unauthorized
< www-authenticate: Bearer
< inp-api-build: 1.77.0.17
< content-length: 0
< set-cookie: 60f748c0f68d5a7f039f7811f05a8aed=921d98620f8510715d63013e397e8b20; path=/; HttpOnly; Secure; SameSite=None
<
* Connection #0 to host siinp-nucleo-tqs.apps.nprd.caixa left intact
-sh-4.2$
-sh: NAME: comando não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$ integra.iniciadora                integra.iniciadora.caixa.gov.br             /         siinp-nucleo-tqs            web       edge/Redirect   None
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh: integra.iniciadora: comando não encontrado
-sh-4.2$ integra.iniciadora.caixa.gov.br   integra.iniciadora.caixa.gov.br                       siinp-nucleo-web-tqs        web       edge            None
-sh: integra.iniciadora.caixa.gov.br: comando não encontrado
-sh-4.2$ siinp-gestao-tqs                  siinp-gestao-tqs.apps.nprd.caixa                      siinp-gestao-tqs            web       edge/Redirect   None
-sh: siinp-gestao-tqs: comando não encontrado
-sh-4.2$ siinp-gestao-web-tqs              siinp-gestao-web-tqs.apps.nprd.caixa                  siinp-gestao-web-tqs        web       edge/Redirect   None
-sh: siinp-gestao-web-tqs: comando não encontrado
-sh-4.2$ siinp-nucleo-tqs                  siinp-nucleo-tqs.apps.nprd.caixa                      siinp-nucleo-tqs            web       edge/Redirect   None
-sh: siinp-nucleo-tqs: comando não encontrado
-sh-4.2$ siinp-nucleo-tqs2-tqs             siinp-nucleo-tqs2-tqs.apps.nprd.caixa                 siinp-nucleo-tqs2-tqs       web       edge/Redirect   None
-sh: siinp-nucleo-tqs2-tqs: comando não encontrado
-sh-4.2$ siinp-nucleo-web-tqs              siinp-nucleo-web-tqs.apps.nprd.caixa                  siinp-nucleo-web-tqs        web       edge/Redirect   None
-sh: siinp-nucleo-web-tqs: comando não encontrado
-sh-4.2$ siinp-nucleo-web-tqs2-tqs         siinp-nucleo-web-tqs2-tqs.apps.nprd.caixa             siinp-nucleo-web-tqs2-tqs   web       edge/Redirect   None
-sh: siinp-nucleo-web-tqs2-tqs: comando não encontrado
-sh-4.2$ -sh-4.2$ curl -v -X POST https://siinp-nucleo-tqs.apps.nprd.caixa/inic-pagto/nucleo/v1/jornada \
> >   -H "Content-Type: application/json" \
> >   -d '{"valor": "25.00"}' -k
-sh: -sh-4.2$: comando não encontrado
-sh-4.2$ * About to connect() to siinp-nucleo-tqs.apps.nprd.caixa port 443 (#0)
-sh: erro de sintaxe próximo do `token' não esperado `('
-sh-4.2$ *   Trying 10.116.180.64...
-sh: Accept:: comando não encontrado
-sh-4.2$ * Connected to siinp-nucleo-tqs.apps.nprd.caixa (10.116.180.64) port 443 (#0)
-sh: erro de sintaxe próximo do `token' não esperado `('
-sh-4.2$ * Initializing NSS with certpath: sql:/etc/pki/nssdb
-sh: Accept:: comando não encontrado
-sh-4.2$ * skipping SSL peer certificate verification
-sh: Accept:: comando não encontrado
-sh-4.2$ * SSL connection using TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256
-sh: Accept:: comando não encontrado
-sh-4.2$ * Server certificate:
-sh: Accept:: comando não encontrado
-sh-4.2$ *       subject: CN=*.apps.nprd.caixa,O=Caixa Economica Federal,C=BR
-sh: Accept:: comando não encontrado
-sh-4.2$ *       start date: Jul 18 15:07:38 2024 GMT
-sh: Accept:: comando não encontrado
-sh-4.2$ *       expire date: Jul 18 15:17:38 2029 GMT
-sh: Accept:: comando não encontrado
-sh-4.2$ *       common name: *.apps.nprd.caixa
-sh: Accept:: comando não encontrado
-sh-4.2$ *       issuer: CN=AC Icptestes Sub,O=Caixa Economica Federal,C=BR
-sh: Accept:: comando não encontrado
-sh-4.2$ > POST /inic-pagto/nucleo/v1/jornada HTTP/1.1
-sh: /inic-pagto/nucleo/v1/jornada: Arquivo ou diretório não encontrado
-sh-4.2$ > User-Agent: curl/7.29.0
-sh: curl/7.29.0: Arquivo ou diretório não encontrado
-sh-4.2$ > Host: siinp-nucleo-tqs.apps.nprd.caixa
-sh: siinp-nucleo-tqs.apps.nprd.caixa: comando não encontrado
-sh-4.2$ > Accept: */*
-sh: jesse/module.xml: Permissão negada
-sh-4.2$ > Content-Type: application/json
-sh: application/json: Arquivo ou diretório não encontrado
-sh-4.2$ > Content-Length: 18
-sh: 18: comando não encontrado
-sh-4.2$ >
-sh: erro de sintaxe próximo do `token' não esperado `newline'
-sh-4.2$ * upload completely sent off: 18 out of 18 bytes
-sh: Accept:: comando não encontrado
-sh-4.2$ < HTTP/1.1 401 Unauthorized
-sh: HTTP/1.1: Arquivo ou diretório não encontrado
-sh-4.2$ < www-authenticate: Bearer
-sh: www-authenticate:: Arquivo ou diretório não encontrado
-sh-4.2$ < inp-api-build: 1.77.0.17
-sh: inp-api-build:: Arquivo ou diretório não encontrado
-sh-4.2$ < content-length: 0
-sh: content-length:: Arquivo ou diretório não encontrado
-sh-4.2$ < set-cookie: 60f748c0f68d5a7f039f7811f05a8aed=921d98620f8510715d63013e397e8b20; path=/; HttpOnly; Secure; SameSite=None
-sh: set-cookie:: Arquivo ou diretório não encontrado
-sh: HttpOnly: comando não encontrado
-sh: Secure: comando não encontrado
-sh-4.2$ <
-sh: erro de sintaxe próximo do `token' não esperado `newline'
-sh-4.2$ * Connection #0 to host siinp-nucleo-tqs.apps.nprd.caixa left intact
-sh: Accept:: comando não encontrado
-sh-4.2$ -sh-4.2$
-sh: -sh-4.2$: comando não encontrado
-sh-4.2$ -sh-4.2$
-sh: -sh-4.2$: comando não encontrado
-sh-4.2$ -sh-4.2$
-sh: -sh-4.2$: comando não encontrado
-sh-4.2$ -sh-4.2$
-sh: -sh-4.2$: comando não encontrado
-sh-4.2$ -sh-4.2$
-sh: -sh-4.2$: comando não encontrado
-sh-4.2$ -sh-4.2$
-sh: -sh-4.2$: comando não encontrado
-sh-4.2$ -sh-4.2$
-sh: -sh-4.2$: comando não encontrado
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ curl -v -X POST https://integra.iniciadora.caixa.gov.br/inic-pagto/nucleo/v1/jornada \
>   -H "Content-Type: application/json" \
>   -d '{"valor": "25.00"}' -k
* About to connect() to integra.iniciadora.caixa.gov.br port 443 (#0)
*   Trying 200.201.168.58...
^C
-sh-4.2$
