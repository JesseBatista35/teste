Vamos diagnosticar:
1️⃣ Verifique se há múltiplas rotas e teste outra que sabemos que funciona:
bash


oc get routes -n siinp-tqs
Pelos screenshots anteriores, existe siinp-nucleo-tqs.apps.nprd.caixa. Tente:
bash


curl -v -X POST https://siinp-nucleo-tqs.apps.nprd.caixa/inic-pagto/nucleo/v1/jornada \
  -H "Content-Type: application/json" \
  -d '{"valor": "25.00"}' -k

  
(Use -k para ignorar certificado auto-assinado)


2️⃣ Se funcionar nessa rota, o problema é específico da rota integra.iniciadora:
bash# Delete e recrie a rota problemática


oc delete route integra.iniciadora
oc expose svc siinp-nucleo-tqs --hostname=integra.iniciadora.caixa.gov.br --path=/ --name=integra.iniciadora


3️⃣ Ou verifique se a rota tem alguma anotação estranha:
bash

oc describe route integra.iniciadora

Manda aí o resultado da primeira rota alternativa! Se funcionar lá, a gente recriad a rota problemática. 🔍
















-sh-4.2$ oc get routes -n siinp-tqs
NAME                              HOST/PORT                                   PATH      SERVICES                    PORT      TERMINATION     WILDCARD
integra.iniciadora                integra.iniciadora.caixa.gov.br             /         siinp-nucleo-tqs            web       edge/Redirect   None
integra.iniciadora.caixa.gov.br   integra.iniciadora.caixa.gov.br                       siinp-nucleo-web-tqs        web       edge            None
siinp-gestao-tqs                  siinp-gestao-tqs.apps.nprd.caixa                      siinp-gestao-tqs            web       edge/Redirect   None
siinp-gestao-web-tqs              siinp-gestao-web-tqs.apps.nprd.caixa                  siinp-gestao-web-tqs        web       edge/Redirect   None
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
< set-cookie: 60f748c0f68d5a7f039f7811f05a8aed=921d98620f8510715d63013e397e8b20; path=/; HttpOnly; Secure; SameSite=None
<
* Connection #0 to host siinp-nucleo-tqs.apps.nprd.caixa left intact
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$

