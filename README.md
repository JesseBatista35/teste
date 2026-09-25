
-sh-4.2$
-sh-4.2$ oc rollout history dc/chrome -n selenium-grid
deploymentconfigs "chrome"
REVISION        STATUS          CAUSE
1               Complete        config change
2               Complete        config change
3               Complete        config change
4               Complete        config change

-sh-4.2$ oc rollout history dc/chrome -n selenium-grid --revision=3 > /tmp/r3.txt
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rollout history dc/chrome -n selenium-grid --revision=4 > /tmp/r4.txt
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ diff /tmp/r3.txt /tmp/r4.txt
1c1
< deploymentconfigs "chrome" with revision #3
---
> deploymentconfigs "chrome" with revision #4
3c3
<   Labels:     deployment=chrome-3
---
>   Labels:     deployment=chrome-4
7c7
<   Annotations:        openshift.io/deployment-config.latest-version=3
---
>   Annotations:        openshift.io/deployment-config.latest-version=4
9c9
<       openshift.io/deployment.name=chrome-3
---
>       openshift.io/deployment.name=chrome-4
20a21,26
>       HTTP_PROXY:     http://proxyprd.caixa:80
>       http_proxy:     http://proxyprd.caixa:80
>       HTTPS_PROXY:    http://proxyprd.caixa:80
>       https_proxy:    http://proxyprd.caixa:80
>       NO_PROXY:       .caixa,.caixa.gov.br,.corecaixa,.local,.svc,localhost,127.0.0.1,10.0.0.0/8,25.0.0.0/8
>       no_proxy:       .caixa,.caixa.gov.br,.corecaixa,.local,.svc,localhost,127.0.0.1,10.0.0.0/8,25.0.0.0/8
-sh-4.2$
