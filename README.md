Vamos liberar temporariamente (CLI do 471, sem restart):

1. Confira o nível geral (root). O esperado é INFO:

/profile=full-ha-sifec-intranet/subsystem=logging/root-logger=ROOT:read-attribute(name=level)

Se vier INFO, pode seguir. Se vier DEBUG ou ALL, pare e me avise, porque o log ia explodir.

2. Garanta que o Keycloak está em DEBUG e libere o arquivo:

/profile=full-ha-sifec-intranet/subsystem=logging/logger=org.keycloak:write-attribute(name=level,value=DEBUG)
/profile=full-ha-sifec-intranet/subsystem=logging/periodic-rotating-file-handler=FILE:write-attribute(name=level,value=DEBUG)

Com o root em INFO, só os três loggers que ligamos (org.keycloak, br.gov.caixa.wpj, br.gov.caixa.intgr) vão gravar DEBUG. O resto continua igual.

3. Peça o teste (login novo na InPrivate e abrir o PJ) e rode no 473:

LOG=/opt/jboss/jboss-eap/hc/servers/sifec-intranet_node1_lx473/log/server.log
sudo grep -nE "DEBUG \[(org\.keycloak|br\.gov\.caixa)" $LOG | tail -80

Pode me mandar a saída. Agora deve aparecer o fluxo do Keycloak e o que o PJ faz ao montar o perfil.

Quando terminarmos, desfaça com:

/profile=full-ha-sifec-intranet/subsystem=logging/periodic-rotating-file-handler=FILE:write-attribute(name=level,value=INFO)
