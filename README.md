/server-group=sifec-intranet/system-property=SICDT_URLBASE:add(value="https://migracaosifec.des.caixa/sicdt-orig-api-rest/sicdt")
/server-group=sifec-intranet/system-property=CCR_PATH_CONCESSAO_SIMULACAO:add(value="/calculo-iof/v3/concessao/simulacao")
/server-group=sifec-intranet/system-property=CCR_PATH_CONCESSAO:add(value="/calculo-iof/v3/concessao")
/server-group=sifec-intranet/system-property=SICDT_URL_BASE_API:add(value="https://migracaosifec.des.caixa/sicdt-orig-api-rest/sicdt")
/server-group=sifec-intranet/system-property=SSO_INTRANET_SERVICE_CDT_CLIENT_ID:add(value="cli-ser-cdt")
/server-group=sifec-intranet/system-property=SSO_INTRANET_SERVICE_CDT_CLIENT_SECRET:add(value="f470c180-6fa5-4408-a78c-9b8a2e967c9a")
/server-group=sifec-intranet/system-property=APIM_CDT_API_KEY:add(value="l790ce8632e39048e6a73aca22e279800a")
/server-group=sifec-intranet/system-property=APIM_CDT_API_SECRET:add(value="19527ce0ec5f486293151e7ecd1af043")
/server-group=sifec-intranet/system-property=CCR_PATH_IOF_ATRASO_SIMULACAO:add(value="/calculo-iof/v2/atraso/simulacao")
/server-group=sifec-intranet/system-property=CCR_PATH_IOF_ATRASO:add(value="/calculo-iof/v2/atraso")


Depois, no 6.4, apague o arquivo:

rm -f /tmp/props_cdt.cli

Próximos passos:

1. Verificações para o datasource e o Keycloak (CLI do 471; me mande a saída):

/profile=full-ha-sifec-intranet/subsystem=datasources:read-children-names(child-type=jdbc-driver)
/profile=full-ha-sifec-intranet/subsystem=keycloak/secure-deployment=sifec-cdt-web.war:read-attribute(name=resource)
/profile=full-ha-sifec-intranet/subsystem=keycloak/secure-deployment=sicdt-orig-api-rest.war:read-attribute(name=resource)
/profile=full-ha-sifec-intranet/subsystem=keycloak/secure-deployment=sicdt-orig-api-rest.war:read-attribute(name=bearer-only)
