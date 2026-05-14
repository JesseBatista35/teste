
-sh-4.2$ oc debug dc/sitop-frontend-des -- /bin/sh -c 'echo "PWD:"; pwd; echo "ARQUIVOS EM /opt/app-root/src:"; ls -la /opt/app-root/src; echo "JS ENCONTRADOS:"; find /opt/app-root -type f -name "*.js" 2>/dev/null | head -50'
Defaulting container name to sitop-frontend-des.
Use 'oc describe pod/sitop-frontend-des-debug -n sitop-des' to see all of the containers in this pod.

Debugging with pod/sitop-frontend-des-debug, original command: <image entrypoint>
Waiting for pod to start ...
PWD:
/opt/app-root/src
ARQUIVOS EM /opt/app-root/src:
total 0
drwxr-xr-x. 1 default root 18 May 13 18:41 .
drwxr-xr-x. 1 default root 17 Sep 15  2021 ..
drwxr-xr-x. 1 default root 19 Sep 15  2021 .pki
drwxr-xr-x. 3 default root 80 May 13 18:40 dist
drwxr-xr-x. 2 default root  6 Sep 15  2021 nginx-start
JS ENCONTRADOS:
/opt/app-root/src/dist/browser/main-UHIWBFY6.js
/opt/app-root/src/dist/browser/polyfills-B6TNHZQ6.js

Removing debug pod ...
-sh-4.2$

