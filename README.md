1. Veja os valores sem os secrets (no 6.4; pode me mandar essa saída):

grep -viE 'SECRET|API_KEY|PASSWORD|SENHA' /tmp/props_pj.cli

Me mande e eu te digo se alguma precisa de ajuste antes de aplicar. Se preferir não esperar, pode aplicar já. Os passos são os mesmos de antes:

2. Aplicar: cat /tmp/props_pj.cli, copie as 21 linhas e cole no jboss-cli do 471. Todas devem voltar "outcome" => "success".

3. Apagar o arquivo no 6.4:

rm -f /tmp/props_pj.cli

4. Reiniciar e testar (CLI do 471):

/server-group=sifec-intranet:restart-servers(blocking=true)
/host=hc_cbrdeapllx473/server=sifec-intranet_node1_lx473:read-attribute(name=server-state)

Com o estado running: logout, login, abrir o PJ e consultar o CNPJ, olhando no F12 o perfil-acesso-usuario e o cliente/cnpj.

Se alguma property ficar com valor errado (por exemplo, o IP do 6.4), dá para corrigir depois com :write-attribute(name=value,value=...) e outro restart. Esse é o motivo de olhar antes.




-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$ grep -viE 'SECRET|API_KEY|PASSWORD|SENHA' /tmp/props_pj.cli
/server-group=sifec-intranet/system-property=URL_BARRAMENTO:add(value="http://des.barramento.caixa/")
/server-group=sifec-intranet/system-property=SILCR_URL_BROKER_SIBAR:add(value="http://des.barramento.caixa")
/server-group=sifec-intranet/system-property=SSO_SERVICO_CLIENT_ID:add(value="cli-ser-fec")
/server-group=sifec-intranet/system-property=SSO_SERVICO_PATH_SETROLE:add(value="/servico/rest/setrole")
/server-group=sifec-intranet/system-property=SICCR_URL_LDAP_INTERNO:add(value="ldap://ldapclusterdes.extra.caixa.gov.br:1489")
/server-group=sifec-intranet/system-property=SICCR_URL_LDAP_EXTERNO:add(value="ldap://ldapclusterdes.extra.caixa.gov.br:1489")
/server-group=sifec-intranet/system-property=SICCR_BASE_EXTERNO:add(value="ou=People,o=caixa_des")
/server-group=sifec-intranet/system-property=URL_SICLI:add(value="http://cadastro.des.coredf.caixa/default.asp")
/server-group=sifec-intranet/system-property=PATH_BASE_API_SIICO:add(value="informacoes-compartilhadas-privadas/v1")
/server-group=sifec-intranet/system-property=SICCR_SIICO_URL_HMP:add(value="")
/server-group=sifec-intranet/system-property=SICCR_IP_SERVER_SIFEC:add(value="${jboss.bind.address}")
/server-group=sifec-intranet/system-property=LOGIN_URL_BASE:add(value="https://login.des.caixa")
/server-group=sifec-intranet/system-property=BARRAMENTO_URL_BASE:add(value="https://des.barramento.caixa")
/server-group=sifec-intranet/system-property=sso.intranet.baseUrl:add(value="https://login.des.caixa/auth")
/server-group=sifec-intranet/system-property=UNI_SIBAR_CONNECTION_FACTORY:add(value="java:/jms/UniSibarConnectionFactory")
/server-group=sifec-intranet/system-property=CCR_API_URL:add(value="https://api.des.caixa:8443/credito")
/server-group=sifec-intranet/system-property=SICCR_PJ_TESTE_MOCK_RETORNO_SICLI:add(value="true")
/server-group=sifec-intranet/system-property=SICCR_PJ_IS_SICLI_REST_MOCK:add(value="true")
/server-group=sifec-intranet/system-property=AMBIENTE_APLICACAO:add(value="DES")
-sh-4.1$
-sh-4.1$
-sh-4.1$
-sh-4.1$
