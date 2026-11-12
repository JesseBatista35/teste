
-sh-4.2$
-sh-4.2$ oc get pods -n siepr-des | grep bec3
siepr-curso-bec3-frontend-des-17-deploy   0/1       Completed   0          148m
siepr-curso-bec3-frontend-des-18-7zb2w    2/2       Running     0          116m
siepr-curso-bec3-frontend-des-18-deploy   0/1       Completed   0          116m
siepr-curso-bec3-frontend-des-19-deploy   0/1       Error       0          35m
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get rc -n siepr-des | grep bec3
siepr-curso-bec3-frontend-des-17   0         0         0         148m
siepr-curso-bec3-frontend-des-18   1         1         1         116m
siepr-curso-bec3-frontend-des-19   0         0         0         35m
-sh-4.2$
-sh-4.2$
-sh-4.2$ curl -sk https://siepr-curso-bec3-frontend-des.apps.nprd.caixa/assets/config/sso-config.json
{"ssoUrl":"https://logindes.caixa.gov.br/auth","ambiente":"internet","clientId":"cli-web-epr"}
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc rollout retry dc/siepr-curso-bec3-frontend-des -n siepr-des
deploymentconfig.apps.openshift.io/siepr-curso-bec3-frontend-des retried rollout #19
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get pods -n siepr-des -w | grep bec3
siepr-curso-bec3-frontend-des-17-deploy   0/1       Completed   0          2h
siepr-curso-bec3-frontend-des-18-7zb2w    2/2       Running     0          1h
siepr-curso-bec3-frontend-des-18-deploy   0/1       Completed   0          1h

