Liberado, vamos lá. Rode os dois blocos abaixo, um no 6.4 e outro no 471, e me mande as saídas.

1. No 6.4 (sbrdeapllx0001), gere as properties do SICDT:

sed -n '57701,58040p' /opt/jboss/jboss-eap/dc/configuration/domain.xml | grep -E '<property name="(SICDT_URLBASE|SICDT_URL_BASE_API|SSO_INTRANET_SERVICE_CDT_CLIENT_ID|SSO_INTRANET_SERVICE_CDT_CLIENT_SECRET|APIM_CDT_API_KEY|APIM_CDT_API_SECRET|CCR_PATH_CONCESSAO|CCR_PATH_CONCESSAO_SIMULACAO|CCR_PATH_IOF_ATRASO|CCR_PATH_IOF_ATRASO_SIMULACAO)"' | sed -E 's#.*name="([^"]*)" value="([^"]*)".*#/server-group=sifec-intranet/system-property=\1:add(value="\2")#' > /tmp/props_cdt.cli; wc -l /tmp/props_cdt.cli
grep -viE 'SECRET|API_KEY' /tmp/props_cdt.cli

O esperado são 10 linhas no arquivo. Me mande a saída do grep (sem os segredos).

Aproveite e veja o datasource do SICDT no 6.4 (sem senha), para conferir URL e usuário:

grep -A4 'OracleSicdtDS"' /opt/jboss/jboss-eap/dc/configuration/domain.xml | grep -E "jndi-name|connection-url|user-name|driver>" | sort -u

2. No 471, dentro do jboss-cli:

/profile=full-ha-sifec-intranet/subsystem=datasources:read-children-names(child-type=jdbc-driver)
/profile=full-ha-sifec-intranet/subsystem=keycloak/secure-deployment=sifec-cdt-web.war:read-attribute(name=resource)
/profile=full-ha-sifec-intranet/subsystem=keycloak/secure-deployment=sicdt-orig-api-rest.war:read-attribute(name=resource)
/profile=full-ha-sifec-intranet/subsystem=keycloak/secure-deployment=sicdt-orig-api-rest.war:read-attribute(name=bearer-only)

O esperado é ver o nome do driver Oracle, cli-web-fec, cli-ser-cdt e true.

Enquanto isso, já pode baixar o .ear do Nexus para a sua máquina:

http://binario.caixa:8081/repository/releases/br/gov/caixa/sicdt/sifec-cdt/3.24.3.001/sifec-cdt-3.24.3.001.ear

Com as saídas, te mando o bloco final: as properties ajustadas, o datasource e o deploy.
