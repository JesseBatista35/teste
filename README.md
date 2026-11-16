
-sh-4.2$
-sh-4.2$ oc get pods -n siepr-des | grep -v deploy
NAME                                      READY     STATUS                  RESTARTS        AGE
siepr-backend-des-244-t982x               0/1       Init:CrashLoopBackOff   759 (57s ago)   2d16h
siepr-backend-intranet-des-142-xfmps      1/1       Running                 0               4d16h
siepr-curso-bec-frontend-des-204-78r24    2/2       Running                 0               61d
siepr-curso-bec3-frontend-des-22-9kznh    2/2       Running                 0               54m
siepr-frontend-des-235-jlmzf              2/2       Running                 0               2d14h
siepr-frontend-intranet-des-184-q6htm     2/2       Running                 0               2d14h
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc get route -n siepr-des
NAME                            HOST/PORT                                       PATH      SERVICES                        PORT      TERMINATION     WILDCARD
siepr-backend-des               siepr-backend-des.apps.nprd.caixa                         siepr-backend-des               web       edge/Redirect   None
siepr-backend-intranet-des      siepr-backend-intranet-des.apps.nprd.caixa                siepr-backend-intranet-des      web       edge/Redirect   None
siepr-carga-des                 siepr-carga-des.apps.nprd.caixa                           siepr-carga-des                 web       edge/Redirect   None
siepr-curso-bec-frontend-des    siepr-curso-bec-frontend-des.apps.nprd.caixa              siepr-curso-bec-frontend-des    web       edge/Redirect   None
siepr-curso-bec3-frontend-des   siepr-curso-bec3-frontend-des.apps.nprd.caixa             siepr-curso-bec3-frontend-des   web       edge/Redirect   None
siepr-frontend-des              siepr-frontend-des.apps.nprd.caixa                        siepr-frontend-des              web       edge/Redirect   None
siepr-frontend-intranet-des     siepr-frontend-intranet-des.apps.nprd.caixa               siepr-frontend-intranet-des     web       edge/Redirect   None
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec -n siepr-des siepr-curso-bec3-frontend-des-22-9kznh -c $(oc get pod -n siepr-des siepr-curso-bec3-frontend-des-22-9kznh -o jsonpath='{.spec.containers[0].name}') -- sh -c 'ls /usr/share/nginx/html/assets/ 2>/dev/null; ls /usr/share/nginx/html/ 2>/dev/null'
50x.html
icons
index.html
nginx-logo.png
poweredby.png
system_noind
