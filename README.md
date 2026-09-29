oc patch svc sipar-inter-frontend-des --type=json \
  -p '[{"op":"add","path":"/spec/ports/-","value":{"name":"https","port":8443,"protocol":"TCP","targetPort":8443}}]'

oc patch route sipar-inter-frontend-des -p '{"spec":{"port":{"targetPort":"https"}}}'

oc get route sipar-inter-frontend-des


https://sipar-inter-frontend-des.apps.nprd.caixa/siparInternet/



URL da Solicitação
https://sipar-inter-frontend-des.apps.nprd.caixa/favicon.ico
Request method
GET
Status code
400 Bad Request
Remote address
10.116.180.64:443
Referrer policy
strict-origin-when-cross-origin
connection
close
content-length
226
content-type
text/html; charset=iso-8859-1
date
Tue, 29 Sep 2026 20:01:41 GMT
server
Apache/2.4.37 (centos) OpenSSL/1.1.1c
accept
image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8
accept-encoding
gzip, deflate, br, zstd
accept-language
pt-BR,pt;q=0.9,en;q=0.8,en-GB;q=0.7,en-US;q=0.6
cache-control
no-cache
connection
keep-alive
host
sipar-inter-frontend-des.apps.nprd.caixa
pragma
no-cache
referer
https://sipar-inter-frontend-des.apps.nprd.caixa/siparInternet/
sec-ch-ua
"Chromium";v="154", "Microsoft Edge";v="154", "Not A(Brand";v="99"
sec-ch-ua-mobile
?0
sec-ch-ua-platform
"Windows"
sec-fetch-dest
image
sec-fetch-mode
no-cors
sec-fetch-site
same-origin
user-agent
Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/154.0.0.0 Safari/537.36 Edg/154.0.0.0



$
-sh-4.2$
-sh-4.2$ oc get pods | grep frontend
sipar-inter-frontend-des-31-deploy   0/1       Error       0          19h
sipar-inter-frontend-des-32-deploy   0/1       Completed   0          4m7s
sipar-inter-frontend-des-32-smvvh    1/1       Running     0          89s
-sh-4.2$ oc patch svc sipar-inter-frontend-des --type=json \
>   -p '[{"op":"add","path":"/spec/ports/-","value":{"name":"https","port":8443,"protocol":"TCP","targetPort":8443}}]'
service/sipar-inter-frontend-des patched
-sh-4.2$
-sh-4.2$ oc patch route sipar-inter-frontend-des -p '{"spec":{"port":{"targetPort":"https"}}}'
route.route.openshift.io/sipar-inter-frontend-des patched
-sh-4.2$
-sh-4.2$ oc get route sipar-inter-frontend-des
NAME                       HOST/PORT                                  PATH      SERVICES                   PORT      TERMINATION            WILDCARD
sipar-inter-frontend-des   sipar-inter-frontend-des.apps.nprd.caixa             sipar-inter-frontend-des   https     passthrough/Redirect   None
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$

