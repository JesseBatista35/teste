1. No 6.4, mostre o arquivo e copie as 21 linhas:

cat /tmp/props_pj.cli

2. No 471 (7.4), dentro do jboss-cli ([domain@localhost:9999 /]), cole as 21 linhas. Cada uma deve voltar "outcome" => "success".

3. Confira (ainda no CLI do 471):

/server-group=sifec-intranet/system-property=SICCR_PJ_IS_SICLI_REST_MOCK:read-attribute(name=value)

O resultado deve ser "true".

4. Apague o arquivo no 6.4:

rm -f /tmp/props_pj.cli

5. Reinicie (CLI do 471):

/server-group=sifec-intranet:restart-servers(blocking=true)
/host=hc_cbrdeapllx473/server=sifec-intranet_node1_lx473:read-attribute(name=server-state)

6. Com o estado running, peça o teste do PJ: logout, login e consultar o CNPJ. A mensagem para o Pablo só vai depois disso.




/server-group=sifec-intranet/system-property=URL_BARRAMENTO:add(value="http://des.barramento.caixa/")
/server-group=sifec-intranet/system-property=SILCR_URL_BROKER_SIBAR:add(value="http://des.barramento.caixa")
/server-group=sifec-intranet/system-property=SSO_SERVICO_CLIENT_ID:add(value="cli-ser-fec")
/server-group=sifec-intranet/system-property=SSO_SERVICO_CLIENT_SECRET:add(value="cf65ddca-84c5-4548-81f2-163d245edf04")
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
/server-group=sifec-intranet/system-property=SICCR_API_MANAGER_API_KEY:add(value="l714f9532275eb495c85015a769ab99181")
/server-group=sifec-intranet/system-property=SICCR_PJ_TESTE_MOCK_RETORNO_SICLI:add(value="true")
/server-group=sifec-intranet/system-property=SICCR_PJ_IS_SICLI_REST_MOCK:add(value="true")
/server-group=sifec-intranet/system-property=AMBIENTE_APLICACAO:add(value="DES")



/server-group=sifec-intranet/system-property=SICCR_PJ_IS_SICLI_REST_MOCK:read-attribute(name=value)
/server-group=sifec-intranet:restart-servers(blocking=true)
/host=hc_cbrdeapllx473/server=sifec-intranet_node1_lx473:read-attribute(name=server-state)
