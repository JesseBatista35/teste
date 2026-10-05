
-sh-4.2$ oc exec $POD -n $NS -- sh -c 'grep -c "__SSO_" /opt/app-root/src/chunk-SUPBJXFF.js; grep -o "https://login.des.caixa/auth" /opt/app-root/src/chunk-SUPBJXFF.js | head -1'
Defaulting container name to sirep-frontend-intranet-novo-des2-des.
Use 'oc describe pod/sirep-frontend-intranet-novo-des2-des-16-2rsgl -n sirep-des' to see all of the containers in this pod.
0
https://login.des.caixa/auth
-sh-4.2$
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec $POD -n $NS -- sh -c 'cat /proc/1/cmdline | tr "\0" " "; echo'
Defaulting container name to sirep-frontend-intranet-novo-des2-des.
Use 'oc describe pod/sirep-frontend-intranet-novo-des2-des-16-2rsgl -n sirep-des' to see all of the containers in this pod.
nginx: master process nginx -g daemon off;
-sh-4.2$
-sh-4.2$
-sh-4.2$
