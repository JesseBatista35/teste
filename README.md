
-sh-4.2$ oc -n selenium-grid get pods | grep -E 'chrome-4|firefox-5|edge-4'
chrome-4-7h2xg                   0/1       ContainerCreating   0          2m47s
chrome-4-deploy                  1/1       Running             0          3m3s
edge-4-deploy                    1/1       Running             0          3m3s
edge-4-mdsbs                     0/1       ContainerCreating   0          2m47s
firefox-5-26gvg                  0/1       ContainerCreating   0          2m47s
firefox-5-deploy                 1/1       Running             0          3m3s
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ echo $POD
pod/firefox-4-n5rkq
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc -n selenium-grid rsh firefox-5-26gvg env | grep -i proxy
NO_PROXY=.caixa,.caixa.gov.br,.corecaixa,.local,.svc,localhost,127.0.0.1,10.0.0.0/8,25.0.0.0/8
HTTP_PROXY=http://proxyprd.caixa:80
http_proxy=http://proxyprd.caixa:80
HTTPS_PROXY=http://proxyprd.caixa:80
https_proxy=http://proxyprd.caixa:80
no_proxy=.caixa,.caixa.gov.br,.corecaixa,.local,.svc,localhost,127.0.0.1,10.0.0.0/8,25.0.0.0/8
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc -n selenium-grid rsh firefox-5-26gvg curl -s -o /dev/null -w '%{http_code}\n' --max-time 15 https://cdn.perfdrive.com/
200
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc -n selenium-grid rsh firefox-5-26gvg curl -sk -o /dev/null -w '%{http_code}\n' --max-time 15 https://logindes.caixa.gov.br/
302
-sh-4.2$
-sh-4.2$
-sh-4.2$
