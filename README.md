1. No 473, o request dump da consulta do CNPJ (o comando já esconde cookie e token):

LOG=/opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log
L=$(sudo grep -n "requestURI=/workflow-credito-pj-web/api/cliente/cnpj/03756362000103" $LOG | tail -1 | cut -d: -f1); echo "linha: $L"; sudo sed -n "${L},$((L+60))p" $LOG | grep -viE "cookie|authorization"

Se aparecer linha: vazio, o request dump não pegou essa chamada. Nesse caso rode este, que mostra o que existe no log com essa URL:

sudo grep -n "cliente/cnpj" $LOG | tail -5

2. No 6.4, a verificação de SSO:

sed -n '18837,20596p' /opt/jboss/jboss-eap/dc/configuration/domain.xml | grep -niE "single-sign-on|<sso|sso-"

O que eu quero ver no 1 são authType, remoteUser e principal, e no 2 se o 6.4 tem SSO configurado.
