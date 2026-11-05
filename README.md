1. No 6.4, gere os comandos já com os valores, num arquivo. Assim você não precisa digitar nem colar segredo no chat:

sed -n '57701,58040p' /opt/jboss/jboss-eap/dc/configuration/domain.xml | grep -E '<property name="(URL_SICLI|SICCR_PJ_IS_SICLI_REST_MOCK|SICCR_PJ_TESTE_MOCK_RETORNO_SICLI|SSO_SERVICO_CLIENT_ID|SSO_SERVICO_CLIENT_SECRET|SSO_SERVICO_PATH_SETROLE|LOGIN_URL_BASE|sso\.intranet\.baseUrl|AMBIENTE_APLICACAO|SICCR_BASE_EXTERNO|SICCR_URL_LDAP_INTERNO|SICCR_URL_LDAP_EXTERNO|SICCR_IP_SERVER_SIFEC|SICCR_API_MANAGER_API_KEY|PATH_BASE_API_SIICO|SICCR_SIICO_URL_HMP|CCR_API_URL|BARRAMENTO_URL_BASE|URL_BARRAMENTO|UNI_SIBAR_CONNECTION_FACTORY|SILCR_URL_BROKER_SIBAR)"' | sed -E 's#.*name="([^"]*)" value="([^"]*)".*#/server-group=sifec-intranet/system-property=\1:add(value="\2")#' > /tmp/props_pj.cli; wc -l /tmp/props_pj.cli

O resultado esperado é 21. Para conferir só os nomes, sem mostrar valores:

cut -d= -f3 /tmp/props_pj.cli | cut -d: -f1

2. Leve para o 7.4: abra o arquivo com cat /tmp/props_pj.cli, copie as 21 linhas e cole no jboss-cli do 471. Não cole isso no chat nem na sala, porque tem secret. Depois apague o arquivo no 6.4:

rm -f /tmp/props_pj.cli

3. Reinicie e confira (CLI do 471):

/server-group=sifec-intranet:restart-servers(blocking=true)
/host=hc_cbrdeapllx473/server=sifec-intranet_node1_lx473:read-attribute(name=server-state)

Com o estado running: logout, login, abrir o PJ e testar o CNPJ.

Se alguma linha der WFLYCTL0212: Duplicate resource, me avise.

Mensagem para a sala, se quiser registrar:

Comparamos as system properties do server-group sifec-intranet entre o 6.4 e o 7.4: faltam 168 no 7.4, entre elas as de SICLI (URL_SICLI, SICCR_PJ_IS_SICLI_REST_MOCK), as de serviço SSO (SSO_SERVICO_*) e as de base do SICCR. Estamos trazendo as 21 relacionadas ao PJ, vamos reiniciar e testar. As demais entram conforme os outros módulos subirem.




-sh-4.1$
-sh-4.1$ sed -n '57701,58040p' /opt/jboss/jboss-eap/dc/configuration/domain.xml | grep -E '<property name="(URL_SICLI|SICCR_PJ_IS_SICLI_REST_MOCK|SICCR_PJ_TESTE_MOCK_RETORNO_SICLI|SSO_SERVICO_CLIENT_ID|SSO_SERVICO_CLIENT_SECRET|SSO_SERVICO_PATH_SETROLE|LOGIN_URL_BASE|sso\.intranet\.baseUrl|AMBIENTE_APLICACAO|SICCR_BASE_EXTERNO|SICCR_URL_LDAP_INTERNO|SICCR_URL_LDAP_EXTERNO|SICCR_IP_SERVER_SIFEC|SICCR_API_MANAGER_API_KEY|PATH_BASE_API_SIICO|SICCR_SIICO_URL_HMP|CCR_API_URL|BARRAMENTO_URL_BASE|URL_BARRAMENTO|UNI_SIBAR_CONNECTION_FACTORY|SILCR_URL_BROKER_SIBAR)"' | sed -E 's#.*name="([^"]*)" value="([^"]*)".*#/server-group=sifec-intranet/system-property=\1:add(value="\2")#' > /tmp/props_pj.cli; wc -l /tmp/props_pj.cli
21 /tmp/props_pj.cli
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$ cut -d= -f3 /tmp/props_pj.cli | cut -d: -f1
URL_BARRAMENTO
SILCR_URL_BROKER_SIBAR
SSO_SERVICO_CLIENT_ID
SSO_SERVICO_CLIENT_SECRET
SSO_SERVICO_PATH_SETROLE
SICCR_URL_LDAP_INTERNO
SICCR_URL_LDAP_EXTERNO
SICCR_BASE_EXTERNO
URL_SICLI
PATH_BASE_API_SIICO
SICCR_SIICO_URL_HMP
SICCR_IP_SERVER_SIFEC
LOGIN_URL_BASE
BARRAMENTO_URL_BASE
sso.intranet.baseUrl
UNI_SIBAR_CONNECTION_FACTORY
CCR_API_URL
SICCR_API_MANAGER_API_KEY
SICCR_PJ_TESTE_MOCK_RETORNO_SICLI
SICCR_PJ_IS_SICLI_REST_MOCK
AMBIENTE_APLICACAO
-sh-4.1$


