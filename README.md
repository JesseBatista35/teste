Próximo: CCR, o 401 do Edson

Rode um comando por vez:

1. Na 473:

sudo grep -nE "AdapterTokenVerifier|Failed to verify token|publicKey|Token is not active|Invalid token|ccr-api" /opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log | tail -15

2. Na 471 (root, fora do CLI):

grep -n -A15 'secure-deployment name="ccr-api' /opt/jboss/jboss-eap/dc/configuration/domain.xml | grep -vi secret

3. No 6.4 (10.116.88.20):

sudo grep -n -A15 'secure-deployment name="ccr-api' /opt/jboss/jboss-eap/dc/configuration/domain.xml | grep -vi secret | head -40
