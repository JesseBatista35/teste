Antes de qualquer coisa, valide se o problema ainda existe:

curl -sk https://siepr-curso-bec3-frontend-des.apps.nprd.caixa/assets/config/sso-config.json

Se voltar JSON: o ajuste já está no ar e eles só precisam testar de novo.

Se ainda voltar HTML: o deploy não está no siepr-des, por isso o grep não achou nada. Procure pela rota:

oc get route -A | grep -i bec3

A coluna da esquerda é o namespace. Com ele em mãos:

oc get deploy,dc,pods -n <namespace> | grep -i bec3
oc get deploy <nome> -n <namespace> -o jsonpath='{..image}{"\n"}'
oc set env deploy/<nome> -n <namespace> --list | grep -E "SSO_BASE_PATH|REALM|SSO_CLIENT_ID|API_DADOS_FAMILIA_PATH"

Se for DeploymentConfig, troque deploy por dc. O namespace também aparece no log da release 23, na task de deploy.

Um alerta: você colou aqui o token do oc login. Ele dá acesso como você aos 1002 projetos. Quando terminar, rode oc logout para invalidar esse token. Nas próximas vezes, cole a saída a partir do comando seguinte ao login.

Manda o resultado do curl e do get route.
