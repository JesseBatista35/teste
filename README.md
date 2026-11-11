1. Na 471 (10.116.97.59): qual hub-api existe no 7.4

Como root, sem sudo:

grep -n -iE 'hub-api|HUB-BACKEND' /opt/jboss/jboss-eap/dc/configuration/domain.xml

A lista de deployments do 7.4 tem SICCR-HUB-BACKEND2 a 5, mas não tem um SICCR-HUB-BACKEND sem número. Esse grep mostra o runtime-name de cada um, para achar o que é o hub-api 2.2.0.

2. No 6.4 (10.116.88.20): o que roda no sifec-intranet
sudo grep -n -iE 'hub-api|HUB-BACKEND' /opt/jboss/jboss-eap/dc/configuration/domain.xml

As linhas entre 57701 e 58040 mostram o que o 6.4 tem no sifec-intranet.

Configurações do 6.4 que o hub-api pode usar (propriedades, datasource, Keycloak):

sudo grep -niE 'hub' /opt/jboss/jboss-eap/dc/configuration/domain.xml | grep -viE 'deployment name' | head -40
3. Se houver pacote 2.2.0 no 7.4, deploy pela console

Console https://eap74-nprd.des.caixa:9443 → Deployments → Server Groups → sifec-intranet → Add → Deploy Existing Content → selecione o deployment com o hub-api 2.2.0 → Deploy.

Antes de clicar, deixe o log aberto na 473:

sudo tail -f /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | grep -E "WFLYSRV0010|WFLYSRV0027|WFLYSRV0021|WFLYUT0021|WELD-00|ERROR|Caused by|hub|HUB"

Se o grep da 471 não mostrar nenhum hub-api 2.2.0, vamos precisar do pacote. Ele pode estar no Nexus (binario.caixa) ou com o dev do HUB. Me manda as saídas dos passos 1 e 2.
