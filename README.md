NS=sirep-des
POD=sirep-frontend-intranet-novo-des2-des-16-2rsgl

# 1. Variáveis de SSO existem no pod?
oc exec $POD -n $NS -- env | grep -i sso

# 2. Em quais arquivos os placeholders ainda estão?
oc exec $POD -n $NS -- grep -l "__SSO_" -r /opt/app-root/src

# 3. Como o entrypoint faz a substituição (procura o sed/envsubst)
oc exec $POD -n $NS -- sh -c 'cat /opt/app-root/*.sh /docker-entrypoint.d/* 2>/dev/null | grep -n -iE "sed|envsubst|main-|SSO"'

# 4. Comparar com o DES, que funciona
oc set env dc/<app-des> -n $NS --list | grep -i sso
oc set env dc/sirep-frontend-intranet-novo-des2-des -n $NS --list | grep -i sso
