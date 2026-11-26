A prova fica do lado do Apache. Os servidores 137 e 138 também são os Apaches de DES ("APACHE DES WILD"). No 137, como root:

bash
ls /logs/apache2/sigec-csc/
grep -E '"POST ' /logs/apache2/sigec-csc/sigec-csc.esteiras.des.caixa-access.log | grep '26/Nov/2026:11:4' | tail
grep '11:4' /logs/apache2/sigec-csc/sigec-csc.esteiras.des.caixa-error.log | grep -iE 'ajp|proxy' | tail

Algo como 500 no POST e ajp ... failed ou Broken pipe no error log confirmaria que o JBoss cortou a conexão durante o envio.

O mais rápido em sala é aplicar o ajuste e pedir ao Ilson para repetir. Na 763:

bash
CLI="/opt/jboss/jboss-eap/bin/jboss-cli.sh -c --controller=10.116.193.251:9990"
$CLI '/subsystem=undertow/server=default-server/ajp-listener=ajp:write-attribute(name=max-post-size,value=209715200)'
$CLI '/subsystem=modcluster/mod-cluster-config=configuration:write-attribute(name=node-timeout,value=600)'
$CLI ':reload'

Repita na 756 (pegue o IP com getent hosts caddeapllx756.agil.nprd.caixa.gov.br no bastion). As duas precisam do ajuste, senão o upload falha sempre que o balanceador mandar para a 756. Se o upload de mais de 10 MB passar, está confirmado, e aí vai o commit no SIGEC-CSC-config.
