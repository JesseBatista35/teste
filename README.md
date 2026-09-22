sh-4.2$
-sh-4.2$ oc -n selenium-grid get pods -w          # aguardar chrome-4, firefox-5, edge-4 em Running
NAME                             READY     STATUS              RESTARTS   AGE
chrome-2-deploy                  0/1       Completed           0          1y
chrome-3-deploy                  0/1       Completed           0          1y
chrome-3-wlvwr                   1/1       Running             0          1y
chrome-4-deploy                  0/1       ContainerCreating   0          8s
edge-2-deploy                    0/1       Completed           0          1y
edge-3-deploy                    0/1       Completed           0          1y
edge-3-ffdtk                     1/1       Running             0          1y
edge-4-deploy                    0/1       ContainerCreating   0          8s
firefox-2-deploy                 0/1       Completed           0          1y
firefox-3-deploy                 0/1       Completed           0          1y
firefox-4-deploy                 0/1       Completed           0          3h
firefox-4-n5rkq                  1/1       Running             0          3h
firefox-5-deploy                 0/1       ContainerCreating   0          8s
selenium-distributor-1-8r8pg     1/1       Running             0          139d
selenium-event-bus-1-xlwdp       1/1       Running             0          1y
selenium-router-2-76nqk          1/1       Running             0          4h
selenium-router-2-deploy         0/1       Completed           0          4h
selenium-session-queue-1-6zztd   1/1       Running             0          139d
selenium-sessions-1-pnwn4        1/1       Running             0          41d



firefox-5-deploy   1/1       Running   0         14s
chrome-4-deploy   1/1       Running   0         14s
edge-4-deploy   1/1       Running   0         14s
chrome-4-7h2xg   0/1       Pending   0         0s
firefox-5-26gvg   0/1       Pending   0         0s
chrome-4-7h2xg   0/1       Pending   0         0s
firefox-5-26gvg   0/1       Pending   0         0s
edge-4-mdsbs   0/1       Pending   0         0s
chrome-4-7h2xg   0/1       ContainerCreating   0         0s
edge-4-mdsbs   0/1       Pending   0         0s
firefox-5-26gvg   0/1       ContainerCreating   0         0s
edge-4-mdsbs   0/1       ContainerCreating   0         0s
firefox-5-26gvg   0/1       ContainerCreating   0         3s
chrome-4-7h2xg   0/1       ContainerCreating   0         3s
edge-4-mdsbs   0/1       ContainerCreating   0         3s
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc -n selenium-grid set env dc/firefox --list | grep -i proxy
HTTP_PROXY=http://proxyprd.caixa:80
http_proxy=http://proxyprd.caixa:80
HTTPS_PROXY=http://proxyprd.caixa:80
https_proxy=http://proxyprd.caixa:80
NO_PROXY=.caixa,.caixa.gov.br,.corecaixa,.local,.svc,localhost,127.0.0.1,10.0.0.0/8,25.0.0.0/8
no_proxy=.caixa,.caixa.gov.br,.corecaixa,.local,.svc,localhost,127.0.0.1,10.0.0.0/8,25.0.0.0/8
-sh-4.2$
-sh-4.2$
-sh-4.2$ POD=$(oc -n selenium-grid get pods -l deploymentconfig=firefox -o name | head -1)
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc -n selenium-grid rsh $POD curl -s -o /dev/null -w '%{http_code}\n' --max-time 15 https://cdn.perfdrive.com/
000
command terminated with exit code 28
-sh-4.2$ oc -n selenium-grid rsh $POD curl -s -o /dev/null -w '%{http_code}\n' --max-time 15 https://logindes.caixa.gov.br/
000
command terminated with exit code 60
-sh-4.2$
