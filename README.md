# Comando de entrada da imagem
oc get pod $POD -n $NS -o jsonpath='{.spec.containers[0].command}{" "}{.spec.containers[0].args}{"\n"}'

# Procurar o script que imprime "Bundle Angular localizado"
oc exec $POD -n $NS -- sh -c 'grep -rl "Bundle Angular" / 2>/dev/null | grep -v ^/proc'

# Quais placeholders sobraram no chunk
oc exec $POD -n $NS -- sh -c 'grep -o "__SSO_[A-Z_]*__" /opt/app-root/src/chunk-SUPBJXFF.js | sort -u'


oc exec $POD -n $NS -- sh -c 'cd /opt/app-root/src && for f in *.js; do sed -i \
 -e "s#__SSO_AUTH_URL__#$SSO_AUTH_URL#g" \
 -e "s#__SSO_REALM__#$SSO_REALM#g" \
 -e "s#__SSO_CLIENT_ID__#$SSO_CLIENT_ID#g" \
 -e "s#__SSO_REDIRECT_URL__#$SSO_REDIRECT_URL#g" "$f"; done'

 
