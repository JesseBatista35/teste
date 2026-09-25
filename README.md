
-sh-4.2$
-sh-4.2$ oc rsh -n selenium-grid dc/chrome curl -sv --max-time 15 -o /dev/null https://cdn.perfdrive.com/ 2>&1 | grep -iE "proxy|connected|HTTP/"
* Uses proxy env variable no_proxy == '.caixa,.caixa.gov.br,.corecaixa,.local,.svc,localhost,127.0.0.1,10.0.0.0/8,25.0.0.0/8'
* Uses proxy env variable https_proxy == 'http://proxyprd.caixa:80'
* Connected to (nil) (10.252.32.136) port 80 (#0)
* Establish HTTP proxy tunnel to cdn.perfdrive.com:443
> CONNECT cdn.perfdrive.com:443 HTTP/1.1
> Proxy-Connection: Keep-Alive
< HTTP/1.1 200 Connection established
< Proxy-Connection: Keep-Alive
* Proxy replied 200 to CONNECT request
* ALPN, offering http/1.1
* Connection state changed (HTTP/2 confirmed)
* Copying HTTP/2 data in stream buffer to connection buffer after upgrade: len=0
> GET / HTTP/2
< HTTP/2 200
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc set env dc/edge dc/firefox -n selenium-grid --list | grep -i proxy
HTTP_PROXY=http://proxyprd.caixa:80
http_proxy=http://proxyprd.caixa:80
HTTPS_PROXY=http://proxyprd.caixa:80
https_proxy=http://proxyprd.caixa:80
NO_PROXY=.caixa,.caixa.gov.br,.corecaixa,.local,.svc,localhost,127.0.0.1,10.0.0.0/8,25.0.0.0/8
no_proxy=.caixa,.caixa.gov.br,.corecaixa,.local,.svc,localhost,127.0.0.1,10.0.0.0/8,25.0.0.0/8
HTTP_PROXY=http://proxyprd.caixa:80
http_proxy=http://proxyprd.caixa:80
HTTPS_PROXY=http://proxyprd.caixa:80
https_proxy=http://proxyprd.caixa:80
NO_PROXY=.caixa,.caixa.gov.br,.corecaixa,.local,.svc,localhost,127.0.0.1,10.0.0.0/8,25.0.0.0/8
no_proxy=.caixa,.caixa.gov.br,.corecaixa,.local,.svc,localhost,127.0.0.1,10.0.0.0/8,25.0.0.0/8
-sh-4.2$
