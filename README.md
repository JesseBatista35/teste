
-sh-4.2$
-sh-4.2$ # Comando de entrada da imagem
-sh-4.2$ oc get pod $POD -n $NS -o jsonpath='{.spec.containers[0].command}{" "}{.spec.containers[0].args}{"\n"}'

-sh-4.2$
-sh-4.2$ # Procurar o script que imprime "Bundle Angular localizado"
-sh-4.2$ oc exec $POD -n $NS -- sh -c 'grep -rl "Bundle Angular" / 2>/dev/null | grep -v ^/proc'
Defaulting container name to sirep-frontend-intranet-novo-des2-des.
Use 'oc describe pod/sirep-frontend-intranet-novo-des2-des-16-2rsgl -n sirep-des' to see all of the containers in this pod.

^C
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec $POD -n $NS -- sh -c 'grep -o "__SSO_[A-Z_]*__" /opt/app-root/src/chunk-SUPBJXFF.js | sort -u'
Defaulting container name to sirep-frontend-intranet-novo-des2-des.
Use 'oc describe pod/sirep-frontend-intranet-novo-des2-des-16-2rsgl -n sirep-des' to see all of the containers in this pod.
__SSO_AUTH_URL__
__SSO_CLIENT_ID__
__SSO_REALM__
__SSO_REDIRECT_URL__
-sh-4.2$ oc exec $POD -n $NS -- sh -c 'grep -rl "Bundle Angular" / 2>/dev/null | grep -v ^/proc'
Defaulting container name to sirep-frontend-intranet-novo-des2-des.
Use 'oc describe pod/sirep-frontend-intranet-novo-des2-des-16-2rsgl -n sirep-des' to see all of the containers in this pod.
^C
-sh-4.2$
-sh-4.2$
-sh-4.2$ oc exec $POD -n $NS -- sh -c 'cd /opt/app-root/src && for f in *.js; do sed -i \
>  -e "s#__SSO_AUTH_URL__#$SSO_AUTH_URL#g" \
>  -e "s#__SSO_REALM__#$SSO_REALM#g" \
>  -e "s#__SSO_CLIENT_ID__#$SSO_CLIENT_ID#g" \
>  -e "s#__SSO_REDIRECT_URL__#$SSO_REDIRECT_URL#g" "$f"; done'
Defaulting container name to sirep-frontend-intranet-novo-des2-des.
Use 'oc describe pod/sirep-frontend-intranet-novo-des2-des-16-2rsgl -n sirep-des' to see all of the containers in this pod.
-sh-4.2$
-sh-4.2$
