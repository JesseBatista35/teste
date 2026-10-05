
-sh-4.2$
-sh-4.2$ NS=sirep-des
-sh-4.2$ POD=sirep-frontend-intranet-novo-des2-des-16-2rsgl
-sh-4.2$ oc exec $POD -n $NS -- env | grep -i sso
Defaulting container name to sirep-frontend-intranet-novo-des2-des.
Use 'oc describe pod/sirep-frontend-intranet-novo-des2-des-16-2rsgl -n sirep-des' to see all of the containers in this pod.
SSO_AUTH_URL=https://login.des.caixa/auth
SSO_CLIENT_ID=cli-web-rep
SSO_REALM=intranet
SSO_REDIRECT_URL=https://sirep-frontend-intranet-novo-des2-des.apps.nprd.caixa/auth
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec $POD -n $NS -- grep -l "__SSO_" -r /opt/app-root/src
Defaulting container name to sirep-frontend-intranet-novo-des2-des.
Use 'oc describe pod/sirep-frontend-intranet-novo-des2-des-16-2rsgl -n sirep-des' to see all of the containers in this pod.
/opt/app-root/src/chunk-SUPBJXFF.js
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec $POD -n $NS -- sh -c 'cat /opt/app-root/*.sh /docker-entrypoint.d/* 2>/dev/null | grep -n -iE "sed|envsubst|main-|SSO"'
Defaulting container name to sirep-frontend-intranet-novo-des2-des.
Use 'oc describe pod/sirep-frontend-intranet-novo-des2-des-16-2rsgl -n sirep-des' to see all of the containers in this pod.
command terminated with exit code 1
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc set env dc/<app-des> -n $NS --list | grep -i sso
-sh: app-des: Arquivo ou diretório não encontrado
-sh-4.2$ oc set env dc/sirep-frontend-intranet-novo-des2-des -n $NS --list | grep -i sso
SSO_AUTH_URL=https://login.des.caixa/auth
SSO_CLIENT_ID=cli-web-rep
SSO_REALM=intranet
SSO_REDIRECT_URL=https://sirep-frontend-intranet-novo-des2-des.apps.nprd.caixa/auth
SSO_AUTH_URL=https://login.des.caixa/auth
SSO_CLIENT_ID=cli-web-rep
SSO_REALM=intranet
SSO_REDIRECT_URL=https://sirep-frontend-intranet-novo-des2-des.apps.nprd.caixa/auth
-sh-4.2$
